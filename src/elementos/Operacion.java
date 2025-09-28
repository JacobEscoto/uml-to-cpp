package elementos;

public class Operacion {

    private String operador;
    private Variable variable1;
    private Variable variable2;
    private Variable resultado;

    public Operacion(String operador, Variable variable1, Variable variable2, Variable resultado) {
        this.operador = operador;
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.resultado = resultado;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Variable getVariable1() {
        return variable1;
    }

    public void setVariable1(Variable variable1) {
        this.variable1 = variable1;
    }

    public Variable getVariable2() {
        return variable2;
    }

    public void setVariable2(Variable variable2) {
        this.variable2 = variable2;
    }

    public Variable getResultado() {
        return resultado;
    }

    public void setResultado(Variable resultado) {
        this.resultado = resultado;
    }
    
    public String generarCodigo() {
        return "\n  " + resultado.getNombre() + " = " + variable1.getNombre() + " " + operador + " " + variable2.getNombre() + ";";
    }

    @Override
    public String toString() {
        return resultado.getNombre() + " = " + variable1.getNombre() + " " + operador + " " + variable2.getNombre();
    }

}
