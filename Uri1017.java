import java.util.Scanner;
    public class Uri1017{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);

            //variaveis
            int Velo, Temp;
            double Dist, Comb;
            
            //entrada
            Temp = input.nextInt();
            Velo = input.nextInt();

            //processamento
            Dist = (Temp * Velo);
            Comb = (Dist / 12);

            //saida
            System.out.printf("%.3f\n", Comb);


        }
    }