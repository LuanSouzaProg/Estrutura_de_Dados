import java.util.Random;

public class Estatisticas {

    public static void main(String[] args){

        int [][] matriz = new int[5][5];
        int linha, coluna;
        int[] vetor = new int [25];
        int media, total = 0;

        for (linha = 0; linha < 5; linha++){
            for (coluna = 0; coluna < 5; coluna++){
                Random rand = new Random();
                matriz[linha][coluna] = rand.nextInt(35);
                total += matriz[linha][coluna];
            }
        }
        media = total/25;

        int i = 0;
        for (linha = 0; linha < 5; linha++){
            for (coluna = 0; coluna < 5; coluna++){
                vetor[i] = matriz[linha][coluna];
                i++;
            }
        }

        for (i = 0; i < 25; i++){
            for (int j = i+1; j < 25; j++){
                if(vetor[i] > vetor[j]){
                    int temp = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = temp;
                }
            }
        }

        for (i = 0; i < 25; i++){
            System.out.println(vetor[i]);
        }

        int qtdModa = 0;
        int moda = vetor[0];

        for (int j = 0; j < 25; j++){
            int previosModa = contar(vetor, vetor[j]);
            System.out.println(vetor[j]+ "X" + previosModa);
            if(previosModa >= qtdModa){
                moda = vetor[j];
                qtdModa = previosModa;
            }
        }

        System.out.println("Mediana: " + vetor[24/2]);
        System.out.println("Média: " + media);
        System.out.println("Moda:" + moda);
    }

    static int contar(int[] vetor, int x){
        int cont = 0;
        for (int j : vetor) {
            if (x == j) {
                cont++;
            }
        }
        return cont;
    }
}
