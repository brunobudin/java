import java.util.Scanner;
    public class Uri1048{

        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            

            //variáveis
            float sal;
            float reajuste, nsal, perc;

            sal = input.nextFloat();
            
            if (sal >=0 && sal <= 400.00){
                perc = 15;
                reajuste = sal * perc / 100;
                nsal = reajuste + sal;
                System.out.printf("Novo salario: %.2f\n", nsal);
                System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                System.out.printf("Em percentual: %.0f %%\n", perc);
            }
            else if (sal >=400.01 && sal <= 800.00){
                perc = 12;
                reajuste = sal * perc / 100;
                nsal = reajuste + sal;
                System.out.printf("Novo salario: %.2f\n", nsal);
                System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                System.out.printf("Em percentual: %.0f %%\n", perc);
            }
            else if (sal >=800.01 && sal <= 1200.00){
                perc = 10;
                reajuste = sal * perc / 100;
                nsal = reajuste + sal;
                System.out.printf("Novo salario: %.2f\n", nsal);
                System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                System.out.printf("Em percentual: %.0f %%\n", perc);
            }
            else if (sal >=1200.01 && sal <= 2000.00){
                perc = 7;
                reajuste = sal * perc / 100;
                nsal = reajuste + sal;
                System.out.printf("Novo salario: %.2f\n", nsal);
                System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                System.out.printf("Em percentual: %.0f %%\n", perc);
            }   
            else if (sal >2000.00){
                perc = 4;
                reajuste = sal * perc / 100;
                nsal = reajuste + sal;
                System.out.printf("Novo salario: %.2f\n", nsal);
                System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                System.out.printf("Em percentual: %.0f %%\n", perc);
            }
            
        }
    }