package com.itla.mudat.View.ListAdaptar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.itla.mudat.Entity.Usuario;
import com.itla.mudat.R;

import java.util.List;

/**
 * Created by wagne on 2/12/2017.
 */

public class UsuarioListaAdapter extends BaseAdapter {

    private List<Usuario> usuarios;
    private Activity context;

    public UsuarioListaAdapter(List<Usuario> usuarios, Activity context) {
        this.usuarios = usuarios;
        this.context = context;
    }

    @Override
    public int getCount() {
        return usuarios.size();
    }

    @Override
    public Object getItem(int i) {
        return usuarios.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            view = inflater.inflate(R.layout.lista_usuario_row, null, true);
        }
        TextView txtNombre = view.findViewById(R.id.Nombre);
        TextView txtEmail = view.findViewById(R.id.Email);

        Usuario u = usuarios.get(i);

        txtNombre.setText(u.getNombre());
        txtEmail.setText(u.getEmail());

        return view;
    }


}
