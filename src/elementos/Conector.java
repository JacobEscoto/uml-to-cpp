package elementos;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Conector extends FiguraDiagrama {

    public Conector(ImageIcon icono) {
        super("Conector", "", Color.black, Color.black, icono, 50, 50);
    }

    @Override
    public String generarCodigo() {
        return "";
    }

}
