import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int sair = 0;
		int op = 0;
		int valor1 = 0;
		int valor2 = 0;
		int resultado = 0;
		
		while (sair == 0) {
		    
		System.out.printf("\n\t\tMENU");
		System.out.printf("\n\t1 - Soma");
		System.out.printf("\n\t2 - Subtração");
		System.out.printf("\n\t3 - Divisão");
		System.out.printf("\n\t4 - Muliplicação");
		System.out.printf("\n\t0 - SAIR\n\n");
		op = scan.nextInt();
		
		switch (op) {
		    case 1: 
		        System.out.println("\nDigite dois valores para soma-los: \n");
		        valor1 = scan.nextInt();
		        valor2 = scan.nextInt();
		        resultado = valor1 + valor2;
		        break;
		    case 2:
		        System.out.println("\nDigite dois valores para subtrai-los: \n");
		        valor1 = scan.nextInt();
		        valor2 = scan.nextInt();
		        resultado = valor1 - valor2;
		        break;
		    case 3: 
		        System.out.println("\nDigite dois valores para dividi-los: \n");
		        valor1 = scan.nextInt();
		        valor2 = scan.nextInt();
		        resultado = valor1 / valor2;
		        break;
		    case 4:
		        System.out.println("\nDigite dois valores para multiplica-los: \n");
		        valor1 = scan.nextInt();
		        valor2 = scan.nextInt();
		        resultado = valor1 * valor2;
		        break;
		    case 0:
		        sair = 1;
		        break;
		    default:
		        System.out.println("Opção inválida.");
		        break;
		}
		System.out.printf("\nO resultado é %d\n", resultado);
	    }
	}
}
