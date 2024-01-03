package com.example.actlistcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity
        extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Llenar el comboBox o lista
        //paso 1
        final String[] datos =
                new
                        String[]{"Alojamiento",
                        "Alimentación y Bebidas","Atractivos Culturales",
                        "Esparcimiento","Compras","Transporte","Rutas",
                        "Agencia de Viajes"};

        //paso 2
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);

        //paso 3
        Spinner cmbOpciones =
                (Spinner)findViewById(R.id.cbEstudiantes);
        adaptador.setDropDownViewResource(

                android.R.layout.simple_spinner_dropdown_item );
        cmbOpciones.setAdapter(adaptador);
        cmbOpciones.setOnItemSelectedListener(this);

        //list view
        //Paso 1 Data
        final String[] datos2 =
                new
                        String[]{"EXPLOMUNDO",
                        "MULTICARIBE","XPLORA",
                        "CAFÉ & TINTO","Compras","FANCY MINT COFFEE & CAKE SHOP","SWEET LAND",
                        "TORO CAFÉ"};



        //Paso2

        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        datos2);


        //Paso 3
        ListView lstOpciones =
                (ListView)findViewById(R.id.lstLugar);
        lstOpciones.setAdapter(adaptador2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView txtItem =
                (TextView)findViewById(R.id.textCatego);

        txtItem.setText("Categoría: " +
                parent.getItemAtPosition(position));
    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}