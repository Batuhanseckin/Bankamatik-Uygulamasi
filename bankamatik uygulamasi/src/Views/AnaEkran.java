package Views;

import Logic.Olaylar;
import java.awt.*;
import java.awt.event.*;
import java.util.prefs.Preferences;
import javax.swing.*;
import Views.*;

public class AnaEkran {

    Font font = new Font("Footlight MT Light", Font.BOLD, 35);
    Font font2 = new Font("Arial", Font.LAYOUT_NO_LIMIT_CONTEXT, 20);
    Font font3 = new Font("Arial", Font.BOLD, 15);
    Font font4 = new Font("Arial", Font.BOLD, 30);
    Font font5 = new Font("Arial", Font.BOLD, 30);
    

    MainGui mng;
    JFrame jf;
    JPanel jp, jpSifre, jpbakiye;
    JLabel lblsec;
    JButton btn;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JLabel lblNameLastname;

    //Şifre
    JPasswordField txt_eskisifre, txt_yenisifre;
    JLabel lbleskisifre, lblyenisifre,lblsifre;
    JButton btndegistir, btnsifregeri;
    // bakiye
    JLabel lblbakiye, lblbakiye2;
    JButton btnbakiyegeri;
    
    // transfer
     JButton btngeri, btngonder;

 
    JPanel jpTransfer;
    JLabel lblsect, lblkart, lblisim, lblaciklama, lbltutar;
    JTextField txt_kno, txt_isim, txt_aciklama, txt_tutar;
    
    //PARA CEKME
    JButton btncekmegeri, btncekmegonder,btn10,btn20,btn50,btn100,btn200;

    
    JPanel JpParaCekme;
    JLabel lblsecc,lbldiger,lblcekildi;

   
    JTextField  txt_tutarcekme;

    //PARA YATIRMA
    JButton btnyatirmageri, btnyatirmagonder,btnyatirma10,btnyatirma20,btnyatirma50,btnyatirma100,btnyatirma200;

    
    JPanel JpParayatirma;
    JLabel lblsecy,lbldigery,lblyatirildi;

   
    JTextField  txt_tutaryatirma;

    Olaylar o;

    public Olaylar getO() {
        if (o == null) {
            o = new Olaylar(this, null, null);
        }
        return o;
    }

    public AnaEkran() {
        getJf();
        getJp().add(getLblsec());
        getJp().add(getBtn());
        getJp().add(getBtn2());
        getJp().add(getBtn3());
        getJp().add(getBtn4());
        getJp().add(getBtn5());
        getJp().add(getBtn6());
        getJp().add(getLblNameLastname());

        getJpSifre().add(getTxt_eskisifre());
        getJpSifre().add(getTxt_yenisifre());
        getJpSifre().add(getLbleskisifre());
        getJpSifre().add(getLblyenisifre());
        getJpSifre().add(getBtndegistir());
        getJpSifre().add(getBtnsifregeri()); 
        getJpSifre().add(getLblsifre());

        getJpbakiye().add(getLblbakiye());
        getJpbakiye().add(getLblbakiye2());
        getJpbakiye().add(getBtnbakiyegeri());
        
         getJpTransfer().add(getLblsect());
        getJpTransfer().add(getLblkart());
        getJpTransfer().add(getTxt_kno());
        getJpTransfer().add(getLblisim());
        getJpTransfer().add(getTxt_aciklama());
        getJpTransfer().add(getTxt_isim());
        getJpTransfer().add(getLblaciklama());
        getJpTransfer().add(getBtngeri());
        getJpTransfer().add(getBtngonder());
        getJpTransfer().add(getTxt_tutar());
        getJpTransfer().add(getLbltutar());
        
        //para cekme
         getJpParaCekme().add(getLblsecc());
        getJpParaCekme().add(getBtn10());
        getJpParaCekme().add(getBtn20());
        getJpParaCekme().add(getBtn50());
        getJpParaCekme().add(getBtn100());
        getJpParaCekme().add(getBtn200()); 
        getJpParaCekme().add(getCekmeBtngeri());
        getJpParaCekme().add(getLblcekildi());
        getJpParaCekme().add(getcekmeBtngonder());
        getJpParaCekme().add(getTxt_tutarcekme());
        getJpParaCekme().add(getLbldiger());
         
        //PARA YATİRMA 
         getJpParaYatirma().add(getLblsecy());
        getJpParaYatirma().add(getBtnYatirma10());
        getJpParaYatirma().add(getBtnYatirma20());
        getJpParaYatirma().add(getBtnYatirma50());
        getJpParaYatirma().add(getBtnYatirma100());
        getJpParaYatirma().add(getBtnYatirma200()); 
        getJpParaYatirma().add(getYatirmaBtngeri());
        getJpParaYatirma().add(getLblyatirildi());
        getJpParaYatirma().add(getyatirmaBtngonder());
        getJpParaYatirma().add(getTxt_tutaryatirma());
        getJpParaYatirma().add(getLbldigery());
        
        getJf().add(getJp());
        getJf().setVisible(true);
    }

    public JFrame getJf() {
        if (jf == null) {
            jf = new JFrame("ATM");
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setBounds(550, 250, 800, 450);
            //jf.setContentPane(getJp());
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

    public JLabel getLblsec() {
        if (lblsec == null) {
            lblsec = new JLabel("SECIMINIZI YAPINIZ");
            lblsec.setFont(font);
            lblsec.setBounds(210, 35, 350, 40);
            lblsec.setForeground(Color.white);
        }
        return lblsec;
    }

    public JButton getBtn() {
        if (btn == null) {
            btn = new JButton();
            btn.setBounds(64, 100, 300, 75);
            btn.setBackground(Color.gray);
            btn.setBorder(null);
            btn.setText("PARA ÇEKME");
            btn.setForeground(Color.white);
            btn.setFont(font2);
            btn.addActionListener(getO());
        }
        return btn;
    }

    public JButton getBtn2() {
        if (btn2 == null) {
            btn2 = new JButton();
            btn2.setBounds(64, 185, 300, 75);
            btn2.setBackground(Color.gray);
            btn2.setBorder(null);
            btn2.setText("PARA YATIRMA");
            btn2.setForeground(Color.white);
            btn2.setFont(font2);
            btn2.addActionListener(getO());
        }
        return btn2;
    }

    public JButton getBtn3() {
        if (btn3 == null) {
            btn3 = new JButton();
            btn3.setBounds(64, 270, 300, 75);
            btn3.setBackground(Color.gray);
            btn3.setBorder(null);
            btn3.setText("PARA TRANSFERİ");
            btn3.setForeground(Color.white);
            btn3.setFont(font2);
            btn3.addActionListener(getO());
        }
        return btn3;
    }

    public JButton getBtn4() {
        if (btn4 == null) {
            btn4 = new JButton();
            btn4.setBounds(425, 100, 300, 75);
            btn4.setBackground(Color.gray);
            btn4.setBorder(null);
            btn4.setText("BAKİYE GÖRÜNTÜLEME");
            btn4.setForeground(Color.white);
            btn4.setFont(font2);
            btn4.addActionListener(getO());
        }
        return btn4;
    }

    public JButton getBtn5() {
        if (btn5 == null) {
            btn5 = new JButton();
            btn5.setBounds(425, 185, 300, 75);
            btn5.setBackground(Color.gray);
            btn5.setBorder(null);
            btn5.setText("ŞİFRE İŞLEMLERİ");
            btn5.setForeground(Color.white);
            btn5.setFont(font2);
            btn5.addActionListener(getO());
        }
        return btn5;
    }

    public JButton getBtn6() {
        if (btn6 == null) {
            btn6 = new JButton();
            btn6.setBounds(425, 270, 300, 75);
            btn6.setBackground(Color.red);
            btn6.setBorder(null);
            btn6.setText("ÇIKIŞ");
            btn6.setForeground(Color.white);
            btn6.setFont(font2);
            btn6.addActionListener(getO());
        }
        return btn6;
    }

    public JLabel getLblNameLastname() {
        if (lblNameLastname == null) {
            Preferences pref = Preferences.userNodeForPackage(MainGui.class);
            lblNameLastname = new JLabel(pref.get("isim", ""));
            lblNameLastname.setFont(font3);
            lblNameLastname.setBounds(10, 0, 400, 50);
            lblNameLastname.setForeground(Color.green);
        }
        return lblNameLastname;
    }

    //Sifre Paneli
    public JPanel getJpSifre() {
        if (jpSifre == null) {
            jpSifre = new JPanel();
            jpSifre.setLayout(null);
            jpSifre.setBackground(Color.darkGray);
        }
        return jpSifre;
    }

    public JPasswordField getTxt_eskisifre() {
        if (txt_eskisifre == null) {
            txt_eskisifre = new JPasswordField();
            txt_eskisifre.setLocation(200, 90);
            txt_eskisifre.setSize(350, 50);
            txt_eskisifre.setBackground(Color.white);
        }
        return txt_eskisifre;
    }

    public JPasswordField getTxt_yenisifre() {
        if (txt_yenisifre == null) {
            txt_yenisifre = new JPasswordField();
            txt_yenisifre.setLocation(200, 170);
            txt_yenisifre.setSize(350, 50);
            txt_yenisifre.setBackground(Color.white);
            txt_yenisifre.setFont(font2);
        }
        return txt_yenisifre;
    }

    public JLabel getLbleskisifre() {
        if (lbleskisifre == null) {
            lbleskisifre = new JLabel("ESKİ ŞİFRE");
            lbleskisifre.setFont(font2);
            lbleskisifre.setBounds(30, 75, 200, 80);
            lbleskisifre.setForeground(Color.white);
        }
        return lbleskisifre;
    }

    public JLabel getLblyenisifre() {
        if (lblyenisifre == null) {
            lblyenisifre = new JLabel("YENİ SİFRE");
            lblyenisifre.setFont(font2);
            lblyenisifre.setBounds(30, 150, 200, 90);
            lblyenisifre.setForeground(Color.white);
        }
        return lblyenisifre;
    }

    public JButton getBtndegistir() {
        if (btndegistir == null) {
            btndegistir = new JButton();
            btndegistir.setBounds(370, 250, 170, 40);
            btndegistir.setBackground(Color.green);
            btndegistir.setBorder(null);
            btndegistir.setText("DEĞİŞTİR");
            btndegistir.setForeground(Color.white);
            btndegistir.setFont(font2);
            btndegistir.addActionListener(getO());
        }

        return btndegistir;
    }

    public JButton getBtnsifregeri() {
        if (btnsifregeri == null) {
            btnsifregeri = new JButton();
            btnsifregeri.setBounds(200, 250, 150, 40);
            btnsifregeri.setBackground(Color.RED);
            btnsifregeri.setBorder(null);
            btnsifregeri.setText("GERİ");
            btnsifregeri.setForeground(Color.white);
            btnsifregeri.setFont(font2);
            btnsifregeri.addActionListener(getO());
        }
        return btnsifregeri;
    }
public JLabel getLblsifre() {
         if (lblsifre == null) {
            lblsifre = new JLabel("");
            lblsifre.setFont(font3);
            lblsifre.setBounds(250, 365, 450, 40);
            lblsifre.setForeground(Color.GREEN);
        }
        return lblsifre;
    }

    public void setLblsifre(JLabel lblsifre) {
        this.lblsifre = lblsifre;
    }
    //Sifre Paneli BİTİŞ
    
    
    // BAKİYE GÖRÜNTÜLEME
    public JLabel getLblbakiye() {
        if (lblbakiye == null) {
            lblbakiye = new JLabel("MEVCUT BAKIYENIZ");
            lblbakiye.setFont(font);
            lblbakiye.setBounds(215, 35, 450, 40);
            lblbakiye.setForeground(Color.white);
        }
        return lblbakiye;
    }

    public JLabel getLblbakiye2() {
        if (lblbakiye2 == null) {
            lblbakiye2 = new JLabel("1000 TL");
            lblbakiye2.setFont(font4);
            lblbakiye2.setBounds(325, 135, 170, 40);
            lblbakiye2.setForeground(Color.white);
        }
        return lblbakiye2;
    }

    public JButton getBtnbakiyegeri() {
        if (btnbakiyegeri == null) {
            btnbakiyegeri = new JButton();
            btnbakiyegeri.setBounds(325, 250, 150, 40);
            btnbakiyegeri.setBackground(Color.RED);
            btnbakiyegeri.setBorder(null);
            btnbakiyegeri.setText("GERİ");
            btnbakiyegeri.setForeground(Color.white);
            btnbakiyegeri.setFont(font2);
            btnbakiyegeri.addActionListener(getO());
        }
        return btnbakiyegeri;
    }

    public JPanel getJpbakiye() {

        if (jpbakiye == null) {
            jpbakiye = new JPanel();
            jpbakiye.setLayout(null);
            jpbakiye.setBackground(Color.darkGray);
        }
        return jpbakiye;
    }

    //BAKİYE GÖRÜNTÜLEME

//PARA TRANSFERİ
 public JPanel getJpTransfer() {
        if (jpTransfer == null) {
            jpTransfer = new JPanel();
            jpTransfer.setLayout(null);
            jpTransfer.setBackground(Color.darkGray);
        }
        return jpTransfer;
    }

    public JLabel getLblsect() {
        if (lblsect == null) {
            lblsect = new JLabel("Lütfen Gerekli Bilgileri Giriniz");
            lblsect.setFont(font);
            lblsect.setBounds(130, 35, 550, 40);
            lblsect.setForeground(Color.white);
        }
        return lblsect;
    }

    public JLabel getLblkart() {
        if (lblkart == null) {
            lblkart = new JLabel("Kart Numarası Giriniz");
            lblkart.setFont(font3);
            lblkart.setBounds(64, 90, 450, 40);
            lblkart.setForeground(Color.white);
        }
        return lblkart;
    }

    public JTextField getTxt_kno() {
        if (txt_kno == null) {
            txt_kno = new JTextField();
            txt_kno.setLocation(250, 90);
            txt_kno.setSize(350, 50);
            txt_kno.setBackground(Color.white);
            txt_kno.setFont(font2);
            txt_kno.addKeyListener(new KeyAdapter() {

                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                        e.consume();
                    }
                }
            });
        }

        return txt_kno;
    }

    public JLabel getLblisim() {
        if (lblisim == null) {
            lblisim = new JLabel("Gönderilecek Ad Soyad");
            lblisim.setFont(font3);
            lblisim.setBounds(64, 155, 450, 40);
            lblisim.setForeground(Color.white);

        }
        return lblisim;
    }

    public JLabel getLblaciklama() {
        if (lblaciklama == null) {
            lblaciklama = new JLabel("Açıklama Giriniz");
            lblaciklama.setFont(font3);
            lblaciklama.setBounds(64, 220, 450, 40);
            lblaciklama.setForeground(Color.white);
        }
        return lblaciklama;
    }

    public JTextField getTxt_isim() {
        if (txt_isim == null) {
            txt_isim = new JTextField();
            txt_isim.setLocation(250, 155);
            txt_isim.setSize(350, 50);
            txt_isim.setBackground(Color.white);
            txt_isim.setFont(font2);
            txt_isim.addKeyListener(new KeyAdapter() {

                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < 'a') || (c > 'z')) && (c != ' ') && ((c < 'A') || (c > 'Z')) && (c != KeyEvent.VK_BACK_SPACE)) {

                        e.consume();
                    }
                }
            });

        }
        return txt_isim;
    }

    public JTextField getTxt_aciklama() {
        if (txt_aciklama == null) {
            txt_aciklama = new JTextField();
            txt_aciklama.setLocation(250, 220);
            txt_aciklama.setSize(350, 50);
            txt_aciklama.setBackground(Color.white);
            txt_aciklama.setFont(font2);

        }
        return txt_aciklama;
    }

    public JLabel getLbltutar() {
        if (lbltutar == null) {
            lbltutar = new JLabel("Yatırılacak Tutarı Giriniz");
            lbltutar.setFont(font3);
            lbltutar.setBounds(64, 285, 450, 40);
            lbltutar.setForeground(Color.white);
        }
        return lbltutar;
    }

    public JTextField getTxt_tutar() {
        if (txt_tutar == null) {
            txt_tutar = new JTextField();
            txt_tutar.setLocation(250, 285);
            txt_tutar.setSize(350, 50);
            txt_tutar.setBackground(Color.white);
            txt_tutar.setFont(font2);
            txt_tutar.addKeyListener(new KeyAdapter() {

                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                        e.consume();
                    }
                }
            });

        }
        return txt_tutar;
    }

    public JButton getBtngeri() {
        if (btngeri == null) {
            btngeri = new JButton();
            btngeri.setBounds(250, 350, 160, 40);
            btngeri.setBackground(Color.red);
            btngeri.setBorder(null);
            btngeri.setText("GERİ");
            btngeri.setForeground(Color.white);
            btngeri.setFont(font2);
            btngeri.addActionListener(getO());
        }
        return btngeri;
    }

 

    public JButton getBtngonder() {
        if (btngonder == null) {
            btngonder = new JButton();
            btngonder.setBounds(440, 350, 160, 40);
            btngonder.setBackground(Color.GREEN);
            btngonder.setBorder(null);
            btngonder.setText("GÖNDER");
            btngonder.setForeground(Color.white);
            btngonder.setFont(font2);
            btngonder.addActionListener(getO());
        }
        return btngonder;
    }


//PARA TRANSFERİ
    
    //PARA CEKME
    public JPanel getJpParaCekme() {
        if (JpParaCekme == null) {
            JpParaCekme = new JPanel();
            JpParaCekme.setLayout(null);
            JpParaCekme.setBackground(Color.darkGray);
        }
        return JpParaCekme;
    }
      


    public JLabel getLblsecc() {
        if (lblsecc == null) {
            lblsecc = new JLabel("Lütfen Çekilicek Tutarı Giriniz");
            lblsecc.setFont(font);
            lblsecc.setBounds(130, 35, 550, 40);
            lblsecc.setForeground(Color.white);
        }
        return lblsecc;
    }

   

    public JTextField getTxt_tutarcekme() {
        if (txt_tutarcekme == null) {
            txt_tutarcekme = new JTextField();
            txt_tutarcekme.setLocation(200, 260);
            txt_tutarcekme.setSize(360, 50);
            txt_tutarcekme.setBackground(Color.white);
            txt_tutarcekme.setFont(font2);
            txt_tutarcekme.addKeyListener(new KeyAdapter() {

                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                        e.consume();
                    }
                }
            });

        }
        return txt_tutarcekme;
    }
     public JLabel getLblcekildi() {
         if (lblcekildi == null) {
            lblcekildi = new JLabel("");
            lblcekildi.setFont(font3);
            lblcekildi.setBounds(250, 365, 450, 40);
            lblcekildi.setForeground(Color.GREEN);
        }
        return lblcekildi;
    }

    public void setLblcekildi(JLabel lblcekildi) {
        this.lblcekildi = lblcekildi;
    }
     
    public JButton getCekmeBtngeri() {
        if (btncekmegeri == null) {
            btncekmegeri = new JButton();
            btncekmegeri.setBounds(200, 330, 160, 40);
            btncekmegeri.setBackground(Color.red);
            btncekmegeri.setBorder(null);
            btncekmegeri.setText("GERİ");
            btncekmegeri.setForeground(Color.white);
            btncekmegeri.setFont(font2);
            btncekmegeri.addActionListener(getO());
        }
        return btncekmegeri;
    }

     
 
    public JButton getcekmeBtngonder() {
        if (btncekmegonder == null) {
            btncekmegonder = new JButton();
            btncekmegonder.setBounds(400, 330, 160, 40);
            btncekmegonder.setBackground(Color.GREEN);
            btncekmegonder.setBorder(null);
            btncekmegonder.setText("ONAYLA");
            btncekmegonder.setForeground(Color.white);
            btncekmegonder.setFont(font2);
            btncekmegonder.addActionListener(getO());
        }
        return btncekmegonder;
    } 
         public JButton getBtn10() {
        if (btn10 == null) {
            btn10 = new JButton();
            btn10.setBounds(200, 80, 160, 50);
            btn10.setBackground(Color.gray);
            btn10.setBorder(null);
            btn10.setText("10 TL");
            btn10.setForeground(Color.white);
            btn10.setFont(font2);
            btn10.addActionListener(getO());
        }
        return btn10;
    }
    public JButton getBtn20() {
        if (btn20 == null) {
            btn20 = new JButton();
            btn20.setBounds(200, 140, 160, 50);
            btn20.setBackground(Color.gray);
            btn20.setBorder(null);
            btn20.setText("20 TL");
            btn20.setForeground(Color.white);
            btn20.setFont(font2);
            btn20.addActionListener(getO());
        }
        return btn20;
    } 
    public JButton getBtn50() {
        if (btn50 == null) {
            btn50 = new JButton();
            btn50.setBounds(400, 200, 160, 50);
            btn50.setBackground(Color.gray);
            btn50.setBorder(null);
            btn50.setText("50 TL");
            btn50.setForeground(Color.white);
            btn50.setFont(font2);
            btn50.addActionListener(getO());
        }
        return btn50;
    }
    public JButton getBtn100() {
        if (btn100 == null) {
            btn100 = new JButton();
            btn100.setBounds(400, 80, 160, 50);
            btn100.setBackground(Color.gray);
            btn100.setBorder(null);
            btn100.setText("100 TL");
            btn100.setForeground(Color.white);
            btn100.setFont(font2);
            btn100.addActionListener(getO());
        }
        return btn100;
    }
    public JButton getBtn200() {
        if (btn200 == null) {
            btn200 = new JButton();
            btn200.setBounds(400, 140, 160, 50);
            btn200.setBackground(Color.gray);
            btn200.setBorder(null);
            btn200.setText("200 TL");
            btn200.setForeground(Color.white);
            btn200.setFont(font2);
            btn200.addActionListener(getO());
        }
        return btn200;
    }

    public JLabel getLbldiger() {
         if (lbldiger == null) {
            lbldiger = new JLabel("Diger");
            lbldiger.setFont(font5);
            lbldiger.setBounds(210, 200, 160, 40);
            lbldiger.setForeground(Color.white);
        }
        return lbldiger;
    }
     

    
    //PARA CEKME
    
    //PARA YATIRMA
     public JPanel getJpParaYatirma() {
        if (JpParayatirma == null) {
            JpParayatirma = new JPanel();
            JpParayatirma.setLayout(null);
            JpParayatirma.setBackground(Color.darkGray);
        }
        return JpParayatirma;
    }
      


    public JLabel getLblsecy() {
        if (lblsecy == null) {
            lblsecy = new JLabel("Lütfen Yatirilicak Tutarı Giriniz");
            lblsecy.setFont(font);
            lblsecy.setBounds(130, 35, 550, 40);
            lblsecy.setForeground(Color.white);
        }
        return lblsecy;
    }

   

    public JTextField getTxt_tutaryatirma() {
        if (txt_tutaryatirma == null) {
            txt_tutaryatirma = new JTextField();
            txt_tutaryatirma.setLocation(200, 260);
            txt_tutaryatirma.setSize(360, 50);
            txt_tutaryatirma.setBackground(Color.white);
            txt_tutaryatirma.setFont(font2);
            txt_tutaryatirma.addKeyListener(new KeyAdapter() {

                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                        e.consume();
                    }
                }
            });

        }
        return txt_tutaryatirma;
    }
     public JLabel getLblyatirildi() {
         if (lblyatirildi == null) {
            lblyatirildi = new JLabel("");
            lblyatirildi.setFont(font3);
            lblyatirildi.setBounds(250, 365, 450, 40);
            lblyatirildi.setForeground(Color.GREEN);
        }
        return lblyatirildi;
    }

    public void setLblyatirildi(JLabel lblcekildi) {
        this.lblyatirildi = lblcekildi;
    }
     
    public JButton getYatirmaBtngeri() {
        if (btnyatirmageri == null) {
            btnyatirmageri = new JButton();
            btnyatirmageri.setBounds(200, 330, 160, 40);
            btnyatirmageri.setBackground(Color.red);
            btnyatirmageri.setBorder(null);
            btnyatirmageri.setText("GERİ");
            btnyatirmageri.setForeground(Color.white);
            btnyatirmageri.setFont(font2);
            btnyatirmageri.addActionListener(getO());
        }
        return btnyatirmageri;
    }

     
 
    public JButton getyatirmaBtngonder() {
        if (btnyatirmagonder == null) {
            btnyatirmagonder = new JButton();
            btnyatirmagonder.setBounds(400, 330, 160, 40);
            btnyatirmagonder.setBackground(Color.GREEN);
            btnyatirmagonder.setBorder(null);
            btnyatirmagonder.setText("ONAYLA");
            btnyatirmagonder.setForeground(Color.white);
            btnyatirmagonder.setFont(font2);
            btnyatirmagonder.addActionListener(getO());
        }
        return btnyatirmagonder;
    } 
         public JButton getBtnYatirma10() {
        if (btnyatirma10 == null) {
            btnyatirma10 = new JButton();
            btnyatirma10.setBounds(200, 80, 160, 50);
            btnyatirma10.setBackground(Color.gray);
            btnyatirma10.setBorder(null);
            btnyatirma10.setText("10 TL");
            btnyatirma10.setForeground(Color.white);
            btnyatirma10.setFont(font2);
            btnyatirma10.addActionListener(getO());
        }
        return btnyatirma10;
    }
    public JButton getBtnYatirma20() {
        if (btnyatirma20 == null) {
            btnyatirma20 = new JButton();
            btnyatirma20.setBounds(200, 140, 160, 50);
            btnyatirma20.setBackground(Color.gray);
            btnyatirma20.setBorder(null);
            btnyatirma20.setText("20 TL");
            btnyatirma20.setForeground(Color.white);
            btnyatirma20.setFont(font2);
            btnyatirma20.addActionListener(getO());
        }
        return btnyatirma20;
    } 
    public JButton getBtnYatirma50() {
        if (btnyatirma50 == null) {
            btnyatirma50 = new JButton();
            btnyatirma50.setBounds(400, 200, 160, 50);
            btnyatirma50.setBackground(Color.gray);
            btnyatirma50.setBorder(null);
            btnyatirma50.setText("50 TL");
            btnyatirma50.setForeground(Color.white);
            btnyatirma50.setFont(font2);
            btnyatirma50.addActionListener(getO());
        }
        return btnyatirma50;
    }
    public JButton getBtnYatirma100() {
        if (btnyatirma100 == null) {
            btnyatirma100 = new JButton();
            btnyatirma100.setBounds(400, 80, 160, 50);
            btnyatirma100.setBackground(Color.gray);
            btnyatirma100.setBorder(null);
            btnyatirma100.setText("100 TL");
            btnyatirma100.setForeground(Color.white);
            btnyatirma100.setFont(font2);
            btnyatirma100.addActionListener(getO());
        }
        return btnyatirma100;
    }
    public JButton getBtnYatirma200() {
        if (btnyatirma200 == null) {
            btnyatirma200 = new JButton();
            btnyatirma200.setBounds(400, 140, 160, 50);
            btnyatirma200.setBackground(Color.gray);
            btnyatirma200.setBorder(null);
            btnyatirma200.setText("200 TL");
            btnyatirma200.setForeground(Color.white);
            btnyatirma200.setFont(font2);
            btnyatirma200.addActionListener(getO());
        }
        return btnyatirma200;
    }

    public JLabel getLbldigery() {
         if (lbldigery == null) {
            lbldigery = new JLabel("Diger");
            lbldigery.setFont(font5);
            lbldigery.setBounds(210, 200, 160, 40);
            lbldigery.setForeground(Color.white);
        }
        return lbldigery;
    }
    //PARA YATIRMA
}