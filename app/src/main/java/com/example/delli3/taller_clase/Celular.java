package com.example.delli3.taller_clase;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Celular extends AppCompatActivity {
 private Spinner txtmarca,txtcolor;
 private EditText txtprecio;
    private String marca[],color[];
    private Resources recursos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celular);

        txtprecio=findViewById(R.id.txtprecio);

        recursos=this.getResources();
        txtmarca=findViewById(R.id.spnmarca);
        txtcolor=findViewById(R.id.spncolor);

        marca=recursos.getStringArray(R.array.marcas);
        ArrayAdapter<String> adapter1= new ArrayAdapter(this,android.R.layout.simple_spinner_item,marca);
        txtmarca.setAdapter(adapter1);

        color=recursos.getStringArray(R.array.colores);
        ArrayAdapter<String> adapter2= new ArrayAdapter(this,android.R.layout.simple_spinner_item,color);
        txtcolor.setAdapter(adapter2);
    }
    public void crear(View v){

            int Pmarca=txtmarca.getSelectedItemPosition();
            int Pcolor=txtcolor.getSelectedItemPosition();
            String marcaSelec=marca[Pmarca];
            String colorSelec=color[Pcolor];
            double precio=Double.parseDouble(txtprecio.getText().toString());

            Guardar_Celular r=new Guardar_Celular(marcaSelec,colorSelec,precio);
            r.guardar();
            Toast.makeText(getApplicationContext(),getString(R.string.registrar),Toast.LENGTH_SHORT).show();
        }


    public void limpiar(View v){
        txtprecio.setText("");
    }
}
