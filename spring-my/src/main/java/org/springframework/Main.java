package org.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		TestService te
				= (TestService) annotationConfigApplicationContext.getBean("testService");
		System.out.println("sout test===================================");
		System.out.println(te);
	}
}