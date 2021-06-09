import java.util.*;

public class ejercicio3{
	
	public static void main(String[] args){
		int num, doble, triple;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		num = scanner.nextInt();
		
		doble = 2*num;
		triple = 3*num;
		
		System.out.println("El doble del numero entero es: "+doble);
		System.out.println("El triple del numero entero es: "+triple);
		
	}
}