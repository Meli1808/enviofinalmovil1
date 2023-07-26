package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    //ATRIBUTOS DE LA CLASE
    EditText cajaNombreUsuario;
    EditText cajaContrasena;

    Button botonIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNombreUsuario=findViewById(R.id.Usuario);
        cajaContrasena=findViewById(R.id.Contraseña);
        botonIngreso=findViewById(R.id.botoningresar);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //CAPTURANDO DATOS DE LAS CAJAS(Edittext)
                String nombreUsuario=cajaNombreUsuario.getText().toString();
                String Contraseña=cajaContrasena.getText().toString();

               //Abrimos una nueva ACTIVIDAD (HOME)
                Intent intent=new Intent(Login.this,Home.class);

                //Pasando datos a la nueva ACTIVIDAD
                intent.putExtra("nombre",nombreUsuario);
                intent.putExtra("Contraseña",Contraseña);

                startActivity(intent);
            }
        });


    }
}