package com.example.AD_5_practica;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TripulacionConfig
{
    @Bean
    List<Tripulacion> tripulacion()
	{
		return Arrays.asList
		(
			new Tripulacion("Alejandro Martínez Iglesias", "Maquinista"),
		    new Tripulacion("Juan Pérez García", "Azafato")
		);
	}
}