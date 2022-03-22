import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[5];

        //vetores resultantes
        int[] vetorC = new int[10];
        int[] vetorD = new int[10];
        int totalB = 0;

        //leituras
        lerVetor(vetorA, 10);
        lerVetor(vetorB, 5);

        for(int i =0; i< 5; i++){
            totalB = vetorB[i] + totalB;
        }

        int j = 0;
        for(int i = 0; i < 10; i++){
            if(vetorA[i]%2==0){
                vetorC[j] = totalB + vetorA[i];
                j++;
            }
        }

        int g = 0;
        for(int i = 0; i < 10; i++){
            if(vetorA[i]%2!=0){
                vetorD[g] = totalB + vetorA[i];
                g++;
            }
        }
        exibirVetor(vetorC, j);
        exibirVetor(vetorD, g);
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
            System.out.println(vetor[i]);
        }
    }
}
