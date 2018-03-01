package com.allen.shout.autocode.handler.repository;

import com.allen.shout.autocode.core.domain.DataSourceInfo;
import com.allen.shout.autocode.core.domain.FieldInfo;
import com.allen.shout.autocode.core.domain.TableInfo;
import com.allen.shout.autocode.core.repostory.IAutoCodeHandler;
import com.allen.shout.autocode.handler.source.IQuerySource;
import com.allen.shout.autocode.handler.source.impl.QuerySource;

import java.util.List;
import java.util.Map;

/**
 * @Author yuanchen.li
 * @DATE Created in 2018/2/11/011
 * @Description
 */
public class AutoCodeHandler implements IAutoCodeHandler {

    private DataSourceInfo dataSourceInfo;

    public AutoCodeHandler(DataSourceInfo dataSourceInfo) {
        this.dataSourceInfo = dataSourceInfo;
    }

    @Override
    public List<TableInfo> buildTableInfo(List<String> tableNames) {
        IQuerySource querySource = new QuerySource(this.dataSourceInfo);
        List<TableInfo> tableInfos = querySource.queryTableStatus(tableNames);

        return null;
    }

}
