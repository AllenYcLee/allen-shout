package com.allen.shout.user.infra.repository;

import com.allen.shout.user.core.domain.UserBase;
import com.allen.shout.user.core.repository.IUserBaseRepository;
import com.allen.shout.user.infra.repository.mappers.UserBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserBaseRepository implements IUserBaseRepository{

    @Autowired
    private UserBaseMapper userBaseMapper;


    @Override
    public UserBase selectById(String id) {
        return userBaseMapper.selectById(id);
    }
}
