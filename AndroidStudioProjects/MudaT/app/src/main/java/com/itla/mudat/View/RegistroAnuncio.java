package com.itla.mudat.View;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.itla.mudat.Entity.*;
import com.itla.mudat.R;
import com.itla.mudat.dao.AnuncioDbo;

import java.util.Date;

public class RegistroAnuncio extends AppCompatActivity {
    AnuncioDbo anuncioDbo;
    private Button btonGuardar;
    private EditText textcategoria;
    private EditText textusuario;
    private EditText textfecha;
    private EditText textcondicion;
    private EditText textprecio;
    private EditText texttitulo;
    private EditText textubicacion;
    private EditText textdetalle;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_anuncio);

        textcategoria = findViewById(R.id.editTextcategoria);
        textusuario = findViewById(R.id.editTextusuario);
        //textfecha = findViewById(R.id.editTextfecha);
        textcondicion = findViewById(R.id.editTextcondicion);
        textprecio = findViewById(R.id.editTextprecio);
        texttitulo = findViewById(R.id.editTexttitulo);
        textubicacion = findViewById(R.id.editTextubicacion);
        textdetalle = findViewById(R.id.editTextdetalle);
        btonGuardar = (Button) findViewById(R.id.btonGuardar);

        Bundle parametros = getIntent().getExtras();
        if (parametros != null && parametros.containsKey("anuncios")) {
            Anuncio anuncio = (Anuncio) parametros.getSerializable("anuncio");

            textcategoria.setText(anuncio.getCategoria().toString());
            textusuario.setText(anuncio.getUsuario().toString());
            textfecha.setText(anuncio.getFecha().toString());
            textcondicion.setText(anuncio.getCondición().toString());
            textprecio.setText(anuncio.getPrecio().toString());
            texttitulo.setText(anuncio.getTitulo().toString());
            textubicacion.setText(anuncio.getUbicacion().toString());
            textdetalle.setText(anuncio.getDetalle().toString());

            anuncioDbo = new AnuncioDbo(this);


            btonGuardar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Anuncio anuncio = new Anuncio();
                    anuncio.setCategoria(textcategoria.getText().toString());
                    anuncio.setUsuario(textusuario.getText().toString());
                    anuncio.setfecha(new Date());
                    anuncio.setCondicion(textcondicion.getText().toString());
                    anuncio.setPrecio(textprecio.getText().toString());
                    anuncio.setTitulo(textprecio.getText().toString());
                    anuncio.setUbicacion(textubicacion.getText().toString());
                    anuncio.setDetalle(textdetalle.getText().toString());

                    //  Log.i(Log_T, anuncio.toString());
                    anuncioDbo.crear(anuncio);

                }

            });
        }
    }
}