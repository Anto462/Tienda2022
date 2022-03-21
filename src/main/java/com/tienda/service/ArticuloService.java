
package com.tienda.service;

import com.tienda.domain.Articulo;
import java.util.List;

public interface ArticuloService {
    public List<Articulo> getArticulos(boolean activo);
    
    public void save(Articulo articulo);
    
    public void delete(Articulo articulo);
    
    public Articulo getArticulo(Articulo articulo);
}
