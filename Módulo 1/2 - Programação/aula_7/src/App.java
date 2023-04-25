class Desenho {

    // Método sem parâmetro
    public void mostrar() {
        
        for (int i = 0; i <= 10; i++) {
            System.out.print("*");
        }

    }

    // Método com um parâmetro
    public void mostrar(char simb) {
        
        for (int i = 0; i <= 10; i++) {
            System.out.print(simb);
        }

    }

    // Método com dois parâmetros
    public void mostrar(int limite, String simb) {
        
        for (int i = 0; i <= limite; i++) {
            System.out.print(simb);
        }

    }

}

public class App {
    public static void main(String[] args) throws Exception {

        Quadrado q1 = new Quadrado();
        q1.Desenhar();

        Circulo c1 = new Circulo();
        c1.Desenhar();

        Desenho d1 = new Desenho();
        d1.mostrar();
        d1.mostrar('$');
        d1.mostrar(5, "a");

        Java jv = new Java();
        jv.mostrarInformacao();

        Linguagem lg = new Linguagem();
        lg.mostrarInformacao();

        String primeira = "Java";
        String segunda = "Python";
        String terceira = new String("Javascript");

        System.out.println(primeira.toUpperCase() + " " + segunda.toLowerCase() + " " + terceira.length());

        boolean resultado = primeira.equals(segunda);
        System.out.println("Compara primeira com segunda: " + resultado);

    }
}
