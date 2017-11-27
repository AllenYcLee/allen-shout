package com.allen.shout.user.core.domain;


import com.allen.shout.common.domain.Entity;

public class UserBase extends Entity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
