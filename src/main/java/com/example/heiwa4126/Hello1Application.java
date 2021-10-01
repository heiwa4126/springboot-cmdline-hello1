package com.example.heiwa4126;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Hello1Application implements CommandLineRunner {

	@Value("${test.msg}")
	private String msg;

	public static void main(String[] args) {
		SpringApplication.run(Hello1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(msg);
		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d]:%s\n", i, args[i]);
		}
	}
}
