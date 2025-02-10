package com.example.AD_5_practica;

public class Tripulacion
{
	private String nombreTripulacion;
	private String cargo;
	
	public Tripulacion()
	{
		nombreTripulacion = "";
		cargo = "";
	}

	public Tripulacion(String nombreTripulacion, String cargo)
	{
		this.nombreTripulacion = nombreTripulacion;
		this.cargo = cargo;
	}

	public String getNombreTripulacion()
	{
		return nombreTripulacion;
	}

	public void setNombreTripulacion(String nombreTripulacion)
	{
		this.nombreTripulacion = nombreTripulacion;
	}

	public String getCargo()
	{
		return cargo;
	}

	public void setCargo(String cargo)
	{
		this.cargo = cargo;
	}
	
	@Override
	public String toString()
	{
		return "Tripulación [nombre = " + nombreTripulacion + ", cargo = " + cargo + "]";
	}
}