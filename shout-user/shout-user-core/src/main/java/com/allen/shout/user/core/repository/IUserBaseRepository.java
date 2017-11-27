package com.allen.shout.user.core.repository;

import com.allen.shout.user.core.domain.UserBase;

public interface IUserBaseRepository {

    UserBase selectById(String id);
}
