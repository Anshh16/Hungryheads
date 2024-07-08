import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import java.util.Random;
import javax.swing.JOptionPane;

public class Bill extends javax.swing.JFrame {
        Connection con;
        java.sql.PreparedStatement ptst;
     /**
     * 
     * Creates new form Bill
     */
    public Bill() {
        initComponents();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
        }catch(Exception ee)
        {
            JOptionPane.showMessageDialog(this,"Start the Database Server");
        }
        String s="";
        int i=1;
        float total=0;
        for(Products pp:MyClass.orderr)
        {
            float amount=pp.qty*pp.price;
            s=s+i+") "+pp.name+"   "+pp.qty+"\t"+pp.price+"    "+(amount)+"\n";
            total=total+(pp.qty*pp.price);
            i++;
        }
        String uio=String.valueOf(total);
        this.jTextArea1.setText(s);
        this.jTextField7.setText(uio);
        this.jTextField8.setText("0.0");
        this.jTextField9.setText(uio);
        this.jTextField10.setText(uio);
        String ne="";
        String pa="";
        for(Info pp:MyClass.inf)
        {
            ne=pp.nname;
            pa=pp.phone;
        }
        this.jTextField77.setText(ne);
        this.jTextField66.setText(pa);
        dt();
        times();
        Random random=new Random();
        int y=random.nextInt(100000);
        String ui=String.valueOf(y);
        tf1.setText(ui);
        times();
        Random random1=new Random();
        int z=random.nextInt(300);
        String uu=String.valueOf(z);
        jTextField4.setText(uu);
    }
    public void dt(){
        Date d =new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        String dd =sdf.format(d);
        tf2.setText(dd);
    }
Timer t ;
SimpleDateFormat st;    
    public void times(){

        
        t=new Timer(0,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dt=new Date();
                st= new SimpleDateFormat("HH:mm");
                String tt=st.format(dt);
                jTextField3.setText(tt);
            }
        });
        t.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        billofsupply = new javax.swing.JLabel();
        scheme = new javax.swing.JLabel();
        Hungryheads = new javax.swing.JLabel();
        Add = new javax.swing.JLabel();
        Phno = new javax.swing.JLabel();
        Add2 = new javax.swing.JLabel();
        Add3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField77 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BILL");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(485, 60));
        setMinimumSize(new java.awt.Dimension(300, 590));
        setResizable(false);
        getContentPane().setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 235, 230, 170);

        billofsupply.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        billofsupply.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        billofsupply.setText("BILL OF SUPPLY");
        getContentPane().add(billofsupply);
        billofsupply.setBounds(87, 3, 110, 20);

        scheme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scheme.setText("(Under Composition Scheme)");
        getContentPane().add(scheme);
        scheme.setBounds(57, 20, 170, 16);

        Hungryheads.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        Hungryheads.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hungryheads.setText("HUNGRYHEADS :)");
        getContentPane().add(Hungryheads);
        Hungryheads.setBounds(-5, 40, 300, 40);

        Add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add.setText("H-101, ABULANE, MEERUT, 250002.");
        getContentPane().add(Add);
        Add.setBounds(24, 70, 240, 16);

        Phno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Phno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Phno.setText("PH-7465000091/92/93  MEERUT");
        getContentPane().add(Phno);
        Phno.setBounds(24, 83, 240, 16);

        Add2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Add2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add2.setText("GSTIN No. - 09CUXPK8633C2Z1");
        getContentPane().add(Add2);
        Add2.setBounds(24, 96, 240, 16);

        Add3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Add3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add3.setText("State Name : UTTAR PRADESH (09)");
        getContentPane().add(Add3);
        Add3.setBounds(24, 109, 240, 16);

        tf1.setEditable(false);
        tf1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tf1.setBorder(null);
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(70, 129, 80, 15);

        tf2.setEditable(false);
        tf2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tf2.setBorder(null);
        getContentPane().add(tf2);
        tf2.setBounds(70, 142, 70, 15);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setText("Bill No.:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 130, 50, 15);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setText("Date    : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 142, 50, 15);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("Time    : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 155, 50, 15);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField3.setBorder(null);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(70, 155, 70, 15);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setText("Order No. :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(154, 155, 60, 15);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jTextField4.setBorder(null);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(210, 155, 45, 15);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 126, 230, 50);

        jLabel6.setText("************************************************");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(32, 175, 250, 10);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("Cust. Name :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 182, 70, 15);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("Mobile No.  :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 194, 70, 15);

        jTextField77.setEditable(false);
        jTextField77.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField77.setBorder(null);
        jTextField77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField77ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField77);
        jTextField77.setBounds(97, 182, 110, 15);

        jTextField66.setEditable(false);
        jTextField66.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField66.setBorder(null);
        jTextField66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField66ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField66);
        jTextField66.setBounds(97, 194, 110, 15);

        jLabel9.setText("************************************************");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(32, 213, 250, 10);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Dish Name");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 220, 70, 16);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Qty.");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(157, 220, 31, 16);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Rate");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(186, 220, 30, 16);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel13.setText("Amount");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(214, 220, 43, 15);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Bill Amount:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(135, 405, 70, 16);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField7.setBorder(null);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(205, 405, 50, 15);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Discount:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(150, 425, 55, 16);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField8.setBorder(null);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(205, 425, 50, 15);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Total:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(147, 445, 60, 16);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField9.setBorder(null);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(205, 445, 50, 15);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Net to Pay:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(137, 465, 70, 16);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField10);
        jTextField10.setBounds(207, 468, 48, 15);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(40, 483, 210, 10);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton1.setText("EDIT ITEMS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 515, 130, 29);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("PAY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(146, 515, 130, 29);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("You will receive this invoice with your order \n                   from the counter!");
        jTextArea2.setBorder(null);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 487, 230, 30);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(30, 430, 100, 25);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("GO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(50, 455, 60, 23);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Coupon Code?");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(30, 415, 100, 18);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whiteback.jpg"))); // NOI18N
        Background.setText("jLabel1");
        Background.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Background);
        Background.setBounds(0, 0, 300, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void jTextField77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField77ActionPerformed

    private void jTextField66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField66ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            new Menu().setVisible(true);
            dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
        String sl="insert into recents values(?,?,?,?,?,?,?) order by date,time";
        ptst=con.prepareStatement(sl);
        ptst.setString(1,tf1.getText());
        ptst.setString(2,jTextField77.getText());
        ptst.setString(3,jTextField66.getText());
        ptst.setString(4,tf2.getText());
        ptst.setString(5,jTextField3.getText());
        ptst.setString(6, jTextArea1.getText());
        ptst.setString(7,jTextField10.getText());
        ptst.executeUpdate();
        {
        new QR().setVisible(true);
        dispose();        // TODO add your handling code here:
        }
    }catch(Exception ee){
        JOptionPane.showMessageDialog(this,"DB Error");  
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String tt=jTextField1.getText();
    if(tt.equals("NEW25"))
    {
        String udp=jTextField7.getText();
        float amt=Float.parseFloat(udp);
        float disc=(float) (0.25*amt);
        String dodo=String.valueOf(disc);
        jTextField8.setText("-"+dodo);
        float ddi=amt-disc;
        String ddii=String.valueOf(ddi);
        jTextField9.setText(ddii);
        jTextField10.setText(ddii);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    else if(tt.equals("WEDS30"))
    {
        String udp=jTextField7.getText();
        float amt=Float.parseFloat(udp);
        float disc=(float) (0.30*amt);
        String dodo=String.valueOf(disc);
        jTextField8.setText("-"+dodo);
        float ddi=amt-disc;
        String ddii=String.valueOf(ddi);
        jTextField9.setText(ddii);
        jTextField10.setText(ddii);
    }
    else
    {
        String udp=jTextField7.getText();
        jTextField8.setText("-"+"0.0");
        jTextField9.setText(udp);
        jTextField10.setText(udp);
    }
}
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
    int a=evt.getKeyCode();
        if(a==10)
        {   
            String tt=jTextField1.getText();
    if(tt.equals("NEW25"))
    {
        String udp=jTextField7.getText();
        float amt=Float.parseFloat(udp);
        float disc=(float) (0.25*amt);
        String dodo=String.valueOf(disc);
        jTextField8.setText("-"+dodo);
        float ddi=amt-disc;
        String ddii=String.valueOf(ddi);
        jTextField9.setText(ddii);
        jTextField10.setText(ddii);// TODO add your handling code here:
    }                                        
    else if(tt.equals("WEDS30"))
    {
        String udp=jTextField7.getText();
        float amt=Float.parseFloat(udp);
        float disc=(float) (0.30*amt);
        String dodo=String.valueOf(disc);
        jTextField8.setText("-"+dodo);
        float ddi=amt-disc;
        String ddii=String.valueOf(ddi);
        jTextField9.setText(ddii);
        jTextField10.setText(ddii);
    }
    else
    {
        String udp=jTextField7.getText();
        jTextField8.setText("-"+"0.0");
        jTextField9.setText(udp);
        jTextField10.setText(udp);
        JOptionPane.showMessageDialog(this, "No such coupon code found!");
    }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random r=new Random();
        int ranno=r.nextInt(100000);
        String str=String.valueOf(ranno);
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Add2;
    private javax.swing.JLabel Add3;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Hungryheads;
    private javax.swing.JLabel Phno;
    private javax.swing.JLabel billofsupply;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField77;
    public javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel scheme;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
