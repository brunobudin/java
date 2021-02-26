import java.util.Scanner;
public class Ex2h{
    public static void main(String args[]){
        Scanner inputusr;
        inputusr = new Scanner(System.in);

        double raio, altura, volume;
        double pi;

        pi = 3.14;

        System.out.println("Digite o raio da base do cilindro:");
        raio = inputusr.nextFloat();
        System.out.println("Digite a altura do cilindro:");
        altura = inputusr.nextFloat();
        
        volume = pi * raio * raio * altura;

        //System.out.println("Este é o volume do cilindro: " + volume); 
        
        // o print f concatena com o %f. e o ponto.numero é o numero de casas decimais. NEste caso use a virgula
        System.out.printf("Este é o volume do cilindro: %.3f\n", volume); 

    }



}