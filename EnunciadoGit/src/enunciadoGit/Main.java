package enunciadoGit;

import java.util.ArrayList;

public class Main {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pelicula p = new Pelicula("VEGETTA777", 120, 5, 100000.0 , "Argentina" );
		//Serie s = new Serie ("Marvel", 6);
		//Temporada t = new Temporada("Titulo");
		//Episodio e = new Episodio("Titulo2", 90, 10, "12/02/02");
		//Serie s = new Serie ();
		
//		ArrayList<Episodio> eps = new ArrayList<>();
//		ArrayList<Temporada> temp = new ArrayList<>();
//		ArrayList<Serie> ser = new ArrayList<>();
//		
//		Temporada te = new Temporada (1, 4 , eps );
		
		//System.out.println(s.toString());
		
		generarObras o = new generarObras();
		o.Caso1();
//		o.caso2();
//		o.imprimirCaso2();
		
		
		
//		for (int i = 0 ; i < 2 ; i++) {
//			eps.add(new Episodio("Titulo"+i, 90, 10, "12/02/02")); //Gebnero los espisodios
//			
//		}
//		
//		for (int i=0 ; i < 2 ; i++) {
//			temp.add(new Temporada (0+i,eps.size(),eps)); //Genero la tempoarada
//		}
//		
//		for (int i= 0 ; i < temp.size(); i++) {
//			ser.add(new Serie("Marvel"+i , 2, temp));
//		}
//		
//		for (int i = 0 ; i< 1; i++) {
//			System.out.print(ser.get(i).toString()); //Serie
//			for (int j = 0 ; j < ser.get(i).getTmp().size() ; j++) {
//			System.out.print(ser.get(i).getTmp().get(j).toString()+""); //Temporada
//				for (int z = 0 ; z < ser.get(i).getTmp().get(j).getEpisodios().size(); z++) {
//				System.out.print(ser.get(i).getTmp().get(i).getEpisodios().get(i).toString());
//				}
//				
//			}
//			System.out.println(
//			ser.get(i).getTmp().get(i).getEpisodios().get(i).toString());
		}
		

		//System.out.println(ser.toString());
		//System.out.println(ser.get(0).toString());
		//System.out.println(ser.get(1).toString());

		
//		System.out.println(te.toString());
//		te.imprimirEpisodios();
//		

	
		
		//System.out.println(p.toString());
		//System.out.println(e.toString());
		
		
//		public void imprimirXD (ArrayList<Serie> ser) {
//			for (int i = 0 ; i< ser.size(); i++) {
//				ser.get(i).getTmp().get(i).getEpisodios().get(i).toString();
//			}
//		}
		
	}

	
	
	


