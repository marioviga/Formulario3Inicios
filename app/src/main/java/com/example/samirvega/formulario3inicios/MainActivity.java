package com.example.samirvega.formulario3inicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TextoaParueba1,TextoaParueba2,TextoaParueba3;
    EditText entrada1,entrada2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextoaParueba1=(TextView)findViewById(R.id.texto1);
        TextoaParueba2=(TextView)findViewById(R.id.texto2);
        TextoaParueba3=(TextView)findViewById(R.id.texto3);
        entrada1=(EditText)findViewById(R.id.entradadato1);
        entrada2=(EditText)findViewById(R.id.entradadato2);

        TextoaParueba1.setText("CAMBIO");
    }
}
