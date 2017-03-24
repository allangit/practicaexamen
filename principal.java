import java.util.Scanner;
import java.io.*;
import javax.swing.*;

public class principal {

	public static void main(String args[]) {



		double datos;
		int i;
		Scanner entrada= new Scanner(System.in);
		ejemplo newtest= new ejemplo();
		
		do {


		System.out.println("digite la cantidad de elementos del arreglo");
		datos=entrada.nextDouble();


		}while( datos> 10) ;
		


			for (i=0; i < 20; i++) {
			
				newtest.density(i);


			}
	}
}
