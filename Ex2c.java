import java.util.Scanner;

public class Ex2c{
    public static void main(String args[]){

    Scanner input;
    input = new Scanner(System.in);

    float base;
    float altura;
    float area;

    System.out.println("Digite o valor da base do triagulo");
    base = input.nextFloat();

    System.out.println("Digite o valor da altura do triangulo");
    altura = input.nextFloat();

    area = (base * altura)/2;

    System.out.println("A Area do seu triangulo e: " + area);
        
    }



}