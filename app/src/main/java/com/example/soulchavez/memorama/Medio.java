package com.example.soulchavez.memorama;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Medio extends AppCompatActivity {
    ImageButton b1;
    ImageButton  b2;
    ImageButton  b3;
    ImageButton b4;
    ImageButton  b5;
    ImageButton  b6;
    ImageButton  b7;
    ImageButton  b8;
    ImageButton  b9;
    ImageButton  b10;
    ImageButton  b11;
    ImageButton  b12;
    ImageButton b13;
    ImageButton  b14;
    ImageButton  b15;
    ImageButton b16;
    ImageButton  b17;
    ImageButton  b18;
    ImageButton  b19;
    ImageButton  b20;
    int[] cartas=new int[20];
    int volteadas=0;
    int vol1;
    int vol2;
    int parejas=0;
    boolean[] listas=new boolean[20];
    clsConfiguracion objConfiguracion=new clsConfiguracion();

    private final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medio);
        Context context = getApplicationContext();
        objConfiguracion.setNivel(context, "2");
        b1=(ImageButton)findViewById(R.id.button);
        b2=(ImageButton)findViewById(R.id.button2);
        b3=(ImageButton)findViewById(R.id.button3);
        b4=(ImageButton)findViewById(R.id.button4);
        b5=(ImageButton)findViewById(R.id.button5);
        b6=(ImageButton)findViewById(R.id.button6);
        b7=(ImageButton)findViewById(R.id.button7);
        b8=(ImageButton )findViewById(R.id.button8);
        b9=(ImageButton )findViewById(R.id.button9);
        b10=(ImageButton )findViewById(R.id.button10);
        b11=(ImageButton )findViewById(R.id.button11);
        b12=(ImageButton )findViewById(R.id.button12);
        b13=(ImageButton)findViewById(R.id.button13m);
        b14=(ImageButton)findViewById(R.id.button14);
        b15=(ImageButton)findViewById(R.id.button15);
        b16=(ImageButton)findViewById(R.id.button16);
        b17=(ImageButton)findViewById(R.id.button17);
        b18=(ImageButton)findViewById(R.id.button18);
        b19=(ImageButton)findViewById(R.id.button19);
        b20=(ImageButton)findViewById(R.id.button20);
        acomoda();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_medio, menu);
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

    public void clic1m(View view){

        int carta=cartas[0];

        if(listas[0]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b1.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b1.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b1.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b1.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b1.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b1.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b1.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b1.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b1.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b1.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 0;
            }

            if (volteadas == 2) {
                vol2 = 0;
                checar();
            }
        }
    }

    public void clic2m(View view){
        int carta=cartas[1];

        if(listas[1]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b2.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b2.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b2.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b2.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b2.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b2.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b2.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b2.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b2.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b2.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 1;
            }

            if (volteadas == 2) {
                vol2 = 1;
                checar();
            }
        }
    }

    public void clic3m(View view){
        int carta=cartas[2];

        if(listas[2]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b3.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b3.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b3.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b3.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b3.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b3.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b3.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b3.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b3.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b3.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 2;
            }

            if (volteadas == 2) {
                vol2 = 2;
                checar();
            }
        }
    }

    public void clic4m(View view){
        int carta=cartas[3];

        if(listas[3]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b4.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b4.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b4.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b4.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b4.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b4.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b4.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b4.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b4.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b4.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 3;
            }

            if (volteadas == 2) {
                vol2 = 3;
                checar();
            }
        }
    }

    public void clic5m(View view){
        int carta=cartas[4];

        if(listas[4]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b5.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b5.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b5.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b5.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b5.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b5.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b5.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b5.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b5.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b5.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 4;
            }

            if (volteadas == 2) {
                vol2 = 4;
                checar();
            }
        }
    }

    public void clic6m(View view){
        int carta=cartas[5];

        if(listas[5]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b6.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b6.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b6.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b6.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b6.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b6.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b6.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b6.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b6.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b6.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 5;
            }

            if (volteadas == 2) {
                vol2 = 5;
                checar();
            }
        }
    }

    public void clic7m(View view){
        int carta=cartas[6];

        if(listas[6]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b7.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b7.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b7.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b7.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b7.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b7.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b7.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b7.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b7.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b7.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 6;
            }

            if (volteadas == 2) {
                vol2 = 6;
                checar();
            }
        }
    }

    public void clic8m(View view){
        int carta=cartas[7];

        if(listas[7]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b8.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b8.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b8.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b8.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b8.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b8.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b8.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b8.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b8.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b8.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 7;
            }

            if (volteadas == 2) {
                vol2 = 7;
                checar();
            }
        }
    }

    public void clic9m(View view){
        int carta=cartas[8];

        if(listas[8]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b9.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b9.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b9.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b9.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b9.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b9.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b9.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b9.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b9.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b9.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 8;
            }

            if (volteadas == 2) {
                vol2 = 8;
                checar();
            }
        }
    }

    public void clic10m(View view){
        int carta=cartas[9];

        if(listas[9]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b10.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b10.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b10.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b10.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b10.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b10.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b10.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b10.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b10.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b10.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 9;
            }

            if (volteadas == 2) {
                vol2 = 9;
                checar();
            }
        }
    }

    public void clic11m(View view){
        int carta=cartas[10];

        if(listas[10]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b11.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b11.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b11.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b11.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b11.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b11.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b11.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b11.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b11.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b11.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 10;
            }

            if (volteadas == 2) {
                vol2 = 10;
                checar();
            }
        }
    }

    public void clic12m(View view){
        int carta=cartas[11];

        if(listas[11]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b12.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b12.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b12.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b12.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b12.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b12.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b12.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b12.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b12.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b12.setImageResource(R.drawable.c10);
            }

            if (volteadas == 1) {
                vol1 = 11;
            }

            if (volteadas == 2) {
                vol2 = 11;
                checar();
            }
        }
    }

    public void clic13m(View view){
        int carta=cartas[12];

        if(listas[12]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b13.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b13.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b13.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b13.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b13.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b13.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b13.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b13.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b13.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b13.setImageResource(R.drawable.c10);
            }

            if (volteadas == 1) {
                vol1 = 12;
            }

            if (volteadas == 2) {
                vol2 = 12;
                checar();
            }
        }
    }

    public void clic14m(View view){
        int carta=cartas[13];

        if(listas[13]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b14.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b14.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b14.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b14.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b14.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b14.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b14.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b14.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b14.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b14.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 13;
            }

            if (volteadas == 2) {
                vol2 = 13;
                checar();
            }
        }
    }

    public void clic15m(View view){
        int carta=cartas[14];

        if(listas[14]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b15.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b15.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b15.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b15.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b15.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b15.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b15.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b15.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b15.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b15.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 14;
            }

            if (volteadas == 2) {
                vol2 = 14;
                checar();
            }
        }
    }

    public void clic16m(View view){
        int carta=cartas[15];

        if(listas[15]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b16.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b16.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b16.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b16.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b16.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b16.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b16.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b16.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b16.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b16.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 15;
            }

            if (volteadas == 2) {
                vol2 = 15;
                checar();
            }
        }
    }

    public void clic17m(View view){
        int carta=cartas[16];

        if(listas[16]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b17.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b17.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b17.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b17.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b17.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b17.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b17.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b17.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b17.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b17.setImageResource(R.drawable.c10);
            }

            if (volteadas == 1) {
                vol1 = 16;
            }

            if (volteadas == 2) {
                vol2 = 16;
                checar();
            }
        }
    }

    public void clic18m(View view){
        int carta=cartas[17];

        if(listas[17]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b18.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b18.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b18.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b18.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b18.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b18.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b18.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b18.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b18.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b18.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 17;
            }

            if (volteadas == 2) {
                vol2 = 17;
                checar();
            }
        }
    }

    public void clic19m(View view){
        int carta=cartas[18];

        if(listas[18]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b19.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b19.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b19.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b19.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b19.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b19.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b19.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b19.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b19.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b19.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 18;
            }

            if (volteadas == 2) {
                vol2 = 18;
                checar();
            }
        }
    }

    public void clic20m(View view){
        int carta=cartas[19];

        if(listas[19]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b20.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b20.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b20.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b20.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b20.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b20.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b20.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b20.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b20.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b20.setImageResource(R.drawable.c10);
            }


            if (volteadas == 1) {
                vol1 = 19;
            }

            if (volteadas == 2) {
                vol2 = 19;
                checar();
            }
        }
    }

    public void acomoda(){

        int i=1;
        int numAleatorio=(int)Math.floor(Math.random()*(10-1+1)+1);
        cartas[0]=numAleatorio;

        while(i<20){
            numAleatorio=(int)Math.floor(Math.random()*(10-1+1)+1);

            int rep=0;
            for(int h=0; h<i; h++){

                if(numAleatorio==cartas[h]){
                    rep++;


                }

            }
            if(rep<2){

                cartas[i]=numAleatorio;

                i++;


            }
        }

        for(int a=0; a<20; a++){
            listas[a]=false;
        }

    }

    public void regresar(int n){
        if(n==0){
            b1.setImageResource(R.drawable.cartas);
        }
        if(n==1){
            b2.setImageResource(R.drawable.cartas);
        }
        if(n==2){
            b3.setImageResource(R.drawable.cartas);
        }
        if(n==3){
            b4.setImageResource(R.drawable.cartas);
        }
        if(n==4){
            b5.setImageResource(R.drawable.cartas);
        }
        if(n==5){
            b6.setImageResource(R.drawable.cartas);
        }
        if(n==6){
            b7.setImageResource(R.drawable.cartas);
        }
        if(n==7){
            b8.setImageResource(R.drawable.cartas);
        }
        if(n==8){
            b9.setImageResource(R.drawable.cartas);
        }
        if(n==9){
            b10.setImageResource(R.drawable.cartas);
        }
        if(n==10){
            b11.setImageResource(R.drawable.cartas);
        }
        if(n==11){
            b12.setImageResource(R.drawable.cartas);
        }
        if(n==12){
            b13.setImageResource(R.drawable.cartas);
        }
        if(n==13){
            b14.setImageResource(R.drawable.cartas);
        }
        if(n==14){
            b15.setImageResource(R.drawable.cartas);
        }
        if(n==15){
            b16.setImageResource(R.drawable.cartas);
        }
        if(n==16){
            b17.setImageResource(R.drawable.cartas);
        }
        if(n==17){
            b18.setImageResource(R.drawable.cartas);
        }
        if(n==18){
            b19.setImageResource(R.drawable.cartas);
        }
        if(n==19){
            b20.setImageResource(R.drawable.cartas);
        }

    }

    public void checar(){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (vol1 == vol2) {
                    volteadas = 1;
                } else {
                    if (cartas[vol1] == cartas[vol2]) {
                        parejas++;
                        listas[vol1] = true;
                        listas[vol2] = true;
                        if (parejas == 10) {
                            Context context = getApplicationContext();

                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, R.string.wintext2, duration);
                            toast.show();
                            String n1T = objConfiguracion.getMedio(context);
                            int pun = Integer.parseInt(n1T);
                            int punt = pun + 3;
                            objConfiguracion.setMedio(context, "" + punt);
                            if(punt==15){
                                Notificacion();
                            }
                            AlertDialog.Builder builder = new AlertDialog.Builder(Medio.this);
                            builder.setMessage(R.string.playagain)
                                    .setTitle(R.string.playagaintitle)
                                    .setCancelable(false)
                                    .setNegativeButton(R.string.cancelar,
                                            new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int id) {
                                                    Intent segunda = new Intent(Medio.this, MenuPrincipal.class);
                                                    startActivity(segunda);

                                                }
                                            })
                                    .setPositiveButton(R.string.aceptar,
                                            new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int id) {
                                                    finish();
                                                    startActivity(getIntent());
                                                }
                                            });
                            AlertDialog alert = builder.create();
                            alert.show();
                        }

                    } else {
                        regresar(vol1);
                        regresar(vol2);
                    }
                    volteadas = 0;
                }
            }
        }, 500);
    }
    public void Notificacion(){
        NotificationCompat.Builder notificar = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(getResources().getString(R.string.titulonuevonivel))
                .setContentText(getResources().getString(R.string.nuevonivel))
                .setDefaults(Notification.DEFAULT_ALL);

        Intent resultIntent= new Intent(this, Niveles.class);
        PendingIntent resultPendingIntent = PendingIntent.getActivity(this, 0, resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        int mNotificationId = 001;
        NotificationManager mNotifyMgr = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        mNotifyMgr.notify(mNotificationId, notificar.build());
    }
}
