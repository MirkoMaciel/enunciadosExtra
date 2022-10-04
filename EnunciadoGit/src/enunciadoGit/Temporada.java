package enunciadoGit;

import java.util.ArrayList;

public class Temporada  {

	private Integer numero;
	private Integer cantidadEpisodio; //cantidad
	private ArrayList<Episodio> episodios;
	

	public Temporada(Integer numero, Integer cantidadEpisodio, ArrayList<Episodio> episodios) {
		super();
		this.numero = numero;
		this.cantidadEpisodio = cantidadEpisodio;
		this.episodios = episodios;
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

	
	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}

	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}

	public void addEpisodio (ArrayList<Episodio> eps) {
		this.addEpisodio(eps);
	}
	
	
	public void imprimirEpisodios() {
		for (int i = 0 ; i < episodios.size() ; i++) {
			System.out.println(episodios.get(i).toString());
		}
	}
	
	@Override
	public String toString() {
		return "\nTemporada: " + numero + " (Cantidad de Episodio:" + cantidadEpisodio + ")"+
				"\nEpisodios: "/*episodios.toString()*/;
	}
	
	
	
	
	
}
