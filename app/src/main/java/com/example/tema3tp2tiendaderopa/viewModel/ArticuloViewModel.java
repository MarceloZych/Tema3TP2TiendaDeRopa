package com.example.tema3tp2tiendaderopa.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tema3tp2tiendaderopa.model.Articulo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArticuloViewModel extends ViewModel {
    private MutableLiveData<List<Articulo>> articulos;

    public ArticuloViewModel() {
        articulos = new MutableLiveData<>();
        cargarArticulos();
    }

    private void cargarArticulos() {
        List<Articulo> articuloList = new ArrayList<>();
            articuloList.add(new Articulo("Pantalón jeans dama", "Talles S-SM-M-L-Xl", Arrays.asList("blanco", "azul", "negro", "celeste"), 25.000, "XXX", 10));
            articuloList.add(new Articulo("Pantalón jeans de Hombre","Talles S-SM-M-L-Xl", Arrays.asList("azul", "negro", "celeste", "gris"), 25.000, "XXX", 10));
            articuloList.add(new Articulo("Blusa fibrana dama","Talles S-SM-M-L-Xl", Arrays.asList("verde", "azul", "negro", "estampado"), 25.000, "XXX", 10));
            articuloList.add(new Articulo("Camisa de Hombre","Talles S-SM-M-L-Xl", Arrays.asList("azul", "rosa", "crema", "amarillo"), 25.000, "XXX", 10));
            articuloList.add(new Articulo("Remera algodón dama","Talles S-SM-M-L-Xl", Arrays.asList("verde", "azul", "negro", "estampado"), 25.000, "XXX", 10));
            articuloList.add(new Articulo("Remera algodón de hombre","Talles S-SM-M-L-Xl", Arrays.asList("negro", "rojo"), 25.000, "XXX", 10));
            articulos.setValue(articuloList);
    }
    public LiveData<List<Articulo>> getArticulos() {
        return articulos;
    }
}
