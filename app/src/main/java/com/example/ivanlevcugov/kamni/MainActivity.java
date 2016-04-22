package com.example.ivanlevcugov.kamni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
   public  EditText nick1;
    public EditText nick2;
    public String p1,p2;
    protected void onCreate(Bundle savedInstanceState) {
         nick1 = (EditText) findViewById(R.id.editText2);
         nick2 = (EditText) findViewById(R.id.editText3);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void begin (View view){
        p1=nick1.getText().toString();
        p2=nick2.getText().toString();
        Intent intent = new Intent(MainActivity.this,Main2Activity.class );
        intent.putExtra(p1)
        startActivity(intent);

    }

}


