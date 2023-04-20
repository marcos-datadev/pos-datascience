import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Estrutura de repetição for

        for (int cont = 0; cont < 1; cont ++) {
            System.out.println(cont);
        }

        // Estrutura de repetição while
        
        int numero = 0;
        
        while (numero != 99) {
            System.out.println("Entre com um número ou com 99 pra sair");
            Scanner entrada = new Scanner(System.in);
    
            numero = entrada.nextInt();
            entrada.close();
        }

        // Estrutura de repetição do-while

        int opcao;

        do {
            System.out.println("Entre com um número ou 99 para sair");
            Scanner entrada = new Scanner(System.in);
            
            opcao = entrada.nextInt();
            entrada.close();
        } while(opcao != 99);

        // Estrutura de repetição aninhada

        for (int i = 1; i <= 10; i++) {
            System.out.println("");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }

        // Métodos
        int total = App.somar(5, 6);
        System.out.println(total);
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}