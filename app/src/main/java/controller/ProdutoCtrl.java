package controller;

import DAO.ProdutoDAO;
import dbHelper.ConexaoSQLite;
import model.Produto;

public class ProdutoCtrl {

    private final ProdutoDAO produtoDAO;

    public ProdutoCtrl(ConexaoSQLite pConexaoSQLite) {
        produtoDAO = new ProdutoDAO(pConexaoSQLite);
    }

    public long salvarProdutoCtrl(Produto pProduto){
        return this.produtoDAO.salvarPtodutoDAO(pProduto);
    }
}
