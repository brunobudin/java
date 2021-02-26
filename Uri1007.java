import java.util.Scanner;
    public class Uri1007{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);

            //variaveis

            Integer A, B, C, D, DIFERENCA;

            A = input.nextInt();
            B = input.nextInt();
            C = input.nextInt();
            D = input.nextInt();

            //processamento

            DIFERENCA = ((A * B) - (C * D));

            //saida

            System.out.println("DIFERENCA = " + DIFERENCA);

        }
    }