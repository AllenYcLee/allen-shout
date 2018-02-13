package com.allen.shout.common.mapper;

import java.util.List;

/**
 * @Author yuanchen.li
 * @DATE Created in 2017/12/28/028
 * @Description
 */
public interface BaseMapper<T> {
    List<T> selectByCondition(T record);

    int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    int insertBatch(T record);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(T record);
}
