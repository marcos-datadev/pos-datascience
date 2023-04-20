import java.util.Scanner;

public class Aula_1 {
    public static void main(String[] args) throws Exception {
        // Primeiro teste
        String valor = "Olá, mundo!";
        System.out.println(valor);
        System.out.println();

        // Lendo o input do usuário
        String palavra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com uma palavra e eu direi o tamanho dela:");
        palavra = entrada.next();
        System.out.println(palavra.length());
        System.out.println();

        // Operadores aritméticos
        double numA, numB, total;
        numA = 8;
        numB = 3;
        total = numA + numB;
        System.out.println("Resultado  da soma: " + total);
        total = numA - numB;
        System.out.println("Resultado  da subtração: " + total);
        total = numA * numB;
        System.out.println("Resultado  da multiplicação: " + total);
        total = numA / numB;
        System.out.println("Resultado  da divisão: " + total);
        total = numA % numB;
        System.out.println("Resto da divisão: " + total);
    }
}
