package caesar;

import java.awt.Desktop;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class frame extends javax.swing.JFrame {
    
    String name = "Caesar",ver = "1.6", author = "Piotr J. Węgrzyn";
    ImageIcon icon;
    URL iconURL;
    
    public frame() {
        iconURL = getClass().getResource("icon.png");
        icon = new ImageIcon(iconURL);
        //frame.setIconImage(icon.getImage());
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jFileChooser3 = new javax.swing.JFileChooser();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jSlider3 = new javax.swing.JSlider();
        jSlider4 = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jFileChooser1.setApproveButtonText("Importuj");
        jFileChooser1.setApproveButtonToolTipText("Importuj plik");
        jFileChooser1.setCurrentDirectory(null);
        jFileChooser1.setDialogTitle("Importuj plik .caesar");
        jFileChooser1.setFileFilter(new FilterForCaesar());

        jFileChooser2.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        jFileChooser2.setApproveButtonText("Eksportuj");
        jFileChooser2.setApproveButtonToolTipText("Eksportuj do pliku");
        jFileChooser2.setCurrentDirectory(null);
        jFileChooser2.setDialogTitle("Eksportuj do pliku .caesar");

        jFileChooser3.setApproveButtonText("Otwórz");
        jFileChooser3.setApproveButtonToolTipText("Otwórz wybrany plik");
        jFileChooser3.setDialogTitle("Otwórz plik .txt");
        jFileChooser3.setFileFilter(new FilterForTxt());
        jFileChooser3.getAccessibleContext().setAccessibleName("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(name);
        setIconImage(icon.getImage());
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jSlider1.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jSlider1.setMajorTickSpacing(3);
        jSlider1.setMaximum(25);
        jSlider1.setMinimum(1);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setValue(1);
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSlider1.setValueIsAdjusting(true);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Wybierz przesunięcie autorskie:");

        jButton2.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jButton2.setText("  Szyfruj  ");
        jButton2.setPreferredSize(new java.awt.Dimension(84, 37));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jButton3.setText("Deszyfruj");
        jButton3.setPreferredSize(new java.awt.Dimension(84, 37));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Podaj tekst:");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Wynik:");

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Wybierz przesunięcie Cezara liter:");

        jSlider2.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jSlider2.setMajorTickSpacing(1);
        jSlider2.setMaximum(5);
        jSlider2.setMinimum(1);
        jSlider2.setMinorTickSpacing(1);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setSnapToTicks(true);
        jSlider2.setValue(1);
        jSlider2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSlider2.setValueIsAdjusting(true);

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Wybierz przesunięcie Cezara cyfr:");

        jSlider3.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jSlider3.setMajorTickSpacing(1);
        jSlider3.setMaximum(9);
        jSlider3.setMinimum(1);
        jSlider3.setMinorTickSpacing(1);
        jSlider3.setPaintLabels(true);
        jSlider3.setPaintTicks(true);
        jSlider3.setSnapToTicks(true);
        jSlider3.setValue(1);
        jSlider3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSlider3.setValueIsAdjusting(true);

        jSlider4.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jSlider4.setMajorTickSpacing(1);
        jSlider4.setMaximum(10);
        jSlider4.setMinimum(2);
        jSlider4.setMinorTickSpacing(1);
        jSlider4.setPaintLabels(true);
        jSlider4.setPaintTicks(true);
        jSlider4.setSnapToTicks(true);
        jSlider4.setValue(2);
        jSlider4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSlider4.setValueIsAdjusting(true);

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Wybierz okres szyfrowania przestawieniowego:");

        jButton4.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jButton4.setText("Importuj klucz szyfrowania");
        jButton4.setPreferredSize(new java.awt.Dimension(84, 37));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jButton5.setText("Eksportuj klucz szyfrowania");
        jButton5.setPreferredSize(new java.awt.Dimension(84, 37));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });

        jMenuBar1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/tools.png"))); // NOI18N
        jMenu1.setText("Plik");
        jMenu1.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/locked.png"))); // NOI18N
        jMenuItem5.setText("Szyfruj");
        jMenuItem5.setToolTipText("Zaszyfruj podany tekst");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/unlocked.png"))); // NOI18N
        jMenuItem6.setText("Deszyfruj");
        jMenuItem6.setToolTipText("Odszyfruj podany tekst");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator2);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/attachment.png"))); // NOI18N
        jMenuItem8.setText("Otwórz plik .txt");
        jMenuItem8.setToolTipText("Otwórz plik tekstowy");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/right_arrow.png"))); // NOI18N
        jMenuItem12.setText("Zapisz do pliku .txt");
        jMenuItem12.setToolTipText("Zapisz jako plik tekstowy");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);
        jMenu1.add(jSeparator3);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/down_arrow.png"))); // NOI18N
        jMenuItem7.setText("Importuj");
        jMenuItem7.setToolTipText("Importuj zaszyfrowany plik");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/up_arrow.png"))); // NOI18N
        jMenuItem1.setText("Eksportuj");
        jMenuItem1.setToolTipText("Eksportuj zaszyfrowany tekst");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/delete.png"))); // NOI18N
        jMenuItem2.setText("Wyjdź");
        jMenuItem2.setToolTipText("Zamknij program");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);
        jMenu1.getAccessibleContext().setAccessibleDescription("");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/settings.png"))); // NOI18N
        jMenu3.setText("Szyfr");
        jMenu3.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N

        jCheckBoxMenuItem1.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Cezara (liter)");
        jCheckBoxMenuItem1.setToolTipText("Szyfrowanie liter algorytmem Cezara");
        jMenu3.add(jCheckBoxMenuItem1);
        jCheckBoxMenuItem1.getAccessibleContext().setAccessibleDescription("");

        jCheckBoxMenuItem3.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Cezara (cyfr)");
        jCheckBoxMenuItem3.setToolTipText("Szyfrowanie cyfr algorytmem Cezara");
        jMenu3.add(jCheckBoxMenuItem3);

        jCheckBoxMenuItem2.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Autorski");
        jCheckBoxMenuItem2.setToolTipText("Szyfrowanie systemem autorskim");
        jMenu3.add(jCheckBoxMenuItem2);
        jCheckBoxMenuItem2.getAccessibleContext().setAccessibleDescription("");

        jCheckBoxMenuItem4.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("Przestawieniowy");
        jCheckBoxMenuItem4.setToolTipText("Szyfrowanie przestawieniowe");
        jMenu3.add(jCheckBoxMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/key.png"))); // NOI18N
        jMenu4.setText("Klucze");
        jMenu4.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/down_arrow.png"))); // NOI18N
        jMenuItem9.setText("Importuj klucz");
        jMenuItem9.setToolTipText("Importuj klucz szyfrowania");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/up_arrow.png"))); // NOI18N
        jMenuItem10.setText("Eksportuj klucz");
        jMenuItem10.setToolTipText("Eksportuj klucz szyfrowania");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);
        jMenu4.add(jSeparator5);

        jMenuItem11.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/info.png"))); // NOI18N
        jMenuItem11.setText("Jak działają klucze?");
        jMenuItem11.setToolTipText("Wyświetl informacje o kluczach szyfrowania");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);
        jMenuItem11.getAccessibleContext().setAccessibleDescription("");

        jMenuBar1.add(jMenu4);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/info.png"))); // NOI18N
        jMenu2.setText("Info");
        jMenu2.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/tag.png"))); // NOI18N
        jMenuItem4.setText("Ikony");
        jMenuItem4.setToolTipText("Wyświetl informacje o autorach ikon");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caesar/icons/info.png"))); // NOI18N
        jMenuItem3.setText("O programie");
        jMenuItem3.setToolTipText("Wyświetl informacje o autorze programu");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSlider2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSlider4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jSlider1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // ACTION PERFORMERS
   
    // ABOUT
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Object[] options = { "OK","Strona autora", "Napisz email" };
        int choice = JOptionPane.showOptionDialog(null, name + " " + ver + "\nProgram (z wyłączeniem ikon) na licencji GNU GPL v3\nAutor: " + author, "O programie", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        Desktop desktop;
        if(choice == JOptionPane.CANCEL_OPTION && (Desktop.isDesktopSupported() && (desktop = Desktop.getDesktop()).isSupported(Desktop.Action.MAIL))) {
            URI mailto;
            try {
                mailto = new URI("mailto:piotr@wegrzyn.dev?subject=" + name + "%20" + ver + "%20-%20Opinia");
                desktop.mail(mailto);
            } catch (URISyntaxException | IOException ex) {
            }
        }
        if(choice == JOptionPane.NO_OPTION && Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("https://piotr.wegrzyn.dev/"));
            } catch (URISyntaxException | IOException ex) {
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    
    // EXIT
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    
    // EXPORT FILE
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        exporter(readFromTextArea(2), ".caesar");
    }//GEN-LAST:event_jMenuItem1ActionPerformed
        
    // ICONS
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Object[] options = { "OK", "Strona Dryicons" };
        int choice = JOptionPane.showOptionDialog(null, "Wykorzystane ikony są autorstwa Dryicons", "Ikony", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
        if(choice == JOptionPane.NO_OPTION) {
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().browse(new URI("http://dryicons.com/icon-packs/stylistica-icons-set"));
                } catch (URISyntaxException | IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed
        
    // SHIFT
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        shifter(getIntFromSlider(1), getIntFromSlider(2), getIntFromSlider(3), getIntFromSlider(4));
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    // DESHIFT
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        deshifter((26 - getIntFromSlider(1)),getIntFromSlider(2), 10 - getIntFromSlider(3), getIntFromSlider(4));
    }//GEN-LAST:event_jMenuItem6ActionPerformed
        
    // IMPORT FILE
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        String text = importer();
        if(!text.isEmpty()) {
            jTextArea1.setText(text);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    // OPENING TXT FILES
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        int returnVal = jFileChooser3.showOpenDialog(this);
        
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser3.getSelectedFile();

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
                String line, text = "";
                int x = 1, quantity = 0;                
                while (br.readLine() != null) {
                    quantity++;
                }
                br.close();
                br = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
                while ((line = br.readLine()) != null) {
                    // process line
                    if(quantity != x) {
                        text = text + line + "\n";
                    }
                    else {
                        text = text + line;
                    }
                    x++;
                }
                jTextArea1.setText(text);
                br.close();
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    // KEYS ABOUT
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        JOptionPane.showMessageDialog(null, "Klucz szyfrowania to specjalny ciąg znaków, mówiący o konfiguracji algorytmów szyfrujących.\nKlucze programu "+ name + " mają rozszerzenie .caesar (takie samo jak eksportowane pliki).", "Jak działają klucze?", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem11ActionPerformed
    
    // IMPORT KEY
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        
        String imported = importer();
        
        if(!"".equals(imported)) {
            String[] values = imported.split("-");

            if(keyChecker(values) == true) {
                putKey(values);
            } else {
                showKeyImporterError();
            }
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    // EXPORT KEY
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        exporter(doKey(), ".caesar");
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    // SAVING AS TXT
    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        Object[] options = { ".caesar",".txt", "Anuluj" };
        int choice = JOptionPane.showOptionDialog(null,"Zaszyfrowany tekst może być źle kodowany w plikach .txt.\nPolecane rozszerzenie to .caesar. Jaki format wybrać?", "Ostrzeżenie", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if(choice == JOptionPane.YES_OPTION) {
            exporter(readFromTextArea(2), ".caesar");
        }
        if(choice == JOptionPane.NO_OPTION) {
            exporter(readFromTextArea(2), ".txt");
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed
    
    // MAIN
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }
    
    // FUNCTIONS
    
    // slider value setter
    private void setIntOnSlider(int s, int v) {
        switch(s) {
            case 1:
                jSlider1.setValue(v);
            case 2:
                jSlider2.setValue(v);
            case 3:
                jSlider3.setValue(v);
            case 4:
                jSlider4.setValue(v);
        }
    }
    
    // checkboxes value setter
    private void setCheckBox(int s, boolean v) {
        switch(s) {
            case 1:
                jCheckBoxMenuItem1.setSelected(v);
            case 2:
                jCheckBoxMenuItem2.setSelected(v);
            case 3:
                jCheckBoxMenuItem3.setSelected(v);
            case 4:
                jCheckBoxMenuItem4.setSelected(v);
        }
    }
    
    // slider value getter
    private int getIntFromSlider(int s) {
        switch(s) {
            case 1:
                return jSlider1.getValue();
            case 2:
                return jSlider2.getValue();
            case 3:
                return jSlider3.getValue();
            case 4:
                return jSlider4.getValue();
            default:
                return 0;
        }
    }
    
    // text getter
    private String readFromTextArea(int option) {
        switch(option) {
            case 1:
                return jTextArea1.getText();
            case 2:
                return jTextArea2.getText();
            default:
                return "e";
        }
    }
    
    // shifting text from text area
    private void shifter(int shift1, int shift2, int shift3, int shift4) {
        String contentInTextArea = readFromTextArea(1);
        
        contentInTextArea = algorithmCaesar(shift1, contentInTextArea.toCharArray());
        contentInTextArea = algorithmNumbers(shift3, contentInTextArea.toCharArray());
        contentInTextArea = algorithmAuthory(shift2, contentInTextArea.toCharArray(), true);
        contentInTextArea = algorithmInvert(shift4, contentInTextArea.toCharArray());
        
        jTextArea2.setText(contentInTextArea);
    }
    
    // deshifting text from text area
    private void deshifter(int shift1, int shift2, int shift3, int shift4) {
        String contentInTextArea = readFromTextArea(1);
        
        contentInTextArea = algorithmInvert(shift4, contentInTextArea.toCharArray());
        contentInTextArea = algorithmAuthory(shift2, contentInTextArea.toCharArray(), false);
        contentInTextArea = algorithmNumbers(shift3, contentInTextArea.toCharArray());
        contentInTextArea = algorithmCaesar(shift1, contentInTextArea.toCharArray());
        
        jTextArea2.setText(contentInTextArea);
    }
    
    // letters in Caesar's alghorithm
    private String algorithmCaesar(int shift, char[] array) {
        if(jCheckBoxMenuItem1.isSelected()) {
            for(int i=0; i<array.length; i++) {

                int valueOfChar = (int) array[i];
                
                // duże litery
                if((valueOfChar >= 65) && (valueOfChar <= 90)) {

                    array[i] = (char) (valueOfChar + shift);

                    if(90 < (int) array[i]) {
                        array[i] = (char) ((int) array[i] - 26);
                    }
                }

                // małe litery
                if((valueOfChar >= 97) && (valueOfChar <= 122)) {

                    array[i] = (char) (valueOfChar + shift);

                    if(122 < (int) array[i]) {
                        array[i] = (char) ((int) array[i] - 26);
                    }
                }
            }
        }
        return String.valueOf(array);
    }

    // authory algorithm
    private String algorithmAuthory(int shift, char[] array, boolean auth) {
        if(jCheckBoxMenuItem2.isSelected()) {
            int j = shift*(-1);
            for(int i=0; i<array.length; i++) {
                int valueOfChar = (int) array[i];
                j++;
                if(valueOfChar != 10) {
                    if(auth) {
                        array[i] = (char) (valueOfChar + j);
                    }
                    else {
                        array[i] = (char) (valueOfChar - j);
                    }
                }
                if(j >= shift) {
                    j = shift*(-1);
                }
            }
        }
        return String.valueOf(array);
    }
    
    // numbers in Caesar's alghorithm
    private String algorithmNumbers(int shift, char[] array) {
        if(jCheckBoxMenuItem3.isSelected()) {
            for(int i=0; i<array.length; i++) {

                int valueOfChar = (int) array[i];
        
                // cyferki
                if((valueOfChar >= 48) && (valueOfChar <= 57)) {
                    
                    array[i] = (char) (valueOfChar + shift);

                    if(57 < (int) array[i]) {
                        array[i] = (char) ((int) array[i] - 10);
                    }
                }
            }
        }
        return String.valueOf(array);
    }
    
    // invert algorithm
    private String algorithmInvert(int shift, char[] array) {
        if(jCheckBoxMenuItem4.isSelected()) {
            
            int longness = array.length;
            
            int operations = longness/shift;

            for(int i = 0; i<operations; i++) {
                for(int j = 0; j<shift/2; j++) {
                    char a = array[(i*shift)+j];
                    array[(i*shift)+j] = array[shift*(i+1)-j-1];
                    array[shift*(i+1)-j-1] = a;
                }
            }            
        }
        return String.valueOf(array);
    }
    
    // key maker
    private String doKey() {
        String valA, val1="00", val2="00", val3="00", val4="00";
        
        Random rand = new Random();
        int a = rand.nextInt(101) + 1;
        valA = Integer.toHexString(a);
        
        if(jCheckBoxMenuItem1.isSelected()) {
            val1 = Integer.toHexString(a*getIntFromSlider(1));
        }
        if(jCheckBoxMenuItem2.isSelected()) {
            val2 = Integer.toHexString(a*getIntFromSlider(2));
        }
        if(jCheckBoxMenuItem3.isSelected()) {
            val3 = Integer.toHexString(a*getIntFromSlider(3));
        }
        if(jCheckBoxMenuItem4.isSelected()) {
            val4 = Integer.toHexString(a*getIntFromSlider(4));
        }
        return (valA + "-" +val1 + "-" + val2 + "-" + val3 + "-" + val4);
    }
    
    // text exporter for .caesar files
    private void exporter(String text, String extension) {
        int returnval = jFileChooser2.showSaveDialog(null);
        if (returnval == JFileChooser.APPROVE_OPTION) {
            try {
                OutputStreamWriter co = new OutputStreamWriter(new FileOutputStream(jFileChooser2.getSelectedFile()+extension), Charset.forName("UTF-8").newEncoder());
                co.write(text);
                co.close();
                JOptionPane.showMessageDialog(null, "Wyeksportowano pomyślnie!", "Udało się!", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problem przy eksporcie", "Nie udało się", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    // text importer for .caesar files
    private String importer() {
        int returnVal = jFileChooser1.showOpenDialog(this);
        String text = "";
        
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
            
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), Charset.forName("UTF-8").newDecoder()));
                String line;
                int x = 1, quantity = 0;
                
                while (br.readLine() != null) {
                    quantity++;
                }
                br.close();
                br = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), Charset.forName("UTF-8").newDecoder()));
                while ((line = br.readLine()) != null) {
                    // process line
                    if(quantity != x) {
                        text = text + line + "\n";
                    }
                    else {
                        text = text + line;
                    }
                    x++;
                }
                br.close();
            } catch (IOException ex) {
            }
        }
        return text;
    }
    
    // setting key values
    private void putKey(String[] values) {
        int actualValue, decoderKey = Integer.parseInt(values[0], 16);

        for(int i=1; i<5; i++) {
            actualValue = Integer.parseInt(values[i], 16) / decoderKey;
            if(actualValue != 0) {
                setIntOnSlider(i, actualValue);
                setCheckBox(i, true);
            } else {
                setCheckBox(i, false);
            }
        }
    }
    
    // showing error info
    private void showKeyImporterError() {
        JOptionPane.showMessageDialog(null, "Importowany plik nie jest kluczem szyfrowania!", "Błąd", JOptionPane.ERROR_MESSAGE);
    }
    
    // checker for key values
    private boolean keyChecker(String[] values) {
        try {
            if(values.length != 5) {
                return false;
            }
            
            for(int i=0; i<5; i++) {
                Integer.parseInt(values[i], 16);
            }
            return true;
            
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    
    // FILTERS
    
    // file filter for .caesar files
    class FilterForCaesar extends javax.swing.filechooser.FileFilter {

        @Override
        public boolean accept(File file) {
            return file.isDirectory() || file.getAbsolutePath().endsWith(".caesar");
        }

        @Override
        public String getDescription() {
            return "Pliki programu Caesar (*.caesar)";
        }
    }
    
    // file filter for .txt files
    class FilterForTxt extends javax.swing.filechooser.FileFilter {

        @Override
        public boolean accept(File file) {
            return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
        }

        @Override
        public String getDescription() {
            return "Pliki tekstowe (*.txt)";
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JFileChooser jFileChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JSlider jSlider4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
