package com.mobie.login_registro;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG = "Actividad";
    private EditText ingresar_nombre,ingresar_apellido,ingresar_password,dato1,dato2,dato3,nom,ape,pass;
    private TextView titulo,use_name,password;
    private Button entrar,ingresar, web,Google,camara;
    //private String numeroTelefono = "3106537162";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG,"--OnCreate--");
        nom = (EditText)findViewById(R.id.ingresar_nombre);
        ape = (EditText)findViewById(R.id.ingresar_apellido);
        pass = (EditText)findViewById(R.id.ingresar_password);
        ingresar = findViewById(R.id.click);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ingresar() == true){
                    enviardatos(view);
                }
            }
        });
    }
    public boolean ingresar(){
        String nombre = nom.getText().toString();
        String apellido = ape.getText().toString();
        String password = pass.getText().toString();
        boolean validar;
        if(nombre.length() == 0 | apellido.length() == 0 | password.length() == 0){
            if(nombre.length() == 0){
                nom.setError("Este Campo Es Obligatorio");
            }
            if(apellido.length() == 0){
                ape.setError("Este Campo Es Obligatorio");
            }
            if(password.length() == 0){
                pass.setError("Este Campo Es Obligatorio");
            }
            validar = false;
        }
        else {
            Toast.makeText(this,"Ingreso Exitoso",Toast.LENGTH_LONG).show();
            validar=true;
        }
        return validar;
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Entre A OnStart");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"Entre A OnRestart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"Entre A OnResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Entre A OnPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Entre A OnStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Entre A OnDestroy");
    }
    public void  enviardatos(View view){
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("dato1", nom.getText().toString());
        i.putExtra("dato2", ape.getText().toString());
        i.putExtra("dato3", pass.getText().toString());
        startActivity(i);
    }
}