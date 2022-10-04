package enunciadoGit;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula p = new Pelicula("Titulo", 120, 5, 100000.0 , "Argentina" );
		Episodio e = new Episodio("Titulo2", 90, 10, "12/02/02");
		
		
		System.out.println(p.toString());
		System.out.println(e.toString());
		
		
	}

}
