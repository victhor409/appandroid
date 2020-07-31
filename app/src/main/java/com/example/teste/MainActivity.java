package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import activites.ActivityProduto;
import controller.ProdutoCtrl;
import dbHelper.ConexaoSQLite;
import model.Produto;

public class MainActivity extends AppCompatActivity {

    private Button btnCadastroDeProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexaoSQLite conexaoSQLite = ConexaoSQLite.getInstancia(this);


        //Produto na mao aqui
        Produto produto1 = new Produto();
        produto1.setId(123456);
        produto1.setName("Computador");
        produto1.setQuantidadeEmEstoque(100);
        produto1.setPreco(1500);

        ProdutoCtrl produtoCtrl = new ProdutoCtrl(conexaoSQLite);
        long resultado = produtoCtrl.salvarProdutoCtrl(produto1);

        System.out.println("Resultado = "+resultado);


        this.btnCadastroDeProdutos = (Button) findViewById(R.id.btnCadastroProdutos);

        this.btnCadastroDeProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //executado ao clicar no botao
                Intent intent = new Intent(MainActivity.this, ActivityProduto.class);
                startActivity(intent);

            }
        });
    }
}