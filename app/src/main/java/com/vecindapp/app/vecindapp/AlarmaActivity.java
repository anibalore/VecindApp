package com.vecindapp.app.vecindapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by anibalore on 30-08-16.
 */
public class AlarmaActivity extends Activity{
    Button font_cancelar_alarma;
    ImageButton button_robo;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarma);

        /* Cambio fuente de letra botón alertas */
        font_cancelar_alarma = (Button) findViewById(R.id.button_cancelar_alarma);
        String font_alertas_path = "font/BebasNeueRegular.otf";
        Typeface TF_alertas = Typeface.createFromAsset(getAssets(),font_alertas_path);
        font_cancelar_alarma.setTypeface(TF_alertas);

        button_robo = (ImageButton) findViewById(R.id.button_robo);
        button_robo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i = new Intent(AlarmaActivity.this, RoboActivity.class);
                Toast.makeText(AlarmaActivity.this, "prueba", Toast.LENGTH_SHORT).show();
                //startActivity(i);
            }
        });
    }
}
