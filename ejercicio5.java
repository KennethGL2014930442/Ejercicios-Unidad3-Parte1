import java.util.*;

public class ejercicio5{
	
	public static void main(String[] args){
		int num,siguiente;
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		num = scanner.nextInt();
	
		siguiente = num+1;
	
		System.out.println("El numero que le sucede al numero ingresado es: "+siguiente);
	
	}
}