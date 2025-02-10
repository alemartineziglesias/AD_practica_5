package com.example.AD_5_practica;

import java.util.ArrayList;
import java.util.List;

public class Tren
{
	private String modelo;
	private int numeroAsientos;
	private List<Tripulacion> tripulacion;
	
	public Tren()
	{
		modelo = "";
		numeroAsientos = 0;
		tripulacion = new ArrayList<Tripulacion>();
	}

	public Tren(String modelo, int numeroAsientos, List<Tripulacion> tripulacion)
	{
		this.modelo = modelo;
		this.numeroAsientos = numeroAsientos;
		this.tripulacion = tripulacion;
	}

	public String getModelo()
	{
		return modelo;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	public int getNumeroAsientos()
	{
		return numeroAsientos;
	}

	public void setNumeroAsientos(int numeroAsientos)
	{
		this.numeroAsientos = numeroAsientos;
	}

	public List<Tripulacion> getTripulacion()
	{
		return tripulacion;
	}

	public void setTripulacion(List<Tripulacion> tripulacion)
	{
		this.tripulacion = tripulacion;
	}
	
	@Override
	public String toString()
	{
		return "Tren [modelo = " + modelo + ", numero de asientos = " + numeroAsientos + ", tripulación = " + tripulacion + "]";
	}
}