import java.util.Scanner;
    public class Uri1038{

        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            

            //variáveis

            int cod, qtd;
            double total;

            cod = input.nextInt();
            qtd = input.nextInt();
            
            if (cod == 1){
                total = 4.00f * qtd;
                System.out.printf("Total: R$ %.2f\n", total);
            }
            else if (cod == 2){
                total = 4.50f * qtd;
                System.out.printf("Total: R$ %.2f\n", total);
            }
            else if  (cod == 3){
                total = 5.00f * qtd;
                System.out.printf("Total: R$ %.2f\n", total);
            }
            else if (cod == 4){
                total = 2.00f * qtd;
                System.out.printf("Total: R$ %.2f\n", total);
            }
            else if (cod == 5){
                total = 1.50f * qtd;
                System.out.printf("Total: R$ %.2f\n", total);
            }
        }
    }