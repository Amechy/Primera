package com.example.ejercicio1acda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import java.util.Date;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView texto;
    Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.tvFechaYHora);
        boton = (Button) findViewById(R.id.btnObtenerFechaYHora);
        boton.setOnClickListener(this);
        actualizar();

    }

    @Override
    public void onClick(View view) {

        if (view == boton) {
            actualizar();
        }

    }

    public void actualizar() {

        texto.setText(new Date().toString());
    }
}