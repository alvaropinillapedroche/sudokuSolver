package resolucionsudoku;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Sudoku extends javax.swing.JFrame {
    
    private int [][] sudoku = new int[9][9];
    
    public Sudoku() {
        initComponents();
        anularPegar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        matriz1 = new javax.swing.JPanel();
        c0x0 = new javax.swing.JTextField();
        c0x1 = new javax.swing.JTextField();
        c0x2 = new javax.swing.JTextField();
        c1x0 = new javax.swing.JTextField();
        c1x1 = new javax.swing.JTextField();
        c1x2 = new javax.swing.JTextField();
        c2x0 = new javax.swing.JTextField();
        c2x1 = new javax.swing.JTextField();
        c2x2 = new javax.swing.JTextField();
        matriz2 = new javax.swing.JPanel();
        c0x3 = new javax.swing.JTextField();
        c0x4 = new javax.swing.JTextField();
        c0x5 = new javax.swing.JTextField();
        c1x3 = new javax.swing.JTextField();
        c1x4 = new javax.swing.JTextField();
        c1x5 = new javax.swing.JTextField();
        c2x3 = new javax.swing.JTextField();
        c2x4 = new javax.swing.JTextField();
        c2x5 = new javax.swing.JTextField();
        matriz3 = new javax.swing.JPanel();
        c0x6 = new javax.swing.JTextField();
        c0x7 = new javax.swing.JTextField();
        c0x8 = new javax.swing.JTextField();
        c1x6 = new javax.swing.JTextField();
        c1x7 = new javax.swing.JTextField();
        c1x8 = new javax.swing.JTextField();
        c2x6 = new javax.swing.JTextField();
        c2x7 = new javax.swing.JTextField();
        c2x8 = new javax.swing.JTextField();
        matriz4 = new javax.swing.JPanel();
        c3x0 = new javax.swing.JTextField();
        c3x1 = new javax.swing.JTextField();
        c3x2 = new javax.swing.JTextField();
        c4x0 = new javax.swing.JTextField();
        c4x1 = new javax.swing.JTextField();
        c4x2 = new javax.swing.JTextField();
        c5x0 = new javax.swing.JTextField();
        c5x1 = new javax.swing.JTextField();
        c5x2 = new javax.swing.JTextField();
        matriz5 = new javax.swing.JPanel();
        c3x3 = new javax.swing.JTextField();
        c3x4 = new javax.swing.JTextField();
        c3x5 = new javax.swing.JTextField();
        c4x3 = new javax.swing.JTextField();
        c4x4 = new javax.swing.JTextField();
        c4x5 = new javax.swing.JTextField();
        c5x3 = new javax.swing.JTextField();
        c5x4 = new javax.swing.JTextField();
        c5x5 = new javax.swing.JTextField();
        matriz6 = new javax.swing.JPanel();
        c3x6 = new javax.swing.JTextField();
        c3x7 = new javax.swing.JTextField();
        c3x8 = new javax.swing.JTextField();
        c4x6 = new javax.swing.JTextField();
        c4x7 = new javax.swing.JTextField();
        c4x8 = new javax.swing.JTextField();
        c5x6 = new javax.swing.JTextField();
        c5x7 = new javax.swing.JTextField();
        c5x8 = new javax.swing.JTextField();
        matriz7 = new javax.swing.JPanel();
        c6x0 = new javax.swing.JTextField();
        c6x1 = new javax.swing.JTextField();
        c6x2 = new javax.swing.JTextField();
        c7x0 = new javax.swing.JTextField();
        c7x1 = new javax.swing.JTextField();
        c7x2 = new javax.swing.JTextField();
        c8x0 = new javax.swing.JTextField();
        c8x1 = new javax.swing.JTextField();
        c8x2 = new javax.swing.JTextField();
        matriz8 = new javax.swing.JPanel();
        c6x3 = new javax.swing.JTextField();
        c6x4 = new javax.swing.JTextField();
        c6x5 = new javax.swing.JTextField();
        c7x3 = new javax.swing.JTextField();
        c7x4 = new javax.swing.JTextField();
        c7x5 = new javax.swing.JTextField();
        c8x3 = new javax.swing.JTextField();
        c8x4 = new javax.swing.JTextField();
        c8x5 = new javax.swing.JTextField();
        matriz9 = new javax.swing.JPanel();
        c6x6 = new javax.swing.JTextField();
        c6x7 = new javax.swing.JTextField();
        c6x8 = new javax.swing.JTextField();
        c7x6 = new javax.swing.JTextField();
        c7x7 = new javax.swing.JTextField();
        c7x8 = new javax.swing.JTextField();
        c8x6 = new javax.swing.JTextField();
        c8x7 = new javax.swing.JTextField();
        c8x8 = new javax.swing.JTextField();
        botonSalir = new javax.swing.JButton();
        botonResolver = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonResolverLento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Introduce el sudoku a resolver", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        matriz1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c0x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c0x0KeyTyped(evt);
            }
        });

        c0x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c0x1KeyTyped(evt);
            }
        });

        c0x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c0x2KeyTyped(evt);
            }
        });

        c1x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c1x0KeyTyped(evt);
            }
        });

        c1x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c1x1KeyTyped(evt);
            }
        });

        c1x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c1x2KeyTyped(evt);
            }
        });

        c2x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c2x0KeyTyped(evt);
            }
        });

        c2x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c2x1KeyTyped(evt);
            }
        });

        c2x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c2x2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout matriz1Layout = new javax.swing.GroupLayout(matriz1);
        matriz1.setLayout(matriz1Layout);
        matriz1Layout.setHorizontalGroup(
            matriz1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz1Layout.createSequentialGroup()
                .addGroup(matriz1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matriz1Layout.createSequentialGroup()
                        .addComponent(c0x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c0x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c0x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz1Layout.createSequentialGroup()
                        .addComponent(c1x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz1Layout.createSequentialGroup()
                        .addComponent(c2x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        matriz1Layout.setVerticalGroup(
            matriz1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz1Layout.createSequentialGroup()
                .addGroup(matriz1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c0x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c0x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c0x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c2x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        matriz2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c0x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c0x3KeyTyped(evt);
            }
        });

        c0x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c0x4KeyTyped(evt);
            }
        });

        c0x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c0x5KeyTyped(evt);
            }
        });

        c1x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c1x3KeyTyped(evt);
            }
        });

        c1x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c1x4KeyTyped(evt);
            }
        });

        c1x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c1x5KeyTyped(evt);
            }
        });

        c2x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c2x3KeyTyped(evt);
            }
        });

        c2x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c2x4KeyTyped(evt);
            }
        });

        c2x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c2x5KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout matriz2Layout = new javax.swing.GroupLayout(matriz2);
        matriz2.setLayout(matriz2Layout);
        matriz2Layout.setHorizontalGroup(
            matriz2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz2Layout.createSequentialGroup()
                .addGroup(matriz2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matriz2Layout.createSequentialGroup()
                        .addComponent(c0x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c0x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c0x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz2Layout.createSequentialGroup()
                        .addComponent(c1x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c1x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c1x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz2Layout.createSequentialGroup()
                        .addComponent(c2x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c2x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c2x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        matriz2Layout.setVerticalGroup(
            matriz2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz2Layout.createSequentialGroup()
                .addGroup(matriz2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c0x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c0x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c0x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c2x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        matriz3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c0x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c0x6KeyTyped(evt);
            }
        });

        c0x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c0x7KeyTyped(evt);
            }
        });

        c0x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c0x8KeyTyped(evt);
            }
        });

        c1x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c1x6KeyTyped(evt);
            }
        });

        c1x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c1x7KeyTyped(evt);
            }
        });

        c1x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c1x8KeyTyped(evt);
            }
        });

        c2x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c2x6KeyTyped(evt);
            }
        });

        c2x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c2x7KeyTyped(evt);
            }
        });

        c2x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c2x8KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout matriz3Layout = new javax.swing.GroupLayout(matriz3);
        matriz3.setLayout(matriz3Layout);
        matriz3Layout.setHorizontalGroup(
            matriz3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz3Layout.createSequentialGroup()
                .addGroup(matriz3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matriz3Layout.createSequentialGroup()
                        .addComponent(c0x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c0x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c0x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz3Layout.createSequentialGroup()
                        .addComponent(c1x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c1x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c1x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz3Layout.createSequentialGroup()
                        .addComponent(c2x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c2x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c2x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        matriz3Layout.setVerticalGroup(
            matriz3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz3Layout.createSequentialGroup()
                .addGroup(matriz3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c0x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c0x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c0x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c2x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        matriz4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c3x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c3x0KeyTyped(evt);
            }
        });

        c3x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c3x1KeyTyped(evt);
            }
        });

        c3x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c3x2KeyTyped(evt);
            }
        });

        c4x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c4x0KeyTyped(evt);
            }
        });

        c4x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c4x1KeyTyped(evt);
            }
        });

        c4x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c4x2KeyTyped(evt);
            }
        });

        c5x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c5x0KeyTyped(evt);
            }
        });

        c5x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c5x1KeyTyped(evt);
            }
        });

        c5x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c5x2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout matriz4Layout = new javax.swing.GroupLayout(matriz4);
        matriz4.setLayout(matriz4Layout);
        matriz4Layout.setHorizontalGroup(
            matriz4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz4Layout.createSequentialGroup()
                .addGroup(matriz4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matriz4Layout.createSequentialGroup()
                        .addComponent(c3x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz4Layout.createSequentialGroup()
                        .addComponent(c4x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c4x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c4x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz4Layout.createSequentialGroup()
                        .addComponent(c5x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c5x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c5x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        matriz4Layout.setVerticalGroup(
            matriz4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz4Layout.createSequentialGroup()
                .addGroup(matriz4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c3x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c4x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c5x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        matriz5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c3x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c3x3KeyTyped(evt);
            }
        });

        c3x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c3x4KeyTyped(evt);
            }
        });

        c3x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c3x5KeyTyped(evt);
            }
        });

        c4x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c4x3KeyTyped(evt);
            }
        });

        c4x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c4x4KeyTyped(evt);
            }
        });

        c4x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c4x5KeyTyped(evt);
            }
        });

        c5x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c5x3KeyTyped(evt);
            }
        });

        c5x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c5x4KeyTyped(evt);
            }
        });

        c5x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c5x5KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout matriz5Layout = new javax.swing.GroupLayout(matriz5);
        matriz5.setLayout(matriz5Layout);
        matriz5Layout.setHorizontalGroup(
            matriz5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz5Layout.createSequentialGroup()
                .addGroup(matriz5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matriz5Layout.createSequentialGroup()
                        .addComponent(c3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c3x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c3x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz5Layout.createSequentialGroup()
                        .addComponent(c4x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c4x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz5Layout.createSequentialGroup()
                        .addComponent(c5x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c5x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c5x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        matriz5Layout.setVerticalGroup(
            matriz5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz5Layout.createSequentialGroup()
                .addGroup(matriz5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c4x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c5x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        matriz6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c3x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c3x6KeyTyped(evt);
            }
        });

        c3x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c3x7KeyTyped(evt);
            }
        });

        c3x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c3x8KeyTyped(evt);
            }
        });

        c4x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c4x6KeyTyped(evt);
            }
        });

        c4x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c4x7KeyTyped(evt);
            }
        });

        c4x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c4x8KeyTyped(evt);
            }
        });

        c5x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c5x6KeyTyped(evt);
            }
        });

        c5x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c5x7KeyTyped(evt);
            }
        });

        c5x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c5x8KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout matriz6Layout = new javax.swing.GroupLayout(matriz6);
        matriz6.setLayout(matriz6Layout);
        matriz6Layout.setHorizontalGroup(
            matriz6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz6Layout.createSequentialGroup()
                .addGroup(matriz6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matriz6Layout.createSequentialGroup()
                        .addComponent(c3x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c3x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c3x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz6Layout.createSequentialGroup()
                        .addComponent(c4x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c4x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c4x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz6Layout.createSequentialGroup()
                        .addComponent(c5x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c5x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c5x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        matriz6Layout.setVerticalGroup(
            matriz6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz6Layout.createSequentialGroup()
                .addGroup(matriz6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c3x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c4x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c5x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        matriz7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c6x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c6x0KeyTyped(evt);
            }
        });

        c6x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c6x1KeyTyped(evt);
            }
        });

        c6x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c6x2KeyTyped(evt);
            }
        });

        c7x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c7x0KeyTyped(evt);
            }
        });

        c7x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c7x1KeyTyped(evt);
            }
        });

        c7x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c7x2KeyTyped(evt);
            }
        });

        c8x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c8x0KeyTyped(evt);
            }
        });

        c8x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c8x1KeyTyped(evt);
            }
        });

        c8x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c8x2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout matriz7Layout = new javax.swing.GroupLayout(matriz7);
        matriz7.setLayout(matriz7Layout);
        matriz7Layout.setHorizontalGroup(
            matriz7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz7Layout.createSequentialGroup()
                .addGroup(matriz7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matriz7Layout.createSequentialGroup()
                        .addComponent(c6x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c6x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c6x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz7Layout.createSequentialGroup()
                        .addComponent(c7x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c7x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c7x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz7Layout.createSequentialGroup()
                        .addComponent(c8x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c8x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c8x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        matriz7Layout.setVerticalGroup(
            matriz7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz7Layout.createSequentialGroup()
                .addGroup(matriz7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c6x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c7x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c8x0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8x1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8x2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        matriz8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c6x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c6x3KeyTyped(evt);
            }
        });

        c6x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c6x4KeyTyped(evt);
            }
        });

        c6x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c6x5KeyTyped(evt);
            }
        });

        c7x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c7x3KeyTyped(evt);
            }
        });

        c7x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c7x4KeyTyped(evt);
            }
        });

        c7x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c7x5KeyTyped(evt);
            }
        });

        c8x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c8x3KeyTyped(evt);
            }
        });

        c8x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c8x4KeyTyped(evt);
            }
        });

        c8x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c8x5KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout matriz8Layout = new javax.swing.GroupLayout(matriz8);
        matriz8.setLayout(matriz8Layout);
        matriz8Layout.setHorizontalGroup(
            matriz8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz8Layout.createSequentialGroup()
                .addGroup(matriz8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matriz8Layout.createSequentialGroup()
                        .addComponent(c6x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c6x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c6x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz8Layout.createSequentialGroup()
                        .addComponent(c7x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c7x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c7x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz8Layout.createSequentialGroup()
                        .addComponent(c8x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c8x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c8x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        matriz8Layout.setVerticalGroup(
            matriz8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz8Layout.createSequentialGroup()
                .addGroup(matriz8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c6x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c7x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c8x3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8x4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8x5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        matriz9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c6x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c6x6KeyTyped(evt);
            }
        });

        c6x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c6x7KeyTyped(evt);
            }
        });

        c6x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c6x8KeyTyped(evt);
            }
        });

        c7x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c7x6KeyTyped(evt);
            }
        });

        c7x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c7x7KeyTyped(evt);
            }
        });

        c7x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c7x8KeyTyped(evt);
            }
        });

        c8x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c8x6KeyTyped(evt);
            }
        });

        c8x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c8x7KeyTyped(evt);
            }
        });

        c8x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c8x8KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout matriz9Layout = new javax.swing.GroupLayout(matriz9);
        matriz9.setLayout(matriz9Layout);
        matriz9Layout.setHorizontalGroup(
            matriz9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz9Layout.createSequentialGroup()
                .addGroup(matriz9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matriz9Layout.createSequentialGroup()
                        .addComponent(c6x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c6x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c6x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz9Layout.createSequentialGroup()
                        .addComponent(c7x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c7x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c7x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(matriz9Layout.createSequentialGroup()
                        .addComponent(c8x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c8x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c8x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        matriz9Layout.setVerticalGroup(
            matriz9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matriz9Layout.createSequentialGroup()
                .addGroup(matriz9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c6x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c7x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(matriz9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c8x6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8x7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8x8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        botonSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonResolver.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonResolver.setText("Resolver");
        botonResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResolverActionPerformed(evt);
            }
        });

        botonBorrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonResolverLento.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonResolverLento.setText("Resolución dinámica");
        botonResolverLento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResolverLentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(matriz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(matriz2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(matriz3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(matriz4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(matriz5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(matriz6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(matriz7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(matriz8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(matriz9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(botonResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(botonResolverLento, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matriz3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matriz2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matriz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matriz6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matriz5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matriz4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(matriz8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(matriz7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(matriz9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(botonResolverLento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anularPegar(){
        c0x0.setTransferHandler(null);
        c0x1.setTransferHandler(null);
        c0x2.setTransferHandler(null);
        c1x0.setTransferHandler(null);
        c1x1.setTransferHandler(null);
        c1x2.setTransferHandler(null);
        c2x0.setTransferHandler(null);
        c2x1.setTransferHandler(null);
        c2x2.setTransferHandler(null);
        c0x3.setTransferHandler(null);
        c0x4.setTransferHandler(null);
        c0x5.setTransferHandler(null);
        c1x3.setTransferHandler(null);
        c1x4.setTransferHandler(null);
        c1x5.setTransferHandler(null);
        c2x3.setTransferHandler(null);
        c2x4.setTransferHandler(null);
        c2x5.setTransferHandler(null);
        c0x6.setTransferHandler(null);
        c0x7.setTransferHandler(null);
        c0x8.setTransferHandler(null);
        c1x6.setTransferHandler(null);
        c1x7.setTransferHandler(null);
        c1x8.setTransferHandler(null);
        c2x6.setTransferHandler(null);
        c2x7.setTransferHandler(null);
        c2x8.setTransferHandler(null);
        c3x0.setTransferHandler(null);
        c3x1.setTransferHandler(null);
        c3x2.setTransferHandler(null);
        c4x0.setTransferHandler(null);
        c4x1.setTransferHandler(null);
        c4x2.setTransferHandler(null);
        c5x0.setTransferHandler(null);
        c5x1.setTransferHandler(null);
        c5x2.setTransferHandler(null);
        c3x3.setTransferHandler(null);
        c3x4.setTransferHandler(null);
        c3x5.setTransferHandler(null);
        c4x3.setTransferHandler(null);
        c4x4.setTransferHandler(null);
        c4x5.setTransferHandler(null);
        c5x3.setTransferHandler(null);
        c5x4.setTransferHandler(null);
        c5x5.setTransferHandler(null);
        c3x6.setTransferHandler(null);
        c3x7.setTransferHandler(null);
        c3x8.setTransferHandler(null);
        c4x6.setTransferHandler(null);
        c4x7.setTransferHandler(null);
        c4x8.setTransferHandler(null);
        c5x6.setTransferHandler(null);
        c5x7.setTransferHandler(null);
        c5x8.setTransferHandler(null);
        c6x0.setTransferHandler(null);
        c6x1.setTransferHandler(null);
        c6x2.setTransferHandler(null);
        c7x0.setTransferHandler(null);
        c7x1.setTransferHandler(null);
        c7x2.setTransferHandler(null);
        c8x0.setTransferHandler(null);
        c8x1.setTransferHandler(null);
        c8x2.setTransferHandler(null);
        c6x3.setTransferHandler(null);
        c6x4.setTransferHandler(null);
        c6x5.setTransferHandler(null);
        c7x3.setTransferHandler(null);
        c7x4.setTransferHandler(null);
        c7x5.setTransferHandler(null);
        c8x3.setTransferHandler(null);
        c8x4.setTransferHandler(null);
        c8x5.setTransferHandler(null);
        c6x6.setTransferHandler(null);
        c6x7.setTransferHandler(null);
        c6x8.setTransferHandler(null);
        c7x6.setTransferHandler(null);
        c7x7.setTransferHandler(null);
        c7x8.setTransferHandler(null);
        c8x6.setTransferHandler(null);
        c8x7.setTransferHandler(null);
        c8x8.setTransferHandler(null);
    }
     
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResolverActionPerformed
        if (sudokuValido()){
            int [][] sudokuResolver = new int[9][9]; //para que no me modifique el atributo sudoku de esta clase
            sudokuResolver = copiarMatriz(sudoku, sudokuResolver); //NOTA: no se puede asignar directamente dos matrices, no se duplican. Solo se crea una referencia
            SudokuResuelto solucion = new SudokuResuelto(new javax.swing.JFrame(), true, sudokuResolver);
            solucion.setTitle("Sudoku resuelto");
            solucion.setLocationRelativeTo(null);
            solucion.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "El sudoku inicial introducido no es válido, no es posible una solución", "Sudoku sin solución", JOptionPane.ERROR_MESSAGE);
            
    }//GEN-LAST:event_botonResolverActionPerformed
  
    private int[][] copiarMatriz(int[][] origen, int[][] destino){
        for(int i = 0; i<9; i++)
            for(int j = 0; j<9; j++)
                destino[i][j] = origen[i][j];
        return destino;
    }
    
    
    public boolean sudokuValido(){
        //Compruebo si el sudoku introducido es correcto
        //Primero, recorro las celdas que están rellenas
        
        for (int i = 0; i<9; i++)
            for(int j = 0; j<9; j++){
                if(sudoku[i][j] != 0){
                    
                    for (int k = 0; k<9; k++) //busco si esta en la misma fila
                        if(sudoku[i][j]==sudoku[i][k] && j!=k)
                            return false;
                    
                     for (int k = 0; k<9; k++) //busco si esta en la misma columna
                        if(sudoku[i][j]==sudoku[k][j] && i!=k)
                           return false;
                     
                     //busco si esta en su matriz de 3x3
                     int filaInicio3x3 = getFilaInicio3x3(i);
                     int columnaInicio3x3 = getColumnaInicio3x3(j);

                     for (int k=filaInicio3x3; k<filaInicio3x3+3; k++)
                        for(int l=columnaInicio3x3; l<columnaInicio3x3+3; l++)
                            if(sudoku[i][j]==sudoku[k][l] && (i!=k || j!=l))
                               return false;
                }
            }
                return true;
    }
    
    private int getFilaInicio3x3(int fila){
        if(fila>=0 && fila<=2)
            return 0;
        else if (fila>=3 && fila<=5)
            return 3;
        else
            return 6;
    }
    
    private int getColumnaInicio3x3(int columna){
        if(columna>=0 && columna<=2)
            return 0;
        else if (columna>=3 && columna<=5)
            return 3;
        else
            return 6;
    }
    
    // NOTA: Hasta que no termina el evento no se actualiza internamente el valor del jTextField
    //       y la longitud la marca como 0 aunque se vea un número. Excepto al borrar, ahí sí
    //       que coje la longitud a cero antes de terminar el evento
    
    private void c0x0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c0x0KeyTyped
      char caracter = evt.getKeyChar();
      //Veo si es un digito del 1-9 y que no escriba más de 1
      if(caracter < '1' || caracter > '9' || c0x0.getText().length() >= 1)
         evt.consume();  //ignorar el evento de teclado
      //Actualizo valor en la matriz
      try{
          if(c0x0.getText().length() == 0)
            sudoku[0][0] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[0][0] = 0;
      }
    }//GEN-LAST:event_c0x0KeyTyped

    private void c0x1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c0x1KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c0x1.getText().length() >= 1)
         evt.consume();
      try{
          if(c0x1.getText().length() == 0)
            sudoku[0][1] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[0][1] = 0;
      }
    }//GEN-LAST:event_c0x1KeyTyped

    private void c0x2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c0x2KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c0x2.getText().length() >= 1)
         evt.consume();
      try{
          if(c0x2.getText().length() == 0)
            sudoku[0][2] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[0][2] = 0;
      }
    }//GEN-LAST:event_c0x2KeyTyped

    private void c1x0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1x0KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c1x0.getText().length() >= 1)
         evt.consume();
      try{
          if(c1x0.getText().length() == 0)
            sudoku[1][0] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[1][0] = 0;
      }
    }//GEN-LAST:event_c1x0KeyTyped

    private void c1x1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1x1KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c1x1.getText().length() >= 1)
         evt.consume();
      try{
          if(c1x1.getText().length() == 0)
            sudoku[1][1] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[1][1] = 0;
      }
    }//GEN-LAST:event_c1x1KeyTyped

    private void c1x2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1x2KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c1x2.getText().length() >= 1)
         evt.consume();
      try{
          if(c1x2.getText().length() == 0)
            sudoku[1][2] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[1][2] = 0;
      }
    }//GEN-LAST:event_c1x2KeyTyped

    private void c2x0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2x0KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c2x0.getText().length() >= 1)
         evt.consume();
      try{
          if(c2x0.getText().length() == 0)
            sudoku[2][0] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[2][0] = 0;
      }
    }//GEN-LAST:event_c2x0KeyTyped

    private void c2x1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2x1KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c2x1.getText().length() >= 1)
         evt.consume();
      try{
          if(c2x1.getText().length() == 0)
            sudoku[2][1] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[2][1] = 0;
      }
    }//GEN-LAST:event_c2x1KeyTyped

    private void c2x2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2x2KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c2x2.getText().length() >= 1)
         evt.consume();
      try{
          if(c2x2.getText().length() == 0)
            sudoku[2][2] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[2][2] = 0;
      }
    }//GEN-LAST:event_c2x2KeyTyped

    private void c0x3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c0x3KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c0x3.getText().length() >= 1)
         evt.consume();
      try{
          if(c0x3.getText().length() == 0)
            sudoku[0][3] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[0][3] = 0;
      }
    }//GEN-LAST:event_c0x3KeyTyped

    private void c0x4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c0x4KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c0x4.getText().length() >= 1)
         evt.consume();
      try{
          if(c0x4.getText().length() == 0)
            sudoku[0][4] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[0][4] = 0;
      }
    }//GEN-LAST:event_c0x4KeyTyped

    private void c0x5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c0x5KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c0x5.getText().length() >= 1)
         evt.consume();
      try{
          if(c0x5.getText().length() == 0)
            sudoku[0][5] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[0][5] = 0;
      }
    }//GEN-LAST:event_c0x5KeyTyped

    private void c1x3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1x3KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c1x3.getText().length() >= 1)
         evt.consume();
      try{
          if(c1x3.getText().length() == 0)
            sudoku[1][3] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[1][3] = 0;
      }
    }//GEN-LAST:event_c1x3KeyTyped

    private void c1x4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1x4KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c1x4.getText().length() >= 1)
         evt.consume();
      try{
          if(c1x4.getText().length() == 0)
            sudoku[1][4] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[1][4] = 0;
      }
    }//GEN-LAST:event_c1x4KeyTyped

    private void c1x5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1x5KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c1x5.getText().length() >= 1)
         evt.consume();
      try{
          if(c1x5.getText().length() == 0)
            sudoku[1][5] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[1][5] = 0;
      }
    }//GEN-LAST:event_c1x5KeyTyped

    private void c2x3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2x3KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c2x3.getText().length() >= 1)
         evt.consume();
      try{
          if(c2x3.getText().length() == 0)
            sudoku[2][3] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[2][3] = 0;
      }
    }//GEN-LAST:event_c2x3KeyTyped

    private void c2x4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2x4KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c2x4.getText().length() >= 1)
         evt.consume();
      try{
          if(c2x4.getText().length() == 0)
            sudoku[2][4] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[2][4] = 0;
      }
    }//GEN-LAST:event_c2x4KeyTyped

    private void c2x5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2x5KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c2x5.getText().length() >= 1)
         evt.consume();
      try{
          if(c2x5.getText().length() == 0)
            sudoku[2][5] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[2][5] = 0;
      }
    }//GEN-LAST:event_c2x5KeyTyped

    private void c0x6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c0x6KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c0x6.getText().length() >= 1)
         evt.consume();
      try{
          if(c0x6.getText().length() == 0)
            sudoku[0][6] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[0][6] = 0;
      }
    }//GEN-LAST:event_c0x6KeyTyped

    private void c0x7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c0x7KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c0x7.getText().length() >= 1)
         evt.consume();
      try{
          if(c0x7.getText().length() == 0)
            sudoku[0][7] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[0][7] = 0;
      }
    }//GEN-LAST:event_c0x7KeyTyped

    private void c0x8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c0x8KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c0x8.getText().length() >= 1)
         evt.consume();
      try{
          if(c0x8.getText().length() == 0)
            sudoku[0][8] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[0][8] = 0;
      }
    }//GEN-LAST:event_c0x8KeyTyped

    private void c1x6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1x6KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c1x6.getText().length() >= 1)
         evt.consume();
      try{
          if(c1x6.getText().length() == 0)
            sudoku[1][6] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[1][6] = 0;
      }
    }//GEN-LAST:event_c1x6KeyTyped

    private void c1x7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1x7KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c1x7.getText().length() >= 1)
         evt.consume();
      try{
          if(c1x7.getText().length() == 0)
            sudoku[1][7] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[1][7] = 0;
      }
    }//GEN-LAST:event_c1x7KeyTyped

    private void c1x8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1x8KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c1x8.getText().length() >= 1)
         evt.consume();
      try{
          if(c1x8.getText().length() == 0)
            sudoku[1][8] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[1][8] = 0;
      }
    }//GEN-LAST:event_c1x8KeyTyped

    private void c2x6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2x6KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c2x6.getText().length() >= 1)
         evt.consume();
      try{
          if(c2x6.getText().length() == 0)
            sudoku[2][6] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[2][6] = 0;
      }
    }//GEN-LAST:event_c2x6KeyTyped

    private void c2x7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2x7KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c2x7.getText().length() >= 1)
         evt.consume();
      try{
          if(c2x7.getText().length() == 0)
            sudoku[2][7] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[2][7] = 0;
      }
    }//GEN-LAST:event_c2x7KeyTyped

    private void c2x8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2x8KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c2x8.getText().length() >= 1)
         evt.consume();
      try{
          if(c2x8.getText().length() == 0)
            sudoku[2][8] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[2][8] = 0;
      }
    }//GEN-LAST:event_c2x8KeyTyped

    private void c3x0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3x0KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c3x0.getText().length() >= 1)
         evt.consume();
      try{
          if(c3x0.getText().length() == 0)
            sudoku[3][0] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[3][0] = 0;
      }
    }//GEN-LAST:event_c3x0KeyTyped

    private void c3x1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3x1KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c3x1.getText().length() >= 1)
         evt.consume();
      try{
          if(c3x1.getText().length() == 0)
            sudoku[3][1] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[3][1] = 0;
      }
    }//GEN-LAST:event_c3x1KeyTyped

    private void c3x2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3x2KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c3x2.getText().length() >= 1)
         evt.consume();
      try{
          if(c3x2.getText().length() == 0)
            sudoku[3][2] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[3][2] = 0;
      }
    }//GEN-LAST:event_c3x2KeyTyped

    private void c4x0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4x0KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c4x0.getText().length() >= 1)
         evt.consume();
      try{
          if(c4x0.getText().length() == 0)
            sudoku[4][0] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[4][0] = 0;
      }
    }//GEN-LAST:event_c4x0KeyTyped

    private void c4x1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4x1KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c4x1.getText().length() >= 1)
         evt.consume();
      try{
          if(c4x1.getText().length() == 0)
            sudoku[4][1] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[4][1] = 0;
      }
    }//GEN-LAST:event_c4x1KeyTyped

    private void c4x2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4x2KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c4x2.getText().length() >= 1)
         evt.consume();
      try{
          if(c4x2.getText().length() == 0)
            sudoku[4][2] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[4][2] = 0;
      }
    }//GEN-LAST:event_c4x2KeyTyped

    private void c5x0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5x0KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c5x0.getText().length() >= 1)
         evt.consume();
      try{
          if(c5x0.getText().length() == 0)
            sudoku[5][0] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[5][0] = 0;
      }
    }//GEN-LAST:event_c5x0KeyTyped

    private void c5x1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5x1KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c5x1.getText().length() >= 1)
         evt.consume();
      try{
          if(c5x1.getText().length() == 0)
            sudoku[5][1] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[5][1] = 0;
      }
    }//GEN-LAST:event_c5x1KeyTyped

    private void c5x2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5x2KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c5x2.getText().length() >= 1)
         evt.consume();
      try{
          if(c5x2.getText().length() == 0)
            sudoku[5][2] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[5][2] = 0;
      }
    }//GEN-LAST:event_c5x2KeyTyped

    private void c3x3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3x3KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c3x3.getText().length() >= 1)
         evt.consume();
      try{
          if(c3x3.getText().length() == 0)
            sudoku[3][3] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[3][3] = 0;
      }
    }//GEN-LAST:event_c3x3KeyTyped

    private void c3x4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3x4KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c3x4.getText().length() >= 1)
         evt.consume();
      try{
          if(c3x4.getText().length() == 0)
            sudoku[3][4] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[3][4] = 0;
      }
    }//GEN-LAST:event_c3x4KeyTyped

    private void c3x5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3x5KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c3x5.getText().length() >= 1)
         evt.consume();
      try{
          if(c3x5.getText().length() == 0)
            sudoku[3][5] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[3][5] = 0;
      }
    }//GEN-LAST:event_c3x5KeyTyped

    private void c4x3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4x3KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c4x3.getText().length() >= 1)
         evt.consume();
      try{
          if(c4x3.getText().length() == 0)
            sudoku[4][3] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[4][3] = 0;
      }
    }//GEN-LAST:event_c4x3KeyTyped

    private void c4x4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4x4KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c4x4.getText().length() >= 1)
         evt.consume();
      try{
          if(c4x4.getText().length() == 0)
            sudoku[4][4] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[4][4] = 0;
      }
    }//GEN-LAST:event_c4x4KeyTyped

    private void c4x5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4x5KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c4x5.getText().length() >= 1)
         evt.consume();
      try{
          if(c4x5.getText().length() == 0)
            sudoku[4][5] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[4][5] = 0;
      }
    }//GEN-LAST:event_c4x5KeyTyped

    private void c5x3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5x3KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c5x3.getText().length() >= 1)
         evt.consume();
      try{
          if(c5x3.getText().length() == 0)
            sudoku[5][3] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[5][3] = 0;
      }
    }//GEN-LAST:event_c5x3KeyTyped

    private void c5x4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5x4KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c5x4.getText().length() >= 1)
         evt.consume();
      try{
          if(c5x4.getText().length() == 0)
            sudoku[5][4] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[5][4] = 0;
      }
    }//GEN-LAST:event_c5x4KeyTyped

    private void c5x5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5x5KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c5x5.getText().length() >= 1)
         evt.consume();
      try{
          if(c5x5.getText().length() == 0)
            sudoku[5][5] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[5][5] = 0;
      }
    }//GEN-LAST:event_c5x5KeyTyped

    private void c3x6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3x6KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c3x6.getText().length() >= 1)
         evt.consume();
      try{
          if(c3x6.getText().length() == 0)
            sudoku[3][6] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[3][6] = 0;
      }
    }//GEN-LAST:event_c3x6KeyTyped

    private void c3x7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3x7KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c3x7.getText().length() >= 1)
         evt.consume();
      try{
          if(c3x7.getText().length() == 0)
            sudoku[3][7] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[3][7] = 0;
      }
    }//GEN-LAST:event_c3x7KeyTyped

    private void c3x8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3x8KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c3x8.getText().length() >= 1)
         evt.consume();
      try{
          if(c3x8.getText().length() == 0)
            sudoku[3][8] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[3][8] = 0;
      }
    }//GEN-LAST:event_c3x8KeyTyped

    private void c4x6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4x6KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c4x6.getText().length() >= 1)
         evt.consume();
      try{
          if(c4x6.getText().length() == 0)
            sudoku[4][6] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[4][6] = 0;
      }
    }//GEN-LAST:event_c4x6KeyTyped

    private void c4x7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4x7KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c4x7.getText().length() >= 1)
         evt.consume();
      try{
          if(c4x7.getText().length() == 0)
            sudoku[4][7] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[4][7] = 0;
      }
    }//GEN-LAST:event_c4x7KeyTyped

    private void c4x8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4x8KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c4x8.getText().length() >= 1)
         evt.consume();
      try{
          if(c4x8.getText().length() == 0)
            sudoku[4][8] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[4][8] = 0;
      }
    }//GEN-LAST:event_c4x8KeyTyped

    private void c5x6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5x6KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c5x6.getText().length() >= 1)
         evt.consume();
      try{
          if(c5x6.getText().length() == 0)
            sudoku[5][6] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[5][6] = 0;
      }
    }//GEN-LAST:event_c5x6KeyTyped

    private void c5x7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5x7KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c5x7.getText().length() >= 1)
         evt.consume();
      try{
          if(c5x7.getText().length() == 0)
            sudoku[5][7] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[5][7] = 0;
      }
    }//GEN-LAST:event_c5x7KeyTyped

    private void c5x8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5x8KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c5x8.getText().length() >= 1)
         evt.consume();
      try{
          if(c5x8.getText().length() == 0)
            sudoku[5][8] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[5][8] = 0;
      }
    }//GEN-LAST:event_c5x8KeyTyped

    private void c6x0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6x0KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c6x0.getText().length() >= 1)
         evt.consume();
      try{
          if(c6x0.getText().length() == 0)
            sudoku[6][0] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[6][0] = 0;
      }
    }//GEN-LAST:event_c6x0KeyTyped

    private void c6x1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6x1KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c6x1.getText().length() >= 1)
         evt.consume();
      try{
          if(c6x1.getText().length() == 0)
            sudoku[6][1] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[6][1] = 0;
      }
    }//GEN-LAST:event_c6x1KeyTyped

    private void c6x2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6x2KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c6x2.getText().length() >= 1)
         evt.consume();
      try{
          if(c6x2.getText().length() == 0)
            sudoku[6][2] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[6][2] = 0;
      }
    }//GEN-LAST:event_c6x2KeyTyped

    private void c7x0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7x0KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c7x0.getText().length() >= 1)
         evt.consume();
      try{
          if(c7x0.getText().length() == 0)
            sudoku[7][0] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[7][0] = 0;
      }
    }//GEN-LAST:event_c7x0KeyTyped

    private void c7x1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7x1KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c7x1.getText().length() >= 1)
         evt.consume();
      try{
          if(c7x1.getText().length() == 0)
            sudoku[7][1] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[7][1] = 0;
      }
    }//GEN-LAST:event_c7x1KeyTyped

    private void c7x2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7x2KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c7x2.getText().length() >= 1)
         evt.consume();
      try{
          if(c7x2.getText().length() == 0)
            sudoku[7][2] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[7][2] = 0;
      }
    }//GEN-LAST:event_c7x2KeyTyped

    private void c8x0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8x0KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c8x0.getText().length() >= 1)
         evt.consume();
      try{
          if(c8x0.getText().length() == 0)
            sudoku[8][0] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[8][0] = 0;
      }
    }//GEN-LAST:event_c8x0KeyTyped

    private void c8x1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8x1KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c8x1.getText().length() >= 1)
         evt.consume();
      try{
          if(c8x1.getText().length() == 0)
            sudoku[8][1] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[8][1] = 0;
      }
    }//GEN-LAST:event_c8x1KeyTyped

    private void c8x2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8x2KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c8x2.getText().length() >= 1)
         evt.consume();
      try{
          if(c8x2.getText().length() == 0)
            sudoku[8][2] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[8][2] = 0;
      }
    }//GEN-LAST:event_c8x2KeyTyped

    private void c6x3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6x3KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c6x3.getText().length() >= 1)
         evt.consume();
      try{
          if(c6x3.getText().length() == 0)
            sudoku[6][3] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[6][3] = 0;
      }
    }//GEN-LAST:event_c6x3KeyTyped

    private void c6x4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6x4KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c6x4.getText().length() >= 1)
         evt.consume();
      try{
          if(c6x4.getText().length() == 0)
            sudoku[6][4] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[6][4] = 0;
      }
    }//GEN-LAST:event_c6x4KeyTyped

    private void c6x5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6x5KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c6x5.getText().length() >= 1)
         evt.consume();
      try{
          if(c6x5.getText().length() == 0)
            sudoku[6][5] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[6][5] = 0;
      }
    }//GEN-LAST:event_c6x5KeyTyped

    private void c7x3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7x3KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c7x3.getText().length() >= 1)
         evt.consume();
      try{
          if(c7x3.getText().length() == 0)
            sudoku[7][3] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[7][3] = 0;
      }
    }//GEN-LAST:event_c7x3KeyTyped

    private void c7x4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7x4KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c7x4.getText().length() >= 1)
         evt.consume();
      try{
          if(c7x4.getText().length() == 0)
            sudoku[7][4] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[7][4] = 0;
      }
    }//GEN-LAST:event_c7x4KeyTyped

    private void c7x5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7x5KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c7x5.getText().length() >= 1)
         evt.consume();
      try{
          if(c7x5.getText().length() == 0)
            sudoku[7][5] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[7][5] = 0;
      }
    }//GEN-LAST:event_c7x5KeyTyped

    private void c8x3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8x3KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c8x3.getText().length() >= 1)
         evt.consume();
      try{
          if(c8x3.getText().length() == 0)
            sudoku[8][3] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[8][3] = 0;
      }
    }//GEN-LAST:event_c8x3KeyTyped

    private void c8x4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8x4KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c8x4.getText().length() >= 1)
         evt.consume();
      try{
          if(c8x4.getText().length() == 0)
            sudoku[8][4] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[8][4] = 0;
      }
    }//GEN-LAST:event_c8x4KeyTyped

    private void c8x5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8x5KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c8x5.getText().length() >= 1)
         evt.consume();
      try{
          if(c8x5.getText().length() == 0)
            sudoku[8][5] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[8][5] = 0;
      }
    }//GEN-LAST:event_c8x5KeyTyped

    private void c6x6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6x6KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c6x6.getText().length() >= 1)
         evt.consume();
      try{
          if(c6x6.getText().length() == 0)
            sudoku[6][6] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[6][6] = 0;
      }
    }//GEN-LAST:event_c6x6KeyTyped

    private void c6x7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6x7KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c6x7.getText().length() >= 1)
         evt.consume();
      try{
          if(c6x7.getText().length() == 0)
            sudoku[6][7] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[6][7] = 0;
      }
    }//GEN-LAST:event_c6x7KeyTyped

    private void c6x8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6x8KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c6x8.getText().length() >= 1)
         evt.consume();
      try{
          if(c6x8.getText().length() == 0)
            sudoku[6][8] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[6][8] = 0;
      }
    }//GEN-LAST:event_c6x8KeyTyped

    private void c7x6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7x6KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c7x6.getText().length() >= 1)
         evt.consume();
      try{
          if(c7x6.getText().length() == 0)
            sudoku[7][6] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[7][6] = 0;
      }
    }//GEN-LAST:event_c7x6KeyTyped

    private void c7x7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7x7KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c7x7.getText().length() >= 1)
         evt.consume();
      try{
          if(c7x7.getText().length() == 0)
            sudoku[7][7] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[7][7] = 0;
      }
    }//GEN-LAST:event_c7x7KeyTyped

    private void c7x8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7x8KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c7x8.getText().length() >= 1)
         evt.consume();
      try{
          if(c7x8.getText().length() == 0)
            sudoku[7][8] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[7][8] = 0;
      }
    }//GEN-LAST:event_c7x8KeyTyped

    private void c8x6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8x6KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c8x6.getText().length() >= 1)
         evt.consume();
      try{
          if(c8x6.getText().length() == 0)
            sudoku[8][6] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[8][6] = 0;
      }
    }//GEN-LAST:event_c8x6KeyTyped

    private void c8x7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8x7KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c8x7.getText().length() >= 1)
         evt.consume();
      try{
          if(c8x7.getText().length() == 0)
            sudoku[8][7] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[8][7] = 0;
      }
    }//GEN-LAST:event_c8x7KeyTyped

    private void c8x8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8x8KeyTyped
      char caracter = evt.getKeyChar();
      if(caracter < '1' || caracter > '9' || c8x8.getText().length() >= 1)
         evt.consume();
      try{
          if(c8x8.getText().length() == 0)
            sudoku[8][8] = Integer.parseInt(caracter+"");
      }
      catch(NumberFormatException e){
          sudoku[8][8] = 0;
      }
    }//GEN-LAST:event_c8x8KeyTyped

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        for(int i = 0; i<9; i++)
            for(int j = 0; j<9; j++)
                sudoku[i][j] = 0;
        
        c0x0.setText("");
        c0x1.setText("");
        c0x2.setText("");
        c1x0.setText("");
        c1x1.setText("");
        c1x2.setText("");
        c2x0.setText("");
        c2x1.setText("");
        c2x2.setText("");
        c0x3.setText("");
        c0x4.setText("");
        c0x5.setText("");
        c1x3.setText("");
        c1x4.setText("");
        c1x5.setText("");
        c2x3.setText("");
        c2x4.setText("");
        c2x5.setText("");
        c0x6.setText("");
        c0x7.setText("");
        c0x8.setText("");
        c1x6.setText("");
        c1x7.setText("");
        c1x8.setText("");
        c2x6.setText("");
        c2x7.setText("");
        c2x8.setText("");
        c3x0.setText("");
        c3x1.setText("");
        c3x2.setText("");
        c4x0.setText("");
        c4x1.setText("");
        c4x2.setText("");
        c5x0.setText("");
        c5x1.setText("");
        c5x2.setText("");
        c3x3.setText("");
        c3x4.setText("");
        c3x5.setText("");
        c4x3.setText("");
        c4x4.setText("");
        c4x5.setText("");
        c5x3.setText("");
        c5x4.setText("");
        c5x5.setText("");
        c3x6.setText("");
        c3x7.setText("");
        c3x8.setText("");
        c4x6.setText("");
        c4x7.setText("");
        c4x8.setText("");
        c5x6.setText("");
        c5x7.setText("");
        c5x8.setText("");
        c6x0.setText("");
        c6x1.setText("");
        c6x2.setText("");
        c7x0.setText("");
        c7x1.setText("");
        c7x2.setText("");
        c8x0.setText("");
        c8x1.setText("");
        c8x2.setText("");
        c6x3.setText("");
        c6x4.setText("");
        c6x5.setText("");
        c7x3.setText("");
        c7x4.setText("");
        c7x5.setText("");
        c8x3.setText("");
        c8x4.setText("");
        c8x5.setText("");
        c6x6.setText("");
        c6x7.setText("");
        c6x8.setText("");
        c7x6.setText("");
        c7x7.setText("");
        c7x8.setText("");
        c8x6.setText("");
        c8x7.setText("");
        c8x8.setText("");
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonResolverLentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResolverLentoActionPerformed
        if (sudokuValido()){
            int [][] sudokuResolver = new int[9][9]; //para que no me modifique el atributo sudoku de esta clase
            sudokuResolver = copiarMatriz(sudoku, sudokuResolver); //NOTA: no se puede asignar directamente dos matrices, no se duplican. Solo se crea una referencia
            SudokuResueltoLento solucion = new SudokuResueltoLento(new javax.swing.JFrame(), true, sudokuResolver);
            solucion.setTitle("Solución dinámica");
            solucion.setLocationRelativeTo(null);
            solucion.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "El sudoku inicial introducido no es válido, no es posible una solución", "Sudoku sin solución", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_botonResolverLentoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonResolver;
    private javax.swing.JButton botonResolverLento;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField c0x0;
    private javax.swing.JTextField c0x1;
    private javax.swing.JTextField c0x2;
    private javax.swing.JTextField c0x3;
    private javax.swing.JTextField c0x4;
    private javax.swing.JTextField c0x5;
    private javax.swing.JTextField c0x6;
    private javax.swing.JTextField c0x7;
    private javax.swing.JTextField c0x8;
    private javax.swing.JTextField c1x0;
    private javax.swing.JTextField c1x1;
    private javax.swing.JTextField c1x2;
    private javax.swing.JTextField c1x3;
    private javax.swing.JTextField c1x4;
    private javax.swing.JTextField c1x5;
    private javax.swing.JTextField c1x6;
    private javax.swing.JTextField c1x7;
    private javax.swing.JTextField c1x8;
    private javax.swing.JTextField c2x0;
    private javax.swing.JTextField c2x1;
    private javax.swing.JTextField c2x2;
    private javax.swing.JTextField c2x3;
    private javax.swing.JTextField c2x4;
    private javax.swing.JTextField c2x5;
    private javax.swing.JTextField c2x6;
    private javax.swing.JTextField c2x7;
    private javax.swing.JTextField c2x8;
    private javax.swing.JTextField c3x0;
    private javax.swing.JTextField c3x1;
    private javax.swing.JTextField c3x2;
    private javax.swing.JTextField c3x3;
    private javax.swing.JTextField c3x4;
    private javax.swing.JTextField c3x5;
    private javax.swing.JTextField c3x6;
    private javax.swing.JTextField c3x7;
    private javax.swing.JTextField c3x8;
    private javax.swing.JTextField c4x0;
    private javax.swing.JTextField c4x1;
    private javax.swing.JTextField c4x2;
    private javax.swing.JTextField c4x3;
    private javax.swing.JTextField c4x4;
    private javax.swing.JTextField c4x5;
    private javax.swing.JTextField c4x6;
    private javax.swing.JTextField c4x7;
    private javax.swing.JTextField c4x8;
    private javax.swing.JTextField c5x0;
    private javax.swing.JTextField c5x1;
    private javax.swing.JTextField c5x2;
    private javax.swing.JTextField c5x3;
    private javax.swing.JTextField c5x4;
    private javax.swing.JTextField c5x5;
    private javax.swing.JTextField c5x6;
    private javax.swing.JTextField c5x7;
    private javax.swing.JTextField c5x8;
    private javax.swing.JTextField c6x0;
    private javax.swing.JTextField c6x1;
    private javax.swing.JTextField c6x2;
    private javax.swing.JTextField c6x3;
    private javax.swing.JTextField c6x4;
    private javax.swing.JTextField c6x5;
    private javax.swing.JTextField c6x6;
    private javax.swing.JTextField c6x7;
    private javax.swing.JTextField c6x8;
    private javax.swing.JTextField c7x0;
    private javax.swing.JTextField c7x1;
    private javax.swing.JTextField c7x2;
    private javax.swing.JTextField c7x3;
    private javax.swing.JTextField c7x4;
    private javax.swing.JTextField c7x5;
    private javax.swing.JTextField c7x6;
    private javax.swing.JTextField c7x7;
    private javax.swing.JTextField c7x8;
    private javax.swing.JTextField c8x0;
    private javax.swing.JTextField c8x1;
    private javax.swing.JTextField c8x2;
    private javax.swing.JTextField c8x3;
    private javax.swing.JTextField c8x4;
    private javax.swing.JTextField c8x5;
    private javax.swing.JTextField c8x6;
    private javax.swing.JTextField c8x7;
    private javax.swing.JTextField c8x8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel matriz1;
    private javax.swing.JPanel matriz2;
    private javax.swing.JPanel matriz3;
    private javax.swing.JPanel matriz4;
    private javax.swing.JPanel matriz5;
    private javax.swing.JPanel matriz6;
    private javax.swing.JPanel matriz7;
    private javax.swing.JPanel matriz8;
    private javax.swing.JPanel matriz9;
    // End of variables declaration//GEN-END:variables
}
