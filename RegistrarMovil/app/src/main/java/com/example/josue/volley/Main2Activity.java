package com.example.josue.volley;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public static final String nombres="names";
    TextView txtBienvenido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtBienvenido=(TextView)findViewById(R.id.txtbienvenido);
        String usuario=getIntent().getStringExtra("names");
        txtBienvenido.setText("¡Bienvenido "+ usuario + "!");
    }
}