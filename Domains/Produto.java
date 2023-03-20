package Domains;

public class Produto {
    private int id;
    private String name;
    private String fabricante;
    private double preco;

    public Produto(int id, String name, String fabricante, double preco) {
        this.id = id;
        this.name = name;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public int getId() {
        return this.id;
    }
}
