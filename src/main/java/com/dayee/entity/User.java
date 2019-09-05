package com.dayee.entity;


import lombok.Data;

/**
 * Created by xuruanshun on 2019/8/30.
 */
@Data
public class User {

    private String name;

    private Integer age;

    @Override
    public String toString() {
        return name + "," + age;
    }
}
