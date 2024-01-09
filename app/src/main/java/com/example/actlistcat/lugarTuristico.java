package com.example.actlistcat;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class lugarTuristico {
    String Nombre;
    String Direccion;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getUrlLogo() {
        return UrlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        UrlLogo = urlLogo;
    }



    public lugarTuristico(JSONObject a) throws JSONException {
        Nombre = a.getString("nombre_lugar").toString();
        Direccion = a.getString("direccion").toString() ;
        Telefono = a.getString("telefono").toString() ;
        UrlLogo = "https://uealecpeterson.net/turismo/assets/imgs/logos_gifs/" +
        a.getString("logo").toString();
    }
    public static ArrayList<lugarTuristico> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<lugarTuristico> lstLugares = new ArrayList<>();
        for (int i = 0; i < datos.length() && i<20; i++) {
            lstLugares.add(new lugarTuristico(datos.getJSONObject(i)));
        }
        return lstLugares;
    }
    String Telefono; String UrlLogo;
}

