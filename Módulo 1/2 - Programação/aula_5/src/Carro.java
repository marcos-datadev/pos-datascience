public class Carro {
    String modelo;
    String cor;
    int ano;
    double peso;

    public Carro() {
        modelo = "Uno";
    }

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void Anda() {
        System.out.println("Sou um " + modelo + " funcional");
    }

    public void DadosCarro() {
        System.out.println("Modelo: " + modelo + "\nAno: " + ano);
    }
}
