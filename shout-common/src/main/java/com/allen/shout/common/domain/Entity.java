package com.allen.shout.common.domain;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * @Author yuanchen.li
 * @DATE Created in 2017/11/27/027
 * @Description
 */
public class Entity extends BaseEntity {

    private String others;
    private Integer state;
    private Long sort;
    private Date createdAt;
    private Date updatedAt;
    public Entity() {
    }

    private JSONObject getOthersJSONObject() {
        JSONObject result = new JSONObject();
        if (!StringUtils.isEmpty(this.others)) {
            try {
                result = JSONObject.parseObject(this.others);
            } catch (Exception var3) {
                throw new RuntimeException("parse fail. error:" + var3.getMessage());
            }
        }

        return result;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
