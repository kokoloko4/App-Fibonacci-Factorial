package com.example.andres.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Vector;

public class factorial extends AppCompatActivity {

    Vector<Integer> facto;
    int res;
    LinearLayout ly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);

        String numero = getIntent().getStringExtra("num");
        int n1 = Integer.parseInt(numero);

        ly = findViewById(R.id.listaFacto);
        facto = new Vector<Integer>();
        res = 1;

        for (int i =1; i<=n1;i++){
            facto.add(i);
            res = res*i;
        }

        TextView multi= new TextView(this);
        multi.setText("Multiplicación = ");
        for (int i =0 ;i<facto.size();i++){
            multi.append(Integer.toString(facto.elementAt(i)));
            if (i != facto.size()-1){
                multi.append("*");
            }
        }
        ly.addView(multi);
        TextView resultado= new TextView(this);
        resultado.setText("Resultado = "+Integer.toString(res));
        ly.addView(resultado);
    }
}
