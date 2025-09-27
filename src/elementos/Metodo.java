package elementos;

import java.io.Serializable;
import java.util.ArrayList;

public class Metodo implements Serializable {

    private String nombre;
    private String tipoRetorno;
    private String alcance;
    private ArrayList<Variable> parametros;

    public Metodo(String nombre, String tipoRetorno, String alcance) {
        this.nombre = nombre;
        this.tipoRetorno = tipoRetorno;
        this.alcance = alcance;
        this.parametros = new ArrayList();
    }

    public Metodo(String nombre, String tipoRetorno, String alcance, ArrayList<Variable> parametros) {
        this.nombre = nombre;
        this.tipoRetorno = tipoRetorno;
        this.alcance = alcance;
        this.parametros = parametros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoRetorno() {
        return tipoRetorno;
    }

    public void setTipoRetorno(String tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public ArrayList<Variable> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<Variable> parametros) {
        this.parametros = parametros;
    }

    public String generarCodigo() {
        String listParametros = "";
        for (Variable parametro : parametros) {
            listParametros+= parametro.getTipo() + " " + parametro.getNombre() + ", ";
        }
        if (listParametros.endsWith(", ")) {
            listParametros = listParametros.substring(0, listParametros.lastIndexOf(","));
        }
        return tipoRetorno + " " + nombre + "(" + listParametros + ") {};";
    }

    @Override
    public String toString() {
        return "(" + tipoRetorno + ") " + nombre;
    }

}
