package elementos;

import java.io.Serializable;
import java.util.ArrayList;

public class Clase implements Serializable {

    private String nombre;
    private boolean esHija;
    private Clase clasePadre;
    private String descripcion;
    private ArrayList<Variable> propiedades;
    private ArrayList<Metodo> metodos;

    public Clase(String nombre) {
        this.nombre = nombre;
        this.esHija = false;
        this.clasePadre = null;
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
    
    public boolean esHija() {
        return esHija;
    }
    
    public Clase getClasePadre() {
        return clasePadre;
    }
    
    public void setClasePadre(Clase clasePadre) {
        this.esHija = true;
        this.clasePadre = clasePadre;
    }
    
    public void setHija(boolean esHija) {
        this.esHija = esHija;
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

    public ArrayList<Metodo> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<Metodo> metodos) {
        this.metodos = metodos;
    }

    public String generarHeaderFile() {
        String h = "#ifndef " + nombre.toUpperCase() + "_H\n#define " + nombre.toUpperCase() + "_H\n";
        
        h += "\n#include <iostream>\n#include <string>";
        if (esHija()) {
            h += "\n\n#include \"" + clasePadre.getNombre() + ".h\"\n";
            h+= "\nclass " + nombre + " : public " + clasePadre.getNombre() + "\n{\n";
        } else {
            h+= "\n\nclass " + nombre + "\n{\n";
        }
        
        
        
        return h;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
