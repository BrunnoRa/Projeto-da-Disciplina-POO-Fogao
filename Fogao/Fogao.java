package Fogao;

public class Fogao {

    private int numeroBocas;
    private String cor;
    private String marca;
    private String modelo;

    Fogao() {
        numeroBocas = 4;
        cor = "Inox";
        marca = "Brastemp";
        modelo = "BFO4P";
    }

    Fogao(int numeroBocas, String cor, String marca, String modelo) {
        this.numeroBocas = numeroBocas;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getNumeroBocas() {
        return numeroBocas;
    }

    public void setNumeroBocas(int numeroBocas) {
        this.numeroBocas = numeroBocas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static void main(String[] args) {
        Fogao f1 = new Fogao();
        Fogao f2 = new Fogao(5, "Preto", "Consul", "CFO5P");
        Fogao f3 = new Fogao(6, "Branco", "Electrolux", "EFO6B");

        System.out.println("O objeto f1 tem as seguintes características:");
        System.out.println("Número de bocas: " + f1.getNumeroBocas());
        System.out.println("Cor: " + f1.getCor());
        System.out.println("Marca: " + f1.getMarca());
        System.out.println("Modelo: " + f1.getModelo());

        System.out.println("\nO objeto f2 tem as seguintes características:");
        System.out.println("Número de bocas: " + f2.getNumeroBocas());
        System.out.println("Cor: " + f2.getCor());
        System.out.println("Marca: " + f2.getMarca());
        System.out.println("Modelo: " + f2.getModelo());

        System.out.println("\nO objeto f3 tem as seguintes características:");
        System.out.println("Número de bocas: " + f3.getNumeroBocas());
        System.out.println("Cor: " + f3.getCor());
        System.out.println("Marca: " + f3.getMarca());
        System.out.println("Modelo: " + f3.getModelo());

        f1.setNumeroBocas(3);
        f2.setCor("Inox");
        f3.setMarca("Brastemp");

        System.out.println("\nApós mudanças, o objeto f1 tem as seguintes características:");
        System.out.println("Número de bocas: " + f1.getNumeroBocas());
        System.out.println("Cor: " + f1.getCor());
        System.out.println("Marca: " + f1.getMarca());
        System.out.println("Modelo: " + f1.getModelo());

        System.out.println("\nApós mudanças, o objeto f2 tem as seguintes características:");
        System.out.println("Número de bocas: " + f2.getNumeroBocas());
        System.out.println("Cor: " + f2.getCor());
        System.out.println("Marca: " + f2.getMarca());
        System.out.println("Modelo: " + f2.getModelo());

        System.out.println("\nApós mudanças, o objeto f3 tem as seguintes características:");
        System.out.println("Número de bocas: " + f3.getNumeroBocas());
        System.out.println("Cor: " + f3.getCor());
        System.out.println("Marca: " + f3.getMarca());
        System.out.println("Modelo: " + f3.getModelo());
    }
}
