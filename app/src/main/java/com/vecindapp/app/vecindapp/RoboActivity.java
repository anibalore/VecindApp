package com.vecindapp.app.vecindapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;

/**
 * Created by anibalore on 31-08-16.
 */
public class RoboActivity extends Activity {
    public void alertaRobo(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¿Está seguro de enviar la Alarma?");
        builder.setTitle("Confirmación");
        /* Si */
        builder.setPositiveButton("Si", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){
                dialog.cancel();
            }
        });
        /* No */
        builder.setNegativeButton("No", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){
                dialog.cancel();
            }
        });

        AlertDialog dialog=builder.create();
        dialog.show();
    }
}
