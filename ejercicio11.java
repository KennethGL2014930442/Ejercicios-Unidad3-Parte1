import java.util.*;

public class ejercicio11{
	
	public static void main(String[] args){
		double centi, yard, m, ft, plg;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero en centimetros: ");
		centi = scanner.nextDouble();
		
		yard = centi*0.0109361;
		m = centi*0.01;
		ft = centi*0.0328084;
		plg = centi*0.393701;
		
		System.out.println("La conversion a yardas es de: "+yard);
		System.out.println("La conversion a metros es de: "+m);
		System.out.println("La conversion a pies es de: "+ft);
		System.out.println("La conversion a pulgadas es de: "+plg);
		
	}
}