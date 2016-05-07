package com.example.danilo.calculadorasimples;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView resultado;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        resultado= (TextView) findViewById(R.id.resultado);
    }

    public void ce(View v){
        num1.setText("");
        num2.setText("");
        resultado.setText("");
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this,"Os campos foram limpos",duration);
        toast.show();
        MediaPlayer mp = MediaPlayer.create(this, R.raw.blop);
        mp.start();



    }

    public void som(View v){
        float numx = Float.parseFloat(num1.getText().toString());
        float numy = Float.parseFloat(num2.getText().toString());
        float soma=numx+numy;
        resultado.setText("O resultado é:\n"+soma);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.blop);
        mp.start();
    }

    public void sub(View v) {
        float numx = Float.parseFloat(num1.getText().toString());
        float numy = Float.parseFloat(num2.getText().toString());
        float sub = numx - numy;
        resultado.setText("O resultado é:\n" + sub);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.blop);
        mp.start();
    }
    public void div(View v) {
        float numx = Float.parseFloat(num1.getText().toString());
        float numy = Float.parseFloat(num2.getText().toString());
        float div = numx/ numy;
        resultado.setText("O resultado é:\n" + div);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.blop);
        mp.start();

    }

    public void mult(View v) {
        float numx = Float.parseFloat(num1.getText().toString());
        float numy = Float.parseFloat(num2.getText().toString());
        float mult = numx * numy;
        resultado.setText("O resultado é:\n" + mult);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.blop);
        mp.start();

    }



}
