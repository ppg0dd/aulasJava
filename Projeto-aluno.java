import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		Aluno c1 = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		String nome = scan.nextLine();
		c1.setNome(nome);
		
		System.out.println("Digite o curso do aluno: ");
		String curso = scan.nextLine();
		c1.setCurso(curso);
		
		System.out.println("Digite a turma do aluno (A, B, C ou D): ");
		String turma = scan.nextLine();
		c1.setTurma(turma);
		
		System.out.println("Digite o período do aluno (1 - 8): ");
		int periodo = scan.nextInt();
		c1.setPeriodo(periodo);
		
		System.out.printf("\nMatrícula: %s\nNome: %s\nCurso: %s\nTurma: %s\nPeriodo: %d", c1.getMatricula(), c1.getNome(), c1.getCurso(), c1.getTurma(), c1.getPeriodo());
	    
	    System.out.println("\n\nDigite sua nota do 1 Bimestre: ");
	    double nota1 = scan.nextDouble();
	    System.out.println("\nDigite sua nota do 2 Bimestre: ");
	    double nota2 = scan.nextDouble();
	    
	    String status;
	    
	    if (nota1+nota2 < 6) {
	        status = "Reprovado.";
	    } else if(nota1+nota2 < 14) {
	        System.out.println("\nDigite sua nota da prova final");
	        double notaFinal = scan.nextDouble();
	        if (notaFinal + ((nota1+nota2)/2) < 10) {
	            status = "Reprovado.";
	        } else {
	            status = "Aprovado.";
	        } 
	    }else {
	        status = "Aprovado.";
	    }
	    
	    System.out.println("\n" + status);
	    
	    if (status == "Aprovado.") {
	        c1.passarPeriodo();
	        System.out.println("\n\nO aluno deseja ir para qual turma para o próximo período? \n1-A\n2-B\n3-C\n4-D");
	        int novaTurma = scan.nextInt();
	        switch (novaTurma){
	            case 1:
	                c1.setTurma("A");
	                break;
	            case 2:
	                c1.setTurma("B");
	                break;
	            case 3:
	                c1.setTurma("C");
	                break;
	            case 4:
	                c1.setTurma("D");
	            default:
	                break;
	        }
	    }

	    
	    
	    System.out.printf("\nMatrícula: %s\nNome: %s\nCurso: %s\nTurma: %s\nPeriodo: %d", c1.getMatricula(), c1.getNome(), c1.getCurso(), c1.getTurma(), c1.getPeriodo());
	}
}



import java.util.*;


public class Aluno 
{
    //MATRICULA
    private String matricula;
    
    public Aluno() {
        Random rand = new Random ();
        int i = rand.nextInt(10000);
        String matricula = "2023" + i; 
        this.matricula = matricula;
    }
    
    public String getMatricula () {
        return this.matricula;
    }
    
    
    
    //NOME
    private String nome;
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //CURSO
    private String curso;
    
    public String getCurso() {
        return this.curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //TURMA
    private String turma;
    
    public String getTurma() {
        return this.turma;
    }
    
    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    //PERIODO
    private int periodo;
    
    public int getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    public void passarPeriodo() {
        this.periodo += 1;
    }
       
}
