package elementos;

public class Metodos {

    private String nombre;
    private String tipoRetorno;
    private String alcance;

    public Metodos(String nombre, String tipoRetorno, String alcance) {
        this.nombre = nombre;
        this.tipoRetorno = tipoRetorno;
        this.alcance = alcance;
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

}
