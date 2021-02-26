import java.util.Scanner;
    public class Uri1067{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);

            int X, count;

            X = input.nextInt();
            count = 1;

            do{
                System.out.println(count);
                count = count+2;
            }
            
            while (count <= X);
                               
            

        }
    }