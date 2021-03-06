package com.leablogs;

import java.io.Reader;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.leablogs.annotation.SystemLogs;
import com.leablogs.aspect.LogAspect;
import com.leablogs.config.MybatisPlus;

@SpringBootApplication
@EnableCaching
@MapperScan({ "com.leablogs.mapper" })
public class MybatisApplicationMain {
//	@Bean
//	public LogAspect logAspect() {
//		return new LogAspect();
//	}
//	@Autowired
//	SqlSessionFactory sqlSessionFactory = null;

	public static void main(String[] args) throws Exception {
		Configuration configuration = new Configuration();
		SpringApplication.run(MybatisApplicationMain.class, args);
		
		String resource = "";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sessionFactory.openSession();
		
	}

//	@PostConstruct
//	public void initMybatis() {
//
//		Interceptor plugin = new MybatisPlus();
//		Properties properties = new Properties();
//		properties.setProperty("key1", "value1");
//		properties.setProperty("key2", "value2");
//		properties.setProperty("key3", "value3");
//		plugin.setProperties(properties);
//		sqlSessionFactory.getConfiguration().addInterceptor(plugin);
//	}

}
