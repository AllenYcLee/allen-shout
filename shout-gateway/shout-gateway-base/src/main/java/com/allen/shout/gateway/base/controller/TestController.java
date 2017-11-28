package com.allen.shout.gateway.base.controller;

import com.allen.shout.gateway.base.service.UserBaseService;
import com.allen.shout.user.core.domain.UserBase;
import com.allen.shout.user.facade.dto.UserBaseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yuanchen.li
 * @DATE Created in 2017/9/21/021
 * @Description
 */
@RestController
public class TestController {

    @Autowired
    private UserBaseService userBaseService;

    @RequestMapping("/hello")
    public UserBaseDTO test(){
        return userBaseService.test();
    }
}
