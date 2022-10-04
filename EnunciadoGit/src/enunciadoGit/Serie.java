package enunciadoGit;

import java.util.ArrayList;

public class Serie extends Obras{
	
	private Integer cantidadTemporadas;
	private ArrayList<Temporada> tmp;
		

	public Serie(String titulo, Integer cantidadTemporadas,ArrayList<Temporada> tmp ) {
		super(titulo);
		// TODO Auto-generated constructor stub
		this.cantidadTemporadas=cantidadTemporadas;
		this.tmp=tmp;
	}

	public Integer getCantidadTemporadas() {
		return cantidadTemporadas;
	}

	public void setCantidadTemporadas(Integer cantidadTemporadas) {
		this.cantidadTemporadas = cantidadTemporadas;
	}


	public ArrayList<Temporada> getTmp() {
		return tmp;
	}

	public void setTmp(ArrayList<Temporada> tmp) {
		this.tmp = tmp;
	}

	public void addTemporada (ArrayList<Temporada> tmp) {
		this.addTemporada(tmp);
	}
	
	
	@Override
	public String toString() {
		return "Serie: "+ super.getTitulo() + ", Temporadas: " + cantidadTemporadas +"\n" /*tmp.toString()*/;
	}

	
	

	
	
}
