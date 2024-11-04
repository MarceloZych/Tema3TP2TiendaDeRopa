package com.example.tema3tp2tiendaderopa.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.tema3tp2tiendaderopa.databinding.ActivityMainBinding;
import com.example.tema3tp2tiendaderopa.listener.ArticuloClickListener;
import com.example.tema3tp2tiendaderopa.model.Articulo;
import com.example.tema3tp2tiendaderopa.viewModel.ArticuloViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ArticuloViewModel articuloViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        articuloViewModel = new ViewModelProvider(this).get(ArticuloViewModel.class);
        binding.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        articuloViewModel.getArticulos().observe(this, new Observer<List<Articulo>>() {
            @Override
            public void onChanged(List<Articulo> articulos) {
                if (articulos != null && !articulos.isEmpty()) {
                    Log.d("ArticleList", "Articulos: " + articulos.size());
                    ArticuloAdapter adapter = new ArticuloAdapter(new ArticuloClickListener() {
                        @Override
                        public void onItemClick(Articulo articulo) {
                            Toast.makeText(MainActivity.this, "Elegiste: " + articulo.getNombre(), Toast.LENGTH_SHORT).show();
                        }
                    }, articulos, MainActivity.this); // Asegúrate de pasar los parámetros correctamente
                    binding.recyclerView.setAdapter(adapter); // Establecer el adaptador
                } else {
                    Log.d("MainActivity", "No hay articulos");
                }
            }
        });
    }
}