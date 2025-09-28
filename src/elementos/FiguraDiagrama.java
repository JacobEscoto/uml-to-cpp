package elementos;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class FiguraDiagrama implements Serializable {

    protected String nombre;
    protected String texto;
    protected JLabel label;
    protected Color backgroundColor;
    protected Color foregroundColor;
    protected ImageIcon icono;
    protected Font fuente;
    protected int x;
    protected int y;

    public FiguraDiagrama(String nombre, String texto, Color backgroundColor, Color foregroundColor, ImageIcon icono, int x, int y) {
        this.nombre = nombre;
        this.texto = texto;
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
        this.icono = icono;
        this.fuente = new Font("Arial", Font.PLAIN, 12);
        this.x = x;
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public ImageIcon getIcono() {
        return icono;
    }

    public void setIcono(ImageIcon icono) {
        this.icono = icono;
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    

    public void initLabel() {
        this.label = new JLabel(this.texto, this.icono, JLabel.CENTER);
        label.setName(nombre);
        label.setBounds(x, y, icono.getIconWidth(), icono.getIconHeight());
        label.setBackground(backgroundColor);
        label.setOpaque(true);
        label.setBorder(null);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(foregroundColor);
        label.setFont(this.fuente);

        label.addPropertyChangeListener(evt -> {
            if (evt.getPropertyName().equalsIgnoreCase("name")) {
                nombre = label.getName();
            } else if (evt.getPropertyName().equalsIgnoreCase("text")) {
                texto = label.getText();
            } else if (evt.getPropertyName().equalsIgnoreCase("background")) {
                backgroundColor = label.getBackground();
            } else if (evt.getPropertyName().equalsIgnoreCase("foreground")) {
                foregroundColor = label.getForeground();
            } else if (evt.getPropertyName().equalsIgnoreCase("icon")) {
                icono = (ImageIcon) label.getIcon();
            } else if(evt.getPropertyName().equalsIgnoreCase("font")) {
                fuente = label.getFont();
            }
        });
    }

    public abstract String generarCodigo();

}
