package com.allen.shout.common.util;

import java.util.regex.Pattern;

/**
 * @Author yuanchen.li
 * @DATE Created in 2018/1/4/004
 * @Description 代码生成器工具类
 */
public class GeneratorUtil {
    /**
     * 是否为大写命名
     * @param word 待判断字符串
     * @return
     */
    public static boolean isCapitalMode(String word) {
        return null != word && word.matches("^[0-9A-Z/_]+$");
    }

    /**
     * 是否为驼峰下划线混合命名
     * @param word 待判断字段
     * @return
     */
    public static boolean isMixedMode(String word){
        return Pattern.compile(".*[A-Z]+.*").matcher(word).matches() && Pattern.compile(".*[/_]+.*").matcher(word).matches();
    }
}
