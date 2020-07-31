package DAO;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import java.io.IOException;

import dbHelper.ConexaoSQLite;
import model.Produto;

public class ProdutoDAO {

    private final ConexaoSQLite conexaoSQLite;

    public ProdutoDAO(ConexaoSQLite conexaoSQLite) {
        this.conexaoSQLite = conexaoSQLite;
    }

    public long salvarPtodutoDAO(Produto pProduto){

        SQLiteDatabase db = conexaoSQLite.getWritableDatabase();
         try {
             ContentValues values = new ContentValues();
             values.put("id", pProduto.getId());
             values.put("nome", pProduto.getName());
             values.put("quantidade em estoque", pProduto.getQuantidadeEmEstoque());
             values.put("preco", pProduto.getPreco());

             long idProdutoInserido = db.insert("produto", null, values);

             return idProdutoInserido;
         }
         catch (Exception e){
             e.printStackTrace();
         }
         return 0;



    }



}
