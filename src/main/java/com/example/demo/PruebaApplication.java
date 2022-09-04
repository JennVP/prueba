package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties
public class PruebaApplication {

	public static void main(String args[]) {
		int num1 = 4;
		int num2 = 4;
		int resultado = 0;

		resultado = num1 + num2 / 2;
		System.out.println("El resultado es: " + resultado);
	}
}
