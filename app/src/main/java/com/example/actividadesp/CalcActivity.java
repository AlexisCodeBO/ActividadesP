package com.example.actividadesp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends AppCompatActivity implements View.OnClickListener{

    EditText TXT_Primero,TXT_Segundo;
    TextView LBLResultado;
    Float val_1,val_2;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        btn_1=findViewById(R.id.buttonSuma);
        btn_1.setOnClickListener((View.OnClickListener) this);
        btn_2=findViewById(R.id.buttonResta);
        btn_2.setOnClickListener((View.OnClickListener) this);
        btn_3=findViewById(R.id.buttonProduct);
        btn_3.setOnClickListener((View.OnClickListener) this);
        btn_4=findViewById(R.id.buttonDivision);
        btn_4.setOnClickListener((View.OnClickListener) this);
        TXT_Primero=findViewById(R.id.txtPrimer);
        TXT_Segundo=findViewById(R.id.txtSegundo);
        LBLResultado=findViewById(R.id.etqResultado);
    }

    public void onClick(View v){

        val_1=Float.parseFloat(TXT_Primero.getText().toString());
        val_2=Float.parseFloat(TXT_Segundo.getText().toString());

        switch(v.getId()) {
            case R.id.buttonSuma: suma();
            break;

            case R.id.buttonResta: resta();
            break;

            case R.id.buttonProduct: producto();
            break;

            case R.id.buttonDivision: division();
            break;

            default:
                break;


        }

        }

        private void suma(){
            float varsum=val_1+val_2;
            LBLResultado.setText("La Suma es: "+varsum);

        }
        private void resta(){
            float varres=val_1-val_2;
            LBLResultado.setText("La resta es: "+varres);
        }
        private void producto(){
            float varpro=val_1*val_2;
            LBLResultado.setText("El producto es: "+varpro);
        }
        private void division(){
            float vardiv=val_1/val_2;
            LBLResultado.setText("La division es: "+vardiv);
        }

    }
