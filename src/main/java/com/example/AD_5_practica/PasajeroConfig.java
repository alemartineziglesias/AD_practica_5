package com.example.AD_5_practica;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PasajeroConfig
{
	@Bean
	List<Pasajero> pasajeros()
	{
		return Arrays.asList
		(
			new Pasajero("Manuel Romero Salvatierra", 4),
			new Pasajero("Mario Barranco Barrero", 18)
		);
	}
}
