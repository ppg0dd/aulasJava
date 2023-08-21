//Estamos usando o Apache NetBeans IDE 14 agora

//Primeiros testes mexendo com funções:

package com.mycompany.mavenproject1;

public class Mavenproject1 {
    
    public static int somar(int a, int b) {
        int s = a + b;
        return s;
    }
    

    public static void main(String[] args) {
        System.out.printf("\nComeçou!\n");
        int x = 5;
        int y = 3;
        int resultado = 0;
        resultado = somar(x, y);
        System.out.printf("\nResultado:\n" + resultado);
    }
} //vai retornar o valor 8

//quando a função encontra com o return, ela deixa de executar o resto, portanto, se colocar algo depois, vai ser ignorado.

package com.mycompany.mavenproject1;
import java.util.*;

public class Mavenproject1 {
    
    public static int somar(int a, int b) {
        int r = a + b;
        return r;
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x, y, resultado;
        System.out.printf("\n\tCalculadora:\n\n\t1\t2\t3\n\t4\t5\t6\n\t7\t8\t9\n\t\t0\n\n");
        
        x = scan.nextInt();
        y = scan.nextInt();
        resultado = somar(x, y);
        System.out.printf("\nResultado: "+ resultado);
    }
    
}

//terminar de fazer a calculadora
