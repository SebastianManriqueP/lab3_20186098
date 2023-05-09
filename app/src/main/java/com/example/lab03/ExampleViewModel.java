package com.example.lab03;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.lab03.model.Emergencia;

import java.util.ArrayList;

public class ExampleViewModel extends ViewModel {
    private MutableLiveData<ArrayList<Emergencia>> listaPersonas = new MutableLiveData<>();

    public MutableLiveData<ArrayList<Emergencia>> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(MutableLiveData<ArrayList<Emergencia>> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
}
