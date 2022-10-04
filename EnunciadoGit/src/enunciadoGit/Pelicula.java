package enunciadoGit;

public class Pelicula extends Obras{

	private Double recaudacion;
	private String pais;
	
	public Pelicula(String titulo, Integer duracion, Integer calificacion, Double recaudacion , String pais) {
		super(titulo, duracion, calificacion);
		// TODO Auto-generated constructor stub
		this.recaudacion=recaudacion;
		this.pais=pais;
	}

	public Double getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(Double recaudacion) {
		this.recaudacion = recaudacion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Pelicula: "+super.toString()+", Recaudacion (En miles de pesos): "+ recaudacion + ", Pais:" + pais;
	}


	

	
	
	
	
}
