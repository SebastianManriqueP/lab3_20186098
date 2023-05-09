package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.lab03.databinding.ActivityMainBinding;
import com.example.lab03.fragment.Entrada;
import com.example.lab03.fragment.Historial;
import com.example.lab03.model.Emergencia;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState == null) {
            ExampleViewModel exampleViewModel = new ViewModelProvider(this).get(ExampleViewModel.class);

            /*Crear emergencias*/
            com.example.lab03.model.Emergencia emergencia1 = new com.example.lab03.model.Emergencia("Peluche","Masculino","Alonso","25865489","Intoxicaion","Lince - Lince");
            com.example.lab03.model.Emergencia emergencia2 = new com.example.lab03.model.Emergencia("Maria Antonieta","Femenino","Maria", "08104081","Parto","Jesus Maria - Lince");
            com.example.lab03.model.Emergencia emergencia3 = new com.example.lab03.model.Emergencia("Candy","Femenino","Aracelli", "46285087","Dolor Cadera","San Isidro - Lince");
            com.example.lab03.model.Emergencia emergencia4 = new com.example.lab03.model.Emergencia("Julieta","Femenino","Natalia", "29120389","No se levanta","Madgalena- Lince");
            com.example.lab03.model.Emergencia emergencia5 = new com.example.lab03.model.Emergencia("Rocket","Masculino","Julian", "56894578","Dificultad para respirar","Madgalena- Lince");

            /*juntarlas en lista*/
            ArrayList<Emergencia> lista = new ArrayList<>();
            lista.add(emergencia1);
            lista.add(emergencia2);
            lista.add(emergencia3);
            lista.add(emergencia4);
            lista.add(emergencia5);

            exampleViewModel.getListaPersonas().setValue(lista);
        }

    }
}