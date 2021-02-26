import java.util.Scanner;
    public class Uri1073{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);

            int N, quad;
            quad = 0;
            N = input.nextInt();
            
            if (N % 2 == 0){
                
            }
                   
            for (int cont = 2; cont <= N; cont = cont + 2){
                quad = cont * cont;
                System.out.println(cont+ "^2 = " +quad);
                
            }
            

        }
    }