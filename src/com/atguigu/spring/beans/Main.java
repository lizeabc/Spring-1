package com.atguigu.spring.beans;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//����helloworld��һ������
		//HelloWorld helloWorld=new HelloWorld();
		//Ϊname���Ը�ֵ
		//helloWorld.setName("atguigu");
		
		//1.����Spring��IOC��������
		ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��IOC�����л�ȡBeanʵ��
		HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloWorld");
		//����hello����
		helloWorld.hello();
		Car car=ctx.getBean(Car.class);
		System.out.println(car);
		
		Person person=(Person) ctx.getBean("person");
		System.out.println(person);
	}
}
