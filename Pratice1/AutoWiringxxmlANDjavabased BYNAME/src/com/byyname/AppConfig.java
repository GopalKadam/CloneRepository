package com.byyname;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean
	public Employee e()
	{
		Employee em=new Employee();
		em.setEid(10);
		em.setEname("Yogesh");
		return em;
	}
	@Bean
	public Department d()
	{
		Department dp=new Department();
		dp.setDid(1);
		dp.setDname("production");
		return dp;
		
	}
	

}
