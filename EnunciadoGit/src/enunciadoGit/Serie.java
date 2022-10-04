package enunciadoGit;


public class Serie extends Temporada{
	
	private Integer cantidadTemporadas;
	
	public Serie(String titulo, Integer duracion, Integer calificacion, String fechaEmision, Integer numero,
			Integer cantidadEpisodio, Integer cantidadTemporadas) {
		super(titulo, duracion, calificacion, fechaEmision, numero, cantidadEpisodio);
		// TODO Auto-generated constructor stub
		this.cantidadTemporadas=cantidadTemporadas;
		
		
	}

	public Integer getCantidadTemporadas() {
		return cantidadTemporadas;
	}

	public void setCantidadTemporadas(Integer cantidadTemporadas) {
		this.cantidadTemporadas = cantidadTemporadas;
	}

	
	

	
	
}
