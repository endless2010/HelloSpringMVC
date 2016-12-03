package com.mycompany.web.converters;

import java.util.Date;

public class Employee {
	private String id;
	
	private String name;
	
/*
 *  @DateTimeFormat(pattern = "yyyy-MM-dd")//这么一个注解就可以了，不需要在XML配置conversionService
 *  @DateTimeFormat单独使用可以，但与org.springframework.context.support.ConversionServiceFactoryBean一同配置会出问题
 *  TODO why?
*/	private Date recruitTime;
	
	private Employee boss;
	
	public Employee(){}
	public Employee(String id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString(){
		return "[ id = "+id+ ", name = "+name+", recruitTime = "+recruitTime+", boss = "+boss+" ]";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRecruitTime() {
		return recruitTime;
	}
	public void setRecruitTime(Date recruitTime) {
		this.recruitTime = recruitTime;
	}

	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		this.boss = boss;
	}

}