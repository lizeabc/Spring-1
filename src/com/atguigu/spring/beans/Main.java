package com.atguigu.spring.beans;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//创建helloworld的一个对象
		//HelloWorld helloWorld=new HelloWorld();
		//为name属性赋值
		//helloWorld.setName("atguigu");
		
		//1.创建Spring的IOC容器对象
		ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取Bean实例
		HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloWorld");
		//调用hello方法
		helloWorld.hello();
		Car car=ctx.getBean(Car.class);
		System.out.println(car);
		
		Person person=(Person) ctx.getBean("person");
		System.out.println(person);
	}
}
