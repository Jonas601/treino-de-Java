import java.util.Scanner;

public class SwitchCase { //testando switch
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite um número de 1 a 7 e veja um dia da semana com suas metas");
        int dia = entrada.nextInt();
        switch(dia){
        
        
            case 1:
            System.out.println("hoje é segunda-feira. lave as roupa do balde");
            break;
            
            case 2:
            System.out.println("hoje é terça-feira. Estude java por 30 minutos todos os dias");
            break;
             
            case 3: 
            System.out.println("hoje é quarta-feira. leia um livro sobre java");
            break;
            
            case 4:
            System.out.println("hoje é quinta-feira. faça exercicios e estude inglês por 45 minutos");
            break;
            
            case 5:
            System.out.println("hoje é sexta-feira. Faça exercicios ");
            break;
            
            case 6:
            System.out.println("hoje é sábado. dê uma caminhada");
            break;
            
            case 7:
            System.out.println("hoje é domingo. Descanse e Durma bem.");
            break;
            
            default:
            System.out.println("número inválido");
        }
    } //Sugestão de melhoria, tratamento para caso o usuário coloque uma letra e quebre o código 
}
