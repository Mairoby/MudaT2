package com.itla.mudat.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.itla.mudat.R;

public class Visualizar extends AppCompatActivity {
    private TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar);

      Bundle parametros = getIntent().getExtras();


      String ver = parametros.getString("nombre");
      TextView txtNombre = findViewById(R.id.textView3);

      txtNombre.setText(ver);





    }
}
