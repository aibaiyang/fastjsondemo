package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Group {

    private Long       id;
    private String     name;
    private List<User> users = new ArrayList<User>();

}