package com.example.AD_5_practica;

import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ViajeConfig
{
	@Bean
	Viaje viaje(Tren tren, List<Pasajero> pasajeros)
	{
		return new Viaje("viaje", "Sevilla", "Murcia", tren, pasajeros);
	}
}