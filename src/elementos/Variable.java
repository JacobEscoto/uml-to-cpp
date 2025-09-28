package elementos;

import java.io.Serializable;

public class Variable implements Serializable{

    private String tipo;
    private String nombre;
    private String alcance;

    public Variable(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public Variable(String tipo, String nombre, String alcance) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.alcance = alcance;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public String generarCodigo() {
        return tipo + " " + nombre + ";";
    }

    @Override
    public String toString() {
        return "(" + tipo + ") " + nombre;
    }

}
