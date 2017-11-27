package com.allen.shout.user.infra.repository.mappers;

import com.allen.shout.user.core.domain.UserBase;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

@Mapper
public interface UserBaseMapper {

    UserBase selectById(@Param("id")String id);
}
