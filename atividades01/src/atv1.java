import java.util.Scanner;

public class atv1 {

    public double total;
    public int cont;
    public double media;
    public static int dias = 7;

    public void leitura(double[] temp){
        Scanner tc = new Scanner(System.in);
        for(int i = 0; i < dias; i++){
            System.out.println("Dígite o valor da primeira temperatura");
            temp[i] = tc.nextDouble();

            total = temp[i] + total;
        }
    }

    public void calcularMedia(){
        media = total / dias;
    }

    public void contarDias(double[] temp){
        for(int i = 0; i < dias; i++){
            if(temp[i] > media){
                cont++;
            }
        }
    }

    public static void main(String[] args){
        double[] temperatura = new double[7];

        atv1 atividade = new atv1();
        atividade.leitura(temperatura);
        atividade.calcularMedia();
        atividade.contarDias(temperatura);

        System.out.println("Acima da media " + atividade.cont);
    }
}
