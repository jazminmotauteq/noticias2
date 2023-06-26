package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DATOS
        final String[] datos =
                new
                        String[]{"Elem1","Elem2","Elem3","Elem4","Elem5"};
        //ADAPTADOR
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);
//ASIGANA EL ADAPTADOR DE LA VISTA (sPINNER)
        Spinner cmbOpciones = (Spinner) findViewById(R.id.cblista);
         adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
         cmbOpciones.setAdapter(adaptador);
         cmbOpciones.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        TextView txtItem = (TextView)findViewById(R.id.txtiten);
        txtItem.setText("Seleccionado: " + adapterView.getItemAtPosition(i));

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}