package elementos;

import java.io.Serializable;
import java.util.ArrayList;

public class Clase implements Serializable {

    private String nombre;
    private boolean incluyeHerencia;
    private Clase clasePadre;
    private String descripcion;
    private ArrayList<Variable> propiedades;
    private ArrayList<Metodo> metodos;

    public Clase(String nombre) {
        this.nombre = nombre;
        this.incluyeHerencia = false;
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

    public boolean incluyeHerencia() {
        return incluyeHerencia;
    }

    public void setIncluyeHerencia(boolean incluyeHerencia) {
        if (!incluyeHerencia) {
            this.clasePadre = null;
        }
        this.incluyeHerencia = incluyeHerencia;

    }

    public Clase getClasePadre() {
        return clasePadre;
    }

    public void setClasePadre(Clase clasePadre) {
        if (clasePadre != null) {
            this.incluyeHerencia = true;
            this.clasePadre = clasePadre;
        }
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

    public String generarCodigo() {
        String codigo = "#include <iostream>\n#include <string>\n#using namespace std;\n";
        if (clasePadre == null) {
            codigo += "\nclass " + nombre + "\n{\n";
        } else if (incluyeHerencia && clasePadre != null) {
            codigo += "#include \"" + clasePadre.getNombre() + ".cpp\"\n\n";
            codigo += "class " + nombre + " : public " + clasePadre.getNombre() + "\n{";
        }
        boolean contienePublic = false;
        boolean contienePrivate = false;
        boolean contieneProtected = false;
        String publicos = "\npublic:\n";
        String privados = "\nprivate:\n";
        String protecteds = "\nprotected:\n";
        if (!propiedades.isEmpty()) {
            for (Variable propiedad : propiedades) {
                if (propiedad.getAlcance().equalsIgnoreCase("public")) {
                    contienePublic = true;
                    publicos += "   " + propiedad.generarCodigo() + "\n";
                } else if (propiedad.getAlcance().equalsIgnoreCase("private")) {
                    contienePrivate = true;
                    privados += "   " + propiedad.generarCodigo() + "\n";
                } else if (propiedad.getAlcance().equalsIgnoreCase("protected")) {
                    contieneProtected = true;
                    protecteds += "   " + propiedad.generarCodigo() + "\n";
                }
            }

            if (!metodos.isEmpty()) {
                for (Metodo metodo : metodos) {
                    if (metodo.getAlcance().equalsIgnoreCase("public")) {
                        contienePublic = true;
                        publicos += "   " + metodo.generarCodigo() + "\n";
                    } else if (metodo.getAlcance().equalsIgnoreCase("private")) {
                        contienePrivate = true;
                        privados += "   " + metodo.generarCodigo() + "\n";
                    } else if (metodo.getAlcance().equalsIgnoreCase("protected")) {
                        contieneProtected = true;
                        protecteds += "   " + metodo.generarCodigo() + "\n";
                    }
                }
            }
            if (contienePublic) {
                codigo += publicos;
            }
            if (contienePrivate) {
                codigo += privados;
            }
            if (contieneProtected) {
                codigo += protecteds;
            }
            codigo += "};\n";

        }

        return codigo;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
