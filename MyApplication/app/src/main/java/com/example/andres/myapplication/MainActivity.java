package com.example.andres.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    int cantFibo=0;
    int cantFacto=0;
    EditText et;
    EditText et2;
    Date dFibo;
    Date dFacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.calcularf);
        button2 = findViewById(R.id.calcularfacto);

        et = findViewById(R.id.num);
        et2 = findViewById(R.id.facto);
        //numbers = findViewById(R.id.listFibo);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dFibo = new Date();
                cantFibo += 1;
                Intent intent = new Intent(view.getContext(),fibonacci.class);
                intent.putExtra("num",et.getText().toString());
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dFacto = new Date();
                cantFacto += 1;
                Intent intent = new Intent(view.getContext(),factorial.class);
                intent.putExtra("num",et2.getText().toString());
                startActivity(intent);
            }
        });
    }

    @Override
    public void onResume(){
        super.onResume();

        if (cantFibo != 0){
            TextView hFibo = findViewById(R.id.histoFibo);
            hFibo.setText("Se ha usado "+Integer.toString(cantFibo)+" veces"+".\nÚltima vez usado "+dFibo.toString());
        }
        if (cantFacto != 0){
            TextView hFacto = findViewById(R.id.histoFacto);
            hFacto.setText("Se ha usado "+Integer.toString(cantFacto)+" veces"+".\nÚltima vez usado "+dFacto.toString());
        }

    }
}