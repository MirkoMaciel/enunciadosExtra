package preParcial4;

import java.util.ArrayList;

public class Sube {

	private Double saldoActual;
	private String dniDueño;
	private String contraseña;
	private Integer cantidadViaje;
	ArrayList<Viaje> viajes = new ArrayList<>();
	
	
	public Sube(Double saldoActual, String dniDueño, String contraseña, Integer cantidadViaje) {
		super();
		this.saldoActual = saldoActual;
		this.dniDueño = dniDueño;
		this.contraseña = contraseña;
		this.cantidadViaje = cantidadViaje;
	}
	
	public Double acreditarSaldo (Double saldo) {
		return this.saldoActual= this.saldoActual + saldo;
	}
	
	public Double consultarSaldo () {
		return this.saldoActual;
	}
	
	public Boolean pagarViaje (Double costoViaje) {
		if (costoViaje < this.saldoActual ) {  
			return true;
		}else if (this.saldoActual > -30 & this.saldoActual < 0  & costoViaje < 30) {
			return true;
		}return false;
	}
	
	public void informeMensual () {
		
	}

	public Double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(Double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public String getDniDueño() {
		return dniDueño;
	}

	public void setDniDueño(String dniDueño) {
		this.dniDueño = dniDueño;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Integer getCantidadViaje() {
		return cantidadViaje;
	}

	public void setCantidadViaje(Integer cantidadViaje) {
		this.cantidadViaje = cantidadViaje;
	}

	public ArrayList<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(ArrayList<Viaje> viajes) {
		this.viajes = viajes;
	}
		
	public void addIntegrante (ArrayList<Viaje> viajes) {
		this.addIntegrante(viajes);
	}
	
	
	
}
