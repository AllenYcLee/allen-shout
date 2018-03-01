package com.allen.shout.autocode.handler.source;

import com.allen.shout.autocode.core.domain.FieldInfo;
import com.allen.shout.autocode.core.domain.TableInfo;

import java.util.List;
import java.util.Map;

/**
 * @Author yuanchen.li
 * @DATE Created in 2018/2/9/009
 * @Description
 */
public interface IQuerySource {

    String TABLE_STATUS_SQL = "show table status";

    String TABLE_QUERY_NAMES = " where name in ('%s')";

    String FIELDS_FULL_SQL = "show full fields from `%s`";

    /**
     * <p>表详情</p>
     * @return
     */
    List<TableInfo> queryTableStatus(List<String> tableNames);

    /**
     * <p>字段详情</p>
     * @return
     */
    Map<String, List<FieldInfo>> queryFieldsFull(List<String> tableNames);
}
