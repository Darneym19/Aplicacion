package com.mobie.login_registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button Google,webSicau,camara;
    private TextView dato_1,dato_2,dato_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Botones();
        recibirDatos();
        abreCamara();
    }
    public void Botones(){
        Google = (Button)findViewById(R.id.webGoogle);
        webSicau = (Button)findViewById(R.id.webSicau);
        //camara = (Button)findViewById(R.id.camara);

        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webGoogle(view);
            }
        });
        webSicau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webSicau(view);
            }
        });
        /*camara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                camara(view);
            }
        });*/
    }
    public void webGoogle(View View){
        Intent irGoogle = new Intent(Intent.ACTION_VIEW); // Abre una nueva pantalla
        irGoogle.setData(Uri.parse("https://www.google.com"));
        startActivity(irGoogle);
    }
    public void webSicau(View View){
        Intent sicau = new Intent(Intent.ACTION_VIEW); // Abre una nueva pantalla en Sicau
        sicau.setData(Uri.parse("https://sicau.pascualbravo.edu.co/SICAU/Account/Login"));
        startActivity(sicau);
    }
    public void abreCamara(){
        Intent camara = new Intent(Intent.ACTION_CAMERA_BUTTON); // Abre la app de Camara
        camara.setData(Uri.parse(""));
        startActivity(camara);
    }
    public void recibirDatos(){
        dato_1 = (TextView) findViewById(R.id.dato1);
        dato_2 = (TextView)findViewById(R.id.dato2);
        dato_3 = (TextView)findViewById(R.id.dato3);

        String a = getIntent().getStringExtra("dato1");
        dato_1.setText("Nombre: " + a);
        String b = getIntent().getStringExtra("dato2");
        dato_2.setText("Apellido: " + b);
        String c = getIntent().getStringExtra("dato3");
        dato_3.setText("Clave: " + c);
    }
}