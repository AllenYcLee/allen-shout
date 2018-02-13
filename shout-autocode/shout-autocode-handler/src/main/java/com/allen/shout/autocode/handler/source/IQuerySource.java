package com.allen.shout.autocode.handler.source;

import com.allen.shout.autocode.core.domain.FieldInfo;
import com.allen.shout.autocode.core.domain.TableInfo;

import java.util.List;

/**
 * @Author yuanchen.li
 * @DATE Created in 2018/2/9/009
 * @Description
 */
public interface IQuerySource {

    String TABLE_STATUS_SQL = "show table status";

    String FIELDS_FULL_SQL = "show full fields from `%s`";

    /**
     * <p>表详情</p>
     * @return
     */
    List<TableInfo> queryTableStatus();

    /**
     * <p>字段详情</p>
     * @return
     */
    List<FieldInfo> queryFieldsFull(String tableName);
}
