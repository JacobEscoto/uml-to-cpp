package elementos;

public class Variable {

    private String tipo;
    private String nombre;

    public Variable(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
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

    public String generarCodigo() {
        return tipo + " " + nombre + ";";
    }

    @Override
    public String toString() {
        return "(" + tipo + ") " + nombre;
    }

}
