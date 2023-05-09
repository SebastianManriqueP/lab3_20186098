package com.example.lab03.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab03.ExampleViewModel;
import com.example.lab03.R;
import com.example.lab03.adapter.ListaHistorialAdapter;
import com.example.lab03.databinding.FragmentEmergenciaBinding;
import com.example.lab03.databinding.FragmentHistorialBinding;
import com.example.lab03.model.Emergencia;

import androidx.lifecycle.ViewModelProvider;
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

        ExampleViewModel exampleViewModel = new ViewModelProvider(requireActivity())
                .get(ExampleViewModel.class);

        ArrayList<Emergencia> listaEmergencias = new ArrayList<>();

        exampleViewModel.getListaPersonas().observe(getViewLifecycleOwner(), personas -> {
            for(Emergencia p: personas){
                listaEmergencias.add(p);
            }
        });


        ListaHistorialAdapter listaHistorialAdapter =new ListaHistorialAdapter();
        listaHistorialAdapter.setContext(getActivity());
        listaHistorialAdapter.setEmergenciaList(listaEmergencias);

        binding.recyclerView.setAdapter(listaHistorialAdapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        return root;
    }
}