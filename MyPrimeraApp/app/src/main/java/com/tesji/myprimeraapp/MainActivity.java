
package com.tesji.myprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.tesji.myprimeraapp.model.MainActivityModel;

public class MainActivity extends AppCompatActivity {
    //PASO 1: Declarar los views a manipular
    private TextInputEditText txNombre;
    private TextInputEditText txAnacimiento;
    private Button btEnviar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PASO 2:Referenciar los views declarados con el id
        //definido en el xml (Es decir en la vista)

        txNombre = findViewById(R.id.txtNombre);
        txAnacimiento = findViewById(R.id.txtAnacimiento);
        btEnviar = findViewById(R.id.btnEnviar);


        //PASO 3: Generar el evento clic para el boton
        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Validando cajas vacias
                if(txNombre.getText().toString().trim().length()==0){
                    txNombre.setText(null);
                    txNombre.setError("Debe ingresar el Nombre");
                    txNombre.requestFocus();
                }else if(txAnacimiento.getText().toString().trim().length()==0){
                    txAnacimiento.setText(null);
                    txAnacimiento.setError(("Debe ingresar Año de Nacimiento"));
                    txAnacimiento.requestFocus();
                }else{

                    // Enviando la peticiòn al Modelo creando una Instancia(objeto)
                    MainActivityModel objModel=new MainActivityModel();
                    //objModel.nombre=txNombre.getText().toString().trim();
                    objModel.setNombre(txNombre.getText().toString().trim());
                    //objModel.anioNac=Integer.parseInt(txAnacimiento.getText().toString());
                    objModel.setAnioNac(Integer.parseInt(txAnacimiento.getText().toString()));

                    //  Recibe el modelo los datos, los procesa y los regresa a la lista
                    Toast.makeText(getApplicationContext(),
                            objModel.calcularEdad(),
                            Toast.LENGTH_LONG).show();

                }
            }
        });

    }

}