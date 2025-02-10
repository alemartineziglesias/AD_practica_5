package com.example.AD_5_practica;

import java.util.ArrayList;
import java.util.List;

public class Viaje
{
	private String nombreViaje;
	private String origen;
	private String destino;
	private Tren tren;
	private List<Pasajero> pasajeros;
	
	public Viaje()
	{
		nombreViaje = "";
		origen = "";
		destino = "";
		tren = new Tren();
		pasajeros = new ArrayList<Pasajero>();
	}

	public Viaje(String nombreViaje, String origen, String destino, Tren tren, List<Pasajero> pasajeros)
	{
		this.nombreViaje = nombreViaje;
		this.origen = origen;
		this.destino = destino;
		this.tren = tren;
		this.pasajeros = pasajeros;
	}

	public String getNombreViaje()
	{
		return nombreViaje;
	}

	public void setNombreViaje(String nombreViaje)
	{
		this.nombreViaje = nombreViaje;
	}

	public String getOrigen()
	{
		return origen;
	}

	public void setOrigen(String origen)
	{
		this.origen = origen;
	}

	public String getDestino()
	{
		return destino;
	}

	public void setDestino(String destino)
	{
		this.destino = destino;
	}

	public Tren getTren()
	{
		return tren;
	}

	public void setTren(Tren tren)
	{
		this.tren = tren;
	}

	public List<Pasajero> getPasajeros()
	{
		return pasajeros;
	}

	public void setPasajeros(List<Pasajero> pasajeros)
	{
		this.pasajeros = pasajeros;
	}
	
	@Override
	public String toString()
	{
		return "Viaje [nombre = " + nombreViaje + ", origen = " + origen + ", destino = " + destino + ", tren = " + tren + ", pasajeros = " + pasajeros + "]";
	}
}
