import java.util.Scanner;
    public class Uri1035{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);

            // (1)se B for maior do que C
            //(2)se D for maior do que A
            //(3)a soma de C com D for maior que a soma de A e B
            //(4)se C e D, ambos, forem positivos
            //(5)se a variável A for par
            
            int A,B,C,D;

            A = input.nextInt();
            B = input.nextInt();
            C = input.nextInt();
            D = input.nextInt();

            if ((B > C) && (D > A) && (C + D > A + B) && (C > 0 && D > 0 ) && (A % 2 == 0))

            System.out.println("Valores aceitos");

            else

            System.out.println("Valores nao aceitos");

        }
    }