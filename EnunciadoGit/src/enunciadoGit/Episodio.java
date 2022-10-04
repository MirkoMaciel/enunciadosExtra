package enunciadoGit;


public class Episodio extends Obras {

	private String fechaEmision;

	public Episodio(String titulo, Integer duracion, Integer calificacion, String fechaEmision) {
		super(titulo, duracion, calificacion);
		// TODO Auto-generated constructor stub
		this.fechaEmision = fechaEmision;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

//	public Calendar seteoFecha () {
//		return new GregorianCalendar(12,12,12);	
//	}

	
//	public Date seteoFecha () {
//		return fechaEmision.getTime();
//	}

	@Override
	public String toString() {
		return super.toString() + ", Fecha emision: " + fechaEmision;
	}

}
