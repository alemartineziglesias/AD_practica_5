package com.example.AD_5_practica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	@Autowired
	private Viaje viaje;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("El bean " + viaje + " se ha creado correctamente.");
	}
}