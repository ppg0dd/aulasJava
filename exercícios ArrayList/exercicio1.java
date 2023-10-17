/*Exercício 1:
Crie um programa Java que armazene uma lista de nomes em um ArrayList. 
Em seguida, remova os nomes que começam com a letra "A" e imprima a lista resultante.*/


import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args) {
		List<String> listaDeNomes = new ArrayList<>();
		
		listaDeNomes.add("Alexia");
		listaDeNomes.add("Arthur");
		listaDeNomes.add("Diogo");
		listaDeNomes.add("Jõao");
		listaDeNomes.add("Davi");
		listaDeNomes.add("Amanda");
		
		for (int i = 0; i < listaDeNomes.size(); i++) {
		    if ((listaDeNomes.get(i)).charAt(0) == 'A') {
		        listaDeNomes.remove(i);
		        i--;
		    }
		}
		for (String nome : listaDeNomes) {
		    System.out.println(nome);
		}
	}
}
