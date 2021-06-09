import java.util.*;

public class ejercicio14{
	
	public static void main(String[] args){
		int num1, num2, div;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese primer numero: ");
		num1 = scanner.nextInt();
		System.out.println("Ingrese segundo numero: ");
		num2 = scanner.nextInt();
		
		if (num2 != 0){
			div = num1/num2;
			System.out.println(div+". Es divisible");
		}else{
			System.out.println("No es divisible, ya que no se pued dividir entre 0");
		}	
		
	}
}