import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);

        //variaveis

        int X;
        double Y, consumo;

        //entrada
        X = input.nextInt();
        Y = input.nextDouble();

        //processamento
        consumo = (X / Y);

        //saida
        System.out.printf("%.3f km/l\n", consumo);
    }

}