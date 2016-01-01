package com.example.soulchavez.memorama;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Niveles extends AppCompatActivity {
    Button facil;
    Button medio;
    Button experto;
    clsConfiguracion obj=new clsConfiguracion();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveles);
        facil=(Button)findViewById(R.id.button65);
        medio=(Button)findViewById(R.id.button66);
        experto=(Button)findViewById(R.id.button67);
        Context context = getApplicationContext();
        String pf=obj.getPrincipiante(context);
        int prin=Integer.parseInt(pf);
        String pm=obj.getMedio(context);
        int med=Integer.parseInt(pm);
        if(prin<5){
            medio.setEnabled(false);
            experto.setEnabled(false);
        }else{
            if (prin>=5 && med<15){
                medio.setEnabled(true);
                experto.setEnabled(false);
            }else{
                if(med>=15){
                    medio.setEnabled(true);
                    experto.setEnabled(true);
                }
            }

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_niveles, menu);
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

    public void principianteClick(View view){
        Intent segunda = new Intent(this,Principiante.class);
        finish();
        startActivity(segunda);
    }

    public void medioClic(View view){
        Intent segunda = new Intent(this,Medio.class);
        finish();
        startActivity(segunda);
    }

    public void expClic(View view){
        Intent segunda = new Intent(this,Experto.class);
        finish();
        startActivity(segunda);
    }
}
