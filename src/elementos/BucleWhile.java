package elementos;

import java.awt.Color;
import javax.swing.ImageIcon;

public class BucleWhile extends FiguraDiagrama {

    public BucleWhile(ImageIcon icono, String texto, int x, int y) {
        super("Bucle While", texto, Color.magenta, Color.BLACK, icono, x, y);
    }

    @Override
    public String generarCodigo() {
        return "\n  while (" + texto + ") {\n\n  }";
    }

}