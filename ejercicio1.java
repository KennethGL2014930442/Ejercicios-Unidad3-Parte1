import java.util.*;

public class ejercicio1{
	
	public static void main(String[] args){
		int num1, num2,s;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		num1 = scanner.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		num2 = scanner.nextInt();
		
		s = num1+num2;
		
		System.out.println("El resultado de la suma es: "+s);
		
	}
}