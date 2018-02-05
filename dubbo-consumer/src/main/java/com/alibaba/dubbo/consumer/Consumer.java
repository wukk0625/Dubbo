package com.alibaba.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.demo.DemoService;

public class Consumer {
	public static void main(String[] args) {
		// 测试常规服务
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("consumer start");
		DemoService demoService = context.getBean(DemoService.class);
		System.out.println("consumer");
		System.out.println(demoService.getPermissions(5L));
	}
}
