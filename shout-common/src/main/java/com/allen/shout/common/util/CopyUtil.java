package com.allen.shout.common.util;


import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyDescriptor;
import java.util.*;

/**
 * Created by zhuangql113409 on 2016/3/15.
 */
public class CopyUtil {

    private static final Logger logger = LoggerFactory.getLogger(CopyUtil.class);

    /**
     * Lynge版拉风转换器
     * @param dest
     * @param orig
     * @return
     */
    public static Object copyProperties(Object orig, Object dest) {
        if (dest == null || orig == null) {
            return dest;
        }
        Map<String, String> map = new HashMap<String, String>();
        PropertyDescriptor[] origDesc = PropertyUtils.getPropertyDescriptors(orig);
        for (int i = 0; i < origDesc.length; i++) {
            map.put(origDesc[i].getName(), "");
        }

        PropertyDescriptor[] destDesc = PropertyUtils.getPropertyDescriptors(dest);
        try {
            for (int i = 0; i < destDesc.length; i++) {
                if (!map.containsKey(destDesc[i].getName())) {
                    continue;
                }
                Class destType = destDesc[i].getPropertyType();
                Class origType = PropertyUtils.getPropertyType(orig, destDesc[i].getName());
                if (destType != null && destType.equals(origType) && !destType.equals(Class.class)) {
                    if (!Collection.class.isAssignableFrom(origType)) {
                        try {
                            Object value = PropertyUtils.getProperty(orig, destDesc[i].getName());
                            PropertyUtils.setProperty(dest, destDesc[i].getName(), value);
                        } catch (Exception ex) {
                        }
                    }
                } else if (destType != null && !destType.equals(Class.class) && !Collection.class.isAssignableFrom
                        (origType)) {
                    try {
                        if (destType.equals(Long.class) && origType.equals(String.class)) {
                            Object value = PropertyUtils.getProperty(orig, destDesc[i].getName());
                            Long l = null;
                            if (value != null && StringUtils.isNotBlank(value.toString()))
                                l = Long.valueOf(value.toString());
                            PropertyUtils.setProperty(dest, destDesc[i].getName(), l);
                        } else if (destType.equals(String.class) && origType.equals(Long.class)) {
                            Object value = PropertyUtils.getProperty(orig, destDesc[i].getName());
                            String temp = null;
                            if (null != value) temp = value.toString();
                            PropertyUtils.setProperty(dest, destDesc[i].getName(), temp);
                        }
                    } catch (Exception ex) {
                        logger.error(ex.getMessage(), ex);
                    }
                }
            }


        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }
        return dest;
    }


    /**
     * create by Karen.Monkey.Wang拉风版集合转换器
     * @param list
     * @return
     */
    public static List<Long> stringListToLongList(List<String> list) {

        if (CollectionUtils.isEmpty(list)) {
            return null;
        }

        List<Long> longList = new ArrayList<>();
        for (String str : list) {
            Long l;
            if (StringUtils.isBlank(str)) {
                l = null;

            } else {
                l = Long.valueOf(str);

            }
            longList.add(l);
        }

        return longList;
    }

    public static List<String> LongListToStringList(List<Long> longList) {

        if (CollectionUtils.isEmpty(longList)) {
            return null;
        }

        List<String> stringList = new ArrayList<>();
        for (Long l : longList) {
            String s;
            if (l != null) {
                s = l.toString();
                stringList.add(s);
            }

        }

        return stringList;
    }

}
