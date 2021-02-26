import java.util.Scanner;
    public class Uri1070{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);

            int X;

            X = input.nextInt();
            
            if (X % 2 == 0){
                X++;
            }

            for (int count=1; count <= 6; X = X+2){
                count++;
                System.out.println(X);
            }

        }
    }