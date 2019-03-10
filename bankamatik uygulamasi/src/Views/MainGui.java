/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Logic.Olaylar;
import com.sun.glass.ui.Cursor;
import java.awt.Color;
import Views.*;
import java.awt.Font;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.*;
import java.util.prefs.Preferences;

/**
 *
 * @author batuhan
 */
public class MainGui {

    Font font = new Font("Footlight MT Light" , Font.BOLD , 35) ;
    Font font2 = new Font("Verdana" , Font.BOLD , 15) ;
    AnaEkran aekrn;
    JFrame jf;
    JPanel jp;
    JTextField txt_usename;
    JPasswordField txt_password;
    JLabel lblsifreekrani;
    JLabel lblusename;
    JLabel lblpassword;
    JButton btn;
    JButton btn2,btn3;
    Olaylar o=new Olaylar(null,this,null);;

    public Olaylar getO() {
        if (o==null) {
            o=new Olaylar(null,this,null);
        }
        return o;
    }
    
    public MainGui( ) {
        
        getJf();
        getJp().add(getLblsifreekrani());
        getJp().add(getTxt_password());
        
        getJp().add(getTxt_usename());
        getJp().add(getLblusename());
        getJp().add(getLblpassword());
        getJp().add(getBtn());
        getJp().add(getBtn2());
        getJp().add(getBtn3());
        getJf().setVisible(true); 
    }
    
    
    public JFrame getJf() {
        if (jf == null) {
            jf = new JFrame("ATM");
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setBounds(550, 200, 750, 500);
            jf.setContentPane(getJp());
        }
        return jf;
        
    }

    public JPanel getJp() {
         if (jp == null) {
            jp = new JPanel();
            jp.setLayout(null);
            jp.setBackground(Color.darkGray);
        }
        return jp;
    }

    public JTextField getTxt_usename() {
          if (txt_usename == null) {
            txt_usename = new JTextField();
            txt_usename.setLocation(200, 140);
            txt_usename.setSize(350,50);
            txt_usename.setBackground(Color.white);
            txt_usename.setFont(font2);
            Preferences pref = Preferences.userNodeForPackage(MainGui.class);
           if(pref.get("isim", "")!="")
            txt_usename.setText(pref.get("kartnumarasi", ""));
                pref.put("kartnumarasi", (""));
            txt_usename.addKeyListener(new KeyAdapter() {

                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                        e.consume();
                    }
                }
            });
         }
        
        
        return txt_usename;
    }

    public JPasswordField getTxt_password() {
         if (txt_password == null) {
            txt_password = new JPasswordField();
            txt_password.setLocation(200, 220);
            txt_password.setSize(350,50);
            txt_password.setBackground(Color.white);
            txt_password.setFont(font2);
         }
        return txt_password;
    }

    public JLabel getLblsifreekrani() {//sifre ekranı label
          if (lblsifreekrani == null) {
            lblsifreekrani = new JLabel("Kullanıcı Girisi");
            lblsifreekrani.setFont(font);
            lblsifreekrani.setLocation(250, 80);
            lblsifreekrani.setSize(275,50);
            lblsifreekrani.setForeground(Color.white);
            
         }
        return lblsifreekrani;
    }

 

    public JLabel getLblusename() {//usename  label
        if (lblusename == null) {
            lblusename = new JLabel("HESAP NUMARASI");
            lblusename.setFont(font2);
            lblusename.setBounds(30, 125, 200, 80);
            lblusename.setForeground(Color.white);
         }
        return lblusename;
    }

    public JLabel getLblpassword() {//password  label
        if (lblpassword == null) {
            lblpassword = new JLabel("SİFRE");
            lblpassword.setFont(font2);
            lblpassword.setBounds(130, 200, 200, 90);
            lblpassword.setForeground(Color.white);
         }
        return lblpassword;
    }
    public JButton getBtn(){
        if(btn == null){
            btn = new JButton();
            btn.setBounds(385, 300, 150, 40);
            btn.setBackground(Color.green);
            btn.setBorder(null);
            btn.setText("GİRİS");
            btn.setForeground(Color.white);
            btn.setFont(font2);
            btn.addActionListener(getO());
        }
        return btn;
    }
      

    public JButton getBtn2() {
        
        if(btn2 == null){
            btn2 = new JButton();
            btn2.setBounds(215, 300, 150, 40);
            btn2.setBackground(Color.gray);
            btn2.setBorder(null);
            btn2.setText("HESAP AC");
            btn2.setForeground(Color.white);
            btn2.setFont(font2);
            btn2.addActionListener(getO());
        }
        return btn2;
    }
     public JButton getBtn3() {
        
        if(btn3 == null){
            btn3 = new JButton();
            btn3.setBounds(215, 360, 150, 40);
            btn3.setBackground(Color.gray);
            btn3.setBorder(null);
            btn3.setText("GUNCELLE");
            btn3.setForeground(Color.white);
            btn3.setFont(font2);
            btn3.addActionListener(getO());
        }
        return btn3;
    }
  
   
    
}
