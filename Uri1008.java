import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //variaveis

        int func, horas;
        double valor, salario;

        //entrada
        func = input.nextInt();
        horas = input.nextInt();
        valor = input.nextDouble();

        //processamento

        salario = (horas * valor);

        //saida
        System.out.println("NUMBER = " + func);
        System.out.printf("SALARY = U$ %.2f\n", salario);

    }

}