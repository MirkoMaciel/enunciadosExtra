package enunciadoGit;

public  class Obras { //Peliculas y episodios

	private String titulo;
	private Integer duracion;
	private Integer calificacion; //0 a 10 , 10 la mejor
	
	
	public Obras(String titulo) {
		super();
		this.titulo=titulo;
	}
	
	public Obras(String titulo, Integer duracion, Integer calificacion) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.calificacion = calificacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public Integer getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}
	

	@Override
	public String toString() {
		return titulo + ", Duracion(en minutos): " + duracion + ", Calificacion: " + calificacion;
	}
	
	
	
	
	
	
}
