package com.example.soulchavez.memorama;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {
    private Button cmdJugar;
    private Button cmdNivel;
    private Button cmdPuntajes;
    clsConfiguracion objConfiguracion=new clsConfiguracion();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        cmdJugar=(Button)findViewById(R.id.cmdPlay);
        cmdNivel=(Button)findViewById(R.id.cmdNivel);
        cmdPuntajes=(Button)findViewById(R.id.cmdPuntos);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void puntajesOnClick(View view ){
        Intent segunda = new Intent(this,Puntajes.class);

        startActivity(segunda);
    }

    public void jugarClic(View view ){
        Context context = getApplicationContext();
        String nivel=objConfiguracion.getNivel(context);

        if(nivel.equals("1")){
            Intent segunda = new Intent(this,Principiante.class);
            finish();
            startActivity(segunda);
        }
        if(nivel.equals("2")){
            Intent segunda = new Intent(this,Medio.class);
            finish();
            startActivity(segunda);
        }
        if(nivel.equals("3")){
            Intent segunda = new Intent(this,Experto.class);

            startActivity(segunda);
        }

        else{
            objConfiguracion.setNivel(context, "1");
            Intent segunda = new Intent(this,Principiante.class);
            finish();
            startActivity(segunda);
        }
    }

    public void nivelesOnClick(View view ){
        Intent segunda = new Intent(this,Niveles.class);

        startActivity(segunda);
    }
}
