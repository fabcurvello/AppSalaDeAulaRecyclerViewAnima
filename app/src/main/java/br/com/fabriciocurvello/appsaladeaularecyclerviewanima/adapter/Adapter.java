package br.com.fabriciocurvello.appsaladeaularecyclerviewanima.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import br.com.fabriciocurvello.appsaladeaularecyclerviewanima.R;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Método para criar a vizualização dos itens da lista
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);
        return new MyViewHolder( itemLista );
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // Método para exibir os itens da lista
        holder.disciplina.setText("Sistemas Distribuídos e Mobile");
        holder.professor.setText("Fabrício Curvello");
        holder.diaSemana.setText("QUI");
        holder.sala.setText("REMOTO");
    }

    @Override
    public int getItemCount() {
        //Quantidade de itens a ser exibida
        return 50;
    }

    // Classe interna
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView disciplina;
        TextView professor;
        TextView diaSemana;
        TextView sala;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            disciplina = itemView.findViewById(R.id.tv_disciplina);
            professor = itemView.findViewById(R.id.tv_professor);
            diaSemana = itemView.findViewById(R.id.tv_dia_semana);
            sala = itemView.findViewById(R.id.tv_sala);
        }
    }

}
