package com.allen.shout.autocode.core.domain;

/**
 * @Author yuanchen.li
 * @DATE Created in 2018/2/9/009
 * @Description
 */
public class FieldInfo {

    /**
     * <p>字段名</p>
     */
    private String field;
    /**
     * <p>字段类型</p>
     */
    private String type;
    /**
     * <p>字段描述</p>
     */
    private String comment;

    public String getField() {
        return field;
    }

    public FieldInfo setField(String field) {
        this.field = field;
        return this;
    }

    public String getType() {
        return type;
    }

    public FieldInfo setType(String type) {
        this.type = type;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public FieldInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }
}
