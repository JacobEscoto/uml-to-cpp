package gui;

import elementos.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Screen extends JFrame {

    private Point click;
    private JLabel labelSeleccionado = null;
    private FiguraDiagrama elementoSeleccionado = null;
    private FiguraDiagrama copiaElemento = null;
    private final ArrayList<FiguraDiagrama> elementos = new ArrayList();
    private final int BACKGROUND_OPTION = 1;
    private final int FOREGROUND_OPTION = 2;

    public Screen() {
        initComponents();
        this.setTitle("Nuevo Diagrama - " + this.getTitle());

        // Iniciar Fonts Disponibles
        DefaultComboBoxModel modeloFuentes = new DefaultComboBoxModel();
        fontChooser_jcb.setModel(modeloFuentes);
        fontProperty_jcb.setModel(modeloFuentes);
        initFonts(fontChooser_jcb);
        initFonts(fontProperty_jcb);

        // Modelo de Listas (Variables y Procesos)
        DefaultListModel modelVariables = new DefaultListModel();
        variables_list.setModel(modelVariables);

        // Modelo de Spinner Number para Tamaño de Fuente
        SpinnerNumberModel modeloFontSize = new SpinnerNumberModel(12, 8, 48, 1);
        fontSize_spinner.setModel(modeloFontSize);
        fontSizeProperty_spinner.setModel(modeloFontSize);

        DefaultListModel modelProcesos = new DefaultListModel();
        process_list.setModel(modelProcesos);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        workarea_jp = new javax.swing.JPanel();
        frameMenu_jmb = new javax.swing.JMenuBar();
        fileOptions_jm = new javax.swing.JMenu();
        newFile_jmi = new javax.swing.JMenuItem();
        openFile_jmi = new javax.swing.JMenuItem();
        saveFile_jmi = new javax.swing.JMenuItem();
        exportOptions_jm = new javax.swing.JMenu();

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

        properties_dialog.setMaximumSize(new java.awt.Dimension(372, 375));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UML Editor");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        menuElements_jp.setBackground(new java.awt.Color(204, 204, 204));
        menuElements_jp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(51, 51, 51)));
        menuElements_jp.setMaximumSize(new java.awt.Dimension(210, 497));
        menuElements_jp.setMinimumSize(new java.awt.Dimension(210, 497));
        menuElements_jp.setPreferredSize(new java.awt.Dimension(210, 497));

        optionsTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        optionsTitle.setForeground(new java.awt.Color(0, 0, 0));
        optionsTitle.setText("  OPCIONES --------------------");

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
                .addComponent(optionsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(menuElements_jpLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(menuElements_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(predefinedProcessFig_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(processFig_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(terminalFig_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(decisionFig_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soutFig_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
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
                .addContainerGap(129, Short.MAX_VALUE))
        );

        getContentPane().add(menuElements_jp, java.awt.BorderLayout.LINE_START);

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

        javax.swing.GroupLayout variables_jpLayout = new javax.swing.GroupLayout(variables_jp);
        variables_jp.setLayout(variables_jpLayout);
        variables_jpLayout.setHorizontalGroup(
            variables_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(variables_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(variables_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(variables_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, variables_jpLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(agregarVariable_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        variables_jpLayout.setVerticalGroup(
            variables_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(variables_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(variables_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarVariable_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        extras_tabs.addTab("Variables", variables_jp);

        procesos_jp.setBackground(new java.awt.Color(204, 204, 204));

        processes_scroll.setViewportView(process_list);

        agregarProceso_btn.setBackground(new java.awt.Color(102, 102, 102));
        agregarProceso_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agregarProceso_btn.setForeground(new java.awt.Color(0, 0, 0));
        agregarProceso_btn.setText("Agregar");
        agregarProceso_btn.setBorderPainted(false);

        javax.swing.GroupLayout procesos_jpLayout = new javax.swing.GroupLayout(procesos_jp);
        procesos_jp.setLayout(procesos_jpLayout);
        procesos_jpLayout.setHorizontalGroup(
            procesos_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(procesos_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(procesos_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(processes_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, procesos_jpLayout.createSequentialGroup()
                        .addGap(0, 85, Short.MAX_VALUE)
                        .addComponent(agregarProceso_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        procesos_jpLayout.setVerticalGroup(
            procesos_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(procesos_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(processes_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarProceso_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        extras_tabs.addTab("Procesos", procesos_jp);

        getContentPane().add(extras_tabs, java.awt.BorderLayout.LINE_END);

        controlButtons_jp.setBackground(new java.awt.Color(204, 204, 204));
        controlButtons_jp.setMaximumSize(new java.awt.Dimension(1280, 50));
        controlButtons_jp.setMinimumSize(new java.awt.Dimension(1280, 50));
        controlButtons_jp.setPreferredSize(new java.awt.Dimension(1280, 50));

        generarCodigo_btn.setBackground(new java.awt.Color(102, 102, 102));
        generarCodigo_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        generarCodigo_btn.setForeground(new java.awt.Color(0, 0, 0));
        generarCodigo_btn.setText("Generar Codigo");
        generarCodigo_btn.setBorderPainted(false);

        javax.swing.GroupLayout controlButtons_jpLayout = new javax.swing.GroupLayout(controlButtons_jp);
        controlButtons_jp.setLayout(controlButtons_jpLayout);
        controlButtons_jpLayout.setHorizontalGroup(
            controlButtons_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlButtons_jpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generarCodigo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(570, 570, 570))
        );
        controlButtons_jpLayout.setVerticalGroup(
            controlButtons_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlButtons_jpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generarCodigo_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(controlButtons_jp, java.awt.BorderLayout.PAGE_END);

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

        getContentPane().add(tools_jp, java.awt.BorderLayout.PAGE_START);

        workarea_jp.setBackground(new java.awt.Color(255, 255, 255));
        workarea_jp.setLayout(null);
        getContentPane().add(workarea_jp, java.awt.BorderLayout.CENTER);

        fileOptions_jm.setText("Archivo");

        newFile_jmi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newFile_jmi.setText("Nuevo");
        fileOptions_jm.add(newFile_jmi);

        openFile_jmi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openFile_jmi.setText("Abrir");
        fileOptions_jm.add(openFile_jmi);

        saveFile_jmi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveFile_jmi.setText("Guardar");
        fileOptions_jm.add(saveFile_jmi);

        frameMenu_jmb.add(fileOptions_jm);

        exportOptions_jm.setText("Exportar");
        frameMenu_jmb.add(exportOptions_jm);

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
            System.out.println("label: " + labelSeleccionado.getFont().getSize());
            System.out.println("Elemento: " + elementoSeleccionado.getFuente().getSize());
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
        showDialog("Elemento " + labelSeleccionado.getName() + " - Propiedades", properties_dialog, elementoSeleccionado);
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

    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Screen screen = new Screen();
                screen.setLocationRelativeTo(null);
                screen.setVisible(true);

            }
        });
    }

    /*
    * FUNCTIONS IN SCREEN INTERACTIONS
     */
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
                Point movedClick = SwingUtilities.convertPoint(evt.getComponent(), evt.getPoint(), workarea_jp);
                int posX = movedClick.x - click.x;
                int posY = movedClick.y - click.y;
                posX = setLimits(posX, figura.getWidth(), 0, workarea_jp.getWidth());
                posY = setLimits(posY, figura.getHeight(), 0, workarea_jp.getHeight());
                figura.setLocation(posX, posY);
                elemento.setX(posX);
                elemento.setY(posY);
                workarea_jp.repaint();
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
        workarea_jp.repaint();
    }

    private void addToWorkArea(FiguraDiagrama elemento) {
        elemento.initLabel();
        elementos.add(elemento);
        elemento.getLabel().setComponentPopupMenu(elements_jpm);
        initDragAndDrop(elemento.getLabel(), elemento);
        workarea_jp.add(elemento.getLabel());
        workarea_jp.revalidate();
        workarea_jp.repaint();
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
    * SHOW INFORMATION FUNCTIONS
     */
    private void showDialog(String title, JDialog dialog, FiguraDiagrama elemento) {
        dialog.setTitle(title);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProceso_btn;
    private javax.swing.JButton agregarVariable_btn;
    private javax.swing.JButton backgroundChooser_btn;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel bgProperty;
    private javax.swing.JToggleButton bold_toggleBtn;
    private javax.swing.JButton cancelPropertyDialog_btn;
    private javax.swing.JMenuItem changeElementBackground_jmi;
    private javax.swing.JMenuItem changeElementFont_jmi;
    private javax.swing.JMenuItem changeElementForeground_jmi;
    private javax.swing.JMenuItem changeElementText_jmi;
    private javax.swing.JPanel controlButtons_jp;
    private javax.swing.JMenuItem copyElement_jmi;
    private javax.swing.JButton decisionFig_btn;
    private javax.swing.JMenuItem deleteElement_jmi;
    private javax.swing.JMenuItem elementProperties_jmi;
    private javax.swing.JPopupMenu elements_jpm;
    private javax.swing.JMenu exportOptions_jm;
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
    private javax.swing.JButton generarCodigo_btn;
    private javax.swing.JSpinner heigthLabel_spinner;
    private javax.swing.JLabel heigthPropertyLabel;
    private javax.swing.JToggleButton italic_toggleBtn;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator js_elementEdition;
    private javax.swing.JPopupMenu.Separator js_elementProperties;
    private javax.swing.JPanel menuElements_jp;
    private javax.swing.JLabel namePropertyLabel;
    private javax.swing.JMenuItem newFile_jmi;
    private javax.swing.JButton okProperties_btn;
    private javax.swing.JMenuItem openFile_jmi;
    private javax.swing.JLabel optionsTitle;
    private javax.swing.JMenuItem pasteElement_jmi;
    private javax.swing.JButton predefinedProcessFig_btn;
    private javax.swing.JPanel procesos_jp;
    private javax.swing.JButton processFig_btn;
    private javax.swing.JList<String> process_list;
    private javax.swing.JScrollPane processes_scroll;
    private javax.swing.JDialog properties_dialog;
    private javax.swing.JMenuItem saveFile_jmi;
    private javax.swing.JSeparator separator2_tool;
    private javax.swing.JSeparator separator_tool;
    private javax.swing.JLabel sizeFontLabel;
    private javax.swing.JButton soutFig_btn;
    private javax.swing.JLabel space1_toolLabel;
    private javax.swing.JLabel space2_toolLbl;
    private javax.swing.JButton terminalFig_btn;
    private javax.swing.JLabel textPropertyLabel;
    private javax.swing.JTextField tf_nameProperty;
    private javax.swing.JTextField tf_textProperty;
    private javax.swing.JPanel tools_jp;
    private javax.swing.JPanel variables_jp;
    private javax.swing.JList<String> variables_list;
    private javax.swing.JScrollPane variables_scroll;
    private javax.swing.JSpinner widthLabel_spinner;
    private javax.swing.JLabel widthProperty;
    private javax.swing.JPanel workarea_jp;
    // End of variables declaration//GEN-END:variables
}
