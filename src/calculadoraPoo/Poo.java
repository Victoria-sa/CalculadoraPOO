package calculadoraPoo;

import java.util.Scanner;
/**Calculadora con Arrays 
 * 
 * @author Programador
 *
 */
public class Poo {
	


	  public static void main(String[] args) {
	    double num1, num2;
	    Scanner lector = new Scanner(System.in);
	    System.out.println(" INGRESE EL PRIMER NUMERO ->> ");
	    num1 = lector.nextDouble();
	    System.out.println(" INGRESE EL SEGUNDO NUMERO ->>");
	    num2 = lector.nextDouble();
	    double[] resultados = new double[6];
	    resultados[0] = Math.addExact((int)num1, (int)num2);
	    resultados[1] = Math.subtractExact((int)num1, (int)num2);
	    resultados[2] = Math.multiplyExact((int)num1, (int)num2);
	    resultados[3] = num1 / num2;
	    resultados[4] = num1 % num2;
	    resultados[5] = Math.pow(num1, num2);
	    
	    System.out.println("Los resultados son: ");
	    String[] operaciones = {"Suma", "Resta", "Multiplicación", "División","Resto","Exponencial"};
	    for(int i=0; i<6; i++){
	      System.out.println(operaciones[i] + " : " + resultados[i]);
	    }
	  }
	

	
	
	
	
	
}
