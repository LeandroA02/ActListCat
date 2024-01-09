package com.example.actlistcat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdaptadorLugaresTuristico extends ArrayAdapter<lugarTuristico> {
        public AdaptadorLugaresTuristico(Context context, ArrayList<lugarTuristico> datos) {
            super(context, R.layout.litems, datos);
        }
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.litems, null);

            TextView lblNombre = (TextView) item.findViewById(R.id.lblNombre);
            lblNombre.setText(getItem(position).getNombre());
            TextView lblDireccion = (TextView) item.findViewById(R.id.lblDireccion);
            lblDireccion.setText(getItem(position).getDireccion());
            TextView lblTelefono = (TextView) item.findViewById(R.id.lbltelefono);
            lblTelefono.setText(getItem(position).getTelefono());
            ImageView imageView = (ImageView)item.findViewById(R.id.imgLogo);
            Glide.with(this.getContext())
                    .load(getItem(position).getUrlLogo())
                    .into(imageView);
            return (item);
        }
}
