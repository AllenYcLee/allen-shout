package com.allen.shout.user.application.impl;

import com.allen.shout.user.application.IUserBaseApplication;
import com.allen.shout.user.core.domain.UserBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBaseApplication implements IUserBaseApplication {

    @Autowired
    private UserBase userBase;

    @Override
    public UserBase test() {
        return userBase.test();
    }
}
