import java.awt.Color;
public class login_1 extends javax.swing.JFrame {
 
    
    public login_1() {
        initComponents();
        username.setBackground(new Color(0, 0, 0, 0));
        pass.setBackground(new Color(0, 0, 0, 0));
    }
 
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
 
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        pass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
   setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel3.setBackground(new java.awt.Color(51, 0, 255));
        jPanel3.setLayout(null);
        jPanel1.add(jPanel3);
        jPanel3.setBounds(580, 310, 400, 3);
username.setFont(new java.awt.Font("Segoe UI", 0, 18));         username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username");
        username.setBorder(null);
        username.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(username);
        username.setBounds(580, 160, 400, 40);
        jPanel2.setBackground(new java.awt.Color(51, 0, 255));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(580, 200, 400, 3);
        pass.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("Password");
        pass.setBorder(null);
        pass.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(pass);
        pass.setBounds(580, 270, 400, 40);
        jButton1.setBackground(new java.awt.Color(51, 0, 255));
jButton1.setFont(new java.awt.Font("Maiandra GD", 1, 30));                                jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log In");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(640, 380, 290, 50);
 
        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 40));        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setText("LOGIN");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(700, 60, 150, 60);
 
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Desktop\\oltest.jpg")); 
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 580);
 
        getContentPane().add(jPanel1, "card2");
 
        setSize(new java.awt.Dimension(1014, 578));
        setLocationRelativeTo(null);
    }                      
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String u = username.getText();
        String p = pass.getText();
        if (u.equals("admin") && p.equals("admin")) {
            OnlineTest r = new OnlineTest();
            r.setVisible(true);
        }
    }                                        
    public static void main(String args[]) {
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_1().setVisible(true);
            }
        });
    }   
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField username;
}
