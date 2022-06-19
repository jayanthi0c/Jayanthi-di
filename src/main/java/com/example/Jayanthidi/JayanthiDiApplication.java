package com.example.Jayanthidi;

import Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"Controllers"})
@SpringBootApplication
public class JayanthiDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JayanthiDiApplication.class, args);
		MyController controller = (MyController) context.getBean("myController");
		String greeting =controller.runMethod();
		System.out.println(greeting);
	}

}
