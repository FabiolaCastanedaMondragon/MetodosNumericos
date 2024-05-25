package com.tesji.atlets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;
import com.tesji.atlets.model.MainActivityModel;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText txnu1;
    private TextInputEditText txnu2;
    private TextInputEditText txseg1;
    private TextInputEditText txseg2;
    private AppCompatButton btCalcular;
    private Button btCancelar;
    private MediaPlayer sonidoBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txnu1 = findViewById(R.id.txtnum1);
        txnu2 = findViewById(R.id.txtnum2);
        txseg1 = findViewById(R.id.txtseg1);
        txseg2 = findViewById(R.id.txtseg2);
        btCalcular = findViewById(R.id.btnCalcular);
        btCancelar = findViewById(R.id.btnCancelar);

        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txnu1.setText("");
                txnu2.setText("");
                txseg1.setText("");
                txseg2.setText("");
                Toast.makeText(getApplicationContext(), "Datos borrados", Toast.LENGTH_LONG).show();
            }
        });
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoBoton=MediaPlayer.create(getApplicationContext(),R.raw.dobleclick);
                sonidoBoton.start();
                String n1 = txnu1.getText().toString().trim();
                String n2 = txnu2.getText().toString().trim();
                String s1 = txseg1.getText().toString().trim();
                String s2 = txseg2.getText().toString().trim();

                if (n1.isEmpty()) {
                    txnu1.setError("Ingresa Datos");
                    txnu1.requestFocus();
                    return;
                }
                if (n2.isEmpty()){
                    txnu2.setError("Ingresa Datos");
                    txnu2.requestFocus();
                    return;
                }
                if (s1.isEmpty()){
                    txseg1.setError("Ingresa Datos");
                    txseg1.requestFocus();
                    return;
                }
                if (s2.isEmpty()){
                    txseg2.setError("Ingresa Datos");
                    txseg2.requestFocus();
                    return;
                }

                // Convertir los datos ingresados a enteros y flotantes
                int nume1 = Integer.parseInt(n1);
                int nume2 = Integer.parseInt(n2);
                float tim1 = Float.parseFloat(s1);
                float tim2 = Float.parseFloat(s2);

                // Crear una instancia de MainActivityModel para realizar los cálculos
                com.tesji.atlets.model.MainActivityModel model = new MainActivityModel(nume1, nume2, tim1, tim2);

                // Obtener el resultado del cálculo de tiempo total
                String resultado = model.calculaTiempo();

                // Mostrar el resultado en un Toast
                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });
    }
}