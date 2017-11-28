package com.allen.shout.user.core.domain;


import com.allen.shout.common.domain.Entity;
import com.allen.shout.user.core.repository.IUserBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserBase extends Entity {

    @Autowired
    private IUserBaseRepository userBaseRepository;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserBase selectById(){
        return userBaseRepository.selectById("1");
    }
}
