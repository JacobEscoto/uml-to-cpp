package elementos;

import java.awt.Color;
import javax.swing.ImageIcon;

public class BucleFor extends FiguraDiagrama {

    public BucleFor(ImageIcon icono, String texto, int x, int y) {
        super("Bucle For", "n", Color.yellow, Color.BLACK, icono, x, y);
    }

    @Override
    public String generarCodigo() {
        return "\n  for (int i = 0; i < n; i++) {\n\n   }";
    }

}
