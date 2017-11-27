package com.allen.shout.common.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;

/**
 * @Author yuanchen.li
 * @DATE Created in 2017/11/27/027
 * @Description
 */
public class CommonEntity implements Serializable{

    public CommonEntity() {
    }

    public String toString() {
        return JSON.toJSONString(this, new SerializerFeature[]{SerializerFeature.WriteMapNullValue, SerializerFeature.DisableCircularReferenceDetect});
    }
}
