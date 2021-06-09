import java.util.*;

public class ejercicio7{
	
	public static void main(String[] args){
		int numero = (int)(Math.random()*(50-10+1)+10);
		double multi,div,disminuido;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("El numero aleatorio esntre 10 y 50 es: "+numero);
		
		multi = numero*15;
		div = multi/100;
		disminuido = numero-div;
		
		System.out.println("El numero aleatorio disminuido en un 15% es: "+disminuido);
		
		
	}
}