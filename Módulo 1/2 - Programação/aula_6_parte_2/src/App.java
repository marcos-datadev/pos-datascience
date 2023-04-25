import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
        
        Conta cp = new Poupanca();
        cp.depositar(500);
        cp.sacar(100);
        System.out.println(cp.getSaldo());

        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Digite um valor: ");
            int numero1 = s.nextInt();
            System.out.println(numero1);
        } catch (Exception ex) {
            System.out.println("Valor inválido");
        }

        s.close();

        Cachorro c = new Cachorro();
        c.setNome("Bidu");

        Gato g = new Gato();
        g.setNome("Hermes");

        c.mostrar();
        g.mostrar();
    }
}
