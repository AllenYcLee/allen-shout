package com.allen.shout.autocode.core.domain;

/**
 * @Author yuanchen.li
 * @DATE Created in 2018/2/9/009
 * @Description
 */
public class TemplateInfo {

    /**
     * <p>模板名称</p>
     */
    private String name;
    /**
     * <p>模板路径</p>
     */
    private String path;

    public String getName() {
        return name;
    }

    public TemplateInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getPath() {
        return path;
    }

    public TemplateInfo setPath(String path) {
        this.path = path;
        return this;
    }
}
