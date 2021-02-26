import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        float A, B, C, soma;

        A = input.nextFloat();
        B = input.nextFloat();
        C = input.nextFloat();

        if ((A + B > C) && (A + C > B) && (B + C > A)){
            soma = A + B + C;
            System.out.printf("Perimetro = %.1f\n", soma);
        
        }
        else{
            soma = ((A + B) * C)/2;
            System.out.printf("Area = %.1f\n", soma);
           
        
        }
    }
}