import java.util.*;

public class ejercicio12{
	
	public static void main(String[] args){
		double celsius, farenheit;
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Ingrese la temperatura en grados Celsius: ");
		celsius = scanner.nextDouble();
		
		farenheit = (celsius*1.8)+32;
		
		System.out.println("La conversion a grados farenheit es: "+farenheit);
		
	}
}