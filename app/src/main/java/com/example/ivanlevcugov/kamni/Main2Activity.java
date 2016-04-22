package com.example.ivanlevcugov.kamni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    public TextView button1;
    public TextView  button2;
    public TextView button3;
    public TextView igrok;
    Random r = new Random();
    EditText num;
    String s;
    int r1,r2,r3,a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        b=1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        num = (EditText) findViewById(R.id.editText);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        igrok = (TextView) findViewById(R.id.textView);
        r1=r.nextInt(20)+1;
        r2=r.nextInt(20)+1;
        r3=r.nextInt(20)+1;
        button1.setText("" +r1);
        button2.setText("" +r2);
        button3.setText("" +r3);
        igrok.setText("xодит игрок" + b);


    }
    public void Button1(View view) {

        s=num.getText().toString();
        a=Integer.parseInt(s);
        if (a<=r1) {
            r1=r1-a;
        }
        else{
            Toast.makeText(this, "MNOGO", Toast.LENGTH_SHORT).show();
        }
        if (b==1){
            b=2;
        }
        else{
            b=1;
        }
        igrok.setText("xодит игрок" + b);
        button1.setText(""+r1);
        if ((r1==0)&(r2==0)&(r3==0)){
            igrok.setText("win  игрок" + b);
        }
    }
    public void Button2(View view) {
        s=num.getText().toString();
        a=Integer.parseInt(s);
        if (a<=r2) {
            r2=r2-a;
        }
        else{
            Toast.makeText(this, "MNOGO", Toast.LENGTH_SHORT).show();
        }
        if (b==1){
            b=2;
        }
        else{
            b=1;
        }
        igrok.setText("xодит игрок" + b);
        button2.setText(""+r2);
        if ((r1==0)&(r2==0)&(r3==0)){
            igrok.setText("win  игрок" + b);
        }
    }
    public void Button3(View view) {
        s=num.getText().toString();
        a=Integer.parseInt(s);
        if (a<=r3) {
            r3=r3-a;
        }
        else{
            Toast.makeText(this, "MNOGO", Toast.LENGTH_SHORT).show();
        }
        if (b==1){
            b=2;
        }
        else{
            b=1;
        }
        igrok.setText("xодит игрок" + b);
        button3.setText(""+r3);
        if ((r1==0)&(r2==0)&(r3==0)){
            igrok.setText("win  игрок" + b);
        }
    }
}
