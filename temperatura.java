
import java.util.Scanner;
import java.io.*;


public class temperatura {

	public static void main(String args[]) {

	
		
		double temp, gas, presion,soil;
		Scanner entrada= new Scanner(System.in);
		control newcontrol= new control();

		System.out.println("digite la temperatura");
		temp=entrada.nextDouble();
		System.out.println("digite la humedad");
		gas=entrada.nextDouble();
		System.out.println("digite la presion");
		presion=entrada.nextDouble();
		System.out.println("digite la soil");
		soil=entrada.nextDouble();

		newcontrol.mesuare(temp,soil,gas,presion);
	
		System.out.println("la temperatura es "+newcontrol.gettemp());
		
		newcontrol.settemp(36);
	
		System.out.println("la temperatura nueva es "+newcontrol.gettemp());

	}
}
