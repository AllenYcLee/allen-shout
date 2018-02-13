package com.allen.shout.autocode.core.domain;

/**
 * @Author yuanchen.li
 * @DATE Created in 2018/2/9/009
 * @Description
 */
public class DataSourceInfo {

    private String driverName;

    private String url;

    private String user;

    private String password;

    public String getDriverName() {
        return driverName;
    }

    public DataSourceInfo setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public DataSourceInfo setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUser() {
        return user;
    }

    public DataSourceInfo setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public DataSourceInfo setPassword(String password) {
        this.password = password;
        return this;
    }
}
