package com.itla.mudat.View;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.itla.mudat.Entity.Usuario;
import com.itla.mudat.R;
import com.itla.mudat.dao.UsuarioDbo;

import java.util.List;

public class ResgistroUsuario extends AppCompatActivity {


    private EditText txtid;
    private EditText txtnombre;
    private EditText txtTipoUs;
    private EditText txtIdenti;
    private EditText txtEmail;
    private EditText txtTele;
    private EditText txtClave;
    private EditText txtEstatus;
    private Button btnGuardar;
    private Button btnCancelar;
    private Button btnListar;

    UsuarioDbo usuarioDbo;
    public static final String Log_T = "Registro Usuario";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgistro_usuario);



       // txtid = (EditText) findViewById(R.id.editTextid);
        txtnombre = (EditText) findViewById(R.id.editTextNombre);
        txtTipoUs = (EditText) findViewById(R.id.editTextTipoUs);
        txtIdenti = (EditText) findViewById(R.id.editTextIdenti);
        txtEmail = (EditText) findViewById(R.id.editTextEmail);
        txtTele = (EditText) findViewById(R.id.editTextTele);
        txtClave = (EditText) findViewById(R.id.editTextClave);
        txtEstatus = (EditText) findViewById(R.id.editTextEstatus);
        btnCancelar = (Button) findViewById(R.id.btnCancelar);
        btnGuardar = (Button) findViewById(R.id.btnGuardar);
        btnListar = (Button) findViewById(R.id.btnListar);

        Bundle parametros = getIntent().getExtras();
        if (parametros!=null && parametros.containsKey("usuario")){
            Usuario usuario = (Usuario) parametros.getSerializable("usuario");

            txtnombre.setText(usuario.getNombre());
            txtEmail.setText(usuario.getEmail());
            txtTele.setText(usuario.getTelefono());
            txtClave.setText(usuario.getClave());
        }


        usuarioDbo = new UsuarioDbo(this);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario usuario = new Usuario();
                usuario.setNombre(txtnombre.getText().toString());
                usuario.setIdentificacion(txtIdenti.getText().toString());
                usuario.setClave(txtClave.getText().toString());
                usuario.setEmail(txtEmail.getText().toString());
                usuario.setTelefono(txtTele.getText().toString());
                // usuario.setTipodeusuario(txtTipoUs.getText().toString());

                Log.i(Log_T, usuario.toString());
                usuarioDbo.crear(usuario);

            }

        });
        btnListar = findViewById(R.id.btnListar);
        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Usuario> usuarios = usuarioDbo.buscar();

                for (Usuario u : usuarios) {
                    Log.i(Log_T, u.toString());

                }

            }
        });


    }

}
