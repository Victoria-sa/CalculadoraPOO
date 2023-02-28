package calculadoraPoo;
import java.util.Scanner;
/**
 * 
 * @author Victoria
 *
 */
public class CalculadoraPOO {
	
	

		//Mostramos Menú con un método estático
		public static void menu() {
	        System.out.println("***** CALCULADORA *****");
	        System.out.println("1.  SUMAR              ");
	        System.out.println("2.  RESTAR             ");
	        System.out.println("3.  MULTIPLICAR        ");
	        System.out.println("4.  DIVIDIR            ");
	        System.out.println("5.  RESTO              ");
	        System.out.println("6.  EXPONENCIAL        ");
	        System.out.println("0.  SALIR              ");
	    }
	    

		    public static void main(String[] args) {
		        Scanner lector = new Scanner(System.in);
		        int opcion;//declaro las variables opcion y num1,num2.
		        double num1, num2;
		        
		        do {
		            menu();
		            System.out.print(" ELIJA UNA OPERACION = ");//Pedimos al usuario que elija una operación
		            opcion = lector.nextInt();
		          

		            if (opcion == 0) {//Si la opcion es 0 saldrá del programa
		                break;
		            }

		            System.out.print(" INTRODUZCA UN NUMERO >> ");//Pedimos al usuario dos números
		            num1 = lector.nextDouble();
		            System.out.print(" INTRODUZCA OTRO NUMERO >> ");
		            num2 = lector.nextDouble();

		            switch (opcion) {
		                case 1:
		                    System.out.println(num1 + " + " + num2 + " = " + sumar(num1, num2));
		                    break;
		                case 2:
		                    System.out.println(num1 + " - " + num2 + " = " + restar(num1, num2));
		                    break;
		                case 3:
		                    System.out.println(num1 + " * " + num2 + " = " + multiplicar(num1, num2));
		                    break;
		                case 4:
		                    if (num2 == 0) {
		                        System.out.println("Error: no se puede dividir entre cero.");
		                    } else {
		                        System.out.println(num1 + " / " + num2 + " = " + dividir(num1, num2));
		                    }
		                    break;
		                case 5:
		                    if (num2 == 0) {
		                        System.err.println("Error: no se puede dividir entre cero.");
		                    } else {
		                        System.out.println(num1 + " % " + num2 + " = " + resto(num1, num2));
		                    }
		                    break;
		                case 6:
		                    System.out.println(num1 + " ^ " + num2 + " = " + exponencial(num1, num2));
		                    break;
		                default:
		                    System.err.println("Opción inválida.");
		                    break;
		            }
		            System.out.println();
		        } while (opcion != 0);

		        lector.close();
		    }

		  

		    private static double sumar(double num1, double num2) {
		        return  Math.absExact((int)num1 +  (int)num2);
		    }
		    private static double restar(double num1, double num2) {
		        return  Math.subtractExact((int)num1 - (int)num2,0);
		    }

		    private static double multiplicar(double num1, double num2) {
		        return Math.multiplyExact((int)num1 , (int) num2 );
		    }

		    private static double dividir(double num1, double num2) {
		        return num1 / num2;
		    }

		    private static double resto(double num1, double num2) {
		        return num1 % num2;
		    }

		    private static double exponencial(double num1, double num2) {
		        return Math.pow(num1, num2);
		    }
		}

		

