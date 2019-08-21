package br.com.uninove.meucurriculo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirDadosPessoais(View view){
        Intent it = new Intent(this, DadosPessoaisActivity.class);
        startActivity(it);
    }
    public void entrarEmContato(View view){
        Intent it = new Intent(this,Contatos.class);
        startActivity(it);
    }
}
