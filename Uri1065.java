import java.util.Scanner;
    public class Uri1065{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);

            int num, soma;

            soma = 0;
            
            for (int contador=1; contador <= 5; contador++){
                num = input.nextInt();
            
                    if (num % 2 == 0){
                    soma++;
                }
            }
            System.out.println(soma+" valores pares");    
        }
    }
    