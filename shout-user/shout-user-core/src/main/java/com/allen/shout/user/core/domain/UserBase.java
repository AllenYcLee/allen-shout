package com.allen.shout.user.core.domain;


import com.allen.shout.common.domain.Entity;
import com.allen.shout.user.infra.repository.mappers.UserBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.ws.soap.Addressing;

@Component
public class UserBase extends Entity {

    @Autowired
    private UserBaseMapper userBaseMapper;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserBase test(){
        return userBaseMapper.selectById("1");
    }
}
