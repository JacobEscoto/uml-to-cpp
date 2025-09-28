package elementos;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Fin extends FiguraDiagrama {
    
    public Fin(ImageIcon icono, int x, int y) {
        super("Fin", "Fin", Color.CYAN, Color.BLACK, icono, x, y);  
    }
    
    @Override
    public String generarCodigo() {
        return """
                   
                return 0;
               }
               // ============= FIN DEL CODIGO =============""";
    }

}

