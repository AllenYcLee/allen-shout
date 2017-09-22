package com.allen.shout.user.facade.impl;

import com.allen.shout.user.core.domain.UserBase;
import com.allen.shout.user.infra.repository.mappers.UserBaseMapper;
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
    private UserBaseMapper userBaseMapper;

    @RequestMapping("/hello")
    public UserBase test(){
        return userBaseMapper.selectById("1");
    }
}
