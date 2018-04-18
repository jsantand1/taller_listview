package com.example.delli3.taller_clase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TableLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class Reportes extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Guardar_Celular> registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        tabla=findViewById(R.id.tabla);
        registro=Dato.obtener();

    }
    public void reporte1(View v){
        int conteo=0;
        for (int i = 0; i <registro.size() ; i++) {
            String negro=getString(R.string.negro);
            String apple=getString(R.string.apple);

            if (registro.get(i).getMarca().toString().equals(apple)&&
                    registro.get(i).getColor().toString().equals(negro)){
                conteo++;
            }
        }
        Toast.makeText(getApplicationContext(),getResources().getString(R.string.numeroa_app)+": "+conteo,Toast.LENGTH_SHORT).show();
    }
    public void reporte2(View v){
        int conteo=0;
        double total=0,resultado=0;
        for (int i = 0; i <registro.size() ; i++) {
            String nokia=getString(R.string.nokia);
            if (registro.get(i).getMarca().toString().equals(nokia)){
                conteo=conteo+1;
                total=total+registro.get(i).getPrecio();
            }resultado=total/conteo;

        }Toast.makeText(getApplicationContext(),
                getResources().getString(R.string.numerCelulares)+": "+conteo+"\n"+
                        getResources().getString(R.string.total)+": "+total+"\n"+
                        getResources().getString(R.string.promedio)+": "+resultado,Toast.LENGTH_SHORT).show();
    }

}