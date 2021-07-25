package com.learm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class FirstprojectApplication {

	@Autowired
	Laptop a;

	public static void main(String[] args) {
		ApplicationContext  context = SpringApplication.run(FirstprojectApplication.class, args);

//		Alien a = context.getBean(Alien.class);
		FirstprojectApplication f = new FirstprojectApplication();
		f.test();
	}
	public void test()
	{
		System.out.print("sjdjshjsdhdhj");
		a.compile();
	}

}
