import java.util.*;

public class ejercicio2{
	
	public static void main(String[] args){
		String pais, capital;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre del pais: ");
		pais = scanner.nextLine();
		System.out.println("Ingrese el nombre de la capital del pais: ");
		capital = scanner.nextLine();
		
		System.out.println(""+capital+", es la capital de "+pais);
	}
}