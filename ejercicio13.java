import java.util.*;

public class ejercicio13{
	
	public static void main(String[] args){
		double radio, altura, volumen;
		double PI = 3.1416;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el radio del cilindro: ");
		radio = scanner.nextDouble();
		System.out.println("Ingrese el altura del cilindro: ");
		altura = scanner.nextDouble();
		
		if (radio > 0){
			if (altura > 0){
				volumen = PI*radio*radio*altura;
				System.out.println("El volumen del cilindro es: "+volumen);
			}else{
				System.out.println("No se puede calcular el volumen ya que altura < 0");	
			}
		}else{
			System.out.println("No se puede calcular el volumen ya que radio < 0");	
		}
	}
}