import java.util.Scanner;
public class Ex2e{
    public static void main(String args[]){
        Scanner entradausr;
        entradausr = new Scanner(System.in);

        float bmenor;
        float bmaior;
        float altura;
        float area;

        System.out.println("Digite o Valor da Base MENOR do trapezio:");
        bmenor = entradausr.nextFloat();

        System.out.println("Digite o Valor da Base MAIOR do trapezio:");
        bmaior = entradausr.nextFloat();

        System.out.println("Digite o Valor da Base ALTURA do trapezio:");
        altura = entradausr.nextFloat();

        area = ((bmenor+bmaior)*altura)/2;

        System.out.printf("A Area do trapezio de bases %2f e %2f e altura de%2f vale %2f\n", bmenor, bmaior, altura, area);

    }



}