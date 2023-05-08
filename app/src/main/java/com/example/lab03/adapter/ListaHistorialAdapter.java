package com.example.lab03.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab03.R;
import com.example.lab03.model.Emergencia;

import java.util.List;

public class ListaHistorialAdapter extends RecyclerView.Adapter<ListaHistorialAdapter.EmergenciaViewHolder> {

    private List<Emergencia> emergenciaList;
    private Context context;


    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<Emergencia> getEmergenciaList() {
        return emergenciaList;
    }

    public void setEmergenciaList(List<Emergencia> emergenciaList) {
        this.emergenciaList = emergenciaList;
    }

    @NonNull
    @Override
    public ListaHistorialAdapter.EmergenciaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(context).inflate(R.layout.item_historial,parent,false);
        return new EmergenciaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaHistorialAdapter.EmergenciaViewHolder holder, int position) {
        Emergencia e =emergenciaList.get(position);
        holder.emergencia = e;

        TextView textViewNombreM =holder.itemView.findViewById(R.id.textViewMascota);
        textViewNombreM.setText(e.getNombreMascota());

        TextView textViewGenero =holder.itemView.findViewById(R.id.textViewGenero);
        textViewGenero.setText(e.getGenero());

        TextView textViewDuenho =holder.itemView.findViewById(R.id.textViewDuenho);
        textViewDuenho.setText(e.getNombreDuenho());

        TextView textViewDni =holder.itemView.findViewById(R.id.textViewDni);
        textViewDni.setText(e.getDni());

        TextView textViewDescripcion =holder.itemView.findViewById(R.id.textViewDescripcion);
        textViewDescripcion.setText(e.getDescripcion());

        TextView textViewRuta =holder.itemView.findViewById(R.id.textViewRuta);
        textViewRuta.setText(e.getRuta());
        }



        @Override
        public int getItemCount() {
            return emergenciaList.size();
        }

    public class EmergenciaViewHolder extends RecyclerView.ViewHolder{
        Emergencia emergencia;

        public EmergenciaViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
