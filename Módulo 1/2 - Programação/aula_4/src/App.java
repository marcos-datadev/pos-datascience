import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Vetores

        int[] dados = new int[5];

        dados[2] = 9;
        dados[3] = 7;
        dados[0] = 6;

        System.out.println(dados);

        // Matrizes

        int[][] tabela = new int[5][5];
        tabela[0][0] = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j ++) {
                tabela[i][j] = j + 2;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j ++) {
                System.out.println(tabela[i][j]);
            }
        }

        // Vetores na prática

        int[] passaros = {2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1};

        int totalPassaros = 0;
        int totalPassarosPrimeiraSemana = 0;
        int totalPassarosSegundaSemana = 0;

        for (int i = 0; i < 14; i++) {
            totalPassaros = totalPassaros + passaros[i];
        }

        System.out.println("Total de pássaros: " + totalPassaros);

        for (int i = 0; i < 7; i ++) {
            totalPassarosPrimeiraSemana = totalPassarosPrimeiraSemana + passaros[i];
        }

        System.out.println("Pássaros da primeira semana: " + totalPassarosPrimeiraSemana);

        for (int i = 7; i < 14; i ++) {
            totalPassarosSegundaSemana = totalPassarosSegundaSemana + passaros[i];
        }

        System.out.println("Pássaros da segunda semana: " + totalPassarosSegundaSemana);

        // Matrizes na prática
        
        int[][] matriz = {{9, 8, 7}, {5, 3, 2}, {6, 6, 7}};

        int[] maiorLinha = new int[3];
        int[] menorColuna = new int[3];

        for (int i = 0; i < 3; i ++) {
            maiorLinha[i] = 0;
            menorColuna[i] = 10;
        }

            // Maior elemento nas linhas

        for (int i = 0; i < 3; i ++) {
            if (matriz[0][i] > maiorLinha[0]) {
                maiorLinha[0] = matriz[0][i];
            }
        }

        for (int i = 0; i < 3; i ++) {
            if (matriz[1][i] > maiorLinha[1]) {
                maiorLinha[1] = matriz[1][i];
            }
        }

        for (int i = 0; i < 3; i ++) {
            if (matriz[2][i] > maiorLinha[2]) {
                maiorLinha[2] = matriz[2][i];
            }
        }

            // Menor elemento nas colunas

        for (int i = 0; i < 3; i ++) {
            if (matriz[i][0] < menorColuna[0]) {
                menorColuna[0] = matriz[i][0];
            }
        }

        for (int i = 0; i < 3; i ++) {
            if (matriz[i][1] < menorColuna[1]) {
                menorColuna[1] = matriz[i][1];
            }
        }

        for (int i = 0; i < 3; i ++) {
            if (matriz[i][2] < menorColuna[2]) {
                menorColuna[2] = matriz[i][2];
            }
        }

        // Encontrando o ponto de sela

        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                if (maiorLinha[i] == menorColuna[j]) {
                    System.out.println("Ponto de cela: " + maiorLinha[i]);
                }
            }
        }

        // Listas e Arrays

        ArrayList<String> estados = new ArrayList<>();

        estados.add("Minas Gerais");
        estados.add("Rondônia");
        estados.add("Santa Catarina");

        estados.remove("Santa Catarina");
        estados.contains("Amazonas"); // Retorna True ou False

        // Exemplos de lista

        ArrayList<String> bandas = new ArrayList<>();

        bandas.add("Beatles");
        bandas.add("Tool");
        bandas.add("System");
        System.out.println(bandas);

        bandas.add(bandas.indexOf("Beatles"), "Ayreon");
        System.out.println(bandas);

        bandas.remove("Beatles");
        System.out.println(bandas);

        bandas.clear();
        System.out.println(bandas);

    }
}