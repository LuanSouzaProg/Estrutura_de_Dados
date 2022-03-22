import java.util.Scanner;

public class atv2 {

    public static void main(String[] args) {

        double[] vetor = new double[5];
        int menu = 0;

        Scanner tc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o valor");
            vetor[i] = tc.nextDouble();
        }

        System.out.println("Digite a opção");
        menu = tc.nextInt();

        switch (menu){
            case 1: {
                //ordem normal
                for(int i = 0; i < 5; i++){
                    System.out.println(vetor[i]);
                }
                break;
            }

            case 2:{
                //ondem inversa
                for(int i = 4; i >= 0; i--){
                    System.out.println(vetor[i]);
                }
                break;
            }

            default:{
                //sair
                System.out.println("Bye Bye");
            }
            break;
        }


    }

}
