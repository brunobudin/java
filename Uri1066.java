import java.util.Scanner;
    public class Uri1066{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);

            int num, qtdpar, qtdimpar, qtdneg, qtdpos;

            qtdpar=0;
            qtdimpar=0;
            qtdneg=0;
            qtdpos=0;
            
            for (int cont=1 ; cont <=5; cont++){
                num = input.nextInt();

                if (num % 2 == 0){
                    qtdpar++;
                }
                    else{
                    qtdimpar++;
                    }                
                if (num < 0){
                    qtdneg++;
                    }
                    else if (num > 0){
                    qtdpos++;
                    }
            }
            System.out.println(qtdpar+" valor(es) par(es)");
            System.out.println(qtdimpar+" valor(es) impar(es)");
            System.out.println(qtdpos+" valor(es) positivo(s)");
            System.out.println(qtdneg+" valor(es) negativo(s)");
        }
    }