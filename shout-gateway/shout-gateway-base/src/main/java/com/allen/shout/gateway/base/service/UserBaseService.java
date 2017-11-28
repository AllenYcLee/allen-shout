package com.allen.shout.gateway.base.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.allen.shout.user.core.domain.UserBase;
import com.allen.shout.user.facade.IUserBaseFacade;
import org.springframework.stereotype.Component;

/**
 * @Author yuanchen.li
 * @DATE Created in 2017/11/28/028
 * @Description
 */
@Component
public class UserBaseService {


    @Reference(version = "1.0.0")
    private IUserBaseFacade userBaseFacade;


    public UserBase test() {
        return userBaseFacade.test();
    }

}
