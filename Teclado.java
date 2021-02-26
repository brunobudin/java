import java.util.Scanner; //invoca o scanner

public class Teclado{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);

        int a;
        double b;

        System.out.println("Digite o valor Inteiro");
        a = teclado.nextInt();
        System.out.println("Voce digitou = " + a);

        System.out.println("Digite o valor Real");
        b = teclado.nextDouble();
        System.out.println("Voce digitou = " + b);
         

    }


}
    


