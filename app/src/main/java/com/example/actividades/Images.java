package com.example.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Images extends AppCompatActivity implements View.OnClickListener {
    TextView textoRequest;
    EditText textoEdit;
    Button buttonclick;

    ListView list;
    ArrayList<String> titles = new ArrayList<>();
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,titles);
        list = findViewById(R.id.list);

        list.setAdapter(arrayAdapter);

        textoRequest = findViewById(R.id.request);
        buttonclick = (Button) findViewById(R.id.click);
        textoEdit = (EditText) findViewById(R.id.codigo);


        buttonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                find(textoEdit.getText().toString());
            }
        });

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

    private void find(String id) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PostService postApi = retrofit.create(PostService.class);
        Call<List<Post>> call=postApi.find(id);

        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                try {
                    if (response.isSuccessful()) {
                         List<Post> posts= response.body();
                         Post post = posts.get(0);
//                        for(Post post : response.body()) {
//                            titles.add(post.getTitle());
//                        }
//                        arrayAdapter.notifyDataSetChanged();
                        textoRequest.setText(post.getTitle());
                    }
                } catch (Exception ex) {
                    Toast.makeText(Images.this, ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Post>>  call, Throwable t) {

            }
        });
    }


    @Override
    public void onClick(View v) {

    }
}