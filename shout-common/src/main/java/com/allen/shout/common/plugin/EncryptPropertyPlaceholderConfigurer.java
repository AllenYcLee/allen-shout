package com.allen.shout.common.plugin;

import com.allen.shout.common.util.AESUtil;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 支持加密配置文件插件
 * Created by ZhangShuzheng on 2017/2/4.
 */
@Configuration
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

	private String[] propertyNames = {
		"spring.datasource.password"
	};

	/**
	 * 解密指定propertyName的加密属性值
	 * @param propertyName
	 * @param propertyValue
	 * @return
	 */
	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
		for (String p : propertyNames) {
			if (p.equalsIgnoreCase(propertyName)) {
				return AESUtil.AESDecode(propertyValue);
			}
		}
		return super.convertProperty(propertyName, propertyValue);
	}

}
