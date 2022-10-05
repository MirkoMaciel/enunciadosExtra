package preParcial4;

public class Colectivo extends Viaje{

	private Integer kilometros;
	
	public Colectivo(Double valor, Double descuento, Integer kilometros) {
		super(valor, descuento);
		// TODO Auto-generated constructor stub
		this.kilometros=kilometros;
	}

	public Integer getKilometros() {
		return kilometros;
	}

	public void setKilometros(Integer kilometros) {
		this.kilometros = kilometros;
	}

	@Override
	public void calcularPrecio() {
		// TODO Auto-generated method stub
		if (this.kilometros > 0 && this.kilometros < 3) {
			this.setValor(11.0);
		}else if (this.kilometros > 4 && this.kilometros < 6) {
			this.setValor(11.75);
		}else if (this.kilometros > 7 && this.kilometros < 12) {
			this.setValor(12.25);
		}else if (this.kilometros > 13 && this.kilometros < 27) {
			this.setValor(13.0);
		}else if (this.kilometros > 27) {
			this.setValor(13.75);
		}
	}
	
	
}
