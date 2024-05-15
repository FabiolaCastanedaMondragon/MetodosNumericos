package com.tesji.practicaspinner;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

import com.tesji.practicaspinner.Model.CarrerasModel;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText txmonto;
    private Spinner spCliente;
    private Spinner spDescuento;
    private TextView tvImprimir;

    String []opCliente={"--Tipo de cliente--",
            "Cliente general",
            "Cliente afiliado"};
    String[] opDescuento={"--Tipo de pago--",
            "Contado",
            "Plazos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txmonto=findViewById(R.id.txtmonto);

        spCliente=findViewById(R.id.spinnerTipoC);
        spDescuento=findViewById(R.id.spinnerTipoP);
        tvImprimir=findViewById(R.id.textViewImprimir);
        ArrayAdapter<String> adapCliente=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,opCliente);
        spCliente.setAdapter(adapCliente);
        ArrayAdapter<String> adapDescuento=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,opDescuento);
        spDescuento.setAdapter(adapDescuento);
        spCliente.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spDescuento.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(txmonto.getText().toString().trim().length()==0){
                    txmonto.setText(null);
                    txmonto.setError("Indique su monto a pagar");
                    txmonto.requestFocus();
                }else {

                    CarrerasModel resultado;
                    resultado = new CarrerasModel();

                    resultado.setMonto(Integer.parseInt(txmonto.getText().toString()));
                    resultado.setCliente(spCliente.getSelectedItemPosition());
                    resultado.setDescuento(spDescuento.getSelectedItemPosition());
                    tvImprimir.setText(resultado.mostrarResultado());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}

