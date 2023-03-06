package com.example.lab3frasescelebres;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Math;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaramos la variable global para conocer el numero generado en todas las clases
    private static  int numeroAleatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Incializamos las variable de labels para que tengan un contenido incial
        numeroAleatorio = (int)(Math.random()*3+1);

        //Declaromos y incializamos nuestros Views
        TextView numeroGenerado = (TextView) findViewById(R.id.labelNumeroAleatorio);
        Button botonNumeroAleatorio = (Button) findViewById(R.id.Buton_Num_Aleatorios);

        //Método que permite generar un nuevo numero aleatorio al pulsar el botón Generar Número.
        botonNumeroAleatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Declaramos una variable donde guardar nuestro número aleatorio
                String numeroString;

                //Generamos el número aleatorio
                numeroAleatorio = (int)(Math.random()*3+1);

                //Asignamos el número en una string para poder ser mostrado en pantalla
                numeroString = String.valueOf(numeroAleatorio);

                //Actualizamos el label que muestra el número
                numeroGenerado.setText(numeroString);
            }
        });
    }

    /**
     * Incializamos la activity_mostrar_frase
     * @param view
     */
    public void lauchActivityFrase(View view) {
        Intent intent =  new Intent(this, Activity_mostrarFrase.class);
        startActivity(intent);
    }

    /**
     * Este método regresa el numero aleatorio para todas las clases.
     * @return numeroAleatorio
     */
    public static int getNumeroAleatorio() {
        return numeroAleatorio;
    }
}