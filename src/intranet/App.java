/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package intranet;

import db.DataEstudiante;
import java.time.LocalDate;
import model.Estudiante;

/**
 *
 * @author morag
 */
public class App extends javax.swing.JFrame {

    private DataEstudiante dataEstudiante;

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        dataEstudiante = new DataEstudiante();
    }

    
    // https://github.com/muckacid/Intranet.git
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form_new_asignatura = new javax.swing.JFrame();
        form_new_estudiante = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        formNewStudent_panel_name = new javax.swing.JPanel();
        formNewStudent_lbl_nombre = new javax.swing.JLabel();
        form_txt_NewStudent_nombre = new javax.swing.JTextField();
        formNewStudent_lbl_apellido = new javax.swing.JLabel();
        form_txt_NewStudent_apellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        form_txt_NewStudent_telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        form_txt_NewStudent_email = new javax.swing.JTextField();
        formNewStudent_panel_rut = new javax.swing.JPanel();
        form_txt_NewStudent_rut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        form_txt_NewStudent_nacimiento = new javax.swing.JFormattedTextField();
        jPanel14 = new javax.swing.JPanel();
        form_txt_NewStudent_matriculado = new javax.swing.JCheckBox();
        form_btn_NewStudent_guardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        main_btn_filtrar = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        main_menu_nuevo = new javax.swing.JMenu();
        main_menu_nuevo_estudiante = new javax.swing.JMenuItem();
        main_menu_nueva_asignatura = new javax.swing.JMenuItem();

        javax.swing.GroupLayout form_new_asignaturaLayout = new javax.swing.GroupLayout(form_new_asignatura.getContentPane());
        form_new_asignatura.getContentPane().setLayout(form_new_asignaturaLayout);
        form_new_asignaturaLayout.setHorizontalGroup(
            form_new_asignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        form_new_asignaturaLayout.setVerticalGroup(
            form_new_asignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        form_new_estudiante.setSize(new java.awt.Dimension(500, 512));
        form_new_estudiante.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                form_new_estudianteWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nuevo Estudiante");

        formNewStudent_panel_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        formNewStudent_lbl_nombre.setText("Nombre");

        formNewStudent_lbl_apellido.setText("Apellido");

        jLabel6.setText("Telefono");

        jLabel7.setText("Email");

        javax.swing.GroupLayout formNewStudent_panel_nameLayout = new javax.swing.GroupLayout(formNewStudent_panel_name);
        formNewStudent_panel_name.setLayout(formNewStudent_panel_nameLayout);
        formNewStudent_panel_nameLayout.setHorizontalGroup(
            formNewStudent_panel_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formNewStudent_panel_nameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formNewStudent_panel_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(form_txt_NewStudent_email)
                    .addGroup(formNewStudent_panel_nameLayout.createSequentialGroup()
                        .addGroup(formNewStudent_panel_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(form_txt_NewStudent_telefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formNewStudent_panel_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(formNewStudent_panel_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                                .addGroup(formNewStudent_panel_nameLayout.createSequentialGroup()
                                    .addGroup(formNewStudent_panel_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(formNewStudent_lbl_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(form_txt_NewStudent_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(formNewStudent_panel_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(formNewStudent_lbl_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(form_txt_NewStudent_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        formNewStudent_panel_nameLayout.setVerticalGroup(
            formNewStudent_panel_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formNewStudent_panel_nameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formNewStudent_panel_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formNewStudent_lbl_nombre)
                    .addComponent(formNewStudent_lbl_apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formNewStudent_panel_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(form_txt_NewStudent_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(form_txt_NewStudent_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(form_txt_NewStudent_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(form_txt_NewStudent_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        formNewStudent_panel_rut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        form_txt_NewStudent_rut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                form_txt_NewStudent_rutMouseClicked(evt);
            }
        });
        form_txt_NewStudent_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                form_txt_NewStudent_rutActionPerformed(evt);
            }
        });

        jLabel2.setText("RUT");

        jLabel5.setText("Fecha de nacimiento");

        form_txt_NewStudent_nacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y-MM-dd"))));

        javax.swing.GroupLayout formNewStudent_panel_rutLayout = new javax.swing.GroupLayout(formNewStudent_panel_rut);
        formNewStudent_panel_rut.setLayout(formNewStudent_panel_rutLayout);
        formNewStudent_panel_rutLayout.setHorizontalGroup(
            formNewStudent_panel_rutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formNewStudent_panel_rutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formNewStudent_panel_rutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(form_txt_NewStudent_rut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formNewStudent_panel_rutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(form_txt_NewStudent_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formNewStudent_panel_rutLayout.setVerticalGroup(
            formNewStudent_panel_rutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formNewStudent_panel_rutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formNewStudent_panel_rutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formNewStudent_panel_rutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(form_txt_NewStudent_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(form_txt_NewStudent_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        form_txt_NewStudent_matriculado.setText("Matriculado");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(form_txt_NewStudent_matriculado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(form_txt_NewStudent_matriculado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        form_btn_NewStudent_guardar.setText("Guardar");
        form_btn_NewStudent_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                form_btn_NewStudent_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(form_btn_NewStudent_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(formNewStudent_panel_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formNewStudent_panel_rut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formNewStudent_panel_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formNewStudent_panel_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(form_btn_NewStudent_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout form_new_estudianteLayout = new javax.swing.GroupLayout(form_new_estudiante.getContentPane());
        form_new_estudiante.getContentPane().setLayout(form_new_estudianteLayout);
        form_new_estudianteLayout.setHorizontalGroup(
            form_new_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_new_estudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        form_new_estudianteLayout.setVerticalGroup(
            form_new_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_new_estudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            jTable2.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            jTable2.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            jTable2.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Docente");

        jLabel3.setText("Asignatura");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Año");

        jSpinner1.setBorder(null);

        jRadioButton3.setText("Notas");

        jRadioButton4.setText("Asistencia");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox3, 0, 236, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSpinner1))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_btn_filtrar.setText("Buscar");

        main_menu_nuevo.setText("Nuevo");

        main_menu_nuevo_estudiante.setText("Estudiante");
        main_menu_nuevo_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_menu_nuevo_estudianteActionPerformed(evt);
            }
        });
        main_menu_nuevo.add(main_menu_nuevo_estudiante);

        main_menu_nueva_asignatura.setText("Asignatura");
        main_menu_nuevo.add(main_menu_nueva_asignatura);

        menuBar.add(main_menu_nuevo);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(main_btn_filtrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(main_btn_filtrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void main_menu_nuevo_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_menu_nuevo_estudianteActionPerformed
        //cleanFormNewStudent();
        form_txt_NewStudent_rut.setText("ejemplo: 18646384-6");
        form_new_estudiante.setVisible(true);
        main_menu_nuevo_estudiante.setEnabled(false);
        String nombre = "";
        String rut = "";
    }//GEN-LAST:event_main_menu_nuevo_estudianteActionPerformed

    private void form_btn_NewStudent_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_form_btn_NewStudent_guardarActionPerformed
        // Tomar datos
        Estudiante estudiante = new Estudiante();
        estudiante.setRut(form_txt_NewStudent_rut.getText());
        estudiante.setNombre(form_txt_NewStudent_nombre.getText());
        estudiante.setApellido(form_txt_NewStudent_apellido.getText());
        estudiante.setNacimiento(LocalDate.parse(form_txt_NewStudent_nacimiento.getText()));
        estudiante.setTelefono(form_txt_NewStudent_telefono.getText());
        estudiante.setEmail(form_txt_NewStudent_email.getText());
        estudiante.setMatriculado(form_txt_NewStudent_matriculado.isSelected());

        // Manejo de datos
        System.out.println(estudiante);

        dataEstudiante.nuevo(estudiante);

        this.form_new_estudiante.setDefaultCloseOperation(0);
    }//GEN-LAST:event_form_btn_NewStudent_guardarActionPerformed

    private void form_new_estudianteWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_form_new_estudianteWindowClosing
        // Manejo de ventana
        form_new_estudiante.setVisible(false);
        main_menu_nuevo_estudiante.setEnabled(true);
    }//GEN-LAST:event_form_new_estudianteWindowClosing

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void form_txt_NewStudent_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_form_txt_NewStudent_rutActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_form_txt_NewStudent_rutActionPerformed

    private void form_txt_NewStudent_rutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_form_txt_NewStudent_rutMouseClicked
        form_txt_NewStudent_rut.setText("");
    }//GEN-LAST:event_form_txt_NewStudent_rutMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel formNewStudent_lbl_apellido;
    private javax.swing.JLabel formNewStudent_lbl_nombre;
    private javax.swing.JPanel formNewStudent_panel_name;
    private javax.swing.JPanel formNewStudent_panel_rut;
    private javax.swing.JButton form_btn_NewStudent_guardar;
    private javax.swing.JFrame form_new_asignatura;
    private javax.swing.JFrame form_new_estudiante;
    private javax.swing.JTextField form_txt_NewStudent_apellido;
    private javax.swing.JTextField form_txt_NewStudent_email;
    private javax.swing.JCheckBox form_txt_NewStudent_matriculado;
    private javax.swing.JFormattedTextField form_txt_NewStudent_nacimiento;
    private javax.swing.JTextField form_txt_NewStudent_nombre;
    private javax.swing.JTextField form_txt_NewStudent_rut;
    private javax.swing.JTextField form_txt_NewStudent_telefono;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton main_btn_filtrar;
    private javax.swing.JMenuItem main_menu_nueva_asignatura;
    private javax.swing.JMenu main_menu_nuevo;
    private javax.swing.JMenuItem main_menu_nuevo_estudiante;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

    private void cleanFormNewStudent() {
        form_txt_NewStudent_rut.setText("");
        form_txt_NewStudent_nombre.setText("");
        form_txt_NewStudent_apellido.setText("");
        form_txt_NewStudent_nacimiento.setText("");
        form_txt_NewStudent_telefono.setText("");
        form_txt_NewStudent_email.setText("");
    }

}
