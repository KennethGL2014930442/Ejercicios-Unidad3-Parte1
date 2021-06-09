import java.util.*;

public class ejercicio17{
	
	public static void main(String[] args){
		double base, lado1, lado2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la medida de la base: ");
		base = scanner.nextDouble();
		System.out.println("Ingrese la medida del lado 1: ");
		lado1 = scanner.nextDouble();
		System.out.println("Ingrese la medida del lado 2: ");
		lado2 = scanner.nextDouble();
		
		if (base==lado1 && base==lado2){
			System.out.println("Es un triangulo equilatero.");
		}else 
			if(lado1==lado2){
				System.out.println("Es un triangulo isosceles.");
			}else{
				System.out.println("Es un triangulo escaleno.");
			}
		
	}
}