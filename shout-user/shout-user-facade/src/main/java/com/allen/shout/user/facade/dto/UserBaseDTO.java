package com.allen.shout.user.facade.dto;

import com.allen.shout.common.domain.CommonEntity;
import com.allen.shout.user.core.domain.UserBase;

/**
 * @Author yuanchen.li
 * @DATE Created in 2017/11/28/028
 * @Description
 */
public class UserBaseDTO extends CommonEntity {

    private UserBase userBase;

    public UserBase getUserBase() {
        return userBase;
    }

    public void setUserBase(UserBase userBase) {
        this.userBase = userBase;
    }
}
