package com.example.lab03.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab03.R;
import com.example.lab03.adapter.ListaHistorialAdapter;
import com.example.lab03.databinding.FragmentEmergenciaBinding;
import com.example.lab03.databinding.FragmentHistorialBinding;
import com.example.lab03.model.Emergencia;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

public class Historial extends Fragment {

    @NonNull FragmentHistorialBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHistorialBinding.inflate(inflater,container,false);
        View root = binding.getRoot();
        /*Crear emergencias*/
        Emergencia emergencia1 = new Emergencia("Peluche","Masculino","Alonso","25865489","Intoxicaion","Lince - Lince");
        Emergencia emergencia2 = new Emergencia("Maria Antonieta","Femenino","Maria", "08104081","Parto","Jesus Maria - Lince");
        Emergencia emergencia3 = new Emergencia("Candy","Femenino","Aracelli", "46285087","Dolor Cadera","San Isidro - Lince");
        Emergencia emergencia4 = new Emergencia("Julieta","Femenino","Natalia", "29120389","No se levanta","Madgalena- Lince");
        Emergencia emergencia5 = new Emergencia("Rocket","Masculino","Julian", "56894578","Dificultad para respirar","Madgalena- Lince");

        /*juntarlas en lista*/
        ArrayList<Emergencia> listaEmergencias = new ArrayList<>();
        listaEmergencias.add(emergencia1);
        listaEmergencias.add(emergencia2);
        listaEmergencias.add(emergencia3);
        listaEmergencias.add(emergencia4);
        listaEmergencias.add(emergencia5);

        ListaHistorialAdapter listaHistorialAdapter =new ListaHistorialAdapter();
        listaHistorialAdapter.setContext(getActivity());
        listaHistorialAdapter.setEmergenciaList(listaEmergencias);

        binding.recyclerView.setAdapter(listaHistorialAdapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        return root;
    }
}