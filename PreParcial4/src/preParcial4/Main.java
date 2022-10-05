package preParcial4;

public class Main {

	public static void main(String[] args) {
		
		Sube sb = new Sube(300.0, "40205842" , "ffff", 0);
		
		System.out.println(sb.consultarSaldo());
		sb.acreditarSaldo(600.0);
		System.out.println(sb.consultarSaldo());
	}
	
}
