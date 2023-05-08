package com.example.lab03.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab03.R;
import com.example.lab03.databinding.FragmentEntradaBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Entrada#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Entrada extends Fragment {

    FragmentEntradaBinding binding;


    public Entrada() {
        // Required empty public constructor
    }



    public static Entrada newInstance(String param1, String param2) {
        Entrada fragment = new Entrada();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEntradaBinding.inflate(inflater,container,false);

        NavController navController = NavHostFragment.findNavController(Entrada.this);
        binding.btnRegistro.setOnClickListener(view ->{
            navController.navigate(R.id.action_entrada_to_registro);
        } );
        binding.btnEmergencia.setOnClickListener(view -> {
            navController.navigate(R.id.action_entrada_to_emergencia);
        });
        binding.btnHistorial.setOnClickListener(view -> {
            navController.navigate(R.id.action_entrada_to_historial);
        });

        return binding.getRoot();
    }
}