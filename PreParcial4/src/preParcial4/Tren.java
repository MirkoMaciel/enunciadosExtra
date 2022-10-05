package preParcial4;

public class Tren extends Viaje {

	private Integer tramos;
	
	public Tren(Double valor, Double descuento, Integer tramos) {
		super(valor, descuento);
		// TODO Auto-generated constructor stub
		this.tramos=tramos;
	}

	public Integer getTramos() {
		return tramos;
	}

	public void setTramos(Integer tramos) {
		this.tramos = tramos;
	}

	@Override
	public void calcularPrecio() {
		// TODO Auto-generated method stub
		switch (this.tramos) {
		case 1 : this.setValor(3.75);
			break;
		case 2 : this.setValor(4.50);
			break;
		case 3 : this.setValor(6.25);
			break;	
		case 4 : this.setValor(6.50);
			break;
		case 5 : this.setValor(7.75);
			break;
		case 6 : this.setValor(9.25);
			break;
		}
	}

	
	
	
	
}
