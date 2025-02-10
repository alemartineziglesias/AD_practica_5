package com.example.AD_5_practica;

public class Pasajero
{
	private String nombrePasajero;
	public int asiento;
	
	public Pasajero()
	{
		nombrePasajero = "";
		asiento = 0;
	}

	public Pasajero(String nombrePasajero, int asiento)
	{
		this.nombrePasajero = nombrePasajero;
		this.asiento = asiento;
	}

	public String getNombrePasajero()
	{
		return nombrePasajero;
	}

	public void setNombrePasajero(String nombrePasajero)
	{
		this.nombrePasajero = nombrePasajero;
	}

	public int getAsiento()
	{
		return asiento;
	}

	public void setAsiento(int asiento)
	{
		this.asiento = asiento;
	}
	
	@Override
	public String toString()
	{
		return "Pasajero [nombre = " + nombrePasajero + ", asiento = " + asiento + "]";
	}
}