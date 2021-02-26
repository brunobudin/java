import java.util.Scanner;
    public class Uri1114{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);

           int senha, tent;

           senha = 2002;

           do{
               tent = input.nextInt();
               if (tent != senha){
               System.out.println("Senha Invalida");
               }
           }
            while (senha != tent);
                    System.out.println("Acesso Permitido");
        }
    }