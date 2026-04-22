import java.util.Scanner;
 
public class Calculatora{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha dois números para calcular"); 
        System.out.println("Escolha o primeiro número ");
        double Numero1 = entrada.nextDouble();
        System.out.println("escolha o segundo número");
        double numero2 = entrada.nextDouble();

        System.out.println("--------------------------------------------"); 
        System.out.println("Qual das seguintes operações deseja fazer? |"); 
        System.out.println("soma                                       |"); 
        System.out.println("substração                                 |"); 
        System.out.println("multiplicação                              |"); 
        System.out.println("divisão                                    |"); 
        System.out.println("sair                                       |");
        System.out.println("--------------------------------------------"); 

        System.out.print("o que você deseja: ");
        int opcao = entrada.nextInt();

        case(opcao){
            case 1
            result = numero1 + numero2;
            System.out.println("a soma dos números deu: " + result);
            break;
            case 2
            result = numero1 - numero2;
            System.out.println("a substração dos números deu: " + result);
            break;
            case 3
            result = numero1 * numero2;
            System.out.println("a multiplicação dos números deu: " + result);
            break;
            case 4
            result = numero1 / numero2;
            System.out.println("a divisão dos números deu: " + result);
            break;
            case 5
            System.out.print("saindo");
            System.out.print(".");
            System.out.print(".");
            System.out.print(".");
            break;
            default
            System.out.println("reposta inválida");
        }


    }
}