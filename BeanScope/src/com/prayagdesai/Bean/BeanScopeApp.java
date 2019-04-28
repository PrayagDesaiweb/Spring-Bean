package com.prayagdesai.Bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
			// load the spring config fie
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			// retrive the bean from the container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		// check if they are the same beans. i.e they have the same reference or not
		boolean result = (theCoach == alphaCoach);
		System.out.println(result);
		// Internal memory address of myCoach
		System.out.println(theCoach);
		// Internal memory address of alphaCoach
		System.out.println(alphaCoach);
		// close the context
		context.close();

	}

}
