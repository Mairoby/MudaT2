package com.itla.mudat.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.itla.mudat.R;
import com.itla.mudat.dao.AnuncioDbo;

public class Anuncios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncios);

        Button btnNuevo = (Button) findViewById(R.id.btnNuevo);

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ResgistroAnuncio = new Intent(Anuncios.this,RegistroAnuncio.class);
                startActivity(ResgistroAnuncio);
            }
        });



    }
}
