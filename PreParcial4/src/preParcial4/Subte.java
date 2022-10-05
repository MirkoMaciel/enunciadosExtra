package preParcial4;

public class Subte extends Viaje {

	private Integer origen;
	private Integer llegada;
	
	
	public Subte(Double valor, Double descuento, Integer origen, Integer llegada) {
		super(valor, descuento);
		// TODO Auto-generated constructor stub
		this.origen=origen;
		this.llegada=llegada;
	}


	@Override
	public void calcularPrecio() {
		// TODO Auto-generated method stub
		var aux = this.llegada - this.origen;
		
		if (this.llegada == this.origen) {
			this.setValor(12.50);
		}else if (aux == 1 | aux == -1) {
			this.setValor(10.0);
		}else if (aux == 2 | aux == -2) {
			this.setValor(8.75);
		}else if (aux == 3 | aux == -3) {
			this.setValor(7.50);
		}
		
	}
	
	
	
	
}
