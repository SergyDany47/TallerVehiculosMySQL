package com.paquete.tallerSQL;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String potencia;
	private String matricula;
	private String averia;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getAveria() {
		return averia;
	}
	public void setAveria(String averia) {
		this.averia = averia;
	}
	public Vehiculo() {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.matricula = matricula;
		this.averia = averia;
	}
	
		
	
	
}
