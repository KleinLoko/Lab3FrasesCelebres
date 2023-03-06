package com.example.lab3frasescelebres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_mostrarFrase extends AppCompatActivity {


    //obtenemos el número aleatorio generado ne la clase padre
    int numeroAleatorio = MainActivity.getNumeroAleatorio();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_frase);

        //Declaromos y incializamos nuestros Views
        TextView autorCelebre = (TextView) findViewById(R.id.labelNombreAutor);
        TextView fraseCelebre = (TextView) findViewById(R.id.labelFraseCelebre);
        ImageView autorCelebreImagen = (ImageView) findViewById(R.id.imagenAutor);

        //asignamos la imagen,el autor y la frase celebre según el número aleatorio de nuestra clase padre
        switch(numeroAleatorio){
            case 2:
                autorCelebre.setText(R.string.autor2);
                fraseCelebre.setText(R.string.frase2);
                autorCelebreImagen.setImageResource(R.drawable.socratesimagen);
            break;
            case 3:
                autorCelebre.setText(R.string.autor3);
                fraseCelebre.setText(R.string.frase3);
                autorCelebreImagen.setImageResource(R.drawable.epirucio);
            break;
            default:
                autorCelebre.setText(R.string.autor1);
                fraseCelebre.setText(R.string.frase1);
                autorCelebreImagen.setImageResource(R.drawable.platonimagen);

        }

    }
}