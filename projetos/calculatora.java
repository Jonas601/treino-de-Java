import java.util.Scanner;
 
public class Calculatora{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double result;

        System.out.println("Escolha dois números para calcular"); 
        System.out.println("Escolha o primeiro número ");
        double numero1 = entrada.nextDouble();
        System.out.println("escolha o segundo número");
        double numero2 = entrada.nextDouble();

        System.out.println("-----------------------------------------------"); 
        System.out.println("Qual das seguintes operações deseja fazer?    |"); 
        System.out.println("1- soma                                       |"); 
        System.out.println("2- substração                                 |"); 
        System.out.println("3- multiplicação                              |"); 
        System.out.println("4- divisão                                    |"); 
        System.out.println("5 -sair                                       |");
        System.out.println("-----------------------------------------------"); 

        System.out.print("o que você deseja: ");
        int opcao = entrada.nextInt();

        switch(opcao){
            case 1:
            result = numero1 + numero2;
            System.out.println("a soma dos números deu: " + result);
            break;
            case 2:
            result = numero1 - numero2;
            System.out.println("a substração dos números deu: " + result);
            break;
            case 3:
            result = numero1 * numero2;
            System.out.println("a multiplicação dos números deu: " + result);
            break;
            case 4:
            result = numero1 / numero2;
            System.out.println("a divisão dos números deu: " + result);
            break;
            case 5:
            System.out.print("saindo");
            System.out.print(".");
            System.out.print(".");
            System.out.print(".");
            break;
            default:
            System.out.println("reposta inválida");
        }


    }
}