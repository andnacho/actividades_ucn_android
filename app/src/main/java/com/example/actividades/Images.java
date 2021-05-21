package com.example.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.widget.ImageButton;
import android.widget.Toast;

import java.util.List;

/**
 * SE agrega una interfaz tipo View.OnclickListener
 */
public class Images extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

        /**
         * Se crea la variable que obtiene el objeto del layout
         * Se hace un cast del ImageButton (para forzarlo a que sea un ImageButton)
         */
        ImageButton boton1 = (ImageButton) findViewById(R.id.imageButton);

        /**
         * Se agrega un evento tipo onclickListener
         * que lo que hace es escuchar un click
         */
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Se crea un Toast que es un objeto para poner mensaje
                 */
                Toast notification = Toast.makeText(Images.this, R.string.luffy_saluda, Toast.LENGTH_SHORT);
                notification.show();
            }
        });


        ImageButton boton2 = (ImageButton) findViewById(R.id.imageButton2);

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notification = Toast.makeText(Images.this, "Zoro saluda", Toast.LENGTH_SHORT);
                notification.show();

                /**
                 * Crea un Intent que sirve para cambiar de activity
                 */
                Intent intent = new Intent(getApplicationContext(), TabsActivity.class);
                startActivity(intent);
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

                Intent intent = new Intent(getApplicationContext(),NavigationMainActivity.class);
                startActivity(intent);
            }
        });
    }

//    private void find(String id) {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://jsonplaceholder.typicode.com/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        PostService postApi = retrofit.create(PostService.class);
//        Call<List<Post>> call=postApi.find(id);
//
//        call.enqueue(new Callback<List<Post>>() {
//            @Override
//            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
//                try {
//                    if (response.isSuccessful()) {
//                         List<Post> posts= response.body();
//                         Post post = posts.get(0);
////                        for(Post post : response.body()) {
////                            titles.add(post.getTitle());
////                        }
////                        arrayAdapter.notifyDataSetChanged();
//                        textoRequest.setText(post.getTitle());
//                    }
//                } catch (Exception ex) {
//                    Toast.makeText(Images.this, ex.getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Post>>  call, Throwable t) {
//
//            }
//        });
//    }


    @Override
    public void onClick(View v) {

    }
}