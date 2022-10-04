package enunciadoGit;



public class Temporada extends Episodio {

	private Integer numero;
	private Integer cantidadEpisodio; //cantidad
	
	public Temporada(String titulo, Integer duracion, Integer calificacion, String fechaEmision, Integer numero, Integer cantidadEpisodio) {
		super(titulo, duracion, calificacion, fechaEmision);
		// TODO Auto-generated constructor stub
		this.numero=numero;
		this.cantidadEpisodio=cantidadEpisodio;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getCantidadEpisodio() {
		return cantidadEpisodio;
	}

	public void setCantidadEpisodio(Integer cantidadEpisodio) {
		this.cantidadEpisodio = cantidadEpisodio;
	}

	@Override
	public String toString() {
		return "Temporada [numero=" + numero + ", cantidadEpisodio=" + cantidadEpisodio + "]";
	}
	
	
	
	
	
}
