package com.allen.shout.user.facade.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.allen.shout.user.application.IUserBaseApplication;
import com.allen.shout.user.core.domain.UserBase;
import com.allen.shout.user.facade.IUserBaseFacade;
import com.allen.shout.user.facade.dto.UserBaseDTO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0")
public class UserBaseFacade implements IUserBaseFacade {

    public static Logger logger = Logger.getLogger(UserBaseFacade.class);
    @Autowired
    private IUserBaseApplication userBaseApplication;

    @Override
    public UserBaseDTO test() {
        logger.error("method test begin...");
        UserBaseDTO userBaseDTO = new UserBaseDTO();
        UserBase user = userBaseApplication.test();
        if(user != null){
            userBaseDTO.setUserBase(user);
        }
        return userBaseDTO;
    }
}
