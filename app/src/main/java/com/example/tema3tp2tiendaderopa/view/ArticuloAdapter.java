package com.example.tema3tp2tiendaderopa.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tema3tp2tiendaderopa.databinding.ItemArticuloBinding;
import com.example.tema3tp2tiendaderopa.model.Articulo;
import com.example.tema3tp2tiendaderopa.listener.ArticuloClickListener;

import java.util.List;

public class ArticuloAdapter extends RecyclerView.Adapter<ArticuloAdapter.ViewHolder> {
    private ArticuloClickListener listener;
    private List<Articulo> articulos;
    private Context context;

    public ArticuloAdapter (ArticuloClickListener listener, List<Articulo> articulos, Context context) {
        this.listener = listener;
        this.articulos = articulos;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
       private final ItemArticuloBinding binding;

        public ViewHolder(@NonNull ItemArticuloBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Articulo articulo) {
            binding.nombre.setText(articulo.getNombre());
            binding.talle.setText(articulo.getTalle());
            binding.marca.setText(articulo.getMarca());
            binding.precio.setText(String.valueOf(articulo.getPrecio()));
            binding.cantidad.setText(String.valueOf(articulo.getCantidad()));
            //convertir lista en cadena
            String coloresToString = String.join(", ", articulo.getColores());
            binding.colores.setText(coloresToString);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemArticuloBinding binding = ItemArticuloBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Articulo articulo = articulos.get(position);
        holder.bind(articulo);
    }

    @Override
    public int getItemCount() {
        return articulos.size();
    }


}
