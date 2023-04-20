import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Operador lógico

        int a, b;
        a = 15;
        b = 19;

        System.out.println("a > b? " + (a > b));
        System.out.println("a > b ou a == 15? " + (a > b || a == 15));
        System.out.println("a > b e a == 15? " + (a > b && a == 15));

        // Estrutura condicional
        
        System.out.println("");
        int nota = 9;

        if (nota >= 7){
            System.out.println("Aprovado");
        } else if (nota >= 4 && nota < 7) {
            System.out.println("Exame de recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Múltipla escolha

        System.out.println("");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha uma opção");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Cadastrar nota");
        System.out.println("3 - Listar alunos e notas");

        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Cadastro de aluno");
            break;
            case 2:
                System.out.println("Cadastro de nota");
            break;
            case 3:
                System.out.println("Listagem de aluno e nota");
            break;
            default:
                System.out.println("Número inválido");
            break;
        }

        // Prática

        System.out.println("");
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(100);
        
        System.out.println("Escolha um número:");
        int numeroEscolhido = entrada.nextInt();

        if (numeroEscolhido == numeroAleatorio) {
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Você errou.");
        }

        entrada.close();
    }
}
