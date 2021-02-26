import java.util.Scanner;

public class Uri1006{
 public static void main(String args[]){
     Scanner input = new Scanner(System.in);
     
    // Variaveis
    Double A, B, C, MEDIA;

    // Entrada

    A = input.nextDouble();
    B = input.nextDouble();
    C = input.nextDouble();

    // Processamento

    MEDIA = ((A * 2) + (B * 3) + (C * 5)) /10;

    // Saida

    System.out.printf("MEDIA = %.1f\n", MEDIA);

 }

}