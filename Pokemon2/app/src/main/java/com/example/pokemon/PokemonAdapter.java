package com.example.pokemon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
// make an adapter step5
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PokemonAdapter extends RecyclerView.Adapter {
    //نعرف array من النوع الي نبي نظهره
    ArrayList<pokemon>pArray;
    // constructor
    public PokemonAdapter(ArrayList<pokemon> pArray) {
        this.pArray = pArray;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_list_item,parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).img.setImageResource(pArray.get(position).getImage());
        ((ViewHolder)holder).pokemonName.setText(pArray.get(position).getName());
        ((ViewHolder)holder).pokemonTotal.setText(pArray.get(position).getTotal()+"");

    }

    @Override
    public int getItemCount() {
        return pArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // select the items that we wonna show it
        public ImageView img;
        public TextView pokemonName;
        public TextView pokemonTotal;
        public View view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            pokemonName=itemView.findViewById(R.id.textView);
            pokemonTotal=itemView.findViewById(R.id.textView3);
            img=itemView.findViewById(R.id.imageView2);
        }
    }
}
