import java.util.Scanner;


public class control {


	private double temp,soil,gas,presion;


	/*METODOS GET*/

	public double gettemp() {


	return temp;

	}


	public double getsoil() {


	return soil;

	}


	public double getgas() {


	return gas;

	}


	public double getpresion() {


	return presion;

	}


	/*METODOS SET*/

	public void settemp(double temp) {


	this.temp=temp;

	}


	public void setsoil(double soil) {


	this.soil=soil;

	}


	public void setgas(double gas) {


	this.gas=gas;

	}


	public void setpresion(double presion) {


	this.presion=presion;

	}

	/*funcion principal*/


	public void mesuare(double temp,double soil, double gas,double presion) {



	this.temp=temp;
	this.soil=soil;
	this.gas=gas;
	this.presion=presion;

	}


}




