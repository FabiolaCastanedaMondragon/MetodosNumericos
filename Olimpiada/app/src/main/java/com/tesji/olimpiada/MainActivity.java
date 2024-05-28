package com.tesji.olimpiada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tesji.olimpiada.model.MainActivityModel;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText txNombre;
    private TextInputEditText txPuntos;
    private Button btCalcula;
    private Button btCancela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txNombre = findViewById(R.id.jugador1);
        txPuntos = findViewById(R.id.puntosJugador);
        btCalcula = findViewById(R.id.btnEnviar);
        btCancela = findViewById(R.id.btnBorrar);

        btCancela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txPuntos.setText("");
                txNombre.setText("");
                Toast.makeText(getApplicationContext(), "Datos borrados", Toast.LENGTH_LONG).show();
            }
        });

        btCalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txNombre.getText().toString().trim();
                String puntajeStr = txPuntos.getText().toString().trim();

                if (nombre.isEmpty()) {
                    txNombre.setError("Ingresa un nombre");
                    txNombre.requestFocus();
                    return;
                }

                if (puntajeStr.isEmpty()) {
                    txPuntos.setError("Ingresa un puntaje");
                    txPuntos.requestFocus();
                    return;
                }

                int puntaje = Integer.parseInt(puntajeStr);
                if (puntaje < 0 || puntaje > 10) {
                    txPuntos.setError("El puntaje debe estar entre 0 y 10");
                    txPuntos.requestFocus();
                    return;
                }

                MainActivityModel objModel = new MainActivityModel(nombre, puntaje);
                Toast.makeText(getApplicationContext(), objModel.calcularTotal(), Toast.LENGTH_LONG).show();
            }
        });
    }
}