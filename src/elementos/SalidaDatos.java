package elementos;

import java.awt.Color;
import javax.swing.ImageIcon;

public class SalidaDatos extends FiguraDiagrama {
    
    public SalidaDatos(ImageIcon icono, int x, int y) {
        super("Sout", "sout", Color.GREEN, Color.BLACK, icono, x, y);
    }
    
    @Override
    public String generarCodigo() {
        return "\n  cout << \"" + texto + "\" << endl;";
    }
}

