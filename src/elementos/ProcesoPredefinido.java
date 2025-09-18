package elementos;

import java.awt.Color;
import javax.swing.ImageIcon;

public class ProcesoPredefinido extends FiguraDiagrama {
    
    public ProcesoPredefinido(ImageIcon icono, int x, int y) {
        super("Predefinido", "proceso_predefinido", Color.yellow, Color.BLACK, icono, x, y);
    }
    
    @Override
    public String generarCodigo() {
        return texto + ";";
    }

}

