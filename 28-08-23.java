/*§Crie e implemente uma classe PopulacaoBaratas que simule o crescimento de uma população de baratas.
§O tamanho inicial da população de baratas é definido de forma Randômica. (pesquise o objeto Random...)
§O método aumentaBaratas, simula a proporção que a população de baratas vai se multiplicar.
§O método spray pulveriza as baratas com um inseticida e reduz a população em 10%.
§Implemente também uma classe que simule uma cozinha que tenha uma população de baratas
§Utilize a aumentaBaratas, utilize o spray, e imprima a contagem de baratas.*/
//main:
public class Main
{
	public static void main(String[] args) {
	    //declaração de objeto da classe PopulacaoBaratas
	    PopulacaoBaratas b = new PopulacaoBaratas();
		b.populacao = b.tamanhoInicial();
        
        System.out.printf("População inicial: %.0f\n", b.populacao);
        b.populacao = b.aumentaBaratas();
        System.out.printf("População depois de aumentar: %.0f\n", b.populacao);
        b.populacao = b.spray();
        System.out.printf("População depois do spray: %.0f", b.populacao);
	}
}
//classe PopulacaoBaratas:
import java.util.*;

public class PopulacaoBaratas {
    //atributos
    double populacao;
    
    //métodos
    int tamanhoInicial() {
        Random rand = new Random ();
        return rand.nextInt(1000) + 1;
    }
    
    double aumentaBaratas () {
        return populacao*1.15;
    }
    
    double spray () {
        return populacao*0.9;
    }
}
