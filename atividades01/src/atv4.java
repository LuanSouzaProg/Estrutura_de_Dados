import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        lerVetor(vetor, 10);
        exibirVetor(vetor, 10);

    }
    public static void lerVetor(int[] vetor, int tamanho){
        Scanner tc = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++){
            System.out.println("digite o valor");
            vetor[i] = tc.nextInt();
        }
    }

    public static void exibirVetor(int[] vetor, int tamanho){
        for (int i = 0; i < tamanho; i++){
            if(vetor[i] > 50){
                System.out.println("valor: " + vetor[i] + " posição: " + (i + 1));

            }
            System.out.println(vetor[i]);
        }
    }
}
