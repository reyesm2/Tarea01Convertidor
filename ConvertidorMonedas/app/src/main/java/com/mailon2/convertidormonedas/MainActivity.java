package com.mailon2.convertidormonedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void realizarConversion(View view){

        double  VALORCAMBIO = 566.69;

        EditText valorEditText = findViewById(R.id.editTextCantidad);
        String entrada  = valorEditText.getText().toString();


        RadioButton radioButtonColones = findViewById(R.id.radioButtonColones);
        RadioButton radioButtonDolares = findViewById(R.id.radioButtonDolares);

        TextView textView = findViewById(R.id.textViewResultado);

        if(radioButtonColones.isChecked()){
            if(!entrada.isEmpty()){
                double valorEntrada = Double.parseDouble(entrada);
                double resultado = valorEntrada/VALORCAMBIO;
                textView.setText(String.valueOf(resultado+" $"));
                valorEditText.setText("");

            }else{
                Toast.makeText(this, "Complete el monto.", Toast.LENGTH_LONG).show();
            }

        }else if (radioButtonDolares.isChecked()){
            if(!entrada.isEmpty()){
                double valorEntrada = Double.parseDouble(entrada);
                double resultado = valorEntrada*VALORCAMBIO;
                textView.setText(String.valueOf(resultado+" ₡"));
                valorEditText.setText("");

            }else{
                Toast.makeText(this, "Complete el monto.", Toast.LENGTH_LONG).show();
            }

        }else{
            Toast.makeText(this, "Sin seleccionar conversion.", Toast.LENGTH_LONG).show();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
