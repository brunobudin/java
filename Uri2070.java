import java.util.Scanner;
public class Uri2070{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int D, pontos;

        D = input.nextInt();

        if  (D <=800){
            pontos = 1;
            System.out.println(+pontos);
        }
        else if (D > 800 && D <= 1400){
            pontos = 2;
            System.out.println(+pontos);
            
        }
        else if (D > 1400 && D <= 2000){
            pontos = 3;
            System.out.println(+pontos);
        }    
    }
}