package com.example.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText value_1, value_2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value_1 = (EditText) findViewById(R.id.value_1);
        value_2 = (EditText) findViewById(R.id.value_2);

        resultado = findViewById(R.id.total);
    }

    /**
     * Método que suma los valores y lo muestra en el Textview de resultado
     * @param view
     */
    public void sumar(View view) {
        int value1 = Integer.parseInt(value_1.getText().toString());
        int value2 = Integer.parseInt(value_2.getText().toString());

        resultado.setText(String.valueOf(value1 + value2));
    }

    /**
     * Método que resta los valores y lo muestra en el Textview de resultado
     * @param view
     */
    public void restar(View view) {
        int value1 = Integer.parseInt(value_1.getText().toString());
        int value2 = Integer.parseInt(value_2.getText().toString());

        resultado.setText(String.valueOf(value1 - value2));
    }

    /**
     * Método que divide los valores y lo muestra en el Textview de resultado
     * @param view
     */
    public void dividir(View view) {
        double value1 = Integer.parseInt(value_1.getText().toString());
        double value2 = Integer.parseInt(value_2.getText().toString());

        /**
         * Se agrega un toast Indicando que no se puede agregar un dividendo en 0
         * y se muestra
         */
        if (value2 == 0) {
            Toast toast = Toast.makeText(
                    getApplicationContext(),
                    "Divisor no puede ser 0",
                    Toast.LENGTH_SHORT
            );

            toast.show();
        } else {
            /**
             * En caso de que el dividendo sea diferente de 0 se hace la operación
             */
            Double total = value1 / value2;
            resultado.setText(String.valueOf(total));
        }

    }

    /**
     * Método que multiplica los valores y lo muestra en el Textview de resultado
     * @param view
     */
    public void multiplicar(View view) {
        int value1 = Integer.parseInt(value_1.getText().toString());
        int value2 = Integer.parseInt(value_2.getText().toString());

        resultado.setText(String.valueOf(value1 * value2));
    }

    /**
     * Método para limpiar valores
     *
     * @param view
     */
    public void limpiar(View view) {
        value_1.setText("");
        value_2.setText("");
        resultado.setText("");

        Toast toast = Toast.makeText(
                getApplicationContext(),
                "¡Limpio!",
                Toast.LENGTH_SHORT
        );

        toast.show();
    }
}