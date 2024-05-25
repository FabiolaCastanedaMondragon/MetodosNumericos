
package com.tesji.calendario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    //PASO 1: Declarar los views a manipular
    private TextInputEditText txNumero;
    private TextInputEditText txTituloLibro;
    private TextInputEditText txAutorLibro;
    private TextInputEditText txEdicionLibro;

    private TextInputEditText txAnio;

    private Button btRegistar;
    private Button btNuevo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PASO 2:Referenciar los views declarados con el id
        //definido en el xml (Es decir en la vista)

        txNumero = findViewById(R.id.txtNumero);
        txTituloLibro = findViewById(R.id.txtTitulolibro);
        txAutorLibro = findViewById(R.id.txtAutorlibro);
        txEdicionLibro = findViewById(R.id.txtEdicionLibro);
        txAnio= findViewById(R.id.txtAnio);
        btRegistar = findViewById(R.id.btnRegistar);
        btNuevo = findViewById(R.id.btnNuevo);


        //PASO 3: Generar el evento clic para el boton
        btRegistar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero=txNumero.getText().toString();
                String anio= txAnio.getText().toString();
                String titulo= txTituloLibro.getText().toString();
                String autor= txAutorLibro.getText().toString();
                String edicion= txEdicionLibro.getText().toString();

                if(numero.isEmpty() ||titulo.isEmpty()||autor.isEmpty()|| edicion.isEmpty()||anio.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Por favor, llenar todos los campos", Toast.LENGTH_LONG).show();
                }else {


                    //  Crear un mensaje
                    Toast.makeText(getApplicationContext(),
                            "Se han registrado correctamente los datos de tu libro \n" + "\n" + "Verificar Datos: \n" +
                                    "\n" + "Número de libros:" + numero + "\n" +
                                    "El año de tu libro es:" + anio + "\n" +
                                    "El titulo de tu libro es:" + titulo + "\n" +
                                    "El autor de tu libro es:" + autor + "\n" +
                                    "La edición de tu libro es: " + edicion, Toast.LENGTH_LONG).show();

                }
            }

        });
        btNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txTituloLibro.setText("");
                txNumero.setText("");
                txAutorLibro.setText("");
                txEdicionLibro.setText("");
                txAnio.setText("");
                Toast.makeText(getApplicationContext(), "Nuevo formulario:)", Toast.LENGTH_LONG).show();
            }
        });
    }


}
