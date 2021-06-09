import java.util.*;

public class ejercicio10{
	
	public static void main(String[] args){
		double base, altura, area, perimetro;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la base del rectangulo: ");
		base = scanner.nextDouble();
		System.out.println("Ingrese la altura del rectangulo: ");
		altura = scanner.nextDouble();
		
		area = base*altura;
		perimetro = 2*(base+altura);
		
		System.out.println("El area del rectangulo es: "+area);
		System.out.println("El perimetro del rectangulo es: "+perimetro);
	}
}