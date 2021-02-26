import java.util.Scanner;
    public class Uri1051{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);

            double sal, dif8, dif18, dif28, calculo, aliq0, aliq8, aliq18, aliq28;

            sal = input.nextFloat();

            if (sal > 0 && sal <=2000.00){
                aliq0 = (sal * 0 / 100);
                System.out.println("Isento");
            }

            else if (sal > 2000.01 && sal <= 3000.00){
                dif8 = sal - 2000.00;
                aliq8 = (dif8 * 8) / 100;
                calculo = aliq8 + 0.0;
                System.out.printf("R$ = %.2f\n", calculo);
            }
            else if (sal > 3000.01 && sal <= 4500.00){
                dif8 = sal - 2000.00;
                dif18 = sal - 3000.00;
                aliq8 = (dif8 * 8) / 100;
                aliq18 = (dif18 * 18) / 100;
                calculo = aliq8 + aliq18;
                System.out.printf("R$ = %.2f\n", calculo);
            }         
            
        }
    }
    