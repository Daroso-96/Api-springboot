package com.bluesoft.api.rest.Bluesoft.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta")

public class Cuenta {
@Id
 private long cuenta;
 private String nombre;
 private double dinero;
 
 public Cuenta() {

 } 
 public Cuenta(long cuenta, String nombre, double dinero) {
     super();
     this.cuenta = cuenta;
     this.nombre = nombre;
     this.dinero = dinero;
 }

public long getCuenta() {
	return cuenta;
}

public void setCuenta(long cuenta) {
	this.cuenta = cuenta;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getDinero() {
	return dinero;
}

public void setDinero(double dinero) {
	this.dinero = dinero;
} 
 
}

