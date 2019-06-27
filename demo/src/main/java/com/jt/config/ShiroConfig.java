package com.jt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jt.pojo.Shiro;

//该类就是xml文件 <bean id="方法名" class="类名">
@Configuration

public class ShiroConfig {
	@Bean
	public Shiro pri() {
		return new Shiro();
	}

}
