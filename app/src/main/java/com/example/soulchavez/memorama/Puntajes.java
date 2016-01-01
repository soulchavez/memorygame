package com.example.soulchavez.memorama;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Puntajes extends AppCompatActivity {

    clsConfiguracion objConfiguracion=new clsConfiguracion();
    TextView nivel1;
    TextView nivel2;
    TextView nivel3;
    TextView pTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntajes);
        nivel1=(TextView)findViewById(R.id.lblNivel1);
        nivel2=(TextView)findViewById(R.id.lblNivel2);
        nivel3=(TextView)findViewById(R.id.lblNivel3);
        pTotal=(TextView)findViewById(R.id.total);
        sacarPuntajes();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_puntajes, menu);
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

    public void sacarPuntajes(){
        Context context = getApplicationContext();
       String prin=objConfiguracion.getPrincipiante(context);
        nivel1.setText(prin);
        String med=objConfiguracion.getMedio(context);
        nivel2.setText(med);
        String exp=objConfiguracion.getExperto(context);
        nivel3.setText(exp);

        int total=Integer.parseInt(prin)+Integer.parseInt(med)+Integer.parseInt(exp);
        pTotal.setText(""+total);
    }
}
