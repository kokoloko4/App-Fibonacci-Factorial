package com.example.andres.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Vector;

public class fibonacci extends AppCompatActivity {

    Vector<Integer> fibo;
    LinearLayout ly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        String numero = getIntent().getStringExtra("num");
        int n1 = Integer.parseInt(numero);

        ly = findViewById(R.id.listaFibo);
        fibo = new Vector<Integer>();
        fibo.add(0);
        fibo.add(1);
        for (int k = 0; k < n1; k++)
        {
            if (k == 0){
                TextView x = new TextView(this);
                x.setText(Integer.toString(0));
                ly.addView(x);
            }
            if (k==1){
                TextView y = new TextView(this);
                y.setText(Integer.toString(1));
                ly.addView(y);
            }
            if (k>1) {
                TextView n = new TextView(this);
                fibo.add(fibo.elementAt(fibo.size() - 1) + fibo.elementAt(fibo.size() - 2));
                n.setText(Integer.toString(fibo.elementAt(fibo.size() - 1)));
                ly.addView(n);
            }
        }

    }

}
