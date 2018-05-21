package com.example.demo.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Group;
import com.example.demo.entity.User;

import java.util.ArrayList;
import java.util.List;

public class FastJsondemo1 {

    public static void main(String[] args) {

        String str = "{\"id\":2,\"name\":\"guest\"}";
        jsonStrToObject(str);
        jsonStrToPOJO(str);
        PojoToStr();

    }

    /**
     * 字符串转JSON对象
     */
  public static JSONObject jsonStrToObject(String str){
        JSONObject jsonObj = JSON.parseObject(str);
        System.out.println(jsonObj.get("id"));
        System.out.println(jsonObj.get("name"));
        return jsonObj;
    }

    /**
     * 字符串转POJO对象
     */
    public  static  User jsonStrToPOJO(String str){
      User user = JSON.parseObject(str,User.class);
        System.out.println(user.getName());
        return null;
    }

    /**
     * POJO对象转字符串
     */
    public static String PojoToStr(){

        Group group = new Group();
        group.setId(0L);
        group.setName("admin");

        User guestUser = new User();
        guestUser.setId(2L);
        guestUser.setName("guest");

        User rootUser = new User();
        rootUser.setId(3L);
        rootUser.setName("root");

        List<User> list = new ArrayList<>();
        list.add(guestUser);
        list.add(rootUser);

        group.setUsers(list);

        String jsonString = JSON.toJSONString(group);
        return jsonString;
    }
}
