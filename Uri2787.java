import java.util.Scanner;
public class Uri2787{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int L, C;

        L = input.nextInt();
        C = input.nextInt();

        if ((L + C) % 2 == 0)
            System.out.println("1");
        
        else System.out.println("0");
    }
}