package resolucionsudoku;

import java.awt.Font;

public class SudokuResuelto extends javax.swing.JDialog {
    
    private int [][] sudoku;
   
    public SudokuResuelto(java.awt.Frame parent, boolean modal, int[][] sudoku) {
        super(parent, modal);
        initComponents();
        this.sudoku = sudoku;
        ponerNegrita(sudoku);
        
        //Llamada incial en una celda que no esté rellena
        int f = 0, c = 0;
        while (sudoku[f][c] != 0 && (f<8 || c<8)){
            if (c == 8){
                f++;
                c = 0;
            }else
                c++;
        }
        Booleano exito = new Booleano(false); //es necesario su uso para no perder el valor en la recursividad
        resolverSudoku(exito, f, c);
        mostrarResultado();
    }
    
    private void resolverSudoku (Booleano exito, int fila, int columna){
        int candidato = 1;
        int columnaAux, filaAux;

        do {
            if (candidatoAceptable(candidato,fila,columna)){
                sudoku[fila][columna] = candidato;

                if (esSolucion()){
                    exito.setValor(true);
                }
                else {
                    //Avanzamos, si se puede, a una celda libre
                    filaAux = fila;
                    columnaAux = columna;
                    while(sudoku[filaAux][columnaAux]!=0 && (filaAux!=8 || columnaAux!=8)){
                        if (columnaAux == 8){
                            filaAux++;
                            columnaAux = 0;
                        }else
                            columnaAux++;
                    }
                    //Probamos en la siguiente celda si está libre (esto siempre ocurrirá menos si estamos en la útima celda y está ocupada)
                    if(sudoku[filaAux][columnaAux]==0)
                        resolverSudoku(exito,filaAux,columnaAux);

                    if	(!exito.getValor()) //desanotar
                        sudoku[fila][columna] = 0;
                }
            }
            candidato++;
        }while (!exito.getValor() && candidato<=9);
    }
    
    private boolean candidatoAceptable(int candidato, int fila, int columna){
        //buscamos si esta en la fila
        for (int i = 0; i<9; i++){
            if(candidato==sudoku[fila][i])
                return false;
        }

        //buscamos si esta en la columna
        for (int i = 0; i<9; i++){
            if(candidato==sudoku[i][columna])
                return false;
        }

        //buscamos si esta en su matriz de 3x3
        int filaInicio3x3 = getFilaInicio3x3(fila);
        int columnaInicio3x3 = getColumnaInicio3x3(columna);

        for (int i=filaInicio3x3; i<filaInicio3x3+3; i++){
            for(int j=columnaInicio3x3; j<columnaInicio3x3+3; j++){
                if(candidato==sudoku[i][j])
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
    
    private boolean esSolucion(){
        //compruebo si el sudoku está lleno nada más
        for (int i = 0; i<9; i++)
            for (int j = 0; j<9; j++)
                if (sudoku[i][j] == 0)
                    return false;

        return true;
    }
    
    private void mostrarResultado(){
        c0x0.setText(String.valueOf(sudoku[0][0]));
        c0x1.setText(String.valueOf(sudoku[0][1]));
        c0x2.setText(String.valueOf(sudoku[0][2]));
        c1x0.setText(String.valueOf(sudoku[1][0]));
        c1x1.setText(String.valueOf(sudoku[1][1]));
        c1x2.setText(String.valueOf(sudoku[1][2]));
        c2x0.setText(String.valueOf(sudoku[2][0]));
        c2x1.setText(String.valueOf(sudoku[2][1]));
        c2x2.setText(String.valueOf(sudoku[2][2]));
        c0x3.setText(String.valueOf(sudoku[0][3]));
        c0x4.setText(String.valueOf(sudoku[0][4]));
        c0x5.setText(String.valueOf(sudoku[0][5]));
        c1x3.setText(String.valueOf(sudoku[1][3]));
        c1x4.setText(String.valueOf(sudoku[1][4]));
        c1x5.setText(String.valueOf(sudoku[1][5]));
        c2x3.setText(String.valueOf(sudoku[2][3]));
        c2x4.setText(String.valueOf(sudoku[2][4]));
        c2x5.setText(String.valueOf(sudoku[2][5]));
        c0x6.setText(String.valueOf(sudoku[0][6]));
        c0x7.setText(String.valueOf(sudoku[0][7]));
        c0x8.setText(String.valueOf(sudoku[0][8]));
        c1x6.setText(String.valueOf(sudoku[1][6]));
        c1x7.setText(String.valueOf(sudoku[1][7]));
        c1x8.setText(String.valueOf(sudoku[1][8]));
        c2x6.setText(String.valueOf(sudoku[2][6]));
        c2x7.setText(String.valueOf(sudoku[2][7]));
        c2x8.setText(String.valueOf(sudoku[2][8]));
        c3x0.setText(String.valueOf(sudoku[3][0]));
        c3x1.setText(String.valueOf(sudoku[3][1]));
        c3x2.setText(String.valueOf(sudoku[3][2]));
        c4x0.setText(String.valueOf(sudoku[4][0]));
        c4x1.setText(String.valueOf(sudoku[4][1]));
        c4x2.setText(String.valueOf(sudoku[4][2]));
        c5x0.setText(String.valueOf(sudoku[5][0]));
        c5x1.setText(String.valueOf(sudoku[5][1]));
        c5x2.setText(String.valueOf(sudoku[5][2]));
        c3x3.setText(String.valueOf(sudoku[3][3]));
        c3x4.setText(String.valueOf(sudoku[3][4]));
        c3x5.setText(String.valueOf(sudoku[3][5]));
        c4x3.setText(String.valueOf(sudoku[4][3]));
        c4x4.setText(String.valueOf(sudoku[4][4]));
        c4x5.setText(String.valueOf(sudoku[4][5]));
        c5x3.setText(String.valueOf(sudoku[5][3]));
        c5x4.setText(String.valueOf(sudoku[5][4]));
        c5x5.setText(String.valueOf(sudoku[5][5]));
        c3x6.setText(String.valueOf(sudoku[3][6]));
        c3x7.setText(String.valueOf(sudoku[3][7]));
        c3x8.setText(String.valueOf(sudoku[3][8]));
        c4x6.setText(String.valueOf(sudoku[4][6]));
        c4x7.setText(String.valueOf(sudoku[4][7]));
        c4x8.setText(String.valueOf(sudoku[4][8]));
        c5x6.setText(String.valueOf(sudoku[5][6]));
        c5x7.setText(String.valueOf(sudoku[5][7]));
        c5x8.setText(String.valueOf(sudoku[5][8]));
        c6x0.setText(String.valueOf(sudoku[6][0]));
        c6x1.setText(String.valueOf(sudoku[6][1]));
        c6x2.setText(String.valueOf(sudoku[6][2]));
        c7x0.setText(String.valueOf(sudoku[7][0]));
        c7x1.setText(String.valueOf(sudoku[7][1]));
        c7x2.setText(String.valueOf(sudoku[7][2]));
        c8x0.setText(String.valueOf(sudoku[8][0]));
        c8x1.setText(String.valueOf(sudoku[8][1]));
        c8x2.setText(String.valueOf(sudoku[8][2]));
        c6x3.setText(String.valueOf(sudoku[6][3]));
        c6x4.setText(String.valueOf(sudoku[6][4]));
        c6x5.setText(String.valueOf(sudoku[6][5]));
        c7x3.setText(String.valueOf(sudoku[7][3]));
        c7x4.setText(String.valueOf(sudoku[7][4]));
        c7x5.setText(String.valueOf(sudoku[7][5]));
        c8x3.setText(String.valueOf(sudoku[8][3]));
        c8x4.setText(String.valueOf(sudoku[8][4]));
        c8x5.setText(String.valueOf(sudoku[8][5]));
        c6x6.setText(String.valueOf(sudoku[6][6]));
        c6x7.setText(String.valueOf(sudoku[6][7]));
        c6x8.setText(String.valueOf(sudoku[6][8]));
        c7x6.setText(String.valueOf(sudoku[7][6]));
        c7x7.setText(String.valueOf(sudoku[7][7]));
        c7x8.setText(String.valueOf(sudoku[7][8]));
        c8x6.setText(String.valueOf(sudoku[8][6]));
        c8x7.setText(String.valueOf(sudoku[8][7]));
        c8x8.setText(String.valueOf(sudoku[8][8]));
    }
    
    private void ponerNegrita (int [][] sudoku){
        if (sudoku[0][0] != 0)
            c0x0.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[0][1] != 0)
            c0x1.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[0][2] != 0)
            c0x2.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[0][3] != 0)
            c0x3.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[0][4] != 0)
            c0x4.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[0][5] != 0)
            c0x5.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[0][6] != 0)
            c0x6.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[0][7] != 0)
            c0x7.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[0][8] != 0)
            c0x8.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[1][0] != 0)
            c1x0.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[1][1] != 0)
            c1x1.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[1][2] != 0)
            c1x2.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[1][3] != 0)
            c1x3.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[1][4] != 0)
            c1x4.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[1][5] != 0)
            c1x5.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[1][6] != 0)
            c1x6.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[1][7] != 0)
            c1x7.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[1][8] != 0)
            c1x8.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[2][0] != 0)
            c2x0.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[2][1] != 0)
            c2x1.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[2][2] != 0)
            c2x2.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[2][3] != 0)
            c2x3.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[2][4] != 0)
            c2x4.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[2][5] != 0)
            c2x5.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[2][6] != 0)
            c2x6.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[2][7] != 0)
            c2x7.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[2][8] != 0)
            c2x8.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[3][0] != 0)
            c3x0.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[3][1] != 0)
            c3x1.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[3][2] != 0)
            c3x2.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[3][3] != 0)
            c3x3.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[3][4] != 0)
            c3x4.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[3][5] != 0)
            c3x5.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[3][6] != 0)
            c3x6.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[3][7] != 0)
            c3x7.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[3][8] != 0)
            c3x8.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[4][0] != 0)
            c4x0.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[4][1] != 0)
            c4x1.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[4][2] != 0)
            c4x2.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[4][3] != 0)
            c4x3.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[4][4] != 0)
            c4x4.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[4][5] != 0)
            c4x5.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[4][6] != 0)
            c4x6.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[4][7] != 0)
            c4x7.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[4][8] != 0)
            c4x8.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[5][0] != 0)
            c5x0.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[5][1] != 0)
            c5x1.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[5][2] != 0)
            c5x2.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[5][3] != 0)
            c5x3.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[5][4] != 0)
            c5x4.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[5][5] != 0)
            c5x5.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[5][6] != 0)
            c5x6.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[5][7] != 0)
            c5x7.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[5][8] != 0)
            c5x8.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[6][0] != 0)
            c6x0.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[6][1] != 0)
            c6x1.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[6][2] != 0)
            c6x2.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[6][3] != 0)
            c6x3.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[6][4] != 0)
            c6x4.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[6][5] != 0)
            c6x5.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[6][6] != 0)
            c6x6.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[6][7] != 0)
            c6x7.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[6][8] != 0)
            c6x8.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[7][0] != 0)
            c7x0.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[7][1] != 0)
            c7x1.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[7][2] != 0)
            c7x2.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[7][3] != 0)
            c7x3.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[7][4] != 0)
            c7x4.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[7][5] != 0)
            c7x5.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[7][6] != 0)
            c7x6.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[7][7] != 0)
            c7x7.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[7][8] != 0)
            c7x8.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[8][0] != 0)
            c8x0.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[8][1] != 0)
            c8x1.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[8][2] != 0)
            c8x2.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[8][3] != 0)
            c8x3.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[8][4] != 0)
            c8x4.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[8][5] != 0)
            c8x5.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[8][6] != 0)
            c8x6.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[8][7] != 0)
            c8x7.setFont(new Font("Tahoma",Font.BOLD,20));
        if (sudoku[8][8] != 0)
            c8x8.setFont(new Font("Tahoma",Font.BOLD,20));   
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
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sudoku resuelto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        matriz1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c0x0.setEditable(false);
        c0x0.setBackground(new java.awt.Color(255, 255, 255));
        c0x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x0.setFocusable(false);

        c0x1.setEditable(false);
        c0x1.setBackground(new java.awt.Color(255, 255, 255));
        c0x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x1.setFocusable(false);

        c0x2.setEditable(false);
        c0x2.setBackground(new java.awt.Color(255, 255, 255));
        c0x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x2.setFocusable(false);

        c1x0.setEditable(false);
        c1x0.setBackground(new java.awt.Color(255, 255, 255));
        c1x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x0.setFocusable(false);

        c1x1.setEditable(false);
        c1x1.setBackground(new java.awt.Color(255, 255, 255));
        c1x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x1.setFocusable(false);

        c1x2.setEditable(false);
        c1x2.setBackground(new java.awt.Color(255, 255, 255));
        c1x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x2.setFocusable(false);

        c2x0.setEditable(false);
        c2x0.setBackground(new java.awt.Color(255, 255, 255));
        c2x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x0.setFocusable(false);

        c2x1.setEditable(false);
        c2x1.setBackground(new java.awt.Color(255, 255, 255));
        c2x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x1.setFocusable(false);

        c2x2.setEditable(false);
        c2x2.setBackground(new java.awt.Color(255, 255, 255));
        c2x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x2.setFocusable(false);

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

        matriz2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        matriz2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c0x3.setEditable(false);
        c0x3.setBackground(new java.awt.Color(255, 255, 255));
        c0x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x3.setFocusable(false);

        c0x4.setEditable(false);
        c0x4.setBackground(new java.awt.Color(255, 255, 255));
        c0x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x4.setFocusable(false);

        c0x5.setEditable(false);
        c0x5.setBackground(new java.awt.Color(255, 255, 255));
        c0x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x5.setFocusable(false);

        c1x3.setEditable(false);
        c1x3.setBackground(new java.awt.Color(255, 255, 255));
        c1x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x3.setFocusable(false);

        c1x4.setEditable(false);
        c1x4.setBackground(new java.awt.Color(255, 255, 255));
        c1x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x4.setFocusable(false);

        c1x5.setEditable(false);
        c1x5.setBackground(new java.awt.Color(255, 255, 255));
        c1x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x5.setFocusable(false);

        c2x3.setEditable(false);
        c2x3.setBackground(new java.awt.Color(255, 255, 255));
        c2x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x3.setFocusable(false);

        c2x4.setEditable(false);
        c2x4.setBackground(new java.awt.Color(255, 255, 255));
        c2x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x4.setFocusable(false);

        c2x5.setEditable(false);
        c2x5.setBackground(new java.awt.Color(255, 255, 255));
        c2x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x5.setFocusable(false);

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

        matriz3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        matriz3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c0x6.setEditable(false);
        c0x6.setBackground(new java.awt.Color(255, 255, 255));
        c0x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x6.setFocusable(false);

        c0x7.setEditable(false);
        c0x7.setBackground(new java.awt.Color(255, 255, 255));
        c0x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x7.setFocusable(false);

        c0x8.setEditable(false);
        c0x8.setBackground(new java.awt.Color(255, 255, 255));
        c0x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c0x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c0x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c0x8.setFocusable(false);

        c1x6.setEditable(false);
        c1x6.setBackground(new java.awt.Color(255, 255, 255));
        c1x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x6.setFocusable(false);

        c1x7.setEditable(false);
        c1x7.setBackground(new java.awt.Color(255, 255, 255));
        c1x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x7.setFocusable(false);

        c1x8.setEditable(false);
        c1x8.setBackground(new java.awt.Color(255, 255, 255));
        c1x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c1x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1x8.setFocusable(false);

        c2x6.setEditable(false);
        c2x6.setBackground(new java.awt.Color(255, 255, 255));
        c2x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x6.setFocusable(false);

        c2x7.setEditable(false);
        c2x7.setBackground(new java.awt.Color(255, 255, 255));
        c2x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x7.setFocusable(false);

        c2x8.setEditable(false);
        c2x8.setBackground(new java.awt.Color(255, 255, 255));
        c2x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c2x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2x8.setFocusable(false);

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

        matriz4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        matriz4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c3x0.setEditable(false);
        c3x0.setBackground(new java.awt.Color(255, 255, 255));
        c3x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x0.setFocusable(false);

        c3x1.setEditable(false);
        c3x1.setBackground(new java.awt.Color(255, 255, 255));
        c3x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x1.setFocusable(false);

        c3x2.setEditable(false);
        c3x2.setBackground(new java.awt.Color(255, 255, 255));
        c3x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x2.setFocusable(false);

        c4x0.setEditable(false);
        c4x0.setBackground(new java.awt.Color(255, 255, 255));
        c4x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x0.setFocusable(false);

        c4x1.setEditable(false);
        c4x1.setBackground(new java.awt.Color(255, 255, 255));
        c4x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x1.setFocusable(false);

        c4x2.setEditable(false);
        c4x2.setBackground(new java.awt.Color(255, 255, 255));
        c4x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x2.setFocusable(false);

        c5x0.setEditable(false);
        c5x0.setBackground(new java.awt.Color(255, 255, 255));
        c5x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x0.setFocusable(false);

        c5x1.setEditable(false);
        c5x1.setBackground(new java.awt.Color(255, 255, 255));
        c5x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x1.setFocusable(false);

        c5x2.setEditable(false);
        c5x2.setBackground(new java.awt.Color(255, 255, 255));
        c5x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x2.setFocusable(false);

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

        matriz5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        matriz5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c3x3.setEditable(false);
        c3x3.setBackground(new java.awt.Color(255, 255, 255));
        c3x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x3.setFocusable(false);

        c3x4.setEditable(false);
        c3x4.setBackground(new java.awt.Color(255, 255, 255));
        c3x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x4.setFocusable(false);

        c3x5.setEditable(false);
        c3x5.setBackground(new java.awt.Color(255, 255, 255));
        c3x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x5.setFocusable(false);

        c4x3.setEditable(false);
        c4x3.setBackground(new java.awt.Color(255, 255, 255));
        c4x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x3.setFocusable(false);

        c4x4.setEditable(false);
        c4x4.setBackground(new java.awt.Color(255, 255, 255));
        c4x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x4.setFocusable(false);

        c4x5.setEditable(false);
        c4x5.setBackground(new java.awt.Color(255, 255, 255));
        c4x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x5.setFocusable(false);

        c5x3.setEditable(false);
        c5x3.setBackground(new java.awt.Color(255, 255, 255));
        c5x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x3.setFocusable(false);

        c5x4.setEditable(false);
        c5x4.setBackground(new java.awt.Color(255, 255, 255));
        c5x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x4.setFocusable(false);

        c5x5.setEditable(false);
        c5x5.setBackground(new java.awt.Color(255, 255, 255));
        c5x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x5.setFocusable(false);

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

        matriz6.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        matriz6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c3x6.setEditable(false);
        c3x6.setBackground(new java.awt.Color(255, 255, 255));
        c3x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x6.setFocusable(false);

        c3x7.setEditable(false);
        c3x7.setBackground(new java.awt.Color(255, 255, 255));
        c3x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x7.setFocusable(false);

        c3x8.setEditable(false);
        c3x8.setBackground(new java.awt.Color(255, 255, 255));
        c3x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c3x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3x8.setFocusable(false);

        c4x6.setEditable(false);
        c4x6.setBackground(new java.awt.Color(255, 255, 255));
        c4x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x6.setFocusable(false);

        c4x7.setEditable(false);
        c4x7.setBackground(new java.awt.Color(255, 255, 255));
        c4x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x7.setFocusable(false);

        c4x8.setEditable(false);
        c4x8.setBackground(new java.awt.Color(255, 255, 255));
        c4x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c4x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c4x8.setFocusable(false);

        c5x6.setEditable(false);
        c5x6.setBackground(new java.awt.Color(255, 255, 255));
        c5x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x6.setFocusable(false);

        c5x7.setEditable(false);
        c5x7.setBackground(new java.awt.Color(255, 255, 255));
        c5x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x7.setFocusable(false);

        c5x8.setEditable(false);
        c5x8.setBackground(new java.awt.Color(255, 255, 255));
        c5x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c5x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c5x8.setFocusable(false);

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

        matriz7.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        matriz7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c6x0.setEditable(false);
        c6x0.setBackground(new java.awt.Color(255, 255, 255));
        c6x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x0.setFocusable(false);

        c6x1.setEditable(false);
        c6x1.setBackground(new java.awt.Color(255, 255, 255));
        c6x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x1.setFocusable(false);

        c6x2.setEditable(false);
        c6x2.setBackground(new java.awt.Color(255, 255, 255));
        c6x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x2.setFocusable(false);

        c7x0.setEditable(false);
        c7x0.setBackground(new java.awt.Color(255, 255, 255));
        c7x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x0.setFocusable(false);

        c7x1.setEditable(false);
        c7x1.setBackground(new java.awt.Color(255, 255, 255));
        c7x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x1.setFocusable(false);

        c7x2.setEditable(false);
        c7x2.setBackground(new java.awt.Color(255, 255, 255));
        c7x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x2.setFocusable(false);

        c8x0.setEditable(false);
        c8x0.setBackground(new java.awt.Color(255, 255, 255));
        c8x0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x0.setFocusable(false);

        c8x1.setEditable(false);
        c8x1.setBackground(new java.awt.Color(255, 255, 255));
        c8x1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x1.setFocusable(false);

        c8x2.setEditable(false);
        c8x2.setBackground(new java.awt.Color(255, 255, 255));
        c8x2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x2.setFocusable(false);

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

        matriz8.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        matriz8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c6x3.setEditable(false);
        c6x3.setBackground(new java.awt.Color(255, 255, 255));
        c6x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x3.setFocusable(false);

        c6x4.setEditable(false);
        c6x4.setBackground(new java.awt.Color(255, 255, 255));
        c6x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x4.setFocusable(false);

        c6x5.setEditable(false);
        c6x5.setBackground(new java.awt.Color(255, 255, 255));
        c6x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x5.setFocusable(false);

        c7x3.setEditable(false);
        c7x3.setBackground(new java.awt.Color(255, 255, 255));
        c7x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x3.setFocusable(false);

        c7x4.setEditable(false);
        c7x4.setBackground(new java.awt.Color(255, 255, 255));
        c7x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x4.setFocusable(false);

        c7x5.setEditable(false);
        c7x5.setBackground(new java.awt.Color(255, 255, 255));
        c7x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x5.setFocusable(false);

        c8x3.setEditable(false);
        c8x3.setBackground(new java.awt.Color(255, 255, 255));
        c8x3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x3.setFocusable(false);

        c8x4.setEditable(false);
        c8x4.setBackground(new java.awt.Color(255, 255, 255));
        c8x4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x4.setFocusable(false);

        c8x5.setEditable(false);
        c8x5.setBackground(new java.awt.Color(255, 255, 255));
        c8x5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x5.setFocusable(false);

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

        matriz9.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        matriz9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c6x6.setEditable(false);
        c6x6.setBackground(new java.awt.Color(255, 255, 255));
        c6x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x6.setFocusable(false);

        c6x7.setEditable(false);
        c6x7.setBackground(new java.awt.Color(255, 255, 255));
        c6x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x7.setFocusable(false);

        c6x8.setEditable(false);
        c6x8.setBackground(new java.awt.Color(255, 255, 255));
        c6x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c6x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c6x8.setFocusable(false);

        c7x6.setEditable(false);
        c7x6.setBackground(new java.awt.Color(255, 255, 255));
        c7x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x6.setFocusable(false);

        c7x7.setEditable(false);
        c7x7.setBackground(new java.awt.Color(255, 255, 255));
        c7x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x7.setFocusable(false);

        c7x8.setEditable(false);
        c7x8.setBackground(new java.awt.Color(255, 255, 255));
        c7x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c7x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c7x8.setFocusable(false);

        c8x6.setEditable(false);
        c8x6.setBackground(new java.awt.Color(255, 255, 255));
        c8x6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x6.setFocusable(false);

        c8x7.setEditable(false);
        c8x7.setBackground(new java.awt.Color(255, 255, 255));
        c8x7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x7.setFocusable(false);

        c8x8.setEditable(false);
        c8x8.setBackground(new java.awt.Color(255, 255, 255));
        c8x8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        c8x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8x8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c8x8.setFocusable(false);

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

        botonVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(matriz9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVolver;
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
