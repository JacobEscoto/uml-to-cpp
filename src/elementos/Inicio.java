package elementos;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Inicio extends FiguraDiagrama {
    
    
    public Inicio(ImageIcon icono, int x, int y) {
        super("Inicio", "Inicio", Color.CYAN, Color.BLACK, icono, x, y);  
    }
    
    @Override
    public String generarCodigo() {
        return """
               // ============= INICIO DEL CODIGO =============
               #include <iostream>
               using namespace std;
               
               int main() {""";
    }

}

