import java.util.*;

public class ejercicio6{
	
	public static void main(String[] args){
		int numero = (int)(Math.random()*200+1);
		double multi,div,aumentado;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("El numero aleatorio esntre 0 y 200 es: "+numero);
		
		multi = numero*30;
		div = multi/100;
		aumentado = numero+div;
		
		System.out.println("El numero aleatorio aumentado en un 30% es: "+aumentado);
		
		
	}
}