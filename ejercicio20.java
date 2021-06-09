import java.util.*;

public class ejercicio20{
	
	public static void main(String[] args){
		int d1, d2, d3, d4, d5, num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero de 5 digitos: ");
		num = scanner.nextInt();
		
		if (num>=10000 && num<=99999){
			d1 = (int) Math.ceil(num/10000)%10;
			d2 = (int) Math.ceil(num/1000)%10;
			d3 = (int) Math.ceil(num/100)%10;
			d4 = (int) Math.ceil(num/10)%10;
			d5 = (int) Math.ceil(num%10)%10;
			
			System.out.println("El numero 1 es: "+d1);
			System.out.println("El numero 2 es: "+d2);
			System.out.println("El numero 3 es: "+d3);
			System.out.println("El numero 4 es: "+d4);
			System.out.println("El numero 5 es: "+d5);
			
			if (d1==d5 && d2==d4){
				System.out.println("El numero es capicua");
			}else{
				System.out.println("El numero no es capicua");
			}
		}else{
			System.out.println("El numero que ingreso no tiene 5 digitos");
		}
	}
}