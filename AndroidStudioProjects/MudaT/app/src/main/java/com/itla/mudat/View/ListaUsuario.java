package com.itla.mudat.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.itla.mudat.Entity.Usuario;
import com.itla.mudat.R;
import com.itla.mudat.View.ListAdaptar.UsuarioListaAdapter;
import com.itla.mudat.dao.UsuarioDbo;

import java.util.List;

public class ListaUsuario extends AppCompatActivity {
    ListView listaUsuario;
    Button Bagregarusuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuario);
              Bagregarusuario=(Button) findViewById(R.id.btnAgregar);


        UsuarioDbo usuarioDbo = new UsuarioDbo( this);
        List<Usuario> usuarios = usuarioDbo.buscar();
        Log.i("ListaUsuario","cantidad de usuarios " + usuarios.size());

        listaUsuario = (ListView) findViewById(R.id.ListaUsuario);

        listaUsuario.setAdapter(new UsuarioListaAdapter(usuarios, this));
        listaUsuario.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent rUsuario = new Intent(ListaUsuario.this, ResgistroUsuario.class);
                Usuario u = (Usuario) adapterView.getItemAtPosition(i);

                rUsuario.putExtra("usuario", u);
                startActivity(rUsuario);

            }
        });

  Bagregarusuario.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Intent RegistroUsuario = new Intent(ListaUsuario.this,ResgistroUsuario.class);
          startActivity(RegistroUsuario);
      }
  });


    }
}
