import java.util.*;

public class ejercicio19{
	
	public static void main(String[] args){
		int numero = (int)(Math.random()*1000+1);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("El numero aleatorio entre 0 y 1000 es: "+numero);
		
		if(numero%5==0 && numero<=125){
			System.out.println("Correcto");			
		}else{
			System.out.println("Incorrecto");			
		}
	}
}