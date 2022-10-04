package enunciadoGit;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.Random;

public class generarObras {

	Random ran = new Random();
	ArrayList<Pelicula> peliculas = new ArrayList<>();
	ArrayList<Episodio> eps = new ArrayList<>();
	ArrayList<Temporada> temp = new ArrayList<>();
	ArrayList<Serie> ser = new ArrayList<>();

	public void genererObras() {

	}

	public void Caso1() {
		for (int i = 0; i < 2; i++) {
			eps.add(new Episodio("Titulo" + i, 90, 10, "12/02/02")); // Gebnero los espisodios

		}

		for (int i = 0; i < 2; i++) {
			temp.add(new Temporada(0 + i, eps.size(), eps)); // Genero la tempoarada
		}

		for (int i = 0; i < temp.size(); i++) {
			ser.add(new Serie("Marvel" + i, 2, temp));
		}

		for (int i = 0; i < ser.size(); i++) {
			System.out.print(ser.get(i).toString()); // Serie
			for (int j = 0; j < ser.get(i).getTmp().size(); j++) {
				System.out.print(ser.get(i).getTmp().get(j).toString() + ""); // Temporada
				for (int z = 0; z < ser.get(i).getTmp().get(j).getEpisodios().size(); z++) {
					System.out.print(ser.get(i).getTmp().get(i).getEpisodios().get(i).toString());
				}

			}
		}
	}

	public void caso2() { // Caso 2 enunciado

		for (int i = 0; i < ran.nextInt(3, 6); i++) {
			peliculas.add(new Pelicula("Titulo" + i, ran.nextInt(200), ran.nextInt(0, 10), 100.00, "Argentina"));
		}

	}

//	public void ordenarA () { 
//	
//		
//	Collections.sort(peliculas, new Comparator<Pelicula>() {
//		//@Override
//		public Integer compare(Pelicula p1, Pelicula p2) {
//			return new Integer(p1.getCalificacion()).compareTo(new Integer(p2.getCalificacion()));
//		}
//	});
//	
//	}

	public void imprimirCaso2() {
		for (int i = 0; i < peliculas.size(); i++) {
			System.out.println(peliculas.get(i).toString());
		}
	}

}
