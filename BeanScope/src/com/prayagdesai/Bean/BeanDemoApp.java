package com.prayagdesai.Bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	Coach theCoach = context.getBean("my", Coach.class);
}
