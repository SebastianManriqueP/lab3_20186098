package com.example.lab03.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab03.R;
import com.example.lab03.databinding.FragmentEmergenciaBinding;

public class Emergencia extends Fragment {

    private FragmentEmergenciaBinding binding;
    private CountDownTimer countDownTimer;
    private long timeRestanteMili ;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEmergenciaBinding.inflate(inflater,container,false);
        View root = binding.getRoot();
        /**/
        /*Calcular el tiempo y contador*/
        binding.buttonCalcular.setOnClickListener(view -> {
            if(binding.editTextDestino.getText().toString().equals("lince")){
                binding.textTiempo.setText("10:00 minutos");
                this.timeRestanteMili = 600000;
                startTimer();
            }else if(binding.editTextDestino.getText().toString().equals("san isidro")){
                binding.textTiempo.setText("15:00 minutos");
                this.timeRestanteMili  = 900000;
                startTimer();
            }else if(binding.editTextDestino.getText().toString().equals("magdalena")){
                binding.textTiempo.setText("20:00 minutos");
                this.timeRestanteMili  = 1200000;
                startTimer();
            }else if(binding.editTextDestino.getText().toString().equals("jesus maria")){
                binding.textTiempo.setText("25:00 minutos");
                this.timeRestanteMili  = 1500000;
                startTimer();
            }

        });
        return root;
    }

    public void startTimer(){
        countDownTimer = new CountDownTimer(timeRestanteMili ,1000) {
            @Override
            public void onTick(long l) {
                timeRestanteMili = l;
                updateTimer();
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }

    public void updateTimer(){
        int minutes = (int) timeRestanteMili / 60000;
        int seconds = (int) timeRestanteMili % 60000 / 1000;

        String tiempoTexto;

        tiempoTexto = ""+minutes;
        tiempoTexto += ":";
        if(seconds<10) tiempoTexto += "0";
        tiempoTexto += seconds;
        tiempoTexto += " minutos";

        binding.textTiempo.setText(tiempoTexto);
    }
}