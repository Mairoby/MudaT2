package com.itla.mudat.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.itla.mudat.Entity.Anuncio;
import com.itla.mudat.R;

public class MainActivity extends AppCompatActivity {


    public Button txtUsuario, txtAnuncio, txtCategria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       txtUsuario = findViewById(R.id.btnUsuario);
       txtAnuncio = findViewById(R.id.btnAnuncios);
       txtCategria = findViewById(R.id.btnCategoria);

       txtUsuario.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent RegistroUsuario = new Intent(MainActivity.this,ListaUsuario.class);
               startActivity(RegistroUsuario);

           }
       });
        txtAnuncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent RegistroUsuario = new Intent(MainActivity.this,Anuncios.class);
                startActivity(RegistroUsuario);

            }
        });

    }

}
