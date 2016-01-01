package com.example.soulchavez.memorama;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by soulchavez on 01/11/2015.
 */
public class clsConfiguracion {
    public static final String ARCHIVOP="PPrincipiante"; //Nombre Archivo
    public static final String C_PUNTAJEPRINCIPIANTE="0"; //campo
    public static final String ARCHIVOM="PMedio"; //Nombre Archivo
    public static final String C_PUNTAJEMEDIO="0"; //campo
    public static final String ARCHIVOE="PExperto"; //Nombre Archivo
    public static final String C_PUNTAJEEXPERTO="0"; //campo
    public static final String ARCHIVOT="PTotal"; //Nombre Archivo
    public static final String C_PUNTAJETOTAL="0"; //campo
    public static final String ARCHIVON="PPrincipiante"; //Nombre Archivo
    public static final String C_NIVEL="1"; //campo

    public clsConfiguracion(){
        super();

    }

    //public void Guardar(Context context, String strUrl, String strNombre){
      //  SharedPreferences settings;
        //SharedPreferences.Editor editor;

        //settings=context.getSharedPreferences(ARCHIVO, Context.MODE_PRIVATE);

        //editor=settings.edit();
        //editor.putString(C_URL, strUrl);
        //editor.putString(C_NOMBRE, strNombre);

        //editor.commit();
    //}

    public void setPrincipiante (Context context, String prin){
        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings=context.getSharedPreferences(ARCHIVOP, Context.MODE_PRIVATE);

        editor=settings.edit();
        editor.putString(C_PUNTAJEPRINCIPIANTE, prin);
        editor.commit();
    }

    public String getPrincipiante(Context context){
        SharedPreferences settings;
        String text;
        settings=context.getSharedPreferences(ARCHIVOP, Context.MODE_PRIVATE);
        text=settings.getString(C_PUNTAJEPRINCIPIANTE, "0");
        return text;
    }

    public void setMedio (Context context, String medio){
        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings=context.getSharedPreferences(ARCHIVOM, Context.MODE_PRIVATE);

        editor=settings.edit();
        editor.putString(C_PUNTAJEMEDIO, medio);
        editor.commit();
    }

    public String getMedio(Context context){
        SharedPreferences settings;
        String text;
        settings=context.getSharedPreferences(ARCHIVOM, Context.MODE_PRIVATE);
        text=settings.getString(C_PUNTAJEMEDIO, "0");
        return text;
    }

    public void setExperto (Context context, String exp){
        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings=context.getSharedPreferences(ARCHIVOE, Context.MODE_PRIVATE);

        editor=settings.edit();
        editor.putString(C_PUNTAJEEXPERTO, exp);
        editor.commit();
    }

    public String getExperto(Context context){
        SharedPreferences settings;
        String text;
        settings=context.getSharedPreferences(ARCHIVOE, Context.MODE_PRIVATE);
        text=settings.getString(C_PUNTAJEEXPERTO, "0");
        return text;
    }

    public void setTotal (Context context, String total){
        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings=context.getSharedPreferences(ARCHIVOT, Context.MODE_PRIVATE);

        editor=settings.edit();
        editor.putString(C_PUNTAJETOTAL, total);
        editor.commit();
    }

    public String getTotal(Context context){
        SharedPreferences settings;
        String text;
        settings=context.getSharedPreferences(ARCHIVOT, Context.MODE_PRIVATE);
        text=settings.getString(C_PUNTAJETOTAL, "0");
        return text;
    }

    public void setNivel (Context context, String nivel){
        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings=context.getSharedPreferences(ARCHIVON, Context.MODE_PRIVATE);

        editor=settings.edit();
        editor.putString(C_NIVEL, nivel);
        editor.commit();
    }

    public String getNivel(Context context){
        SharedPreferences settings;
        String text;
        settings=context.getSharedPreferences(ARCHIVON, Context.MODE_PRIVATE);
        text=settings.getString(C_NIVEL, "1");
        return text;
    }
}
