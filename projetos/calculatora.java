import java.util.Scanner;
 
public class Calculatora{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha dois números para calcular"); 
        System.out.println("Escolha o primeiro número ");
        int Numero1 = entrada.nextInt();
        System.out.println("escolha o segundo número");
        int numero2 = entrada.nextINt();

        System.out.println("--------------------------------------------"); 
        System.out.println("Qual das seguintes operações deseja fazer? |"); 
        System.out.println("soma                                       |"); 
        System.out.println("substração                                 |"); 
        System.out.println("multiplicação                              |"); 
        System.out.println("divisão                                    |"); 
        System.out.println("sair                                       |");
        System.out.println("--------------------------------------------"); 

        


    }
}