package com.allen.shout.autocode.core.repostory;

import com.allen.shout.autocode.core.domain.FieldInfo;
import com.allen.shout.autocode.core.domain.TableInfo;

import java.util.List;
import java.util.Map;

/**
 * @Author yuanchen.li
 * @DATE Created in 2018/2/11/011
 * @Description
 */
public interface IAutoCodeHandler {

    List<TableInfo> buildTableInfo(List<String> tableNames);


}
