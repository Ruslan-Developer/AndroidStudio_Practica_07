package com.example.proyecto07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num;
    private TextView tv1;
    private Button bt1;

    private int numAleatorio;
    private String comprobacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = findViewById(R.id.et1);
        bt1 = findViewById(R.id.bt1);

        numAleatorio = (int) (Math.random() * 10);
        comprobacion = String.valueOf(numAleatorio);


        Toast.makeText(this, comprobacion, Toast.LENGTH_SHORT).show();

        //private static Toast makeStream


    }


    public void controlador(View view) {

        String valor = num.getText().toString();

        if( valor.equals(comprobacion)){
           Toast.makeText(this, "Acertado", Toast.LENGTH_SHORT).show();

        }else{
            Toast notificacion =  Toast.makeText(this, "No has acertado", Toast.LENGTH_SHORT);
            notificacion.show();
        }
    }
}