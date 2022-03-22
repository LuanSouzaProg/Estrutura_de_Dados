import java.util.Scanner;

public class atv1 {

    static class Aluno{
        public double nota;
        public String nome;
    }

    public static void main(String[] args){
        Aluno[] alunos = new Aluno[5];
        double media = leitura(alunos, 5);

        for(int i = 0; i < 5; i++){
            if(alunos[i].nota > media){
                System.out.println("Aluno acima da média: " + alunos[i].nome);
            }
        }
    }

    public static double leitura(Aluno[] vetor, int tam){
        Scanner tc = new Scanner(System.in);
        double total = 0;

        for (int i=0; i<tam; i++){
            Aluno a = new Aluno();
            System.out.println("Digite a nota:");
            a.nota= tc.nextDouble();
            System.out.println("Digite a nome do aluno:");
            a.nome= tc.next();
            vetor[i] = a;
            total += vetor[i].nota;
        }
        return total / tam;
    }
}
