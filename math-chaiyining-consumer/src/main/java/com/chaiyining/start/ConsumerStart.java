package com.chaiyining.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chaiyining.service.MathService;

public class ConsumerStart {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicantionContext.xml");
		MathService bean = context.getBean(MathService.class);
		int puls = bean.puls(10, 3);
		System.out.println("相加后的结果是"+puls);
		
		int subtract = bean.subtract(1, 3);
		System.out.println("相减后的结果是："+subtract);
		
		int multiply = bean.multiply(20, 5);
		System.out.println("相乘后的结果是"+multiply);
		
		int divide = bean.divide(50, 5);
		System.out.println("相除后的结果是"+divide);
	}
	
}
