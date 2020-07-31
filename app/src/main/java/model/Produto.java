package model;

public class Produto {

    private long id;
    private String name;
    private int quantidadeEmEstoque;
    private double preco;

    public Produto(){

    }


    public Produto(long id, String name, int quantidadeEmEstoque, double preco) {
        this.id = id;
        this.name = name;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                ", preco=" + preco +
                '}';
    }
}
