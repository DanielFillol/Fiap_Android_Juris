package br.fiap.acid.juris;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class JurisAdapter extends RecyclerView.Adapter<JurisAdapter.ViewHolder> {

    JurisData[] myJurisData;
    Context context;

    public JurisAdapter(JurisData[] myJurisData, MainActivity activity) {
        this.myJurisData = myJurisData;
        this.context = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.juris_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final JurisData myJurisData = this.myJurisData[position];

        holder.ementa.setText("Ementa: " + myJurisData.getDecision_short());
        holder.dataJulgamento.setText("Data do Julgamento: " + myJurisData.getTrial_date());
        holder.classe.setText("Classe: " + myJurisData.getLawsuit_class());
        holder.juiz.setText("Magistrado: " + myJurisData.getLawsuit_judge());
        holder.cidade.setText("Cidade: " + myJurisData.getLawsuit_city());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myJurisData.getId(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myJurisData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView ementa, dataJulgamento, classe, juiz, cidade;

        public ViewHolder(View itemView) {
            super(itemView);
            ementa = itemView.findViewById(R.id.ementa);
            dataJulgamento = itemView.findViewById(R.id.dataJulgamento);
            classe = itemView.findViewById(R.id.classe);
            juiz = itemView.findViewById(R.id.juiz);
            cidade = itemView.findViewById(R.id.cidade);

        }
    }
}
