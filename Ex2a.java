
import java.util.Scanner;

public class Ex2a{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);

        float lado;
        float area;

        System.out.println("Digite o Valor de um dos lados do quadrado");
        lado = teclado.nextFloat();
        
        area = lado * lado;

        System.out.println("Area do seu qaudrado e: " + area);
        

    }



}
