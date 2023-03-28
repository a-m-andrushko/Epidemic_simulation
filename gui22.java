package panel1;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class gui22 extends javax.swing.JFrame {

    public gui22() {
        initComponents();
        this.setResizable(false);
        setDefaultCloseOperation(gui22.DISPOSE_ON_CLOSE);
    }

            
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        death_color_btn = new javax.swing.JButton();
        death_color = new javax.swing.JPanel();
        fine_color_btn = new javax.swing.JButton();
        fine_color = new javax.swing.JPanel();
        infected_color = new javax.swing.JPanel();
        infected_color_btn = new javax.swing.JButton();
        cured_color = new javax.swing.JPanel();
        meds_color_btn = new javax.swing.JButton();
        meds_color = new javax.swing.JPanel();
        cured_color_btn = new javax.swing.JButton();
        isolated_color_btn = new javax.swing.JButton();
        isolated_color = new javax.swing.JPanel();
        death_combo = new javax.swing.JComboBox<>();
        fine_combo = new javax.swing.JComboBox<>();
        infect_combo = new javax.swing.JComboBox<>();
        cured_combo = new javax.swing.JComboBox<>();
        meds_combo = new javax.swing.JComboBox<>();
        isolated_combo = new javax.swing.JComboBox<>();
        animation_background_color_btn = new javax.swing.JButton();
        animation_background_color = new javax.swing.JPanel();
        death_shape = new javax.swing.JLabel();
        infected_shape = new javax.swing.JLabel();
        fine_shape = new javax.swing.JLabel();
        cured_shape = new javax.swing.JLabel();
        meds_shape = new javax.swing.JLabel();
        isolated_shape = new javax.swing.JLabel();



        main_panel.setBackground(new java.awt.Color(204, 255, 255));

        death_color_btn.setText("Kolor zmarłych osobników");
        death_color_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                death_color_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout death_colorLayout = new javax.swing.GroupLayout(death_color);
        death_color.setLayout(death_colorLayout);
        death_colorLayout.setHorizontalGroup(
            death_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        death_colorLayout.setVerticalGroup(
            death_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        fine_color_btn.setText("Kolor zdrowych osobników");
        fine_color_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fine_color_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fine_colorLayout = new javax.swing.GroupLayout(fine_color);
        fine_color.setLayout(fine_colorLayout);
        fine_colorLayout.setHorizontalGroup(
            fine_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        fine_colorLayout.setVerticalGroup(
            fine_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout infected_colorLayout = new javax.swing.GroupLayout(infected_color);
        infected_color.setLayout(infected_colorLayout);
        infected_colorLayout.setHorizontalGroup(
            infected_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        infected_colorLayout.setVerticalGroup(
            infected_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        infected_color_btn.setText("Kolor zainfekowanych osobników");
        infected_color_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infected_color_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cured_colorLayout = new javax.swing.GroupLayout(cured_color);
        cured_color.setLayout(cured_colorLayout);
        cured_colorLayout.setHorizontalGroup(
            cured_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cured_colorLayout.setVerticalGroup(
            cured_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

         meds_color_btn.setText("Kolor lekarzy");
         meds_color_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 meds_color_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout meds_colorLayout = new javax.swing.GroupLayout(meds_color);
        meds_color.setLayout(meds_colorLayout);
        meds_colorLayout.setHorizontalGroup(
            meds_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        meds_colorLayout.setVerticalGroup(
            meds_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        cured_color_btn.setText("Kolor Ozdrowieńców");
        cured_color_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cured_color_btnActionPerformed(evt);
            }
        });

        isolated_color_btn.setText("Kolor izolowanych");
        isolated_color_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isolated_color_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout isolated_colorLayout = new javax.swing.GroupLayout(isolated_color);
        isolated_color.setLayout(isolated_colorLayout);
        isolated_colorLayout.setHorizontalGroup(
            isolated_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        isolated_colorLayout.setVerticalGroup(
            isolated_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        death_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Koło", "Kwadrat", "Trójkąt", "Własny wybór" }));
        death_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                death_comboActionPerformed(evt);
            }
        });

        fine_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Koło", "Kwadrat", "Trójkąt", "Własny wybór" }));
        fine_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fine_comboActionPerformed(evt);
            }
        });

        infect_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Koło", "Kwadrat", "Trójkąt", "Własny wybór" }));
        infect_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infect_comboActionPerformed(evt);
            }
        });

        cured_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Koło", "Kwadrat", "Trójkąt", "Własny wybór" }));
        cured_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cured_comboActionPerformed(evt);
            }
        });

        meds_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Koło", "Kwadrat", "Trójkąt", "Własny wybór" }));
        meds_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meds_comboActionPerformed(evt);
            }
        });

        isolated_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Koło", "Kwadrat", "Trójkąt", "Własny wybór" }));
        isolated_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isolated_comboActionPerformed(evt);
            }
        });

        animation_background_color_btn.setText("Kolor tła animacji");
        animation_background_color_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animation_background_color_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout animation_background_colorLayout = new javax.swing.GroupLayout(animation_background_color);
        animation_background_color.setLayout(animation_background_colorLayout);
        animation_background_colorLayout.setHorizontalGroup(
            animation_background_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        animation_background_colorLayout.setVerticalGroup(
            animation_background_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        death_shape.setIcon(new javax.swing.ImageIcon(("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kolo.png"))); // NOI18N

        infected_shape.setIcon(new javax.swing.ImageIcon(("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kolo.png"))); // NOI18N

        fine_shape.setIcon(new javax.swing.ImageIcon(("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kolo.png"))); // NOI18N

        cured_shape.setIcon(new javax.swing.ImageIcon(("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kolo.png"))); // NOI18N

        meds_shape.setIcon(new javax.swing.ImageIcon(("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kolo.png"))); // NOI18N

        isolated_shape.setIcon(new javax.swing.ImageIcon(("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kolo.png"))); // NOI18N

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(isolated_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(meds_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cured_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infected_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fine_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(death_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(animation_background_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent( meds_color_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cured_color_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(isolated_color_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(infected_color_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fine_color_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(death_color_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(death_combo, 0, 207, Short.MAX_VALUE)
                            .addComponent(fine_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(infect_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cured_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(meds_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(isolated_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(animation_background_color_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(death_shape, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(infected_shape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fine_shape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cured_shape)
                    .addComponent(meds_shape)
                    .addComponent(isolated_shape))
                .addGap(24, 24, 24))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(main_panelLayout.createSequentialGroup()
                                        .addContainerGap(18, Short.MAX_VALUE)
                                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(death_shape, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                            .addComponent(death_combo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(death_color_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(death_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fine_color_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fine_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fine_combo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(fine_shape, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(infect_combo)
                                            .addComponent(infected_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(infected_color_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(infected_shape, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cured_combo)
                                            .addComponent(cured_color_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                            .addComponent(cured_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(main_panelLayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cured_shape)))
                                .addGap(6, 6, 6)
                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(meds_combo)
                                    .addComponent( meds_color_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(meds_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(meds_shape)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(isolated_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(isolated_color_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(isolated_combo)))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(isolated_shape)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(animation_background_color_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(animation_background_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }                       

    private void death_color_btnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Color initial_color = Color.white;
        Color color = JColorChooser.showDialog(this,"Wybierz kolor", initial_color);
        death_color.setBackground(color);
        
    }                                        

    private void fine_color_btnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Color initial_color = Color.white;
        Color color = JColorChooser.showDialog(this,"Wybierz kolor", initial_color);
        fine_color.setBackground(color);
    }                                        

    private void infected_color_btnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Color initial_color = Color.white;
        Color color = JColorChooser.showDialog(this,"Wybierz kolor", initial_color);
        infected_color.setBackground(color);
    }                                        

    private void cured_color_btnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Color initial_color = Color.white;
        Color color = JColorChooser.showDialog(this,"Wybierz kolor", initial_color);
        cured_color.setBackground(color);
    }                                        

    private void  meds_color_btnActionPerformed(java.awt.event.ActionEvent evt) {                                         
       Color initial_color = Color.white;
        Color color = JColorChooser.showDialog(this,"Wybierz kolor", initial_color);
        meds_color.setBackground(color);
    }                                        

    private void isolated_color_btnActionPerformed(java.awt.event.ActionEvent evt) {                                         
       Color initial_color = Color.white;
        Color color = JColorChooser.showDialog(this,"Wybierz kolor", initial_color);
        isolated_color.setBackground(color);
    }                                        

    private void death_comboActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String s = (String) death_combo.getSelectedItem();
        switch(s){
            case "Koło":
                death_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kolo.png"));
                break;
            case "Kwadrat":
                death_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kwadrat.png"));
                break;
            case "Trójkąt":
                death_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/trojkat.png"));
                break;
            case "Własny wybór":
            	JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Pliki graficzne", "jpg", "jpeg", "gif", "png"));
                int result = fileChooser.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        Image image = ImageIO.read(file).getScaledInstance(32, 32, Image.SCALE_DEFAULT);
                        
                        ImageIcon icon = new ImageIcon(image);
                        death_shape.setIcon(icon);
                    	} 
                    catch (IOException ex) {
                        ex.printStackTrace();
                    }
                
                }
        }
    }                                          

    private void animation_background_color_btnActionPerformed(java.awt.event.ActionEvent evt) {                                         
       Color initial_color = Color.white;
        Color color = JColorChooser.showDialog(this,"Wybierz kolor", initial_color);
        animation_background_color.setBackground(color);
    }                                        

    private void fine_comboActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String s = (String) fine_combo.getSelectedItem();
        switch(s){
            case "Koło":
                fine_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kolo.png"));
                break;
            case "Kwadrat":
                fine_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kwadrat.png"));
                break;
            case "Trójkąt":
                fine_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/trojkat.png"));
                break;
            case "Własny wybór":
            	JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Pliki graficzne", "jpg", "jpeg", "gif", "png"));
                int result = fileChooser.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        Image image = ImageIO.read(file).getScaledInstance(32, 32, Image.SCALE_DEFAULT);
                        
                        ImageIcon icon = new ImageIcon(image);
                        fine_shape.setIcon(icon);
                    	} 
                    catch (IOException ex) {
                        ex.printStackTrace();
                    }
                
                }
        }
    }                                          

    private void infect_comboActionPerformed(java.awt.event.ActionEvent evt) {                                           
       String s = (String) infect_combo.getSelectedItem();
        switch(s){
            case "Koło":
                infected_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kolo.png"));
                break;
            case "Kwadrat":
                infected_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kwadrat.png"));
                break;
            case "Trójkąt":
                infected_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/trojkat.png"));
                break;
            case "Własny wybór":
            	JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Pliki graficzne", "jpg", "jpeg", "gif", "png"));
                int result = fileChooser.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        Image image = ImageIO.read(file).getScaledInstance(32, 32, Image.SCALE_DEFAULT);
                        
                        ImageIcon icon = new ImageIcon(image);
                        infected_shape.setIcon(icon);
                    	} 
                    catch (IOException ex) {
                        ex.printStackTrace();
                    }
                
                }
        }
    }                                          

    private void cured_comboActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String s = (String) cured_combo.getSelectedItem();
        switch(s){
            case "Koło":
                cured_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kolo.png"));
                break;
            case "Kwadrat":
                cured_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kwadrat.png"));
                break;
            case "Trójkąt":
                cured_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/trojkat.png"));
                break;
            case "Własny wybór":
            	JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Pliki graficzne", "jpg", "jpeg", "gif", "png"));
                int result = fileChooser.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        Image image = ImageIO.read(file).getScaledInstance(32, 32, Image.SCALE_DEFAULT);
                        
                        ImageIcon icon = new ImageIcon(image);
                        cured_shape.setIcon(icon);
                    	} 
                    catch (IOException ex) {
                        ex.printStackTrace();
                    }
                
                }
        }
    }                                          

    private void meds_comboActionPerformed(java.awt.event.ActionEvent evt) {                                           
          String s = (String) meds_combo.getSelectedItem();
        switch(s){
            case "Koło":
                meds_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kolo.png"));
                break;
            case "Kwadrat":
                meds_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kwadrat.png"));
                break;
            case "Trójkąt":
                meds_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/trojkat.png"));
                break;
            case "Własny wybór":
            	JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Pliki graficzne", "jpg", "jpeg", "gif", "png"));
                int result = fileChooser.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        Image image = ImageIO.read(file).getScaledInstance(32, 32, Image.SCALE_DEFAULT);
                        
                        ImageIcon icon = new ImageIcon(image);
                        meds_shape.setIcon(icon);
                    	} 
                    catch (IOException ex) {
                        ex.printStackTrace();
                    }
                
                }
        }
    }                                          

    private void isolated_comboActionPerformed(java.awt.event.ActionEvent evt) {                                           
          String s = (String) isolated_combo.getSelectedItem();
        switch(s){
            case "Koło":
                isolated_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kolo.png"));
                break;
            case "Kwadrat":
                isolated_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/kwadrat.png"));
                break;
            case "Trójkąt":
                isolated_shape.setIcon(new javax.swing.ImageIcon("C:/Users/Konrad/eclipse-workspace/Gui/src/panel1/trojkat.png"));
                break;
            case "Własny wybór":
            	JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Pliki graficzne", "jpg", "jpeg", "gif", "png"));
                int result = fileChooser.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        Image image = ImageIO.read(file).getScaledInstance(32, 32, Image.SCALE_DEFAULT);
                        
                        ImageIcon icon = new ImageIcon(image);
                        isolated_shape.setIcon(icon);
                    	} 
                    catch (IOException ex) {
                        ex.printStackTrace();
                    }
                
                }
        }
    }                                          

    public static void main(String args[]) {
    

  

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui22().setVisible(true);
                
            }
        });
    }
               
    private javax.swing.JButton death_color_btn;
    private javax.swing.JButton fine_color_btn;
    private javax.swing.JButton infected_color_btn;
    private javax.swing.JButton meds_color_btn;
    private javax.swing.JButton cured_color_btn;
    private javax.swing.JButton isolated_color_btn;
    private javax.swing.JButton animation_background_color_btn;
    private javax.swing.JComboBox<String> death_combo;
    private javax.swing.JComboBox<String> fine_combo;
    private javax.swing.JComboBox<String> infect_combo;
    private javax.swing.JComboBox<String> cured_combo;
    private javax.swing.JComboBox<String> meds_combo;
    private javax.swing.JComboBox<String> isolated_combo;
    private javax.swing.JLabel death_shape;
    private javax.swing.JLabel infected_shape;
    private javax.swing.JLabel fine_shape;
    private javax.swing.JLabel cured_shape;
    private javax.swing.JLabel meds_shape;
    private javax.swing.JLabel isolated_shape;
    private javax.swing.JPanel fine_color;
    private javax.swing.JPanel animation_background_color;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel death_color;
    private javax.swing.JPanel infected_color;
    private javax.swing.JPanel cured_color;
    private javax.swing.JPanel meds_color;
    private javax.swing.JPanel isolated_color;
                 
}