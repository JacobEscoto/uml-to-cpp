package elementos;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Proceso extends FiguraDiagrama {
    
    public Proceso(ImageIcon icono, int x, int y) {
        super("Proceso", "proceso", Color.PINK, Color.BLACK, icono, x, y);
    }
    
    @Override
    public String generarCodigo() {
        return "\n  " + texto + ";";
    }

}

