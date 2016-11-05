//--------------------------------------------
//Programa: Login
//Fecha: 12/10/2016
//Autor: Petra Almanza Lobatos
//Tamaño: 17LOC
//--------------------------------------------
package controlcalificaciones;

import java.awt.*;
import javax.swing.*;

public class frmLogin extends javax.swing.JFrame {

    bdUsuario mLogin = new bdUsuario();
    usuario mUser = new usuario();

    public frmLogin() {
        initComponents();
        this.diseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        BTNLogin = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        mesgUser = new javax.swing.JLabel();
        msgPaswd = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        msgNum = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        BTNCancel = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BTNLogin.setText("Entrar");
        BTNLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BTNLogin);
        BTNLogin.setBounds(170, 280, 109, 34);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });

        mesgUser.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mesgUser.setForeground(new java.awt.Color(255, 0, 0));
        mesgUser.setText("usuario incorrecto");

        msgPaswd.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        msgPaswd.setForeground(new java.awt.Color(255, 0, 0));
        msgPaswd.setText("contraseña incorrecta");

        msgNum.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        msgNum.setForeground(new java.awt.Color(255, 0, 0));
        msgNum.setText("Ingresa solo números");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(msgNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mesgUser, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(msgPaswd, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgNum)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(mesgUser)))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(msgPaswd)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 87, 390, 180);

        label3.setAlignmentX(1.0F);
        label3.setAlignmentY(1.0F);
        label3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                label3FocusGained(evt);
            }
        });
        getContentPane().add(label3);
        label3.setBounds(20, 0, 140, 110);

        BTNCancel.setText("Cancelar");
        BTNCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCancelActionPerformed(evt);
            }
        });
        getContentPane().add(BTNCancel);
        BTNCancel.setBounds(290, 280, 110, 34);

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PREPARATORIA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 30, 182, 29);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlcalificacionesv2/img/fondo.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-6, -10, 460, 350);

        pack();
    }// </editor-fold>                        

    public void diseño() {
        this.setTitle("Bienvenido!");
        Image ico = Toolkit.getDefaultToolkit().getImage(getClass().getResource("./img/esc.png"));
        setIconImage(ico);
        setLocationRelativeTo(null);
        this.setSize(new Dimension(445, 360));
        this.setMinimumSize(new Dimension(445, 360));
        this.setResizable(false);
        ImageIcon img = new ImageIcon(getClass().getResource("./img/user_group_256.png"));
        ImageIcon icon = new ImageIcon(img.getImage().getScaledInstance(label3.getWidth(), label3.getHeight(), Image.SCALE_DEFAULT));
        label3.setIcon(icon);
        jPanel2.setBackground(new Color(255, 255, 255, 200));
        this.msgPaswd.setVisible(false);
        this.mesgUser.setVisible(false);
        this.msgNum.setVisible(false);
    }
    private void BTNLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        usuario mUsuario = mLogin.login(Integer.parseInt(this.txtUser.getText()));
        if (mUsuario.getId() != 0) {
            System.out.println(mUsuario.getContraseña());
            if (mUsuario.getContraseña().equals(this.txtPassword.getText())) {
                frmAdministrador mVentanaAdmin = new frmAdministrador();
                mVentanaAdmin.setVisible(true);
            } else {
                this.msgPaswd.setVisible(true);
            }
        } else {
            this.mesgUser.setVisible(true);
        }

    }                                        

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void label3FocusGained(java.awt.event.FocusEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void BTNCancelActionPerformed(java.awt.event.ActionEvent evt) {                                          
        System.exit(0);
    }                                         

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {                                 
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            this.msgNum.setVisible(true);
        }
    }                                

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JToggleButton BTNCancel;
    private javax.swing.JToggleButton BTNLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel mesgUser;
    private javax.swing.JLabel msgNum;
    private javax.swing.JLabel msgPaswd;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration                   
}
