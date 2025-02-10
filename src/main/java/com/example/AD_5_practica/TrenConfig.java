package com.example.AD_5_practica;

import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TrenConfig
{
	@Bean
	Tren tren(List<Tripulacion> tripulacion)
	{
		return new Tren("AVE-3000", 100, tripulacion);
	}
}