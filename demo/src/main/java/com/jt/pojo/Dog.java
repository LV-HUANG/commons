package com.jt.pojo;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource(value="classpath:/properties/dog.properties")
@ConfigurationProperties(prefix="dog")
public class Dog implements Serializable {
	
	private static final long serialVersionUID = -2206178273975827265L;
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + "]";
	}
	
	

}
