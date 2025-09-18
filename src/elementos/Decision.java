package elementos;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Decision extends FiguraDiagrama {
    
    public Decision(ImageIcon icono, int x, int y) {
        super ("Decision", "Decision", Color.ORANGE, Color.BLACK, icono, x, y);
    }
    
    @Override
    public String generarCodigo() {
        return "if (" + texto + ") {\n" +
                "\n}"; 
    }

}

