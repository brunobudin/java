import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //variaveis
        int N;
        int seg, min, hora;
        int resto;

        //entrada
        N = input.nextInt();

        //processamento
        
        hora = N / 3600;
        resto = N % 3600;
        min = resto / 60;
        seg = resto % 60;

        //saida
        System.out.println(hora + ":" + min + ":" + seg);

    }
}

