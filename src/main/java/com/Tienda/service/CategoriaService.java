package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    // retorna una lista de coategorias (activas o todas)
    public List<Categoria> getCategorias(boolean activos);
    
    // retorna una categoria por Id
    public Categoria getCategoria(Categoria categoria);
    
    //Se inserta un nuevo registro si el id de la categoria esta vacio
    //Se actualiza el registro si el Id de la categoria No esta vacio
    public void save(Categoria categoria);
    
    
    public void delete(Categoria categoria);
    
}
