public class App {
    public static void main(String[] args) throws Exception {

        Carro uninho_quadrado = new Carro("Uno", 2017);
        uninho_quadrado.DadosCarro();

        Cao cachorro = new Cao();
        cachorro.setIdade(5);

        if (cachorro.VerificarIdade()) {
            System.out.println("Cão idoso");
        } System.out.println("Cão jovem");

    }
}
