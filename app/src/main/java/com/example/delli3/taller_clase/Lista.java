package com.example.delli3.taller_clase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Lista extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Guardar_Celular> registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        tabla=findViewById(R.id.tabla);
        registro=Dato.obtener();
        for (int i = 0; i <registro.size() ; i++) {
            TableRow fila = new TableRow(this);
            TextView c1 =new TextView(this);
            TextView c2 =new TextView(this);
            TextView c3 =new TextView(this);
            TextView c4 =new TextView(this);

            c1.setText(""+i);
            c2.setText(registro.get(i).getMarca());
            c3.setText(registro.get(i).getColor());
            c4.setText(registro.get(i).getPrecio()+"");

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            tabla.addView(fila);
        }


    }
}
