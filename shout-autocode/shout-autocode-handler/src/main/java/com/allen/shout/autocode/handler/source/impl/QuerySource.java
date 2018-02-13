package com.allen.shout.autocode.handler.source.impl;

import com.allen.shout.autocode.core.domain.DataSourceInfo;
import com.allen.shout.autocode.core.domain.FieldInfo;
import com.allen.shout.autocode.core.domain.TableInfo;
import com.allen.shout.autocode.handler.source.IQuerySource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author yuanchen.li
 * @DATE Created in 2018/2/9/009
 * @Description
 */
public class QuerySource implements IQuerySource{

    private DataSourceInfo dataInfo;

    public QuerySource(DataSourceInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    public DataSourceInfo getDataInfo() {
        return dataInfo;
    }

    public void setDataInfo(DataSourceInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    @Override
    public List<TableInfo> queryTableStatus() {
        List<TableInfo> result = new ArrayList<>();
        Connection connection = init();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(IQuerySource.TABLE_STATUS_SQL);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                TableInfo tableInfo = new TableInfo();
                tableInfo.setName(resultSet.getString("name"))
                        .setComment(resultSet.getString("comment"));
                result.add(tableInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }

        }
        return result;
    }

    @Override
    public List<FieldInfo> queryFieldsFull(String tableName) {
        List<FieldInfo> result = new ArrayList<>();
        Connection connection = init();
        PreparedStatement ps = null;
        try {
            String sql = String.format(IQuerySource.FIELDS_FULL_SQL, tableName);
            ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                FieldInfo fieldInfo = new FieldInfo();
                fieldInfo.setField(resultSet.getString("field"))
                        .setComment(resultSet.getString("comment"))
                        .setType(resultSet.getString("type"));
                result.add(fieldInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }

        }
        return result;
    }


    private Connection init(){
        Connection con = null;
        try {
            System.out.println(">>>>>>>>>>>>>>>>连接数据库>>>>>>>>>>>>>>>");
            Class.forName(this.dataInfo.getDriverName());
            con = DriverManager.getConnection(this.dataInfo.getUrl(), this.dataInfo.getUser(), this.dataInfo.getPassword());
            System.out.println(">>>>>>>>>>>>>>>>连接数据库成功！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }
}
