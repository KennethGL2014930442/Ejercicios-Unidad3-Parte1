import java.util.*;

public class ejercicio4{
	
	public static void main(String[] args){
		int num, cuad, cubo;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		num = scanner.nextInt();
		
		cuad = num*num;
		cubo = num*num*num;
		
		System.out.println("El cuadrado del numero entero es: "+cuad);
		System.out.println("El cubo del numero entero es: "+cubo);
		
	}
}