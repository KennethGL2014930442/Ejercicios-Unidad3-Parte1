import java.util.*;

public class ejercicio9{
	
	public static void main(String[] args){
		String palabra1, palabra2, pl1, pl2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la primera palabra: ");
		palabra1 = scanner.nextLine();
		System.out.println("Ingrese la segunda palabra: ");
		palabra2 = scanner.nextLine();
		
		pl1 = palabra2;
		pl2 = palabra1;
		
		System.out.println("La primera palabra ahora es: "+pl1);
		System.out.println("La segunda palabra ahora es: "+pl2);
		
	}
}