package com.atguigu.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

//ʵ��������������ʵ�����������ٵ��ù�����ʵ������������bean��ʵ��
public class InstranceCarFactory {

	private Map<String, Car>cars=null;
	
	public InstranceCarFactory() {
		cars=new HashMap<String, Car>();
		cars.put("audi", new Car("audi", 200000));
		cars.put("ford", new Car("ford", 200000));	
	}
	public Car getCar(String brand){
		return cars.get(brand);
	}
}
