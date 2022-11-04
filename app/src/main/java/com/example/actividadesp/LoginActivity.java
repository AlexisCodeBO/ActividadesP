package com.example.actividadesp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText TXT_USUARIO, TXT_PASSWORD;
    Button BTN_VALIDA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TXT_USUARIO=  findViewById(R.id.editText);
        TXT_PASSWORD= findViewById(R.id.editText2);

        BTN_VALIDA= findViewById(R.id.button3);
        BTN_VALIDA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
              String VAR_USUARIO=TXT_USUARIO.getText().toString();
              String VAR_PASSWORD=TXT_PASSWORD.getText().toString();

              if(VAR_USUARIO.equals("usuario")&&VAR_PASSWORD.equals("654321")){
                  Toast.makeText(getApplicationContext(), "Bienvenido, "+TXT_USUARIO, Toast.LENGTH_LONG).show();
                  Intent intent=new Intent(getApplicationContext(), Main2Activity.class);
                  startActivity(intent);
              }
              else{
                    Toast.makeText(getApplicationContext(), "Usuario o Contraseña incorrecta", Toast.LENGTH_LONG).show();
              }


            }
        });
    }
}
