package com.example.AD_5_practica;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
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
	
	@Bean
    List<Tripulacion> tripulacion()
	{
		return Arrays.asList
		(
			new Tripulacion("Alejandro Martínez Iglesias", "Maquinista"),
		    new Tripulacion("Juan Pérez García", "Azafato")
		);
	}
	
	@Bean
	Tren tren(List<Tripulacion> tripulacion)
	{
		return new Tren("AVE-3000", 100, tripulacion);
	}
	
	@Bean
	Viaje viaje(Tren tren, List<Pasajero> pasajeros)
	{
		return new Viaje("viaje", "Sevilla", "Murcia", tren, pasajeros);
	}
}
