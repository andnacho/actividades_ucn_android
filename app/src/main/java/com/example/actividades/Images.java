package com.example.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Images extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

        ImageButton boton1 = (ImageButton) findViewById(R.id.imageButton);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notification = Toast.makeText(Images.this, "Luffy saluda", Toast.LENGTH_SHORT);
                notification.show();
            }
        });

        ImageButton boton2 = (ImageButton) findViewById(R.id.imageButton2);

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notification = Toast.makeText(Images.this, "Zoro saluda", Toast.LENGTH_SHORT);
                notification.show();
            }
        });
        ImageButton boton3 = (ImageButton) findViewById(R.id.imageButton4);

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notification = Toast.makeText(Images.this, "Sanji saluda", Toast.LENGTH_SHORT);
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton boton4 = (ImageButton) findViewById(R.id.imageButton5);

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notification = Toast.makeText(Images.this, "Franki saluda", Toast.LENGTH_SHORT);
                notification.show();
            }
        });
    }


    @Override
    public void onClick(View v) {

    }
}