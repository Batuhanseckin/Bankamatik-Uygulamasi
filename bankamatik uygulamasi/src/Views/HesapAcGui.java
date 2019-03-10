package Views;

import Logic.Olaylar;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;
import java.util.prefs.Preferences;
import javax.swing.*;

public class HesapAcGui {

    Font font = new Font("Footlight MT Light", Font.BOLD, 35);
    Font font2 = new Font("Verdana", Font.BOLD, 14);
    Font font3 = new Font("Verdana", Font.BOLD, 20);

    JFrame jf;
    JPanel jp;
    JLabel lblhesapolustur;
    JLabel lblkrtno;
    JLabel lblkrtno2;
    JButton btn3;
    JLabel lblname;
    JTextField name;
    JLabel lbllastname;
    JTextField lastname;
    JLabel lbltc;
    JTextField tc;
    JLabel lbldt;
    JTextField dt1;
    JTextField dt2;
    JTextField dt3;
    JLabel lblpassword;
    JPasswordField password;
    JButton btn;
    JButton btn2;
    JLabel lblBasarili;
    Olaylar o;

    public Olaylar getO() {
        if (o==null) {
            o=new Olaylar(null,null,this);
            
        }
        return o;
    }

    public HesapAcGui() {
        getJf();
        getJp().add(getLblhesapolustur());
        getJp().add(getLblkrtno());
        getJp().add(getLblkrtno2());
        getJp().add(getBtn3());
        getJp().add(getLblname());
        getJp().add(getName());
        getJp().add(getLbllastname());
        getJp().add(getLastname());
        getJp().add(getLbltc());
        getJp().add(getTc());
        getJp().add(getLbldt());
        getJp().add(getDt1());
        getJp().add(getDt2());
        getJp().add(getDt3());
        getJp().add(getLblpassword());
        getJp().add(getPassword());
        getJp().add(getBtn());
        getJp().add(getBtn2());
        getJp().add(getLblBasarili());
        getLblBasarili().setVisible(false);
        getJf().setVisible(true);
    }

    public JFrame getJf() {
        if (jf == null) {
            jf = new JFrame("ATM");
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setBounds(550, 100, 700, 750);
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

    public JLabel getLblhesapolustur() {
        if (lblhesapolustur == null) {
            lblhesapolustur = new JLabel("Hesap Olustur");
            lblhesapolustur.setFont(font);
            lblhesapolustur.setBounds(240, 50, 300, 50);
            lblhesapolustur.setForeground(Color.white);

        }
        return lblhesapolustur;
    }

    public JLabel getLblkrtno() {
        if (lblkrtno == null) {
            lblkrtno = new JLabel("KART NUMARASI");
            lblkrtno.setFont(font2);
            lblkrtno.setBounds(150, 125, 200, 15);
            lblkrtno.setForeground(Color.white);
        }
        return lblkrtno;
    }

    public JLabel getLblkrtno2() {
        if (lblkrtno2 == null) {
            lblkrtno2 = new JLabel("_ _ _ _   _ _ _ _   _ _ _ _   _ _ _ _");
            lblkrtno2.setForeground(Color.white);
            lblkrtno2.setLocation(150, 150);
            lblkrtno2.setSize(270, 40);
            lblkrtno2.setFont(font2);
        }
        return lblkrtno2;
    }

    public void setLblkrtno2(JLabel lblkrtno2) {
        this.lblkrtno2 = lblkrtno2;
    }

    public JButton getBtn3() {
        if (btn3 == null) {
            btn3 = new JButton();
            btn3.setBounds(425, 145, 125, 40);
            btn3.setBackground(Color.GREEN);
            btn3.setBorder(null);
            btn3.setText("KART NO AL");
            btn3.setForeground(Color.white);
            btn3.setFont(font2);
            btn3.addActionListener(getO());

        }
        return btn3;
    }

    public String strtemp = "";

   

    public JLabel getLblname() {
        if (lblname == null) {
            lblname = new JLabel("İSİM");
            lblname.setFont(font2);
            lblname.setBounds(150, 205, 200, 15);
            lblname.setForeground(Color.white);
        }
        return lblname;
    }

    public JTextField getName() {
        if (name == null) {
            name = new JTextField();
            name.setLocation(150, 230);
            name.setSize(400, 40);
            name.setBackground(Color.white);
            name.setFont(font2);
            name.addKeyListener(new KeyAdapter() {

                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < 'a') || (c > 'z')) && (c !=' ') && ((c < 'A') || (c > 'Z')) && (c != KeyEvent.VK_BACK_SPACE)) {

                        e.consume();
                    }
                }
            });
        }
        return name;
    }

    public JLabel getLbllastname() {
        if (lbllastname == null) {
            lbllastname = new JLabel("SOYİSİM");
            lbllastname.setFont(font2);
            lbllastname.setBounds(150, 285, 200, 15);
            lbllastname.setForeground(Color.white);

        }

        return lbllastname;
    }

    public JTextField getLastname() {
        if (lastname == null) {
            lastname = new JTextField();
            lastname.setLocation(150, 310);
            lastname.setSize(400, 40);
            lastname.setBackground(Color.white);
            lastname.setFont(font2);
            lastname.addKeyListener(new KeyAdapter() {

                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < 'a') || (c > 'z')) && ((c < 'A') || (c > 'Z')) && (c != KeyEvent.VK_BACK_SPACE)) {

                        e.consume();
                    }
                }
            });
        }
        return lastname;
    }

    public JLabel getLbltc() {
        if (lbltc == null) {
            lbltc = new JLabel("T.C");
            lbltc.setFont(font2);
            lbltc.setBounds(150, 365, 200, 15);
            lbltc.setForeground(Color.white);

        }
        return lbltc;
    }

    public JTextField getTc() {
        if (tc == null) {
            tc = new JTextField();
            tc.setLocation(150, 390);
            tc.setSize(400, 40);
            tc.setBackground(Color.white);
            tc.setFont(font2);
            tc.addKeyListener(new KeyAdapter() {

                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                        e.consume();
                    }
                }
            });
        }
        return tc;
    }

    public JLabel getLbldt() {
        if (lbldt == null) {
            lbldt = new JLabel("DOĞUM TARİHİ");
            lbldt.setFont(font2);
            lbldt.setBounds(150, 445, 200, 15);
            lbldt.setForeground(Color.white);

        }
        return lbldt;
    }

    public JTextField getDt1() {
        if (dt1 == null) {
            dt1 = new JTextField();
            dt1.setLocation(150, 475);
            dt1.setSize(114, 40);
            dt1.setBackground(Color.white);
            dt1.setFont(font2);
            dt1.addKeyListener(new KeyAdapter() {

                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {

                        e.consume();
                    }
                }
            });
        }
        return dt1;
    }

    public JTextField getDt2() {
        if (dt2 == null) {
            dt2 = new JTextField();
            dt2.setLocation(274, 475);
            dt2.setSize(114, 40);
            dt2.setBackground(Color.white);
            dt2.setFont(font2);
            dt2.addKeyListener(new KeyAdapter() {

                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {

                        e.consume();
                    }
                }
            });
        }
        return dt2;
    }

    public JTextField getDt3() {
        if (dt3 == null) {
            dt3 = new JTextField();
            dt3.setLocation(398, 475);
            dt3.setSize(152, 40);
            dt3.setBackground(Color.white);
            dt3.setFont(font2);
            dt3.addKeyListener(new KeyAdapter() {

                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {

                        e.consume();
                    }
                }
            });
        }
        return dt3;
    }

    public JLabel getLblpassword() {
        if (lblpassword == null) {
            lblpassword = new JLabel("SİFRE");
            lblpassword.setFont(font2);
            lblpassword.setBounds(150, 525, 100, 15);
            lblpassword.setForeground(Color.white);
        }
        return lblpassword;
    }

    public JPasswordField getPassword() {
        if (password == null) {
            password = new JPasswordField();
            password.setLocation(150, 550);
            password.setSize(400, 40);
            password.setFont(font2);
        }
        return password;
    }

    public JButton getBtn() {
        if (btn == null) {
            btn = new JButton();
            btn.setBounds(175, 610, 160, 40);
            btn.setBackground(Color.gray);
            btn.setBorder(null);
            btn.setText("OLUSTUR");
            btn.setForeground(Color.white);
            btn.addActionListener(getO());
            btn.setFont(font2);

        }
        return btn;
    }

   

    public JButton getBtn2() {

        if (btn2 == null) {
            btn2 = new JButton();
            btn2.setBounds(365, 610, 160, 40);
            btn2.setBackground(Color.red);
            btn2.setBorder(null);
            btn2.setText("GERİ");
            btn2.setForeground(Color.white);
            btn2.setFont(font2);
            btn2.addActionListener(getO());
        }
        return btn2;
    }

    public class MainGuiAc implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            MainGui hg = new MainGui();
            getJf().setVisible(false);
        }
    }

    public JLabel getLblBasarili() {
        if (lblBasarili == null) {
            lblBasarili = new JLabel("Hesap Başarıyla Oluşturuldu");
            lblBasarili.setFont(font2);
            lblBasarili.setBounds(240, 670, 400, 20);
            lblBasarili.setForeground(Color.white);

        }

        return lblBasarili;
    }

}
