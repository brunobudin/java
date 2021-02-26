import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int hi, hf, horas;

        hi = input.nextInt();
        hf = input.nextInt();

        if (hi < hf){
            horas = hf - hi;
            System.out.println("O JOGO DUROU " + horas + " HORA(S)");
        }
        else if (hi > hf){
            horas = 24 - (hi - hf);
            System.out.println("O JOGO DUROU " + horas + " HORA(S)");
        }
        else if (hi == hf){
            horas = 24;
            System.out.println("O JOGO DUROU " + horas + " HORA(S)");
        }


    }
}