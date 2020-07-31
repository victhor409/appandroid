package model;

import java.util.Date;

public class Venda {
    private long id;
    private Produto produtoVendido;
    private Date dataDaVenda;
    private String nomeDoCliente;
    
    public Venda(){

    }

    public Venda(long id, Produto produtoVendido, Date dataDaVenda, String nomeDoCliente) {
        this.id = id;
        this.produtoVendido = produtoVendido;
        this.dataDaVenda = dataDaVenda;
        this.nomeDoCliente = nomeDoCliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Produto getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(Produto produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public Date getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(Date dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", produtoVendido=" + produtoVendido +
                ", dataDaVenda=" + dataDaVenda +
                ", nomeDoCliente='" + nomeDoCliente + '\'' +
                '}';
    }
}
