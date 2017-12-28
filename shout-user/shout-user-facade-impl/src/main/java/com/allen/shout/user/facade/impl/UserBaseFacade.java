package com.allen.shout.user.facade.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.allen.shout.user.application.IUserBaseApplication;
import com.allen.shout.user.core.domain.UserBase;
import com.allen.shout.user.facade.IUserBaseFacade;
import com.allen.shout.user.facade.dto.UserBaseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
@Slf4j
@Service(version = "1.0.0")
public class UserBaseFacade implements IUserBaseFacade {

    @Autowired
    private IUserBaseApplication userBaseApplication;

    @Override
    public UserBaseDTO test() {
        log.error("method test begin...");
        UserBaseDTO userBaseDTO = new UserBaseDTO();
        UserBase user = userBaseApplication.test();
        if(user != null){
            userBaseDTO.setUserBase(user);
        }
        return userBaseDTO;
    }
}
