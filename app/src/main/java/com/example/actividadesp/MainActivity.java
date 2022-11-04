package com.example.actividadesp;
import android.os.Bundle;

import com.example.actividadesp.LoginActivity;
import com.example.actividadesp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_a;
    Button btn_b;
    Button btn_c;
    Button btn_d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn_a=findViewById(R.id.button);
        btn_a.setOnClickListener((View.OnClickListener) this);
        btn_b=findViewById(R.id.button2);
        btn_b.setOnClickListener((View.OnClickListener) this);
        btn_c=findViewById(R.id.button5);
        btn_c.setOnClickListener(this);
        btn_d=findViewById(R.id.button4);
        btn_d.setOnClickListener(this);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClick(View v){
        switch(v.getId()){

                case R.id.button:
                    Toast.makeText(getApplicationContext(), "Presionaste el botón A", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button2:

                   Intent intent_1 = new Intent(this, LoginActivity.class);
                   startActivity(intent_1);
                default:break;

                case R.id.button4:
                    Intent intent_2=new Intent(this, CalcActivity.class);
                    startActivity(intent_2);
                    break;





        }


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
