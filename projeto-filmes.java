//main
public class Main
{
	public static void main(String[] args) {
		filme meuFilme = new filme();
		meuFilme.nome = "O poderoso chefão";
		meuFilme.anoDeLancamento = 1970;
		meuFilme.duracaoEmMinutos = 180;
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(6);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		System.out.println(meuFilme.somaDasAvaliacoes);
		System.out.println(meuFilme.totalDeAvaliacoes);
		System.out.println(meuFilme.pegaMedia());
	}
}

//classe filme
public class filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;
    
    void exibeFichaTecnica() {
        System.out.println(nome);
		System.out.println(anoDeLancamento);
    }
    
    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    
    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
