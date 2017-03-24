import java.util.Scanner;
import java.io.*;
/*testting*/

public class mainarreglo{

	public static void main(String args[]) {

	
		
		double pounds[],datos;
		Scanner entrada= new Scanner(System.in);
		arreglo miarreglo= new arreglo();
		pounds= new double[12];


		do {

			System.out.println("digite la cantidad de datos");
			datos=entrada.nextDouble();




		}while( datos > 40);

			miarreglo.fuerzas(pounds, datos);
	
		

	}
}
