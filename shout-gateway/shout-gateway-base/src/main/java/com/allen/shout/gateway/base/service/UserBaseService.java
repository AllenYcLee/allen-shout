package com.allen.shout.gateway.base.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.allen.shout.user.facade.IUserBaseFacade;
import com.allen.shout.user.facade.dto.UserBaseDTO;
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


    public UserBaseDTO test() {
        return userBaseFacade.test();
    }

}
