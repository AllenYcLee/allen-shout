package com.allen.shout.autocode.core.domain;

import java.util.List;

/**
 * @Author yuanchen.li
 * @DATE Created in 2018/2/9/009
 * @Description
 */
public class TableInfo {

    /**
     * <p>表名</p>
     */
    private String name;

    /**
     * <p>表注释</p>
     */
    private String comment;

    /**
     * <p>表字段</p>
     */
    private List<FieldInfo> fieldInfos;

    public String getName() {
        return name;
    }

    public TableInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public TableInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public List<FieldInfo> getFieldInfos() {
        return fieldInfos;
    }

    public TableInfo setFieldInfos(List<FieldInfo> fieldInfos) {
        this.fieldInfos = fieldInfos;
        return this;
    }
}
