package com.itla.mudat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText txtNombre;
    public Button txtGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       txtNombre = findViewById(R.id.txtNombre);
       txtGuardar = findViewById(R.id.btnGuardar);

       txtGuardar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
             //  Toast mensaje = Toast.makeText(MainActivity.this,  "Hola Mundo", Toast.LENGTH_LONG);w
             //  mensaje.show();
               Intent RegistroUsuario = new Intent(MainActivity.this,ResgistroUsuario.class);
               //Bundle parametros = new Bundle();12

               //parametros.putString("nombre", txtNombre.getText().toString());
               //
              // RegistroUsuario.putExtra("nombre", txtNombre.getText().toString());
               startActivity(RegistroUsuario);

           }
       });
    }
}
