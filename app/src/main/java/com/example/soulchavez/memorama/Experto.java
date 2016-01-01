package com.example.soulchavez.memorama;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Experto extends AppCompatActivity {

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
    ImageButton b21;
    ImageButton  b22;
    ImageButton  b23;
    ImageButton b24;
    ImageButton  b25;
    ImageButton  b26;
    ImageButton  b27;
    ImageButton  b28;
    ImageButton  b29;
    ImageButton  b30;
    int[] cartas=new int[30];
    int volteadas=0;
    int vol1;
    int vol2;
    int parejas=0;
    boolean[] listas=new boolean[30];
    clsConfiguracion objConfiguracion=new clsConfiguracion();
    private final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experto);
        b1=(ImageButton)findViewById(R.id.button);
        b2=(ImageButton)findViewById(R.id.imageButton);
        b3=(ImageButton)findViewById(R.id.imageButton2);
        b4=(ImageButton)findViewById(R.id.imageButton3);
        b5=(ImageButton)findViewById(R.id.imageButton4);
        b6=(ImageButton)findViewById(R.id.imageButton5);
        b7=(ImageButton)findViewById(R.id.imageButton6);
        b8=(ImageButton)findViewById(R.id.imageButton7);
        b9=(ImageButton )findViewById(R.id.imageButton8);
        b10=(ImageButton )findViewById(R.id.imageButton9);
        b11=(ImageButton )findViewById(R.id.imageButton10);
        b12=(ImageButton )findViewById(R.id.imageButton11);
        b13=(ImageButton )findViewById(R.id.imageButton12);
        b14=(ImageButton)findViewById(R.id.imageButton13);
        b15=(ImageButton)findViewById(R.id.imageButton14);
        b16=(ImageButton)findViewById(R.id.imageButton15);
        b17=(ImageButton)findViewById(R.id.imageButton16);
        b18=(ImageButton)findViewById(R.id.imageButton17);
        b19=(ImageButton )findViewById(R.id.imageButton18);
        b20=(ImageButton )findViewById(R.id.imageButton19);
        b21=(ImageButton )findViewById(R.id.imageButton20);
        b22=(ImageButton )findViewById(R.id.imageButton21);
        b23=(ImageButton )findViewById(R.id.imageButton22);
        b24=(ImageButton)findViewById(R.id.imageButton23);
        b25=(ImageButton)findViewById(R.id.imageButton24);
        b26=(ImageButton)findViewById(R.id.imageButton25);
        b27=(ImageButton)findViewById(R.id.imageButton26);
        b28=(ImageButton)findViewById(R.id.imageButton27);
        b29=(ImageButton )findViewById(R.id.imageButton28);
        b30=(ImageButton )findViewById(R.id.imageButton29);
        acomoda();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_experto, menu);
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

    public void clic1e(View view){

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

            if (carta == 11) {
                b1.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b1.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b1.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b1.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b1.setImageResource(R.drawable.c15);
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

    public void clic2e(View view){
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

            if (carta == 11) {
                b2.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b2.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b2.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b2.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b2.setImageResource(R.drawable.c15);
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

    public void clic3e(View view){
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
            if (carta == 11) {
                b3.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b3.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b3.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b3.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b3.setImageResource(R.drawable.c15);
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

    public void clic4e(View view){
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
            if (carta == 11) {
                b4.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b4.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b4.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b4.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b4.setImageResource(R.drawable.c15);
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

    public void clic5e(View view){
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

            if (carta == 11) {
                b5.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b5.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b5.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b5.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b5.setImageResource(R.drawable.c15);
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

    public void clic6e(View view){
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
            if (carta == 11) {
                b6.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b6.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b6.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b6.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b6.setImageResource(R.drawable.c15);
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

    public void clic7e(View view){
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
            if (carta == 11) {
                b7.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b7.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b7.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b7.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b7.setImageResource(R.drawable.c15);
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

    public void clic8e(View view){
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
            if (carta == 11) {
                b8.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b8.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b8.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b8.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b8.setImageResource(R.drawable.c15);
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

    public void clic9e(View view){
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
            if (carta == 11) {
                b9.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b9.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b9.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b9.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b9.setImageResource(R.drawable.c15);
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

    public void clic10e(View view){
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
            if (carta == 11) {
                b10.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b10.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b10.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b10.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b10.setImageResource(R.drawable.c15);
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

    public void clic11e(View view){
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
            if (carta == 11) {
                b11.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b11.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b11.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b11.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b11.setImageResource(R.drawable.c15);
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

    public void clic12e(View view){
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

            if (carta == 11) {
                b12.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b12.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b12.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b12.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b12.setImageResource(R.drawable.c15);
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

    public void clic13e(View view){
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
            if (carta == 11) {
                b13.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b13.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b13.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b13.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b13.setImageResource(R.drawable.c15);
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

    public void clic14e(View view){
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
            if (carta == 11) {
                b14.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b14.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b14.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b14.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b14.setImageResource(R.drawable.c15);
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

    public void clic15e(View view){
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
            if (carta == 11) {
                b15.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b15.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b15.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b15.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b15.setImageResource(R.drawable.c15);
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

    public void clic16e(View view){
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
            if (carta == 11) {
                b16.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b16.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b16.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b16.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b16.setImageResource(R.drawable.c15);
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

    public void clic17e(View view){
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
            if (carta == 11) {
                b17.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b17.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b17.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b17.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b17.setImageResource(R.drawable.c15);
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

    public void clic18e(View view){
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
            if (carta == 11) {
                b18.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b18.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b18.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b18.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b18.setImageResource(R.drawable.c15);
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

    public void clic19e(View view){
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

    public void clic20e(View view){
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
            if (carta == 11) {
                b20.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b20.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b20.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b20.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b20.setImageResource(R.drawable.c15);
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

    public void clic21e(View view){
        int carta=cartas[20];

        if(listas[20]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b21.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b21.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b21.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b21.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b21.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b21.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b21.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b21.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b21.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b21.setImageResource(R.drawable.c10);
            }
            if (carta == 11) {
                b21.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b21.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b21.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b21.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b21.setImageResource(R.drawable.c15);
            }


            if (volteadas == 1) {
                vol1 = 20;
            }

            if (volteadas == 2) {
                vol2 = 20;
                checar();
            }
        }
    }

    public void clic22e(View view){
        int carta=cartas[21];

        if(listas[21]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b22.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b22.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b22.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b22.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b22.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b22.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b22.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b22.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b22.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b22.setImageResource(R.drawable.c10);
            }
            if (carta == 11) {
                b22.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b22.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b22.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b22.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b22.setImageResource(R.drawable.c15);
            }


            if (volteadas == 1) {
                vol1 = 21;
            }

            if (volteadas == 2) {
                vol2 = 21;
                checar();
            }
        }
    }


    public void clic23e(View view){
        int carta=cartas[22];

        if(listas[22]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b23.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b23.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b23.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b23.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b23.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b23.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b23.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b23.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b23.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b23.setImageResource(R.drawable.c10);
            }
            if (carta == 11) {
                b23.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b23.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b23.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b23.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b23.setImageResource(R.drawable.c15);
            }


            if (volteadas == 1) {
                vol1 = 22;
            }

            if (volteadas == 2) {
                vol2 = 22;
                checar();
            }
        }
    }

    public void clic24e(View view){
        int carta=cartas[23];

        if(listas[23]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b24.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b24.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b24.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b24.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b24.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b24.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b24.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b24.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b24.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b24.setImageResource(R.drawable.c10);
            }
            if (carta == 11) {
                b24.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b24.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b24.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b24.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b24.setImageResource(R.drawable.c15);
            }


            if (volteadas == 1) {
                vol1 = 23;
            }

            if (volteadas == 2) {
                vol2 = 23;
                checar();
            }
        }
    }


    public void clic25e(View view){
        int carta=cartas[24];

        if(listas[24]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b25.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b25.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b25.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b25.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b25.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b25.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b25.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b25.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b25.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b25.setImageResource(R.drawable.c10);
            }
            if (carta == 11) {
                b25.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b25.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b25.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b25.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b25.setImageResource(R.drawable.c15);
            }


            if (volteadas == 1) {
                vol1 = 24;
            }

            if (volteadas == 2) {
                vol2 = 24;
                checar();
            }
        }
    }

    public void clic26e(View view){
        int carta=cartas[25];

        if(listas[25]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b26.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b26.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b26.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b26.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b26.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b26.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b26.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b26.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b26.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b26.setImageResource(R.drawable.c10);
            }
            if (carta == 11) {
                b26.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b26.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b26.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b26.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b26.setImageResource(R.drawable.c15);
            }


            if (volteadas == 1) {
                vol1 = 25;
            }

            if (volteadas == 2) {
                vol2 = 25;
                checar();
            }
        }
    }


    public void clic27e(View view){
        int carta=cartas[26];

        if(listas[26]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b27.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b27.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b27.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b27.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b27.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b27.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b27.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b27.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b27.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b27.setImageResource(R.drawable.c10);
            }
            if (carta == 11) {
                b27.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b27.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b27.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b27.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b27.setImageResource(R.drawable.c15);
            }


            if (volteadas == 1) {
                vol1 = 26;
            }

            if (volteadas == 2) {
                vol2 = 26;
                checar();
            }
        }
    }


    public void clic28e(View view){
        int carta=cartas[27];

        if(listas[27]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b28.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b28.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b28.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b28.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b28.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b28.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b28.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b28.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b28.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b28.setImageResource(R.drawable.c10);
            }
            if (carta == 11) {
                b28.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b28.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b28.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b28.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b28.setImageResource(R.drawable.c15);
            }


            if (volteadas == 1) {
                vol1 = 27;
            }

            if (volteadas == 2) {
                vol2 = 27;
                checar();
            }
        }
    }

    public void clic29e(View view){
        int carta=cartas[28];

        if(listas[28]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b29.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b29.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b29.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b29.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b29.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b29.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b29.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b29.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b29.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b29.setImageResource(R.drawable.c10);
            }
            if (carta == 11) {
                b29.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b29.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b29.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b29.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b29.setImageResource(R.drawable.c15);
            }


            if (volteadas == 1) {
                vol1 = 28;
            }

            if (volteadas == 2) {
                vol2 = 28;
                checar();
            }
        }
    }


    public void clic30e(View view){
        int carta=cartas[29];

        if(listas[29]==true){

        }else {
            volteadas++;
            if (carta == 1) {
                b30.setImageResource(R.drawable.c1);
            }
            if (carta == 2) {
                b30.setImageResource(R.drawable.c2);
            }
            if (carta == 3) {
                b30.setImageResource(R.drawable.c3);
            }
            if (carta == 4) {
                b30.setImageResource(R.drawable.c4);
            }
            if (carta == 5) {
                b30.setImageResource(R.drawable.c5);
            }
            if (carta == 6) {
                b30.setImageResource(R.drawable.c6);
            }
            if (carta == 7) {
                b30.setImageResource(R.drawable.c7);
            }
            if (carta == 8) {
                b30.setImageResource(R.drawable.c8);
            }
            if (carta == 9) {
                b30.setImageResource(R.drawable.c9);
            }
            if (carta == 10) {
                b30.setImageResource(R.drawable.c10);
            }
            if (carta == 11) {
                b30.setImageResource(R.drawable.c11);
            }
            if (carta == 12) {
                b30.setImageResource(R.drawable.c12);
            }
            if (carta == 13) {
                b30.setImageResource(R.drawable.c13);
            }
            if (carta == 14) {
                b30.setImageResource(R.drawable.c14);
            }
            if (carta == 15) {
                b30.setImageResource(R.drawable.c15);
            }


            if (volteadas == 1) {
                vol1 = 29;
            }

            if (volteadas == 2) {
                vol2 = 29;
                checar();
            }
        }
    }


    public void acomoda(){

        int i=1;
        int numAleatorio=(int)Math.floor(Math.random()*(15-1+1)+1);
        cartas[0]=numAleatorio;

        while(i<30){
            numAleatorio=(int)Math.floor(Math.random()*(15-1+1)+1);

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

        for(int a=0; a<30; a++){
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
        if(n==20){
            b21.setImageResource(R.drawable.cartas);
        }
        if(n==21){
            b22.setImageResource(R.drawable.cartas);
        }
        if(n==22){
            b23.setImageResource(R.drawable.cartas);
        }
        if(n==23){
            b24.setImageResource(R.drawable.cartas);
        }
        if(n==24){
            b25.setImageResource(R.drawable.cartas);
        }
        if(n==25){
            b26.setImageResource(R.drawable.cartas);
        }
        if(n==26){
            b27.setImageResource(R.drawable.cartas);
        }
        if(n==27){
            b28.setImageResource(R.drawable.cartas);
        }
        if(n==28){
            b29.setImageResource(R.drawable.cartas);
        }
        if(n==29){
            b30.setImageResource(R.drawable.cartas);
        }

    }

    public void checar(){
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(cartas[vol1]==cartas[vol2]){
                    parejas++;
                    listas[vol1]=true;
                    listas[vol2]=true;
                    if(parejas==15){
                        Context context = getApplicationContext();

                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, R.string.wintext3, duration);
                        toast.show();
                        String n1T= objConfiguracion.getExperto(context);
                        int pun=Integer.parseInt(n1T);
                        int punt=pun+5;
                        objConfiguracion.setExperto(context, "" + punt);

                        AlertDialog.Builder builder = new AlertDialog.Builder(Experto.this);
                        builder.setMessage(R.string.playagain)
                                .setTitle(R.string.playagaintitle)
                                .setCancelable(false)
                                .setNegativeButton(R.string.cancelar,
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                Intent segunda=new Intent(Experto.this, MenuPrincipal.class);
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

                }else{
                    regresar(vol1);
                    regresar(vol2);
                }
                volteadas=0;
            }
        }, 500);
    }
}
