import java.util.*;

public class ejercicio8{
	
	public static void main(String[] args){
		int num1, num2, num3;
		double promedio;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		num1 = scanner.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		num2 = scanner.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		num3 = scanner.nextInt();
		
		promedio = (num1+num2+num3)/3;
		
		System.out.println("El promedio de los tres numeros es: "+promedio);
				
		
	}
}