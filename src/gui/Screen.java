package gui;

import elementos.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class Screen extends JFrame {

    private Point click;
    private JLabel labelSeleccionado = null;
    private FiguraDiagrama elementoSeleccionado = null;
    private FiguraDiagrama copiaElemento = null;
    private ArrayList<FiguraDiagrama> elementos = new ArrayList();
    private ArrayList<Clase> clases = new ArrayList();
    private final int BACKGROUND_OPTION = 1;
    private final int FOREGROUND_OPTION = 2;
    private int window = 1;
    private JTree arbolSeleccionado = null;

    private ArrayList<Variable> parametros = new ArrayList();

    public Screen() {
        initComponents();
        this.setTitle("Nuevo Diagrama - " + this.getTitle());
        classesGenerator_jp.setVisible(false);
        diagram_toggleBtn.setSelected(true);

        DefaultComboBoxModel modeloFuentes = new DefaultComboBoxModel();
        fontChooser_jcb.setModel(modeloFuentes);
        fontProperty_jcb.setModel(modeloFuentes);
        initFonts(fontChooser_jcb);
        initFonts(fontProperty_jcb);

        DefaultListModel modelVariables = new DefaultListModel();
        variables_list.setModel(modelVariables);

        DefaultListModel modelProcesos = new DefaultListModel();
        process_list.setModel(modelProcesos);

        DefaultListModel modelClasePadre = new DefaultListModel();
        DefaultListModel modelClaseHija = new DefaultListModel();
        parentClass_list.setModel(modelClasePadre);
        childClass_list.setModel(modelClaseHija);

        SpinnerNumberModel modeloFontSize = new SpinnerNumberModel(12, 8, 48, 1);
        fontSize_spinner.setModel(modeloFontSize);
        fontSizeProperty_spinner.setModel(modeloFontSize);

        DefaultMutableTreeNode nodo = new DefaultMutableTreeNode("Clases");
        DefaultTreeModel modelo = new DefaultTreeModel(nodo);
        jt_classes.setModel(modelo);
        modelo.reload();

        deleteHerencia_btn.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        properties_dialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        namePropertyLabel = new javax.swing.JLabel();
        tf_nameProperty = new javax.swing.JTextField();
        textPropertyLabel = new javax.swing.JLabel();
        tf_textProperty = new javax.swing.JTextField();
        backgroundLabel = new javax.swing.JLabel();
        foregroundLabel = new javax.swing.JLabel();
        bgProperty = new javax.swing.JLabel();
        foregroundProperty = new javax.swing.JLabel();
        fontPropertyLabel = new javax.swing.JLabel();
        fontProperty_jcb = new javax.swing.JComboBox<>();
        fontSizePropertyLabel = new javax.swing.JLabel();
        fontSizeProperty_spinner = new javax.swing.JSpinner();
        widthProperty = new javax.swing.JLabel();
        heigthPropertyLabel = new javax.swing.JLabel();
        widthLabel_spinner = new javax.swing.JSpinner();
        heigthLabel_spinner = new javax.swing.JSpinner();
        cancelPropertyDialog_btn = new javax.swing.JButton();
        okProperties_btn = new javax.swing.JButton();
        variables_dialog = new javax.swing.JDialog();
        createVariable_jp = new javax.swing.JPanel();
        variableLabel = new javax.swing.JLabel();
        tf_variableName = new javax.swing.JTextField();
        typeVariableLabel = new javax.swing.JLabel();
        typeVariable_jcb = new javax.swing.JComboBox<>();
        createVariable_btn = new javax.swing.JButton();
        cancelCreationVariable_btn = new javax.swing.JButton();
        alcance_lbl = new javax.swing.JLabel();
        alcance_jcb = new javax.swing.JComboBox<>();
        operation_dialog = new javax.swing.JDialog();
        operacion_jp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        operador_jcb = new javax.swing.JComboBox<>();
        var1_jcb = new javax.swing.JComboBox<>();
        var2_jcb = new javax.swing.JComboBox<>();
        resultado_jcb = new javax.swing.JComboBox<>();
        guardarOperancion_btn = new javax.swing.JButton();
        cancelarOperacion_btn = new javax.swing.JButton();
        methods_dialog = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombreMetodo = new javax.swing.JTextField();
        retornoMetodo_jcb = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        alcanceMetodo_jcb = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        addParametro_btn = new javax.swing.JButton();
        cancelMethod_btn = new javax.swing.JButton();
        agregarMetodo_btn = new javax.swing.JButton();
        herencia_dialog = new javax.swing.JDialog();
        herencia_jp = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        parentClass_list = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        childClass_list = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cancelInheritance_btn = new javax.swing.JButton();
        applyInheritance_btn = new javax.swing.JButton();
        elements_jpm = new javax.swing.JPopupMenu();
        changeElementBackground_jmi = new javax.swing.JMenuItem();
        changeElementForeground_jmi = new javax.swing.JMenuItem();
        changeElementText_jmi = new javax.swing.JMenuItem();
        changeElementFont_jmi = new javax.swing.JMenuItem();
        js_elementEdition = new javax.swing.JPopupMenu.Separator();
        copyElement_jmi = new javax.swing.JMenuItem();
        pasteElement_jmi = new javax.swing.JMenuItem();
        deleteElement_jmi = new javax.swing.JMenuItem();
        js_elementProperties = new javax.swing.JPopupMenu.Separator();
        elementProperties_jmi = new javax.swing.JMenuItem();
        clases_jpm = new javax.swing.JPopupMenu();
        addPropiedad_jmi = new javax.swing.JMenuItem();
        eliminarPropiedad_jmi = new javax.swing.JMenuItem();
        addMetodo_jmi = new javax.swing.JMenuItem();
        eliminarMetodo_jmi = new javax.swing.JMenuItem();
        descripcionMetodo_jmi = new javax.swing.JMenuItem();
        descripcion_jmi = new javax.swing.JMenuItem();
        eliminarArbol_jmi = new javax.swing.JMenuItem();
        parameters_dialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        parameterType_jcb = new javax.swing.JComboBox<>();
        typeParametroLbl = new javax.swing.JLabel();
        nameParametroLbl = new javax.swing.JLabel();
        tf_parameterName = new javax.swing.JTextField();
        confirmParametro_btn = new javax.swing.JButton();
        editorDiagrama_jp = new javax.swing.JPanel();
        tools_jp = new javax.swing.JPanel();
        fontLabel = new javax.swing.JLabel();
        fontChooser_jcb = new javax.swing.JComboBox<>();
        sizeFontLabel = new javax.swing.JLabel();
        fontSize_spinner = new javax.swing.JSpinner();
        space1_toolLabel = new javax.swing.JLabel();
        separator_tool = new javax.swing.JSeparator();
        bold_toggleBtn = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        italic_toggleBtn = new javax.swing.JToggleButton();
        space2_toolLbl = new javax.swing.JLabel();
        separator2_tool = new javax.swing.JSeparator();
        foregroundColor_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        backgroundChooser_btn = new javax.swing.JButton();
        menuElements_jp = new javax.swing.JPanel();
        optionsTitle = new javax.swing.JLabel();
        terminalFig_btn = new javax.swing.JButton();
        processFig_btn = new javax.swing.JButton();
        predefinedProcessFig_btn = new javax.swing.JButton();
        decisionFig_btn = new javax.swing.JButton();
        soutFig_btn = new javax.swing.JButton();
        extras_tabs = new javax.swing.JTabbedPane();
        variables_jp = new javax.swing.JPanel();
        variables_scroll = new javax.swing.JScrollPane();
        variables_list = new javax.swing.JList<>();
        agregarVariable_btn = new javax.swing.JButton();
        procesos_jp = new javax.swing.JPanel();
        processes_scroll = new javax.swing.JScrollPane();
        process_list = new javax.swing.JList<>();
        agregarProceso_btn = new javax.swing.JButton();
        controlButtons_jp = new javax.swing.JPanel();
        generarCodigo_btn = new javax.swing.JButton();
        code_toggleBtn = new javax.swing.JToggleButton();
        diagram_toggleBtn = new javax.swing.JToggleButton();
        paste_btn = new javax.swing.JButton();
        main_jp = new javax.swing.JPanel();
        workarea_jp = new javax.swing.JPanel();
        codeDiagrama_jp = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_codeDiagrama = new javax.swing.JTextArea();
        classesGenerator_jp = new javax.swing.JPanel();
        menuClasses_jp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        scrollClasses = new javax.swing.JScrollPane();
        jt_classes = new javax.swing.JTree();
        createClase_btn = new javax.swing.JButton();
        deleteHerencia_btn = new javax.swing.JButton();
        herencia_btn = new javax.swing.JButton();
        addToWorkArea_btn = new javax.swing.JButton();
        rightSide_jp = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        controlClasses_jp = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        diagramClase_toggleBtn = new javax.swing.JToggleButton();
        codeClase_toggleBtn = new javax.swing.JToggleButton();
        mainarea_jp = new javax.swing.JPanel();
        workareaClasses_jp = new javax.swing.JPanel();
        codeClasses_jp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_codeClass = new javax.swing.JTextArea();
        frameMenu_jmb = new javax.swing.JMenuBar();
        fileOptions_jm = new javax.swing.JMenu();
        newFile_jmi = new javax.swing.JMenuItem();
        openFile_jmi = new javax.swing.JMenuItem();
        saveFile_jmi = new javax.swing.JMenuItem();
        exportOptions_jm = new javax.swing.JMenu();
        exportPdf_jmi = new javax.swing.JMenuItem();
        tools_jm = new javax.swing.JMenu();
        editorDiagrama_jmi = new javax.swing.JMenuItem();
        generadorClases_jmi = new javax.swing.JMenuItem();

        properties_dialog.setMinimumSize(new java.awt.Dimension(372, 375));
        properties_dialog.setModal(true);
        properties_dialog.setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(372, 362));
        jPanel1.setMinimumSize(new java.awt.Dimension(372, 362));

        namePropertyLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namePropertyLabel.setForeground(new java.awt.Color(0, 0, 0));
        namePropertyLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namePropertyLabel.setText("Nombre:");

        textPropertyLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textPropertyLabel.setForeground(new java.awt.Color(0, 0, 0));
        textPropertyLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textPropertyLabel.setText("Texto:");

        backgroundLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backgroundLabel.setForeground(new java.awt.Color(0, 0, 0));
        backgroundLabel.setText("Background:");

        foregroundLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        foregroundLabel.setForeground(new java.awt.Color(0, 0, 0));
        foregroundLabel.setText("Foreground:");

        bgProperty.setText("    ");

        foregroundProperty.setText("    ");

        fontPropertyLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fontPropertyLabel.setForeground(new java.awt.Color(0, 0, 0));
        fontPropertyLabel.setText("Fuente:");

        fontSizePropertyLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fontSizePropertyLabel.setForeground(new java.awt.Color(0, 0, 0));
        fontSizePropertyLabel.setText("Tamaño:");

        widthProperty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        widthProperty.setForeground(new java.awt.Color(0, 0, 0));
        widthProperty.setText("Ancho (px):");

        heigthPropertyLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        heigthPropertyLabel.setForeground(new java.awt.Color(0, 0, 0));
        heigthPropertyLabel.setText("Alto (px):");

        cancelPropertyDialog_btn.setBackground(new java.awt.Color(153, 153, 153));
        cancelPropertyDialog_btn.setForeground(new java.awt.Color(0, 0, 0));
        cancelPropertyDialog_btn.setText("Cancelar");
        cancelPropertyDialog_btn.setBorderPainted(false);
        cancelPropertyDialog_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelPropertyDialog_btnMouseClicked(evt);
            }
        });

        okProperties_btn.setBackground(new java.awt.Color(102, 102, 102));
        okProperties_btn.setForeground(new java.awt.Color(0, 0, 0));
        okProperties_btn.setText("OK");
        okProperties_btn.setBorderPainted(false);
        okProperties_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okProperties_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(heigthPropertyLabel)
                    .addComponent(widthProperty)
                    .addComponent(fontSizePropertyLabel)
                    .addComponent(fontPropertyLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(namePropertyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textPropertyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelPropertyDialog_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okProperties_btn))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(backgroundLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bgProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(foregroundLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(foregroundProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tf_textProperty)
                        .addComponent(tf_nameProperty)
                        .addComponent(fontProperty_jcb, 0, 232, Short.MAX_VALUE)
                        .addComponent(fontSizeProperty_spinner)
                        .addComponent(widthLabel_spinner)
                        .addComponent(heigthLabel_spinner)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namePropertyLabel)
                    .addComponent(tf_nameProperty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPropertyLabel)
                    .addComponent(tf_textProperty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backgroundLabel)
                    .addComponent(foregroundLabel)
                    .addComponent(bgProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foregroundProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontPropertyLabel)
                    .addComponent(fontProperty_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontSizePropertyLabel)
                    .addComponent(fontSizeProperty_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(widthProperty)
                    .addComponent(widthLabel_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heigthPropertyLabel)
                    .addComponent(heigthLabel_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelPropertyDialog_btn)
                    .addComponent(okProperties_btn))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout properties_dialogLayout = new javax.swing.GroupLayout(properties_dialog.getContentPane());
        properties_dialog.getContentPane().setLayout(properties_dialogLayout);
        properties_dialogLayout.setHorizontalGroup(
            properties_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        properties_dialogLayout.setVerticalGroup(
            properties_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        variables_dialog.setTitle("Crear Variable");
        variables_dialog.setMinimumSize(new java.awt.Dimension(373, 242));
        variables_dialog.setModal(true);
        variables_dialog.setResizable(false);

        createVariable_jp.setBackground(new java.awt.Color(204, 204, 204));
        createVariable_jp.setMaximumSize(new java.awt.Dimension(373, 331));
        createVariable_jp.setMinimumSize(new java.awt.Dimension(373, 331));

        variableLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        variableLabel.setForeground(new java.awt.Color(0, 0, 0));
        variableLabel.setText("Variable:");

        typeVariableLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        typeVariableLabel.setForeground(new java.awt.Color(0, 0, 0));
        typeVariableLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        typeVariableLabel.setText("Tipo:");

        typeVariable_jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "int", "double", "float", "bool", "char", "string" }));

        createVariable_btn.setText("Agregar");
        createVariable_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createVariable_btnMouseClicked(evt);
            }
        });

        cancelCreationVariable_btn.setText("Cancelar");
        cancelCreationVariable_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelCreationVariable_btnMouseClicked(evt);
            }
        });

        alcance_lbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        alcance_lbl.setForeground(new java.awt.Color(0, 0, 0));
        alcance_lbl.setText("Alcance:");

        alcance_jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "public", "private", "protected" }));

        javax.swing.GroupLayout createVariable_jpLayout = new javax.swing.GroupLayout(createVariable_jp);
        createVariable_jp.setLayout(createVariable_jpLayout);
        createVariable_jpLayout.setHorizontalGroup(
            createVariable_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createVariable_jpLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(createVariable_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(createVariable_jpLayout.createSequentialGroup()
                        .addComponent(cancelCreationVariable_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createVariable_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createVariable_jpLayout.createSequentialGroup()
                        .addGroup(createVariable_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alcance_lbl)
                            .addGroup(createVariable_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(typeVariableLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(variableLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(createVariable_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_variableName)
                            .addComponent(typeVariable_jcb, 0, 233, Short.MAX_VALUE)
                            .addComponent(alcance_jcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        createVariable_jpLayout.setVerticalGroup(
            createVariable_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createVariable_jpLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(createVariable_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(variableLabel)
                    .addComponent(tf_variableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createVariable_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeVariableLabel)
                    .addComponent(typeVariable_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createVariable_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alcance_lbl)
                    .addComponent(alcance_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(createVariable_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createVariable_btn)
                    .addComponent(cancelCreationVariable_btn))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout variables_dialogLayout = new javax.swing.GroupLayout(variables_dialog.getContentPane());
        variables_dialog.getContentPane().setLayout(variables_dialogLayout);
        variables_dialogLayout.setHorizontalGroup(
            variables_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createVariable_jp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        variables_dialogLayout.setVerticalGroup(
            variables_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createVariable_jp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        operation_dialog.setMinimumSize(new java.awt.Dimension(456, 394));
        operation_dialog.setModal(true);
        operation_dialog.setResizable(false);

        operacion_jp.setBackground(new java.awt.Color(204, 204, 204));
        operacion_jp.setMaximumSize(new java.awt.Dimension(456, 394));
        operacion_jp.setMinimumSize(new java.awt.Dimension(456, 394));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Operador:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Variable 1:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Variable 2:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Resultado:");

        operador_jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));

        guardarOperancion_btn.setText("Agregar");
        guardarOperancion_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarOperancion_btnMouseClicked(evt);
            }
        });

        cancelarOperacion_btn.setText("Cancelar");
        cancelarOperacion_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarOperacion_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout operacion_jpLayout = new javax.swing.GroupLayout(operacion_jp);
        operacion_jp.setLayout(operacion_jpLayout);
        operacion_jpLayout.setHorizontalGroup(
            operacion_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, operacion_jpLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(operacion_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(operacion_jpLayout.createSequentialGroup()
                        .addComponent(cancelarOperacion_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardarOperancion_btn))
                    .addGroup(operacion_jpLayout.createSequentialGroup()
                        .addGroup(operacion_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(operacion_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(operador_jcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(var1_jcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(var2_jcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resultado_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74))
        );
        operacion_jpLayout.setVerticalGroup(
            operacion_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operacion_jpLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(operacion_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(operador_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(operacion_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(var1_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(operacion_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(var2_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(operacion_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(resultado_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(operacion_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarOperancion_btn)
                    .addComponent(cancelarOperacion_btn))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout operation_dialogLayout = new javax.swing.GroupLayout(operation_dialog.getContentPane());
        operation_dialog.getContentPane().setLayout(operation_dialogLayout);
        operation_dialogLayout.setHorizontalGroup(
            operation_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(operacion_jp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        operation_dialogLayout.setVerticalGroup(
            operation_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(operacion_jp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        methods_dialog.setTitle("Crear Metodo");
        methods_dialog.setMinimumSize(new java.awt.Dimension(337, 348));
        methods_dialog.setResizable(false);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setMaximumSize(new java.awt.Dimension(337, 348));
        jPanel6.setMinimumSize(new java.awt.Dimension(337, 348));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre:");

        retornoMetodo_jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "void", "int", "float", "double", "char", "bool" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Retorno:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Alcance:");

        alcanceMetodo_jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "public", "private", "protected" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Parametro:");

        addParametro_btn.setText("Agregar");
        addParametro_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addParametro_btnMouseClicked(evt);
            }
        });

        cancelMethod_btn.setText("Cancelar");
        cancelMethod_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMethod_btnMouseClicked(evt);
            }
        });

        agregarMetodo_btn.setText("Agregar");
        agregarMetodo_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarMetodo_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(cancelMethod_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agregarMetodo_btn))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(retornoMetodo_jcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_nombreMetodo)
                            .addComponent(alcanceMetodo_jcb, 0, 211, Short.MAX_VALUE)
                            .addComponent(addParametro_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nombreMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retornoMetodo_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(alcanceMetodo_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(addParametro_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelMethod_btn)
                    .addComponent(agregarMetodo_btn))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout methods_dialogLayout = new javax.swing.GroupLayout(methods_dialog.getContentPane());
        methods_dialog.getContentPane().setLayout(methods_dialogLayout);
        methods_dialogLayout.setHorizontalGroup(
            methods_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        methods_dialogLayout.setVerticalGroup(
            methods_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        herencia_dialog.setMinimumSize(new java.awt.Dimension(593, 502));
        herencia_dialog.setModal(true);
        herencia_dialog.setResizable(false);

        herencia_jp.setBackground(new java.awt.Color(204, 204, 204));
        herencia_jp.setMaximumSize(new java.awt.Dimension(593, 502));
        herencia_jp.setMinimumSize(new java.awt.Dimension(593, 502));

        jScrollPane3.setViewportView(parentClass_list);

        jScrollPane4.setViewportView(childClass_list);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Clase Hija");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Clase Padre");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("?");
        jLabel14.setToolTipText("<html><b>Nota!</b><p>Las propiedades de la clase padre</p><p>se convertiran a protegidas!</p></html>");

        cancelInheritance_btn.setText("Cancelar");

        applyInheritance_btn.setText("Aplicar Herencia");
        applyInheritance_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applyInheritance_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout herencia_jpLayout = new javax.swing.GroupLayout(herencia_jp);
        herencia_jp.setLayout(herencia_jpLayout);
        herencia_jpLayout.setHorizontalGroup(
            herencia_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, herencia_jpLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(herencia_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(herencia_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(herencia_jpLayout.createSequentialGroup()
                        .addComponent(cancelInheritance_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(applyInheritance_btn))
                    .addGroup(herencia_jpLayout.createSequentialGroup()
                        .addGroup(herencia_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        herencia_jpLayout.setVerticalGroup(
            herencia_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(herencia_jpLayout.createSequentialGroup()
                .addGroup(herencia_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(herencia_jpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14))
                    .addGroup(herencia_jpLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(herencia_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(herencia_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(herencia_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applyInheritance_btn)
                    .addComponent(cancelInheritance_btn))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout herencia_dialogLayout = new javax.swing.GroupLayout(herencia_dialog.getContentPane());
        herencia_dialog.getContentPane().setLayout(herencia_dialogLayout);
        herencia_dialogLayout.setHorizontalGroup(
            herencia_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(herencia_jp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        herencia_dialogLayout.setVerticalGroup(
            herencia_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(herencia_jp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        changeElementBackground_jmi.setText("Cambiar Color");
        changeElementBackground_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeElementBackground_jmiActionPerformed(evt);
            }
        });
        elements_jpm.add(changeElementBackground_jmi);

        changeElementForeground_jmi.setText("Cambiar Color de Texto");
        changeElementForeground_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeElementForeground_jmiActionPerformed(evt);
            }
        });
        elements_jpm.add(changeElementForeground_jmi);

        changeElementText_jmi.setText("Cambiar Texto");
        changeElementText_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeElementText_jmiActionPerformed(evt);
            }
        });
        elements_jpm.add(changeElementText_jmi);

        changeElementFont_jmi.setText("Cambiar Fuente");
        changeElementFont_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeElementFont_jmiActionPerformed(evt);
            }
        });
        elements_jpm.add(changeElementFont_jmi);
        elements_jpm.add(js_elementEdition);

        copyElement_jmi.setText("Copiar");
        copyElement_jmi.setToolTipText("");
        copyElement_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyElement_jmiActionPerformed(evt);
            }
        });
        elements_jpm.add(copyElement_jmi);

        pasteElement_jmi.setText("Pegar");
        pasteElement_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteElement_jmiActionPerformed(evt);
            }
        });
        elements_jpm.add(pasteElement_jmi);

        deleteElement_jmi.setText("Eliminar");
        deleteElement_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteElement_jmiActionPerformed(evt);
            }
        });
        elements_jpm.add(deleteElement_jmi);
        elements_jpm.add(js_elementProperties);

        elementProperties_jmi.setText("Propiedades");
        elementProperties_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementProperties_jmiActionPerformed(evt);
            }
        });
        elements_jpm.add(elementProperties_jmi);

        addPropiedad_jmi.setText("Agregar Propiedad");
        addPropiedad_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPropiedad_jmiActionPerformed(evt);
            }
        });
        clases_jpm.add(addPropiedad_jmi);

        eliminarPropiedad_jmi.setText("Eliminar Propiedad");
        eliminarPropiedad_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPropiedad_jmiActionPerformed(evt);
            }
        });
        clases_jpm.add(eliminarPropiedad_jmi);

        addMetodo_jmi.setText("Agregar Metodo");
        addMetodo_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMetodo_jmiActionPerformed(evt);
            }
        });
        clases_jpm.add(addMetodo_jmi);

        eliminarMetodo_jmi.setText("Eliminar Metodo");
        eliminarMetodo_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMetodo_jmiActionPerformed(evt);
            }
        });
        clases_jpm.add(eliminarMetodo_jmi);

        descripcionMetodo_jmi.setText("Descripcion del Metodo");
        descripcionMetodo_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionMetodo_jmiActionPerformed(evt);
            }
        });
        clases_jpm.add(descripcionMetodo_jmi);

        descripcion_jmi.setText("Descripcion");
        descripcion_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcion_jmiActionPerformed(evt);
            }
        });
        clases_jpm.add(descripcion_jmi);

        eliminarArbol_jmi.setText("Eliminar Arbol");
        eliminarArbol_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarArbol_jmiActionPerformed(evt);
            }
        });
        clases_jpm.add(eliminarArbol_jmi);

        parameters_dialog.setTitle("Agregar Parametro");
        parameters_dialog.setMaximumSize(new java.awt.Dimension(400, 242));
        parameters_dialog.setMinimumSize(new java.awt.Dimension(400, 242));
        parameters_dialog.setModal(true);
        parameters_dialog.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(400, 242));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 242));

        parameterType_jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "int", "float", "double", "char", "string", "bool" }));

        typeParametroLbl.setForeground(new java.awt.Color(0, 0, 0));
        typeParametroLbl.setText("Tipo de Parametro:");

        nameParametroLbl.setForeground(new java.awt.Color(0, 0, 0));
        nameParametroLbl.setText("Nombre de Parametro:");

        confirmParametro_btn.setText("Agregar Parametro");
        confirmParametro_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmParametro_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameParametroLbl)
                    .addComponent(typeParametroLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_parameterName)
                    .addComponent(parameterType_jcb, 0, 184, Short.MAX_VALUE))
                .addGap(49, 49, 49))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(confirmParametro_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameParametroLbl)
                    .addComponent(tf_parameterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parameterType_jcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeParametroLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(confirmParametro_btn)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout parameters_dialogLayout = new javax.swing.GroupLayout(parameters_dialog.getContentPane());
        parameters_dialog.getContentPane().setLayout(parameters_dialogLayout);
        parameters_dialogLayout.setHorizontalGroup(
            parameters_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        parameters_dialogLayout.setVerticalGroup(
            parameters_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UML Editor");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editorDiagrama_jp.setMaximumSize(new java.awt.Dimension(1280, 697));
        editorDiagrama_jp.setMinimumSize(new java.awt.Dimension(1280, 697));
        editorDiagrama_jp.setPreferredSize(new java.awt.Dimension(1280, 697));
        editorDiagrama_jp.setLayout(new java.awt.BorderLayout());

        tools_jp.setBackground(new java.awt.Color(153, 153, 153));
        tools_jp.setMaximumSize(new java.awt.Dimension(1280, 40));
        tools_jp.setMinimumSize(new java.awt.Dimension(1280, 40));
        tools_jp.setPreferredSize(new java.awt.Dimension(1280, 40));
        tools_jp.setLayout(new javax.swing.BoxLayout(tools_jp, javax.swing.BoxLayout.LINE_AXIS));

        fontLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fontLabel.setForeground(new java.awt.Color(0, 0, 0));
        fontLabel.setText("   Fuente:    ");
        tools_jp.add(fontLabel);

        fontChooser_jcb.setToolTipText("<html><b>Fuente</b><p>Escoge una nueva fuente para tu texto</p></html>");
        fontChooser_jcb.setLightWeightPopupEnabled(false);
        fontChooser_jcb.setMaximumSize(new java.awt.Dimension(130, 22));
        fontChooser_jcb.setMinimumSize(new java.awt.Dimension(130, 22));
        fontChooser_jcb.setPreferredSize(new java.awt.Dimension(130, 22));
        fontChooser_jcb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fontChooser_jcbItemStateChanged(evt);
            }
        });
        tools_jp.add(fontChooser_jcb);

        sizeFontLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sizeFontLabel.setForeground(new java.awt.Color(0, 0, 0));
        sizeFontLabel.setText("       Tamaño:   ");
        tools_jp.add(sizeFontLabel);

        fontSize_spinner.setToolTipText("<html><b>Tamaño de Fuente</b><p>Cambia el tamaño del texto</p></html>");
        fontSize_spinner.setMaximumSize(new java.awt.Dimension(90, 22));
        fontSize_spinner.setMinimumSize(new java.awt.Dimension(90, 22));
        fontSize_spinner.setPreferredSize(new java.awt.Dimension(90, 22));
        fontSize_spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fontSize_spinnerStateChanged(evt);
            }
        });
        tools_jp.add(fontSize_spinner);

        space1_toolLabel.setText("    ");
        tools_jp.add(space1_toolLabel);

        separator_tool.setBackground(new java.awt.Color(0, 0, 0));
        separator_tool.setForeground(new java.awt.Color(0, 0, 0));
        separator_tool.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator_tool.setMaximumSize(new java.awt.Dimension(12, 30));
        separator_tool.setMinimumSize(new java.awt.Dimension(12, 30));
        separator_tool.setPreferredSize(new java.awt.Dimension(12, 30));
        tools_jp.add(separator_tool);

        bold_toggleBtn.setBackground(new java.awt.Color(153, 153, 153));
        bold_toggleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/bold.png"))); // NOI18N
        bold_toggleBtn.setToolTipText("<html><b>Negrita</b><p>Haz tu texto en negrita</p></html>");
        bold_toggleBtn.setBorderPainted(false);
        bold_toggleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bold_toggleBtnMouseClicked(evt);
            }
        });
        tools_jp.add(bold_toggleBtn);

        jLabel5.setText("  ");
        tools_jp.add(jLabel5);

        italic_toggleBtn.setBackground(new java.awt.Color(153, 153, 153));
        italic_toggleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/italic.png"))); // NOI18N
        italic_toggleBtn.setToolTipText("<html><b>Italica</b><p>Haz tu texto en italica</p></html>");
        italic_toggleBtn.setBorderPainted(false);
        italic_toggleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                italic_toggleBtnMouseClicked(evt);
            }
        });
        tools_jp.add(italic_toggleBtn);

        space2_toolLbl.setText("     ");
        tools_jp.add(space2_toolLbl);

        separator2_tool.setBackground(new java.awt.Color(0, 0, 0));
        separator2_tool.setForeground(new java.awt.Color(0, 0, 0));
        separator2_tool.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator2_tool.setMaximumSize(new java.awt.Dimension(12, 30));
        separator2_tool.setMinimumSize(new java.awt.Dimension(12, 30));
        separator2_tool.setPreferredSize(new java.awt.Dimension(12, 30));
        tools_jp.add(separator2_tool);

        foregroundColor_btn.setBackground(new java.awt.Color(0, 0, 0));
        foregroundColor_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/text_color.png"))); // NOI18N
        foregroundColor_btn.setToolTipText("<html><b>Color de Texto</b><p>Cambia el color de tu texto</p></html>");
        foregroundColor_btn.setBorder(null);
        foregroundColor_btn.setBorderPainted(false);
        foregroundColor_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foregroundColor_btnMouseClicked(evt);
            }
        });
        tools_jp.add(foregroundColor_btn);

        jLabel7.setText("   ");
        tools_jp.add(jLabel7);

        backgroundChooser_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/bucket_fill.png"))); // NOI18N
        backgroundChooser_btn.setToolTipText("<html><b>Shading</b><p>Cambia el color del elemento</p></html>");
        backgroundChooser_btn.setBorderPainted(false);
        backgroundChooser_btn.setContentAreaFilled(false);
        backgroundChooser_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundChooser_btnMouseClicked(evt);
            }
        });
        tools_jp.add(backgroundChooser_btn);

        editorDiagrama_jp.add(tools_jp, java.awt.BorderLayout.PAGE_START);

        menuElements_jp.setBackground(new java.awt.Color(204, 204, 204));
        menuElements_jp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(51, 51, 51)));
        menuElements_jp.setMaximumSize(new java.awt.Dimension(185, 497));
        menuElements_jp.setMinimumSize(new java.awt.Dimension(185, 497));
        menuElements_jp.setPreferredSize(new java.awt.Dimension(185, 497));

        optionsTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        optionsTitle.setForeground(new java.awt.Color(0, 0, 0));
        optionsTitle.setText("  OPCIONES ---------------");

        terminalFig_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/figuras/siluetas/terminal.png"))); // NOI18N
        terminalFig_btn.setBorderPainted(false);
        terminalFig_btn.setContentAreaFilled(false);
        terminalFig_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terminalFig_btnMouseClicked(evt);
            }
        });

        processFig_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/figuras/siluetas/proceso.png"))); // NOI18N
        processFig_btn.setBorderPainted(false);
        processFig_btn.setContentAreaFilled(false);
        processFig_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                processFig_btnMouseClicked(evt);
            }
        });

        predefinedProcessFig_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/figuras/siluetas/defined_process.png"))); // NOI18N
        predefinedProcessFig_btn.setBorderPainted(false);
        predefinedProcessFig_btn.setContentAreaFilled(false);
        predefinedProcessFig_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                predefinedProcessFig_btnMouseClicked(evt);
            }
        });

        decisionFig_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/figuras/siluetas/decision_rombo.png"))); // NOI18N
        decisionFig_btn.setBorderPainted(false);
        decisionFig_btn.setContentAreaFilled(false);
        decisionFig_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decisionFig_btnMouseClicked(evt);
            }
        });

        soutFig_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/figuras/siluetas/paralelograma.png"))); // NOI18N
        soutFig_btn.setBorderPainted(false);
        soutFig_btn.setContentAreaFilled(false);
        soutFig_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soutFig_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuElements_jpLayout = new javax.swing.GroupLayout(menuElements_jp);
        menuElements_jp.setLayout(menuElements_jpLayout);
        menuElements_jpLayout.setHorizontalGroup(
            menuElements_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuElements_jpLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(menuElements_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(predefinedProcessFig_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(processFig_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(terminalFig_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(decisionFig_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soutFig_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(menuElements_jpLayout.createSequentialGroup()
                .addComponent(optionsTitle)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuElements_jpLayout.setVerticalGroup(
            menuElements_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuElements_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optionsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(terminalFig_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(processFig_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(predefinedProcessFig_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(decisionFig_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(soutFig_btn)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        editorDiagrama_jp.add(menuElements_jp, java.awt.BorderLayout.LINE_START);

        extras_tabs.setBackground(new java.awt.Color(204, 204, 204));
        extras_tabs.setForeground(new java.awt.Color(0, 0, 0));

        variables_jp.setBackground(new java.awt.Color(204, 204, 204));
        variables_jp.setMaximumSize(new java.awt.Dimension(190, 566));
        variables_jp.setMinimumSize(new java.awt.Dimension(190, 566));
        variables_jp.setPreferredSize(new java.awt.Dimension(190, 566));

        variables_scroll.setViewportView(variables_list);

        agregarVariable_btn.setBackground(new java.awt.Color(102, 102, 102));
        agregarVariable_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarVariable_btn.setForeground(new java.awt.Color(0, 0, 0));
        agregarVariable_btn.setText("Agregar");
        agregarVariable_btn.setBorderPainted(false);
        agregarVariable_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarVariable_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout variables_jpLayout = new javax.swing.GroupLayout(variables_jp);
        variables_jp.setLayout(variables_jpLayout);
        variables_jpLayout.setHorizontalGroup(
            variables_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(variables_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(variables_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agregarVariable_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(variables_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        variables_jpLayout.setVerticalGroup(
            variables_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(variables_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(variables_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarVariable_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        extras_tabs.addTab("Variables", variables_jp);

        procesos_jp.setBackground(new java.awt.Color(204, 204, 204));

        processes_scroll.setViewportView(process_list);

        agregarProceso_btn.setBackground(new java.awt.Color(102, 102, 102));
        agregarProceso_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarProceso_btn.setForeground(new java.awt.Color(0, 0, 0));
        agregarProceso_btn.setText("Agregar");
        agregarProceso_btn.setBorderPainted(false);
        agregarProceso_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarProceso_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout procesos_jpLayout = new javax.swing.GroupLayout(procesos_jp);
        procesos_jp.setLayout(procesos_jpLayout);
        procesos_jpLayout.setHorizontalGroup(
            procesos_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(procesos_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(procesos_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agregarProceso_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processes_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        procesos_jpLayout.setVerticalGroup(
            procesos_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(procesos_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(processes_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarProceso_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        extras_tabs.addTab("Procesos", procesos_jp);

        editorDiagrama_jp.add(extras_tabs, java.awt.BorderLayout.LINE_END);

        controlButtons_jp.setBackground(new java.awt.Color(204, 204, 204));
        controlButtons_jp.setMaximumSize(new java.awt.Dimension(1280, 62));
        controlButtons_jp.setMinimumSize(new java.awt.Dimension(1280, 62));
        controlButtons_jp.setPreferredSize(new java.awt.Dimension(1280, 62));

        generarCodigo_btn.setBackground(new java.awt.Color(102, 102, 102));
        generarCodigo_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        generarCodigo_btn.setForeground(new java.awt.Color(0, 0, 0));
        generarCodigo_btn.setText("Generar Codigo");
        generarCodigo_btn.setBorderPainted(false);

        code_toggleBtn.setBackground(new Color(255, 255, 255, 128));
        code_toggleBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        code_toggleBtn.setForeground(new java.awt.Color(0, 0, 0));
        code_toggleBtn.setText("Codigo");
        code_toggleBtn.setBorder(null);
        code_toggleBtn.setBorderPainted(false);
        code_toggleBtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                code_toggleBtnItemStateChanged(evt);
            }
        });
        code_toggleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                code_toggleBtnMouseClicked(evt);
            }
        });

        diagram_toggleBtn.setBackground(new Color(255, 255, 255, 128));
        diagram_toggleBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        diagram_toggleBtn.setForeground(new java.awt.Color(0, 0, 0));
        diagram_toggleBtn.setText("Diagrama");
        diagram_toggleBtn.setBorder(null);
        diagram_toggleBtn.setBorderPainted(false);
        diagram_toggleBtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                diagram_toggleBtnItemStateChanged(evt);
            }
        });
        diagram_toggleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diagram_toggleBtnMouseClicked(evt);
            }
        });

        paste_btn.setBackground(new java.awt.Color(102, 102, 102));
        paste_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        paste_btn.setForeground(new java.awt.Color(0, 0, 0));
        paste_btn.setText("Pegar");
        paste_btn.setBorderPainted(false);
        paste_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paste_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout controlButtons_jpLayout = new javax.swing.GroupLayout(controlButtons_jp);
        controlButtons_jp.setLayout(controlButtons_jpLayout);
        controlButtons_jpLayout.setHorizontalGroup(
            controlButtons_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlButtons_jpLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(generarCodigo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paste_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 453, Short.MAX_VALUE)
                .addComponent(diagram_toggleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(code_toggleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
        );
        controlButtons_jpLayout.setVerticalGroup(
            controlButtons_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlButtons_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlButtons_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(controlButtons_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(generarCodigo_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(paste_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addComponent(diagram_toggleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(code_toggleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        editorDiagrama_jp.add(controlButtons_jp, java.awt.BorderLayout.PAGE_END);

        main_jp.setBackground(new java.awt.Color(255, 255, 255));
        main_jp.setLayout(new java.awt.CardLayout());

        workarea_jp.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout workarea_jpLayout = new javax.swing.GroupLayout(workarea_jp);
        workarea_jp.setLayout(workarea_jpLayout);
        workarea_jpLayout.setHorizontalGroup(
            workarea_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 905, Short.MAX_VALUE)
        );
        workarea_jpLayout.setVerticalGroup(
            workarea_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        main_jp.add(workarea_jp, "card2");

        codeDiagrama_jp.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(null);

        ta_codeDiagrama.setEditable(false);
        ta_codeDiagrama.setBackground(new java.awt.Color(255, 255, 255));
        ta_codeDiagrama.setColumns(20);
        ta_codeDiagrama.setForeground(new java.awt.Color(0, 0, 0));
        ta_codeDiagrama.setRows(5);
        ta_codeDiagrama.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CODIGO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane2.setViewportView(ta_codeDiagrama);

        javax.swing.GroupLayout codeDiagrama_jpLayout = new javax.swing.GroupLayout(codeDiagrama_jp);
        codeDiagrama_jp.setLayout(codeDiagrama_jpLayout);
        codeDiagrama_jpLayout.setHorizontalGroup(
            codeDiagrama_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(codeDiagrama_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
                .addContainerGap())
        );
        codeDiagrama_jpLayout.setVerticalGroup(
            codeDiagrama_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(codeDiagrama_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );

        main_jp.add(codeDiagrama_jp, "card3");

        editorDiagrama_jp.add(main_jp, java.awt.BorderLayout.CENTER);

        getContentPane().add(editorDiagrama_jp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        classesGenerator_jp.setBackground(new java.awt.Color(204, 204, 204));
        classesGenerator_jp.setMaximumSize(new java.awt.Dimension(1280, 720));
        classesGenerator_jp.setMinimumSize(new java.awt.Dimension(1280, 720));
        classesGenerator_jp.setPreferredSize(new java.awt.Dimension(1280, 720));
        classesGenerator_jp.setLayout(new java.awt.BorderLayout());

        menuClasses_jp.setBackground(new java.awt.Color(204, 204, 204));
        menuClasses_jp.setMaximumSize(new java.awt.Dimension(350, 520));
        menuClasses_jp.setMinimumSize(new java.awt.Dimension(350, 520));
        menuClasses_jp.setPreferredSize(new java.awt.Dimension(350, 520));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Clases Generadas --------------------");

        jt_classes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_classesMouseClicked(evt);
            }
        });
        scrollClasses.setViewportView(jt_classes);

        createClase_btn.setBackground(new java.awt.Color(153, 153, 153));
        createClase_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createClase_btn.setForeground(new java.awt.Color(0, 0, 0));
        createClase_btn.setText("Nueva Clase");
        createClase_btn.setBorderPainted(false);
        createClase_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createClase_btnMouseClicked(evt);
            }
        });

        deleteHerencia_btn.setBackground(new java.awt.Color(153, 153, 153));
        deleteHerencia_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteHerencia_btn.setForeground(new java.awt.Color(0, 0, 0));
        deleteHerencia_btn.setText("Eliminar Herencia");
        deleteHerencia_btn.setBorderPainted(false);
        deleteHerencia_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteHerencia_btnMouseClicked(evt);
            }
        });

        herencia_btn.setBackground(new java.awt.Color(153, 153, 153));
        herencia_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        herencia_btn.setForeground(new java.awt.Color(0, 0, 0));
        herencia_btn.setText("Herencia");
        herencia_btn.setBorderPainted(false);
        herencia_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                herencia_btnMouseClicked(evt);
            }
        });

        addToWorkArea_btn.setBackground(new java.awt.Color(153, 153, 153));
        addToWorkArea_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addToWorkArea_btn.setForeground(new java.awt.Color(0, 0, 0));
        addToWorkArea_btn.setText("Agregar a Area de Trabajo");
        addToWorkArea_btn.setBorderPainted(false);
        addToWorkArea_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addToWorkArea_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuClasses_jpLayout = new javax.swing.GroupLayout(menuClasses_jp);
        menuClasses_jp.setLayout(menuClasses_jpLayout);
        menuClasses_jpLayout.setHorizontalGroup(
            menuClasses_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuClasses_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuClasses_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollClasses)
                    .addGroup(menuClasses_jpLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(19, 19, 19))
            .addGroup(menuClasses_jpLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(menuClasses_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuClasses_jpLayout.createSequentialGroup()
                        .addComponent(createClase_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(menuClasses_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(addToWorkArea_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(menuClasses_jpLayout.createSequentialGroup()
                            .addComponent(herencia_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(deleteHerencia_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuClasses_jpLayout.setVerticalGroup(
            menuClasses_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuClasses_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createClase_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuClasses_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(herencia_btn)
                    .addComponent(deleteHerencia_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addToWorkArea_btn)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        classesGenerator_jp.add(menuClasses_jp, java.awt.BorderLayout.LINE_START);

        rightSide_jp.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout rightSide_jpLayout = new javax.swing.GroupLayout(rightSide_jp);
        rightSide_jp.setLayout(rightSide_jpLayout);
        rightSide_jpLayout.setHorizontalGroup(
            rightSide_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        rightSide_jpLayout.setVerticalGroup(
            rightSide_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        classesGenerator_jp.add(rightSide_jp, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setMaximumSize(new java.awt.Dimension(1280, 50));
        jPanel4.setMinimumSize(new java.awt.Dimension(1280, 50));
        jPanel4.setPreferredSize(new java.awt.Dimension(1280, 50));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        classesGenerator_jp.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        controlClasses_jp.setBackground(new java.awt.Color(204, 204, 204));
        controlClasses_jp.setMaximumSize(new java.awt.Dimension(1280, 75));
        controlClasses_jp.setMinimumSize(new java.awt.Dimension(1280, 75));
        controlClasses_jp.setPreferredSize(new java.awt.Dimension(1280, 75));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Generar Codigo");
        jButton3.setBorderPainted(false);

        diagramClase_toggleBtn.setBackground(new Color(255, 255, 255, 128));
        diagramClase_toggleBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        diagramClase_toggleBtn.setForeground(new java.awt.Color(0, 0, 0));
        diagramClase_toggleBtn.setText("Diagrama");
        diagramClase_toggleBtn.setBorder(null);
        diagramClase_toggleBtn.setBorderPainted(false);
        diagramClase_toggleBtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                diagramClase_toggleBtnItemStateChanged(evt);
            }
        });
        diagramClase_toggleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diagramClase_toggleBtnMouseClicked(evt);
            }
        });

        codeClase_toggleBtn.setBackground(new Color(255, 255, 255, 128));
        codeClase_toggleBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        codeClase_toggleBtn.setForeground(new java.awt.Color(0, 0, 0));
        codeClase_toggleBtn.setText("Codigo");
        codeClase_toggleBtn.setBorder(null);
        codeClase_toggleBtn.setBorderPainted(false);
        codeClase_toggleBtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                codeClase_toggleBtnItemStateChanged(evt);
            }
        });
        codeClase_toggleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codeClase_toggleBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout controlClasses_jpLayout = new javax.swing.GroupLayout(controlClasses_jp);
        controlClasses_jp.setLayout(controlClasses_jpLayout);
        controlClasses_jpLayout.setHorizontalGroup(
            controlClasses_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlClasses_jpLayout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 549, Short.MAX_VALUE)
                .addComponent(diagramClase_toggleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(codeClase_toggleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        controlClasses_jpLayout.setVerticalGroup(
            controlClasses_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlClasses_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlClasses_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(diagramClase_toggleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codeClase_toggleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        classesGenerator_jp.add(controlClasses_jp, java.awt.BorderLayout.PAGE_END);

        mainarea_jp.setBackground(new java.awt.Color(255, 255, 255));
        mainarea_jp.setLayout(new java.awt.CardLayout());

        workareaClasses_jp.setBackground(new java.awt.Color(255, 255, 255));
        workareaClasses_jp.setLayout(null);
        mainarea_jp.add(workareaClasses_jp, "card2");

        codeClasses_jp.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        ta_codeClass.setEditable(false);
        ta_codeClass.setBackground(new java.awt.Color(255, 255, 255));
        ta_codeClass.setColumns(20);
        ta_codeClass.setForeground(new java.awt.Color(0, 0, 0));
        ta_codeClass.setRows(5);
        ta_codeClass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CODIGO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane1.setViewportView(ta_codeClass);

        javax.swing.GroupLayout codeClasses_jpLayout = new javax.swing.GroupLayout(codeClasses_jp);
        codeClasses_jp.setLayout(codeClasses_jpLayout);
        codeClasses_jpLayout.setHorizontalGroup(
            codeClasses_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(codeClasses_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );
        codeClasses_jpLayout.setVerticalGroup(
            codeClasses_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(codeClasses_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainarea_jp.add(codeClasses_jp, "card3");

        classesGenerator_jp.add(mainarea_jp, java.awt.BorderLayout.CENTER);

        getContentPane().add(classesGenerator_jp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        fileOptions_jm.setText("Archivo");

        newFile_jmi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newFile_jmi.setText("Nuevo");
        newFile_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFile_jmiActionPerformed(evt);
            }
        });
        fileOptions_jm.add(newFile_jmi);

        openFile_jmi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openFile_jmi.setText("Abrir");
        openFile_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFile_jmiActionPerformed(evt);
            }
        });
        fileOptions_jm.add(openFile_jmi);

        saveFile_jmi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveFile_jmi.setText("Guardar");
        saveFile_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFile_jmiActionPerformed(evt);
            }
        });
        fileOptions_jm.add(saveFile_jmi);

        frameMenu_jmb.add(fileOptions_jm);

        exportOptions_jm.setText("Exportar");

        exportPdf_jmi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.ALT_DOWN_MASK));
        exportPdf_jmi.setText("Exportar PDF");
        exportPdf_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPdf_jmiActionPerformed(evt);
            }
        });
        exportOptions_jm.add(exportPdf_jmi);

        frameMenu_jmb.add(exportOptions_jm);

        tools_jm.setText("Herramientas");

        editorDiagrama_jmi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        editorDiagrama_jmi.setText("Editor de Diagramas");
        editorDiagrama_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editorDiagrama_jmiActionPerformed(evt);
            }
        });
        tools_jm.add(editorDiagrama_jmi);

        generadorClases_jmi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        generadorClases_jmi.setText("Generador de Clases");
        generadorClases_jmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generadorClases_jmiActionPerformed(evt);
            }
        });
        tools_jm.add(generadorClases_jmi);

        frameMenu_jmb.add(tools_jm);

        setJMenuBar(frameMenu_jmb);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    * DIAGRAM ELEMENTS OPTION PANEL
     */
    private void terminalFig_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terminalFig_btnMouseClicked
        boolean isStartExisting = false;
        boolean isEndExisting = false;

        for (FiguraDiagrama elemento : elementos) {
            if (elemento instanceof Inicio) {
                isStartExisting = true;
            }
            if (elemento instanceof Fin) {
                isEndExisting = true;
            }
        }

        if (!isStartExisting && !isEndExisting) {
            Inicio inicio = new Inicio(new ImageIcon(getClass().getResource("/recursos/figuras/templates/terminal.png")), 50, 50);
            addToWorkArea(inicio);
        } else if (isStartExisting && !isEndExisting) {
            Fin fin = new Fin(new ImageIcon(getClass().getResource("/recursos/figuras/templates/terminal.png")), 50, 50);
            addToWorkArea(fin);
        } else if (!isStartExisting && isEndExisting) {
            Inicio inicio = new Inicio(new ImageIcon(getClass().getResource("/recursos/figuras/templates/terminal.png")), 50, 50);
            addToWorkArea(inicio);
        }
    }//GEN-LAST:event_terminalFig_btnMouseClicked

    private void processFig_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processFig_btnMouseClicked
        Proceso proceso = new Proceso(new ImageIcon(getClass().getResource("/recursos/figuras/templates/process.png")), 50, 50);
        addToWorkArea(proceso);
    }//GEN-LAST:event_processFig_btnMouseClicked

    private void predefinedProcessFig_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_predefinedProcessFig_btnMouseClicked
        ProcesoPredefinido procesoPredefinido = new ProcesoPredefinido(new ImageIcon(getClass().getResource("/recursos/figuras/templates/predefined_process.png")), 50, 50);
        addToWorkArea(procesoPredefinido);
    }//GEN-LAST:event_predefinedProcessFig_btnMouseClicked

    private void decisionFig_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decisionFig_btnMouseClicked
        Decision decision = new Decision(new ImageIcon(getClass().getResource("/recursos/figuras/templates/decision.png")), 50, 50);
        addToWorkArea(decision);
    }//GEN-LAST:event_decisionFig_btnMouseClicked

    private void soutFig_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soutFig_btnMouseClicked
        SalidaDatos sout = new SalidaDatos(new ImageIcon(getClass().getResource("/recursos/figuras/templates/in_out.png")), 50, 50);
        addToWorkArea(sout);
    }//GEN-LAST:event_soutFig_btnMouseClicked

    /*
    * TOOLS FUNCTIONS
     */
    private void fontChooser_jcbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fontChooser_jcbItemStateChanged
        if (labelSeleccionado != null) {
            elementoSeleccionado = encontrarElemento(labelSeleccionado);
            labelSeleccionado.setFont(new Font((String) fontChooser_jcb.getSelectedItem(), labelSeleccionado.getFont().getStyle(), labelSeleccionado.getFont().getSize()));
            elementoSeleccionado.setFuente(labelSeleccionado.getFont());
        }
    }//GEN-LAST:event_fontChooser_jcbItemStateChanged

    private void fontSize_spinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fontSize_spinnerStateChanged
        if (labelSeleccionado != null) {
            elementoSeleccionado = encontrarElemento(labelSeleccionado);
            labelSeleccionado.setFont(new Font(labelSeleccionado.getFont().getName(), labelSeleccionado.getFont().getStyle(), (int) fontSize_spinner.getValue()));
            elementoSeleccionado.setFuente(labelSeleccionado.getFont());
        }
    }//GEN-LAST:event_fontSize_spinnerStateChanged

    private void bold_toggleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bold_toggleBtnMouseClicked
        stylishFont();
    }//GEN-LAST:event_bold_toggleBtnMouseClicked

    private void italic_toggleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_italic_toggleBtnMouseClicked
        stylishFont();
    }//GEN-LAST:event_italic_toggleBtnMouseClicked

    private void foregroundColor_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foregroundColor_btnMouseClicked
        if (labelSeleccionado != null) {
            elementoSeleccionado = encontrarElemento(labelSeleccionado);
            setColorToElement(FOREGROUND_OPTION);
        }
    }//GEN-LAST:event_foregroundColor_btnMouseClicked

    private void backgroundChooser_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundChooser_btnMouseClicked
        if (labelSeleccionado != null) {
            elementoSeleccionado = encontrarElemento(labelSeleccionado);
            setColorToElement(BACKGROUND_OPTION);
        }
    }//GEN-LAST:event_backgroundChooser_btnMouseClicked

    /*
    * POPUP MENU FUNCTIONS FOR DIAGRAM ELEMENTS
     */
    private void changeElementBackground_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeElementBackground_jmiActionPerformed
        elementoSeleccionado = encontrarElemento(labelSeleccionado);
        if (elementoSeleccionado != null) {
            setColorToElement(BACKGROUND_OPTION);
        }
    }//GEN-LAST:event_changeElementBackground_jmiActionPerformed

    private void changeElementForeground_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeElementForeground_jmiActionPerformed
        elementoSeleccionado = encontrarElemento(labelSeleccionado);
        if (elementoSeleccionado != null) {
            setColorToElement(FOREGROUND_OPTION);
        }
    }//GEN-LAST:event_changeElementForeground_jmiActionPerformed

    private void changeElementText_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeElementText_jmiActionPerformed
        String textModified = JOptionPane.showInputDialog(this, "Modificar Texto", labelSeleccionado.getText());
        if (textModified != null) {
            if (textModified.trim().length() != 0) {
                elementoSeleccionado = encontrarElemento(labelSeleccionado);
                if (elementoSeleccionado != null) {
                    labelSeleccionado.setText(textModified);
                    elementoSeleccionado.setTexto(textModified);
                }
            }
        }
    }//GEN-LAST:event_changeElementText_jmiActionPerformed

    private void changeElementFont_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeElementFont_jmiActionPerformed
        JComboBox newFontChooser_jcb = new JComboBox();
        DefaultComboBoxModel fontModel = new DefaultComboBoxModel();
        newFontChooser_jcb.setModel(fontModel);
        initFonts(newFontChooser_jcb);

        int option = JOptionPane.showConfirmDialog(this, newFontChooser_jcb, "Seleccionar Fuente", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            elementoSeleccionado = encontrarElemento(labelSeleccionado);
            if (elementoSeleccionado != null) {
                String fuenteSeleccionada = (String) newFontChooser_jcb.getSelectedItem();
                labelSeleccionado.setFont(new Font(fuenteSeleccionada, elementoSeleccionado.getFuente().getStyle(), elementoSeleccionado.getFuente().getSize()));
                elementoSeleccionado.setFuente(new Font(fuenteSeleccionada, elementoSeleccionado.getFuente().getStyle(), elementoSeleccionado.getFuente().getSize()));
            }
        }
    }//GEN-LAST:event_changeElementFont_jmiActionPerformed

    private void copyElement_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyElement_jmiActionPerformed
        elementoSeleccionado = encontrarElemento(labelSeleccionado);
        if (elementoSeleccionado != null) {
            copiaElemento = elementoSeleccionado;
        }
    }//GEN-LAST:event_copyElement_jmiActionPerformed

    private void pasteElement_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteElement_jmiActionPerformed
        if (copiaElemento != null) {
            copiaElemento.setX(elementoSeleccionado.getX() + elementoSeleccionado.getIcono().getIconWidth());
            copiaElemento.setY(elementoSeleccionado.getY() + elementoSeleccionado.getIcono().getIconHeight());
            addToWorkArea(copiaElemento);
        }
    }//GEN-LAST:event_pasteElement_jmiActionPerformed

    private void deleteElement_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteElement_jmiActionPerformed
        elementoSeleccionado = encontrarElemento(labelSeleccionado);
        elementos.remove(elementoSeleccionado);
        workarea_jp.remove(labelSeleccionado);
        workarea_jp.repaint();

        elementoSeleccionado = null;
        labelSeleccionado = null;
    }//GEN-LAST:event_deleteElement_jmiActionPerformed

    private void elementProperties_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementProperties_jmiActionPerformed
        elementoSeleccionado = encontrarElemento(labelSeleccionado);
        tf_nameProperty.setText(labelSeleccionado.getName());
        tf_textProperty.setText(labelSeleccionado.getText());
        bgProperty.setBackground(labelSeleccionado.getBackground());
        foregroundProperty.setBackground(labelSeleccionado.getForeground());
        bgProperty.setOpaque(true);
        foregroundProperty.setOpaque(true);
        fontProperty_jcb.setSelectedItem(labelSeleccionado.getFont().getName());
        fontSize_spinner.setValue(labelSeleccionado.getFont().getSize());
        showDialog("Elemento " + labelSeleccionado.getName() + " - Propiedades", properties_dialog);
    }//GEN-LAST:event_elementProperties_jmiActionPerformed

    /*
    * PROPERTIES DIALOG FUNCTIONS
     */
    private boolean verifyText(javax.swing.JTextField textField) {
        return textField.getText().trim().length() != 0 && !textField.getText().trim().equals(labelSeleccionado.getText());
    }

    private String obtainText(javax.swing.JTextField textField) {
        if (verifyText(textField)) {
            return textField.getText().trim();
        } else {
            return null;
        }
    }

    private void cancelPropertyDialog_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelPropertyDialog_btnMouseClicked
        properties_dialog.dispose();
    }//GEN-LAST:event_cancelPropertyDialog_btnMouseClicked

    private void okProperties_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okProperties_btnMouseClicked
        String nuevoNombre = obtainText(tf_nameProperty);
        String nuevoTexto = obtainText(tf_textProperty);
        if (nuevoNombre != null && elementoSeleccionado != null) {
            labelSeleccionado.setName(nuevoNombre);
            elementoSeleccionado.setNombre(nuevoNombre);
        }
        if (nuevoTexto != null && elementoSeleccionado != null) {
            labelSeleccionado.setText(nuevoTexto);
            elementoSeleccionado.setTexto(nuevoTexto);
        }
    }//GEN-LAST:event_okProperties_btnMouseClicked

    /*
    * CREATE VARIABLE DIALOG
     */
    private void agregarVariable_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarVariable_btnMouseClicked
        alcance_lbl.setVisible(false);
        alcance_jcb.setVisible(false);
        showDialog("Crear Variable", variables_dialog);
    }//GEN-LAST:event_agregarVariable_btnMouseClicked

    private void cancelCreationVariable_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelCreationVariable_btnMouseClicked
        variables_dialog.dispose();
    }//GEN-LAST:event_cancelCreationVariable_btnMouseClicked

    private void createVariable_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createVariable_btnMouseClicked
        if (tf_variableName.getText().trim().length() != 0) {
            String nombre = tf_variableName.getText();
            String tipo = (String) typeVariable_jcb.getSelectedItem();
            String alcance = (String) alcance_jcb.getSelectedItem();
            if (window == 1) {
                Variable variable = new Variable(tipo, nombre);
                DefaultListModel model = (DefaultListModel) variables_list.getModel();
                model.addElement(variable);
                showMessage("Variable agregada", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else if (window == 2) {
                Variable propiedad = new Variable(tipo, nombre, alcance);
                DefaultMutableTreeNode property = new DefaultMutableTreeNode(propiedad);
                if (arbolSeleccionado == null) {
                    return;
                }
                DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arbolSeleccionado.getModel().getRoot();
                DefaultMutableTreeNode nodoPropiedad = null;
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if (raiz.getChildAt(i).toString().equalsIgnoreCase("Propiedades")) {
                        nodoPropiedad = (DefaultMutableTreeNode) raiz.getChildAt(i);
                        break;
                    }
                }
                if (nodoPropiedad != null) {
                    DefaultTreeModel modelo = (DefaultTreeModel) arbolSeleccionado.getModel();
                    nodoPropiedad.add(property);
                    modelo.reload();

                    DefaultTreeModel modelArbolGeneral = (DefaultTreeModel) jt_classes.getModel();

                    DefaultMutableTreeNode raizGeneral = (DefaultMutableTreeNode) modelArbolGeneral.getRoot();
                    DefaultMutableTreeNode nodo = null;
                    for (int i = 0; i < raizGeneral.getChildCount(); i++) {
                        DefaultMutableTreeNode temp = (DefaultMutableTreeNode) raizGeneral.getChildAt(i);
                        if (temp.getUserObject() instanceof Clase && raiz.getUserObject() instanceof Clase) {
                            Clase claseGeneral = (Clase) temp.getUserObject();
                            Clase claseSeleccionada = (Clase) raiz.getUserObject();
                            if (claseGeneral.getNombre().equalsIgnoreCase(claseSeleccionada.getNombre())) {
                                nodo = (DefaultMutableTreeNode) raizGeneral.getChildAt(i);
                                break;
                            }
                        }
                    }
                    if (nodo != null) {
                        DefaultMutableTreeNode prop = null;
                        for (int i = 0; i < nodo.getChildCount(); i++) {
                            if (nodo.getChildAt(i).toString().equalsIgnoreCase("Propiedades")) {
                                prop = (DefaultMutableTreeNode) nodo.getChildAt(i);
                                break;
                            }
                        }
                        if (prop != null) {
                            DefaultMutableTreeNode copiaPropiedad = new DefaultMutableTreeNode(property);
                            prop.add(copiaPropiedad);
                            modelArbolGeneral.reload();
                        }
                    }
                    showMessage("Propiedad agregada", "Exito", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            showMessage("Error al agregar variable", "Error!", JOptionPane.WARNING_MESSAGE);
        }
        tf_variableName.setText("");
        typeVariable_jcb.setSelectedIndex(0);
        alcance_jcb.setSelectedIndex(0);
    }//GEN-LAST:event_createVariable_btnMouseClicked

    /*
    * CREATE OPERATION DIALOG
     */

    private void agregarProceso_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarProceso_btnMouseClicked
        DefaultComboBoxModel modeloVariable1 = (DefaultComboBoxModel) var1_jcb.getModel();
        DefaultComboBoxModel modeloVariable2 = (DefaultComboBoxModel) var2_jcb.getModel();
        DefaultComboBoxModel modeloResultado = (DefaultComboBoxModel) resultado_jcb.getModel();
        DefaultListModel listModel = (DefaultListModel) variables_list.getModel();

        if (listModel.getSize() > 0) {
            for (int i = 0; i < listModel.getSize(); i++) {
                if (listModel.getElementAt(i) instanceof Variable) {
                    modeloVariable1.addElement((Variable) listModel.getElementAt(i));
                    modeloVariable2.addElement((Variable) listModel.getElementAt(i));
                    modeloResultado.addElement((Variable) listModel.getElementAt(i));
                }
            }
            showDialog("Crear Operacion", operation_dialog);
        } else {
            showMessage("No hay variables registradas para crear un proceso", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_agregarProceso_btnMouseClicked

    private void cancelarOperacion_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarOperacion_btnMouseClicked
        operation_dialog.dispose();
    }//GEN-LAST:event_cancelarOperacion_btnMouseClicked

    private void guardarOperancion_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarOperancion_btnMouseClicked
        String operador = (String) operador_jcb.getSelectedItem();
        Variable variable1 = (Variable) var1_jcb.getSelectedItem();
        Variable variable2 = (Variable) var2_jcb.getSelectedItem();
        Variable resultado = (Variable) resultado_jcb.getSelectedItem();

        DefaultListModel modeloProcesos = (DefaultListModel) process_list.getModel();
        modeloProcesos.addElement(new Operacion(operador, variable1, variable2, resultado));

        showMessage("Proceso creado exitosamente!", "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_guardarOperancion_btnMouseClicked

    /*
    * CHANGE TOOL EDITOR FUNCTION
     */
    private void editorDiagrama_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editorDiagrama_jmiActionPerformed

        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) jt_classes.getModel().getRoot();
        if (raiz.getChildCount() > 0 || workareaClasses_jp.getComponentCount() > 0) {
            int option = JOptionPane.showConfirmDialog(this, "Tienes Cambios sin guadar!\nDeseas Continuar?", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                window = 1;
                workareaClasses_jp.removeAll();
                codeClasses_jp.removeAll();
                raiz.removeAllChildren();
                ((DefaultTreeModel) jt_classes.getModel()).reload();

                editorDiagrama_jp.setVisible(true);
                classesGenerator_jp.setVisible(false);
                this.setTitle("Nuevo Diagrama - UML Editor");
            }
        } else {
            editorDiagrama_jp.setVisible(true);
            classesGenerator_jp.setVisible(false);
            this.setTitle("Nuevo Diagrama - UML Editor");
        }
    }//GEN-LAST:event_editorDiagrama_jmiActionPerformed

    private void generadorClases_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generadorClases_jmiActionPerformed
        window = 2;
        if (workarea_jp.getComponentCount() > 0) {
            int option = JOptionPane.showConfirmDialog(this, "Tienes Cambios sin guadar!\nDeseas Continuar?", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                workarea_jp.removeAll();
                codeDiagrama_jp.removeAll();
                elementos.clear();
                DefaultListModel modelo = (DefaultListModel) variables_list.getModel();
                modelo.removeAllElements();
                modelo = (DefaultListModel) process_list.getModel();
                modelo.removeAllElements();
                diagramClase_toggleBtn.setSelected(true);
                editorDiagrama_jp.setVisible(false);
                classesGenerator_jp.setVisible(true);
                this.setTitle("Generador de Clases - UML Editor");
            }
        } else {
            diagramClase_toggleBtn.setSelected(true);
            editorDiagrama_jp.setVisible(false);
            classesGenerator_jp.setVisible(true);
            this.setTitle("Generador de Clases - UML Editor");
        }
    }//GEN-LAST:event_generadorClases_jmiActionPerformed

    /*
    * FILE MANAGEMENT FUNCTIONS
     */
    private void newFile_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFile_jmiActionPerformed
        workarea_jp.removeAll();
        actualizarVista(workarea_jp);
        ta_codeDiagrama.setText("");
        elementos.clear();
        DefaultListModel modelo = (DefaultListModel) variables_list.getModel();
        modelo.removeAllElements();
        modelo = (DefaultListModel) process_list.getModel();
        modelo.removeAllElements();

        workareaClasses_jp.removeAll();
        actualizarVista(workareaClasses_jp);
        ta_codeClass.setText("");
        DefaultTreeModel treeModel = (DefaultTreeModel) jt_classes.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) treeModel.getRoot();
        raiz.removeAllChildren();
        treeModel.reload();
    }//GEN-LAST:event_newFile_jmiActionPerformed

    private void openFile_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFile_jmiActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de UML (UMLD, UMLC)", "umld", "umlc"));
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try (FileInputStream fis = new FileInputStream(fileChooser.getSelectedFile())) {
                ObjectInputStream ois = new ObjectInputStream(fis);

                if (fileChooser.getSelectedFile().getAbsolutePath().endsWith(".umld")) {
                    this.setTitle(fileChooser.getSelectedFile().getName() + " - UML Editor");
                    elementos = (ArrayList<FiguraDiagrama>) ois.readObject();
                    cargarElementos();
                } else if (fileChooser.getSelectedFile().getAbsolutePath().endsWith(".umlc")) {
                    this.setTitle(fileChooser.getSelectedFile().getName() + " - UML Editor");
                    DefaultTreeModel model = (DefaultTreeModel) ois.readObject();
                    jt_classes.setModel(model);
                    editorDiagrama_jp.setVisible(false);
                    classesGenerator_jp.setVisible(true);
                }

            } catch (IOException ex) {
                Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_openFile_jmiActionPerformed

    private void saveFile_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFile_jmiActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        switch (window) {
            case 1 -> {
                if (!elementos.isEmpty()) {
                    fileChooser.setFileFilter(new FileNameExtensionFilter("Archivo de Diagrama UML", "umld"));
                } else {
                    showMessage("No tienes nada por guardar!", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            case 2 -> {
                DefaultTreeModel modelo = (DefaultTreeModel) jt_classes.getModel();
                if (hayClases((DefaultMutableTreeNode) modelo.getRoot())) {
                    fileChooser.setFileFilter(new FileNameExtensionFilter("Archivo de Clase UML", "umlc"));

                } else {
                    showMessage("No has creado ninguna clase para guardar!", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            default -> {
                showMessage("No tienes nada por guardar!", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (window == 1) {
                if (!file.getAbsolutePath().endsWith(".umld")) {
                    file = new File(file.getAbsolutePath() + ".umld");
                }
            } else if (window == 2) {
                if (!file.getAbsolutePath().endsWith(".umlc")) {
                    file = new File(file.getAbsolutePath() + ".umlc");
                }
            }

            try (FileOutputStream fos = new FileOutputStream(file)) {
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                if (window == 1) {
                    oos.writeObject(elementos);
                } else if (window == 2) {
                    DefaultTreeModel modelo = (DefaultTreeModel) jt_classes.getModel();
                    oos.writeObject(modelo);
                }
                oos.close();

                showMessage("Archivo guardado\n" + file.getAbsolutePath(), "Guardado", JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_saveFile_jmiActionPerformed

    private boolean hayClases(DefaultMutableTreeNode raiz) {
        return raiz.getChildCount() > 0;
    }

    /*
    * TOGGLE VIEWS
     */
    private void diagram_toggleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagram_toggleBtnMouseClicked
        workarea_jp.setVisible(true);
        codeDiagrama_jp.setVisible(false);
        code_toggleBtn.setSelected(false);
    }//GEN-LAST:event_diagram_toggleBtnMouseClicked

    private void code_toggleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_code_toggleBtnMouseClicked
        workarea_jp.setVisible(false);
        codeDiagrama_jp.setVisible(true);
        diagram_toggleBtn.setSelected(false);
    }//GEN-LAST:event_code_toggleBtnMouseClicked

    private void diagram_toggleBtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_diagram_toggleBtnItemStateChanged
        if (diagram_toggleBtn.isSelected()) {
            diagram_toggleBtn.setBackground(new Color(170, 170, 170, 128));
        } else {
            diagram_toggleBtn.setBackground(new Color(255, 255, 255, 128));
        }
    }//GEN-LAST:event_diagram_toggleBtnItemStateChanged

    private void code_toggleBtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_code_toggleBtnItemStateChanged
        if (code_toggleBtn.isSelected()) {
            code_toggleBtn.setBackground(new Color(170, 170, 170, 128));
        } else {
            code_toggleBtn.setBackground(new Color(255, 255, 255, 128));
        }
    }//GEN-LAST:event_code_toggleBtnItemStateChanged

    private void diagramClase_toggleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagramClase_toggleBtnMouseClicked
        workareaClasses_jp.setVisible(true);
        codeClasses_jp.setVisible(false);
        codeClase_toggleBtn.setSelected(false);
    }//GEN-LAST:event_diagramClase_toggleBtnMouseClicked

    private void codeClase_toggleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codeClase_toggleBtnMouseClicked
        workareaClasses_jp.setVisible(false);
        codeClasses_jp.setVisible(true);
        diagramClase_toggleBtn.setSelected(false);
    }//GEN-LAST:event_codeClase_toggleBtnMouseClicked

    private void diagramClase_toggleBtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_diagramClase_toggleBtnItemStateChanged
        if (diagramClase_toggleBtn.isSelected()) {
            diagramClase_toggleBtn.setBackground(new Color(170, 170, 170, 128));
        } else {
            diagramClase_toggleBtn.setBackground(new Color(255, 255, 255, 128));
        }
    }//GEN-LAST:event_diagramClase_toggleBtnItemStateChanged

    private void codeClase_toggleBtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_codeClase_toggleBtnItemStateChanged
        if (codeClase_toggleBtn.isSelected()) {
            codeClase_toggleBtn.setBackground(new Color(170, 170, 170, 128));
        } else {
            codeClase_toggleBtn.setBackground(new Color(255, 255, 255, 128));
        }
    }//GEN-LAST:event_codeClase_toggleBtnItemStateChanged

    /*
    * EXPORT PDF FUNCTION
     */
    private void exportPdf_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPdf_jmiActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivo PDF (*.pdf)", "pdf"));
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            int ancho = 0;
            int alto = 0;
            JPanel panel = null;
            File file = fileChooser.getSelectedFile();
            if (!file.getAbsolutePath().endsWith(".pdf")) {
                file = new File(file.getAbsolutePath() + ".pdf");
            }
            if (window == 1) {
                ancho = workarea_jp.getWidth();
                alto = workarea_jp.getHeight();
                panel = workarea_jp;
            } else if (window == 2) {
                ancho = workareaClasses_jp.getWidth();
                alto = workareaClasses_jp.getHeight();
                panel = workareaClasses_jp;
            }
            if (panel == null) {
                return;
            }
            try {
                PDDocument doc = new PDDocument();
                PDPage pagina = new PDPage(new PDRectangle(panel.getWidth(), panel.getHeight()));
                doc.addPage(pagina);
                BufferedImage bi = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
                panel.paint(bi.getGraphics());
                File fileImg = new File("imagen.jpg");
                ImageIO.write(bi, "jpg", fileImg);

                PDPageContentStream contentStream = new PDPageContentStream(doc, pagina);
                PDImageXObject img = LosslessFactory.createFromImage(doc, bi);
                contentStream.drawImage(img, 0, 0, panel.getWidth(), panel.getHeight());

                contentStream.close();
                doc.save(file);
                doc.close();
                showMessage("PDF Exportado", "Exportado", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException ex) {
                showMessage("Error al exportar el PDF", "Error", JOptionPane.ERROR_MESSAGE);
            }
            PDDocument doc = new PDDocument();
            PDPage page = new PDPage();
            doc.addPage(page);
        }

    }//GEN-LAST:event_exportPdf_jmiActionPerformed

    /*
    * Classes Generator Functions
     */
    private void createClase_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createClase_btnMouseClicked
        String nombreClase = JOptionPane.showInputDialog(this, "Escribe el nombre de la clase", "Crear Clase", JOptionPane.PLAIN_MESSAGE);
        if (nombreClase == null) {
            return;
        }
        if (nombreClase.trim().length() != 0) {
            DefaultTreeModel modelo = (DefaultTreeModel) jt_classes.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();

            Clase clase = new Clase(nombreClase);
            clases.add(clase);

            DefaultMutableTreeNode nuevaClase = new DefaultMutableTreeNode(clase);
            DefaultMutableTreeNode propiedades = new DefaultMutableTreeNode("Propiedades");
            DefaultMutableTreeNode methods = new DefaultMutableTreeNode("Metodos");

            nuevaClase.add(propiedades);
            nuevaClase.add(methods);

            raiz.add(nuevaClase);
            modelo.reload();
            showMessage("Clase Creada!", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            showMessage("Error al crear la clase\nIntenta de nuevo!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createClase_btnMouseClicked

    private void herencia_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_herencia_btnMouseClicked
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) jt_classes.getModel().getRoot();
        if (raiz.getChildCount() == 1) {
            showMessage("Necesitas otra clase para implementar Herencia!", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultListModel modelClasePadre = (DefaultListModel) parentClass_list.getModel();
            DefaultListModel modelClaseHija = (DefaultListModel) childClass_list.getModel();
            modelClasePadre.clear();
            modelClaseHija.clear();
            for (Clase clase : clases) {
                modelClasePadre.addElement(clase);
                modelClaseHija.addElement(clase);
            }

            showDialog("Aplicar Herencia", herencia_dialog);
        }
    }//GEN-LAST:event_herencia_btnMouseClicked

    private void addToWorkArea_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addToWorkArea_btnMouseClicked
        if (jt_classes.getSelectionPath() == null) {
            showMessage("No has seleccionado ninguna clase!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultMutableTreeNode clase = (DefaultMutableTreeNode) jt_classes.getSelectionPath().getLastPathComponent();
        if (clase.isRoot()) {
            showMessage("No puedes agregar la raiz del arbol al area de trabajo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (clase.getUserObject() instanceof Clase) {
            DefaultMutableTreeNode raiz = new DefaultMutableTreeNode(clase.getUserObject());
            for (int i = 0; i < clase.getChildCount(); i++) {
                DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) clase.getChildAt(i);
                DefaultMutableTreeNode copiaNodo = new DefaultMutableTreeNode(nodo.getUserObject());
                for (int j = 0; j < nodo.getChildCount(); j++) {
                    DefaultMutableTreeNode subnodo = (DefaultMutableTreeNode) nodo.getChildAt(j);
                    copiaNodo.add(new DefaultMutableTreeNode(subnodo.getUserObject()));
                }

                raiz.add(copiaNodo);
            }

            DefaultTreeModel modelo = new DefaultTreeModel(raiz);
            JTree arbolClase = new JTree(modelo);
            JScrollPane scroll = new JScrollPane(arbolClase);
            scroll.setBounds(15, 15, 180, 225);
            actionListeners(scroll, arbolClase);
            workareaClasses_jp.add(scroll);
            actualizarVista(workareaClasses_jp);
        }
    }//GEN-LAST:event_addToWorkArea_btnMouseClicked

    private void actionListeners(JScrollPane scroll, JTree tree) {

        tree.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                arbolSeleccionado = tree;
                workareaClasses_jp.setComponentZOrder(scroll, 0);
                workareaClasses_jp.repaint();
                if (tree.getSelectionPath() == null) {
                    return;
                }
                if (evt.isMetaDown()) {

                    DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();

                    if (nodo.getParent() == null) {
                        addPropiedad_jmi.setVisible(false);
                        eliminarPropiedad_jmi.setVisible(false);
                        addMetodo_jmi.setVisible(false);
                        eliminarMetodo_jmi.setVisible(false);
                        descripcionMetodo_jmi.setVisible(false);
                        descripcion_jmi.setVisible(true);
                        eliminarArbol_jmi.setVisible(true);
                    } else if (nodo.toString().equalsIgnoreCase("Propiedades")) {
                        addPropiedad_jmi.setVisible(true);
                        eliminarPropiedad_jmi.setVisible(false);
                        addMetodo_jmi.setVisible(false);
                        eliminarMetodo_jmi.setVisible(false);
                        descripcionMetodo_jmi.setVisible(false);
                        descripcion_jmi.setVisible(false);
                        eliminarArbol_jmi.setVisible(false);
                    } else if (nodo.getUserObject() instanceof Variable) {
                        addPropiedad_jmi.setVisible(false);
                        eliminarPropiedad_jmi.setVisible(true);
                        addMetodo_jmi.setVisible(false);
                        eliminarMetodo_jmi.setVisible(false);
                        descripcionMetodo_jmi.setVisible(false);
                        descripcion_jmi.setVisible(false);
                        eliminarArbol_jmi.setVisible(false);
                    } else if (nodo.toString().equalsIgnoreCase("Metodos")) {
                        addPropiedad_jmi.setVisible(false);
                        eliminarPropiedad_jmi.setVisible(false);
                        addMetodo_jmi.setVisible(true);
                        eliminarMetodo_jmi.setVisible(false);
                        descripcionMetodo_jmi.setVisible(false);
                        descripcion_jmi.setVisible(false);
                        eliminarArbol_jmi.setVisible(false);
                    } else if (nodo.getUserObject() instanceof Metodo) {
                        addPropiedad_jmi.setVisible(false);
                        eliminarPropiedad_jmi.setVisible(false);
                        addMetodo_jmi.setVisible(false);
                        eliminarMetodo_jmi.setVisible(true);
                        descripcionMetodo_jmi.setVisible(true);
                        descripcion_jmi.setVisible(false);
                        eliminarArbol_jmi.setVisible(false);
                    }
                    clases_jpm.show(tree, evt.getX(), evt.getY());
                } else {
                    return;
                }
            }
        });
    }

    private void applyInheritance_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyInheritance_btnMouseClicked
        DefaultListModel modelClasePadre = (DefaultListModel) parentClass_list.getModel();
        DefaultListModel modelClaseHija = (DefaultListModel) childClass_list.getModel();
        int indicePadre = parentClass_list.getSelectedIndex();
        int indiceHijo = childClass_list.getSelectedIndex();
        if (indicePadre != -1 && indiceHijo != -1) {
            Object objP = modelClasePadre.getElementAt(indicePadre);
            Object objH = modelClaseHija.getElementAt(indiceHijo);

            Clase clasePadre = null;
            Clase claseHija = null;
            if (objP instanceof Clase && objH instanceof Clase) {
                clasePadre = (Clase) objP;
                claseHija = (Clase) objH;
            }

            if (clasePadre == null && claseHija == null) {
                return;
            }
            if (clasePadre == claseHija) {
                showMessage("Elegiste la misma clase!", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }
            for (int i = 0; i < clasePadre.getPropiedades().size(); i++) {
                clasePadre.getPropiedades().get(i).setAlcance("protected");
            }
            claseHija.setClasePadre(clasePadre);

        }
    }//GEN-LAST:event_applyInheritance_btnMouseClicked

    private void addPropiedad_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPropiedad_jmiActionPerformed
        alcance_lbl.setVisible(true);
        alcance_jcb.setVisible(true);
        showDialog("Agregar Propiedad", variables_dialog);
    }//GEN-LAST:event_addPropiedad_jmiActionPerformed

    private void eliminarPropiedad_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPropiedad_jmiActionPerformed
        // 
    }//GEN-LAST:event_eliminarPropiedad_jmiActionPerformed

    private void addMetodo_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMetodo_jmiActionPerformed
        showDialog("Crear Metodo", methods_dialog);
    }//GEN-LAST:event_addMetodo_jmiActionPerformed

    private void eliminarMetodo_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMetodo_jmiActionPerformed
        // ...
    }//GEN-LAST:event_eliminarMetodo_jmiActionPerformed

    private void descripcionMetodo_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionMetodo_jmiActionPerformed
        if (arbolSeleccionado == null) {
            return;
        }
        if (arbolSeleccionado.getSelectionPath() != null) {
            DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) arbolSeleccionado.getSelectionPath().getLastPathComponent();
            if (nodo.getUserObject() instanceof Metodo) {
                Metodo metodo = (Metodo) nodo.getUserObject();
                String descripcion = JOptionPane.showInputDialog(this, "Escribe la descripcion", metodo.getDescripcion());
            }
        } else {
            return;
        }

        showMessage("Se agrego una descripcion al metodo", "Descripcion Cambiada", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_descripcionMetodo_jmiActionPerformed

    private void descripcion_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcion_jmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcion_jmiActionPerformed

    private void eliminarArbol_jmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarArbol_jmiActionPerformed

    }//GEN-LAST:event_eliminarArbol_jmiActionPerformed

    private void paste_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paste_btnMouseClicked
        if (copiaElemento != null) {
            copiaElemento.setX(elementoSeleccionado.getX() + elementoSeleccionado.getIcono().getIconWidth());
            copiaElemento.setY(elementoSeleccionado.getY() + elementoSeleccionado.getIcono().getIconHeight());
            addToWorkArea(copiaElemento);
        }
    }//GEN-LAST:event_paste_btnMouseClicked

    private void jt_classesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_classesMouseClicked
        if (jt_classes.getSelectionPath() == null) {
            return;
        }
        DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) jt_classes.getSelectionPath().getLastPathComponent();
        if (nodo.getUserObject() instanceof Clase) {
            Clase clase = (Clase) nodo.getUserObject();
            if (clase.getClasePadre() != null) {
                deleteHerencia_btn.setVisible(true);
            } else {
                deleteHerencia_btn.setVisible(false);
            }
        }
    }//GEN-LAST:event_jt_classesMouseClicked

    private void deleteHerencia_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteHerencia_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteHerencia_btnMouseClicked

    private void addParametro_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addParametro_btnMouseClicked
        showDialog(parameters_dialog.getTitle(), parameters_dialog);
    }//GEN-LAST:event_addParametro_btnMouseClicked

    private void confirmParametro_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmParametro_btnMouseClicked
        if (tf_parameterName.getText().trim().length() == 0) {
            showMessage("Nombre del Parametro Vacio!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String nombre = tf_parameterName.getText().replace(" ", "");
        String tipo = (String) parameterType_jcb.getSelectedItem();

        parametros.add(new Variable(tipo, nombre));
        showMessage("Parametro agregado!", "Agregado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_confirmParametro_btnMouseClicked

    private void agregarMetodo_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMetodo_btnMouseClicked
        if (tf_nombreMetodo.getText().trim().length() == 0) {
            showMessage("No escribiste un nombrePara el Metodo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String nombre = tf_nombreMetodo.getText().replace(" ", "");
        String retorno = (String) retornoMetodo_jcb.getSelectedItem();
        String alcance = (String) alcanceMetodo_jcb.getSelectedItem();

        Metodo metodo = new Metodo(nombre, retorno, alcance);

        if (!parametros.isEmpty()) {
            metodo.setParametros(parametros);
            parametros.clear();
        }
        agregarEnArbol((DefaultTreeModel) arbolSeleccionado.getModel(), metodo);
        


    }//GEN-LAST:event_agregarMetodo_btnMouseClicked

    private void cancelMethod_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMethod_btnMouseClicked
        methods_dialog.dispose();
    }//GEN-LAST:event_cancelMethod_btnMouseClicked

    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
        }

        java.awt.EventQueue.invokeLater(() -> {
            Screen screen = new Screen();
            screen.setLocationRelativeTo(null);
            screen.setVisible(true);
        });
    }

    /*
    * FUNCTIONS IN SCREEN INTERACTIONS
     */
    private void actualizarVista(JPanel panel) {
        panel.revalidate();
        panel.repaint();
    }

    private FiguraDiagrama encontrarElemento(JLabel label) {
        for (FiguraDiagrama elemento : elementos) {
            if (elemento.getLabel() == label) {
                return elemento;
            }
        }
        return null;
    }

    private void initDragAndDrop(JLabel figura, FiguraDiagrama elemento) {
        figura.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                seleccionarLabel(figura);
                click = evt.getPoint();
            }

            @Override
            public void mouseClicked(MouseEvent evt) {
                seleccionarLabel(figura);
                elementoSeleccionado = encontrarElemento(figura);
            }
        });

        figura.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent evt) {
                Point movedClick = SwingUtilities.convertPoint(evt.getComponent(), evt.getX(), evt.getY(), workarea_jp);
                int posX = movedClick.x - click.x;
                int posY = movedClick.y - click.y;
                posX = setLimits(posX, figura.getWidth(), 0, workarea_jp.getWidth());
                posY = setLimits(posY, figura.getHeight(), 0, workarea_jp.getHeight());
                figura.setLocation(posX, posY);
                elemento.setX(posX);
                elemento.setY(posY);
                actualizarVista(workarea_jp);
            }
        });
    }

    private int setLimits(int valor, int medidaIcono, int min, int max) {
        if (valor < min) {
            return min;
        } else if (valor + medidaIcono > max) {
            return max - medidaIcono;
        } else {
            return valor;
        }
    }

    private void seleccionarLabel(JLabel label) {
        labelSeleccionado = label;
        workarea_jp.setComponentZOrder(labelSeleccionado, 0);
        actualizarVista(workarea_jp);
    }

    private void addToWorkArea(FiguraDiagrama elemento) {
        elemento.initLabel();
        elementos.add(elemento);
        elemento.getLabel().setComponentPopupMenu(elements_jpm);
        initDragAndDrop(elemento.getLabel(), elemento);
        workarea_jp.add(elemento.getLabel());
        actualizarVista(workarea_jp);
    }

    /*
    * FONT AND STYLE JLABEL FUNCTIONS
     */
    private void initFonts(JComboBox comboBox) {
        String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        DefaultComboBoxModel modelo = ((DefaultComboBoxModel) comboBox.getModel());
        for (String fuente : fuentes) {
            modelo.addElement(fuente);
        }
        modelo.setSelectedItem("Arial");
    }

    private void stylishFont() {
        if (labelSeleccionado != null) {
            elementoSeleccionado = encontrarElemento(labelSeleccionado);
            if (elementoSeleccionado != null) {
                Font fuenteElemento = elementoSeleccionado.getFuente();
                if (bold_toggleBtn.isSelected() && italic_toggleBtn.isSelected()) {
                    labelSeleccionado.setFont(new Font(fuenteElemento.getName(), Font.BOLD | Font.ITALIC, fuenteElemento.getSize()));
                } else if (bold_toggleBtn.isSelected() && !italic_toggleBtn.isSelected()) {
                    labelSeleccionado.setFont(new Font(fuenteElemento.getName(), Font.BOLD, fuenteElemento.getSize()));
                } else if (!bold_toggleBtn.isSelected() && italic_toggleBtn.isSelected()) {
                    labelSeleccionado.setFont(new Font(fuenteElemento.getName(), Font.ITALIC, fuenteElemento.getSize()));
                } else {
                    labelSeleccionado.setFont(new Font(fuenteElemento.getName(), Font.PLAIN, fuenteElemento.getSize()));
                }
                fuenteElemento = new Font(fuenteElemento.getName(), labelSeleccionado.getFont().getStyle(), fuenteElemento.getSize());
                elementoSeleccionado.setFuente(fuenteElemento);
            }
        } else {
            bold_toggleBtn.setSelected(false);
            italic_toggleBtn.setSelected(false);
        }
    }

    private void setColorToElement(int option) {
        if (elementoSeleccionado != null) {
            Color color = (Color) JColorChooser.showDialog(this, "Color Picker", Color.WHITE);
            if (option == BACKGROUND_OPTION) {
                labelSeleccionado.setBackground(color);
                elementoSeleccionado.setBackgroundColor(color);
            } else if (option == FOREGROUND_OPTION) {
                labelSeleccionado.setForeground(color);
                elementoSeleccionado.setForegroundColor(color);
            }
        }
    }

    /*
    * INFORMATION FUNCTIONS
     */
    private void showDialog(String title, JDialog dialog) {
        dialog.setTitle(title);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    private void showMessage(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(this, message, title, messageType);
    }

    private void cargarElementos() {
        for (FiguraDiagrama elemento : elementos) {
            JLabel label = elemento.getLabel();
            label.setComponentPopupMenu(elements_jpm);
            initDragAndDrop(label, encontrarElemento(label));
            workarea_jp.add(label);
            actualizarVista(workarea_jp);
        }
    }

    private void agregarEnArbol(DefaultTreeModel modelo, Metodo metodo) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        DefaultMutableTreeNode nodoMetodo = new DefaultMutableTreeNode(metodo);
        DefaultMutableTreeNode padreNodo = null;
        ArrayList<DefaultMutableTreeNode> nodos = new ArrayList();
        for (int i = 0; i < raiz.getChildCount(); i++) {
            if (raiz.getChildAt(i).toString().equals("Metodos")) {
                padreNodo = (DefaultMutableTreeNode) raiz.getChildAt(i);
                if (padreNodo.getChildCount() > 0) {
                    for (int j = 0; j < padreNodo.getChildCount(); j++) {
                        DefaultMutableTreeNode temp = (DefaultMutableTreeNode) padreNodo.getChildAt(j);
                        if (temp.getUserObject() instanceof Metodo) {
                            nodos.add(temp);
                        }
                    }
                }
            }
        }
        
        if (padreNodo != null && nodos.isEmpty()) {
            padreNodo.add(nodoMetodo);
            showMessage("El Metodo fue agregado", "Agregado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            boolean esExistente = false;
            for (DefaultMutableTreeNode nodo : nodos) {
                if (nodo == nodoMetodo) {
                    esExistente = true;
                    break;
                }
            }
            if (!esExistente) {
                padreNodo.add(nodoMetodo);
                showMessage("El Metodo fue agregado", "Agregado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                showMessage("El Metodo ya existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }

        modelo.reload();
    }
    
    private void agregarEnArbol(DefaultTreeModel modelo, Variable propiedad) {
        
    }

    // <editor-fold defaultstate="collapsed" desc="Variables declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addMetodo_jmi;
    private javax.swing.JButton addParametro_btn;
    private javax.swing.JMenuItem addPropiedad_jmi;
    private javax.swing.JButton addToWorkArea_btn;
    private javax.swing.JButton agregarMetodo_btn;
    private javax.swing.JButton agregarProceso_btn;
    private javax.swing.JButton agregarVariable_btn;
    private javax.swing.JComboBox<String> alcanceMetodo_jcb;
    private javax.swing.JComboBox<String> alcance_jcb;
    private javax.swing.JLabel alcance_lbl;
    private javax.swing.JButton applyInheritance_btn;
    private javax.swing.JButton backgroundChooser_btn;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel bgProperty;
    private javax.swing.JToggleButton bold_toggleBtn;
    private javax.swing.JButton cancelCreationVariable_btn;
    private javax.swing.JButton cancelInheritance_btn;
    private javax.swing.JButton cancelMethod_btn;
    private javax.swing.JButton cancelPropertyDialog_btn;
    private javax.swing.JButton cancelarOperacion_btn;
    private javax.swing.JMenuItem changeElementBackground_jmi;
    private javax.swing.JMenuItem changeElementFont_jmi;
    private javax.swing.JMenuItem changeElementForeground_jmi;
    private javax.swing.JMenuItem changeElementText_jmi;
    private javax.swing.JList<String> childClass_list;
    private javax.swing.JPopupMenu clases_jpm;
    private javax.swing.JPanel classesGenerator_jp;
    private javax.swing.JToggleButton codeClase_toggleBtn;
    private javax.swing.JPanel codeClasses_jp;
    private javax.swing.JPanel codeDiagrama_jp;
    private javax.swing.JToggleButton code_toggleBtn;
    private javax.swing.JButton confirmParametro_btn;
    private javax.swing.JPanel controlButtons_jp;
    private javax.swing.JPanel controlClasses_jp;
    private javax.swing.JMenuItem copyElement_jmi;
    private javax.swing.JButton createClase_btn;
    private javax.swing.JButton createVariable_btn;
    private javax.swing.JPanel createVariable_jp;
    private javax.swing.JButton decisionFig_btn;
    private javax.swing.JMenuItem deleteElement_jmi;
    private javax.swing.JButton deleteHerencia_btn;
    private javax.swing.JMenuItem descripcionMetodo_jmi;
    private javax.swing.JMenuItem descripcion_jmi;
    private javax.swing.JToggleButton diagramClase_toggleBtn;
    private javax.swing.JToggleButton diagram_toggleBtn;
    private javax.swing.JMenuItem editorDiagrama_jmi;
    private javax.swing.JPanel editorDiagrama_jp;
    private javax.swing.JMenuItem elementProperties_jmi;
    private javax.swing.JPopupMenu elements_jpm;
    private javax.swing.JMenuItem eliminarArbol_jmi;
    private javax.swing.JMenuItem eliminarMetodo_jmi;
    private javax.swing.JMenuItem eliminarPropiedad_jmi;
    private javax.swing.JMenu exportOptions_jm;
    private javax.swing.JMenuItem exportPdf_jmi;
    private javax.swing.JTabbedPane extras_tabs;
    private javax.swing.JMenu fileOptions_jm;
    private javax.swing.JComboBox<String> fontChooser_jcb;
    private javax.swing.JLabel fontLabel;
    private javax.swing.JLabel fontPropertyLabel;
    private javax.swing.JComboBox<String> fontProperty_jcb;
    private javax.swing.JLabel fontSizePropertyLabel;
    private javax.swing.JSpinner fontSizeProperty_spinner;
    private javax.swing.JSpinner fontSize_spinner;
    private javax.swing.JButton foregroundColor_btn;
    private javax.swing.JLabel foregroundLabel;
    private javax.swing.JLabel foregroundProperty;
    private javax.swing.JMenuBar frameMenu_jmb;
    private javax.swing.JMenuItem generadorClases_jmi;
    private javax.swing.JButton generarCodigo_btn;
    private javax.swing.JButton guardarOperancion_btn;
    private javax.swing.JSpinner heigthLabel_spinner;
    private javax.swing.JLabel heigthPropertyLabel;
    private javax.swing.JButton herencia_btn;
    private javax.swing.JDialog herencia_dialog;
    private javax.swing.JPanel herencia_jp;
    private javax.swing.JToggleButton italic_toggleBtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator js_elementEdition;
    private javax.swing.JPopupMenu.Separator js_elementProperties;
    private javax.swing.JTree jt_classes;
    private javax.swing.JPanel main_jp;
    private javax.swing.JPanel mainarea_jp;
    private javax.swing.JPanel menuClasses_jp;
    private javax.swing.JPanel menuElements_jp;
    private javax.swing.JDialog methods_dialog;
    private javax.swing.JLabel nameParametroLbl;
    private javax.swing.JLabel namePropertyLabel;
    private javax.swing.JMenuItem newFile_jmi;
    private javax.swing.JButton okProperties_btn;
    private javax.swing.JMenuItem openFile_jmi;
    private javax.swing.JPanel operacion_jp;
    private javax.swing.JComboBox<String> operador_jcb;
    private javax.swing.JDialog operation_dialog;
    private javax.swing.JLabel optionsTitle;
    private javax.swing.JComboBox<String> parameterType_jcb;
    private javax.swing.JDialog parameters_dialog;
    private javax.swing.JList<String> parentClass_list;
    private javax.swing.JMenuItem pasteElement_jmi;
    private javax.swing.JButton paste_btn;
    private javax.swing.JButton predefinedProcessFig_btn;
    private javax.swing.JPanel procesos_jp;
    private javax.swing.JButton processFig_btn;
    private javax.swing.JList<String> process_list;
    private javax.swing.JScrollPane processes_scroll;
    private javax.swing.JDialog properties_dialog;
    private javax.swing.JComboBox<String> resultado_jcb;
    private javax.swing.JComboBox<String> retornoMetodo_jcb;
    private javax.swing.JPanel rightSide_jp;
    private javax.swing.JMenuItem saveFile_jmi;
    private javax.swing.JScrollPane scrollClasses;
    private javax.swing.JSeparator separator2_tool;
    private javax.swing.JSeparator separator_tool;
    private javax.swing.JLabel sizeFontLabel;
    private javax.swing.JButton soutFig_btn;
    private javax.swing.JLabel space1_toolLabel;
    private javax.swing.JLabel space2_toolLbl;
    private javax.swing.JTextArea ta_codeClass;
    private javax.swing.JTextArea ta_codeDiagrama;
    private javax.swing.JButton terminalFig_btn;
    private javax.swing.JLabel textPropertyLabel;
    private javax.swing.JTextField tf_nameProperty;
    private javax.swing.JTextField tf_nombreMetodo;
    private javax.swing.JTextField tf_parameterName;
    private javax.swing.JTextField tf_textProperty;
    private javax.swing.JTextField tf_variableName;
    private javax.swing.JMenu tools_jm;
    private javax.swing.JPanel tools_jp;
    private javax.swing.JLabel typeParametroLbl;
    private javax.swing.JLabel typeVariableLabel;
    private javax.swing.JComboBox<String> typeVariable_jcb;
    private javax.swing.JComboBox<String> var1_jcb;
    private javax.swing.JComboBox<String> var2_jcb;
    private javax.swing.JLabel variableLabel;
    private javax.swing.JDialog variables_dialog;
    private javax.swing.JPanel variables_jp;
    private javax.swing.JList<String> variables_list;
    private javax.swing.JScrollPane variables_scroll;
    private javax.swing.JSpinner widthLabel_spinner;
    private javax.swing.JLabel widthProperty;
    private javax.swing.JPanel workareaClasses_jp;
    private javax.swing.JPanel workarea_jp;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
