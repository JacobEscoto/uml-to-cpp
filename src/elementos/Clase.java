package elementos;

import java.util.ArrayList;

public class Clase {
    
    private String nombre;
    private String descripcion;
    private ArrayList<Variable> propiedades;
    private ArrayList<Metodos> metodos;
    
    public Clase(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.propiedades = new ArrayList();
        this.metodos = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Variable> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(ArrayList<Variable> propiedades) {
        this.propiedades = propiedades;
    }

    public ArrayList<Metodos> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<Metodos> metodos) {
        this.metodos = metodos;
    }
    
    @Override
    public String toString() {
        return nombre;
    }

}

