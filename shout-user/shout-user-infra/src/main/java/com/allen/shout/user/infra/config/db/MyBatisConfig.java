package com.allen.shout.user.infra.config.db;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @Author yuanchen.li
 * @DATE Created in 2017/9/20/020
 * @Description
 */
@Configuration
public class MyBatisConfig {

    @Autowired
    private DataSource dataSource;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        ResourcePatternResolver resolver =  new PathMatchingResourcePatternResolver();
        String mapperLocations = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX+ "mybatis.mappers/*.xml";
        try {
            Resource[] resources =  resolver.getResources(mapperLocations);
            sqlSessionFactoryBean.setMapperLocations(resources);
            sqlSessionFactoryBean.setTypeAliasesPackage("com.allen.shout.user.core.domain");
            return sqlSessionFactoryBean.getObject();
        }catch (Throwable e){
            throw new RuntimeException(e);
        }

    }
}
