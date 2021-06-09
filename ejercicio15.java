import java.util.*;

public class ejercicio15{
	
	public static void main(String[] args){
		int numero;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero cualquiera: ");
		numero = scanner.nextInt();
		
		if(numero == 0){
			System.out.println("El numero es nulo.");
		}else 
			if (numero > 0){
				System.out.println("El numero es positivo.");
		}else {
			System.out.println("El numero es negativo.");
		}
		
	}
}