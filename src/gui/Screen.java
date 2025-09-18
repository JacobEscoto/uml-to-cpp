package gui;

import elementos.FiguraDiagrama;
import elementos.Inicio;
import java.awt.GraphicsEnvironment;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Screen extends JFrame {

    public Screen() {
        initComponents();

        // Iniciar Fonts Disponibles
        DefaultComboBoxModel modeloFuentes = new DefaultComboBoxModel();
        fontChooser_jcb.setModel(modeloFuentes);
        initFonts(fontChooser_jcb);

        // Modelo de Listas (Variables y Procesos)
        DefaultListModel modelVariables = new DefaultListModel();
        variables_list.setModel(modelVariables);

        DefaultListModel modelProcesos = new DefaultListModel();
        process_list.setModel(modelProcesos);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel2 = new javax.swing.JLabel();
        fontChooser_jcb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        fontSize_spinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        separator_tool = new javax.swing.JSeparator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        separator2_tool = new javax.swing.JSeparator();
        foregroundColor_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        backgroundChooser_btn = new javax.swing.JButton();
        workarea_jp = new javax.swing.JPanel();
        frameMenu_jmb = new javax.swing.JMenuBar();
        fileOptions_jm = new javax.swing.JMenu();
        exportOptions_jm = new javax.swing.JMenu();

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

        processFig_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/figuras/siluetas/proceso.png"))); // NOI18N
        processFig_btn.setBorderPainted(false);
        processFig_btn.setContentAreaFilled(false);

        predefinedProcessFig_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/figuras/siluetas/defined_process.png"))); // NOI18N
        predefinedProcessFig_btn.setBorderPainted(false);
        predefinedProcessFig_btn.setContentAreaFilled(false);

        decisionFig_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/figuras/siluetas/decision_rombo.png"))); // NOI18N
        decisionFig_btn.setBorderPainted(false);
        decisionFig_btn.setContentAreaFilled(false);

        soutFig_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/figuras/siluetas/paralelograma.png"))); // NOI18N
        soutFig_btn.setBorderPainted(false);
        soutFig_btn.setContentAreaFilled(false);

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("   Fuente:    ");
        tools_jp.add(jLabel2);

        fontChooser_jcb.setLightWeightPopupEnabled(false);
        fontChooser_jcb.setMaximumSize(new java.awt.Dimension(130, 22));
        fontChooser_jcb.setMinimumSize(new java.awt.Dimension(130, 22));
        fontChooser_jcb.setPreferredSize(new java.awt.Dimension(130, 22));
        tools_jp.add(fontChooser_jcb);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("       Tamaño:   ");
        tools_jp.add(jLabel3);

        fontSize_spinner.setModel(new javax.swing.SpinnerNumberModel(12, 8, 48, 1));
        fontSize_spinner.setMaximumSize(new java.awt.Dimension(90, 22));
        fontSize_spinner.setMinimumSize(new java.awt.Dimension(90, 22));
        fontSize_spinner.setPreferredSize(new java.awt.Dimension(90, 22));
        tools_jp.add(fontSize_spinner);

        jLabel4.setText("    ");
        tools_jp.add(jLabel4);

        separator_tool.setBackground(new java.awt.Color(0, 0, 0));
        separator_tool.setForeground(new java.awt.Color(0, 0, 0));
        separator_tool.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator_tool.setMaximumSize(new java.awt.Dimension(12, 30));
        separator_tool.setMinimumSize(new java.awt.Dimension(12, 30));
        separator_tool.setPreferredSize(new java.awt.Dimension(12, 30));
        tools_jp.add(separator_tool);

        jToggleButton1.setBackground(new java.awt.Color(153, 153, 153));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/bold.png"))); // NOI18N
        jToggleButton1.setBorderPainted(false);
        tools_jp.add(jToggleButton1);

        jLabel5.setText("  ");
        tools_jp.add(jLabel5);

        jToggleButton2.setBackground(new java.awt.Color(153, 153, 153));
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/italic.png"))); // NOI18N
        jToggleButton2.setBorderPainted(false);
        tools_jp.add(jToggleButton2);

        jLabel6.setText("     ");
        tools_jp.add(jLabel6);

        separator2_tool.setBackground(new java.awt.Color(0, 0, 0));
        separator2_tool.setForeground(new java.awt.Color(0, 0, 0));
        separator2_tool.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator2_tool.setMaximumSize(new java.awt.Dimension(12, 30));
        separator2_tool.setMinimumSize(new java.awt.Dimension(12, 30));
        separator2_tool.setPreferredSize(new java.awt.Dimension(12, 30));
        tools_jp.add(separator2_tool);

        foregroundColor_btn.setBackground(new java.awt.Color(0, 0, 0));
        foregroundColor_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/text_color.png"))); // NOI18N
        foregroundColor_btn.setBorder(null);
        foregroundColor_btn.setBorderPainted(false);
        tools_jp.add(foregroundColor_btn);

        jLabel7.setText("   ");
        tools_jp.add(jLabel7);

        backgroundChooser_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/bucket_fill.png"))); // NOI18N
        backgroundChooser_btn.setBorderPainted(false);
        backgroundChooser_btn.setContentAreaFilled(false);
        tools_jp.add(backgroundChooser_btn);

        getContentPane().add(tools_jp, java.awt.BorderLayout.PAGE_START);

        workarea_jp.setBackground(new java.awt.Color(255, 255, 255));
        workarea_jp.setLayout(null);
        getContentPane().add(workarea_jp, java.awt.BorderLayout.CENTER);

        fileOptions_jm.setText("Archivo");
        frameMenu_jmb.add(fileOptions_jm);

        exportOptions_jm.setText("Exportar");
        frameMenu_jmb.add(exportOptions_jm);

        setJMenuBar(frameMenu_jmb);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void initFonts(JComboBox comboBox) {
        String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        DefaultComboBoxModel modelo = ((DefaultComboBoxModel) comboBox.getModel());
        for (String fuente : fuentes) {
            modelo.addElement(fuente);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProceso_btn;
    private javax.swing.JButton agregarVariable_btn;
    private javax.swing.JButton backgroundChooser_btn;
    private javax.swing.JPanel controlButtons_jp;
    private javax.swing.JButton decisionFig_btn;
    private javax.swing.JMenu exportOptions_jm;
    private javax.swing.JTabbedPane extras_tabs;
    private javax.swing.JMenu fileOptions_jm;
    private javax.swing.JComboBox<String> fontChooser_jcb;
    private javax.swing.JSpinner fontSize_spinner;
    private javax.swing.JButton foregroundColor_btn;
    private javax.swing.JMenuBar frameMenu_jmb;
    private javax.swing.JButton generarCodigo_btn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JPanel menuElements_jp;
    private javax.swing.JLabel optionsTitle;
    private javax.swing.JButton predefinedProcessFig_btn;
    private javax.swing.JPanel procesos_jp;
    private javax.swing.JButton processFig_btn;
    private javax.swing.JList<String> process_list;
    private javax.swing.JScrollPane processes_scroll;
    private javax.swing.JSeparator separator2_tool;
    private javax.swing.JSeparator separator_tool;
    private javax.swing.JButton soutFig_btn;
    private javax.swing.JButton terminalFig_btn;
    private javax.swing.JPanel tools_jp;
    private javax.swing.JPanel variables_jp;
    private javax.swing.JList<String> variables_list;
    private javax.swing.JScrollPane variables_scroll;
    private javax.swing.JPanel workarea_jp;
    // End of variables declaration//GEN-END:variables
}
