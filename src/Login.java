/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author PC 1'
 */
public class Login extends javax.swing.JFrame {
    static BufferedReader in = null;
    static PrintWriter out = null; 
  public  String a;
  public  String b;
  
  
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }
    public Login(String a,String b){
        this.a = a;
        this.b = b;
    }
    
    public void close(){
        WindowEvent we = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        userTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        jButtonReg = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Music World");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Music World");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sign In here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        userTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        passTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        loginBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
       }); 

        jButtonReg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonReg.setText("Register");
        jButtonReg.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(userTxt)
                        .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonReg, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonReg)
                .addContainerGap(24, Short.MAX_VALUE))
        );


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(704, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jLabel4)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>  
    
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) { 
       goo(userTxt.getText(),passTxt.getText());
    
                
                
            
      
    }                                       

    private void jButtonRegActionPerformed(java.awt.event.ActionEvent evt) { 
        UserRegistration ur = new UserRegistration();
        ur.setVisible(true);
    }
      
      public static void main(String args[]) {
                  try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }        
    
    private static javax.swing.JButton jButtonReg;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JButton loginBtn;
    public  static javax.swing.JPasswordField passTxt;
    public static javax.swing.JTextField userTxt;
    
public void goo(String a,String b){
    
     try{
         /*Socket sc = new Socket("localhost", 6001);
         ObjectOutputStream to = new ObjectOutputStream(sc.getOutputStream());
         Login log = new Login(a,b);
         to.writeObject(log);
         sc.close();*/
         
            Registry reg = LocateRegistry.getRegistry("192.168.43.169",1111);
            Inf rm = (Inf) reg.lookup("music");
            System.out.println("connected to server");
            rm.go(a, b);
           
            if(rm.go(a,b) == 3){
                
                JOptionPane.showMessageDialog(null, "Welcome " + userTxt.getText());
              
                Mpanel mp = new Mpanel();
                mp.loggedInAsLbl.setText(userTxt.getText());
                close();
                mp.setVisible(true);}
                else{
                   JOptionPane.showMessageDialog(null, "Incorrect username or password");

            }

            
          
            
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }

               }
         
}


