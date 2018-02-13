package com.allen.shout.autocode.handler.repository;

import com.allen.shout.autocode.core.domain.DataSourceInfo;
import com.allen.shout.autocode.core.domain.TableInfo;
import com.allen.shout.autocode.core.repostory.IAutoCodeHandler;
import com.allen.shout.autocode.handler.source.IQuerySource;
import com.allen.shout.autocode.handler.source.impl.QuerySource;

import java.util.List;

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
    public List<TableInfo> buildTableInfo() {
        IQuerySource querySource = new QuerySource(this.dataSourceInfo);
        return querySource.queryTableStatus();
    }
}
