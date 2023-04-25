public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Pedro";
        // p.comissao = 50;

        Vendedor vendedor = new Vendedor();
        vendedor.nome = "Paulo";
        vendedor.comissao = 80;

        // Pedido p = new Pedido();

        Conta cp = new Poupanca();
        cp.setSaldo(5000);
        cp.imprimeExtrato();

    }
}
