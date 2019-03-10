/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Logic.*;
import Views.AnaEkran;
import Views.DBConnection;
import Views.HesapAcGui;
import Views.MainGui;
import Views.Musteri;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Random;
import java.util.prefs.Preferences;
import sun.nio.cs.ext.PCK;

public class Olaylar implements ActionListener {

    DBConnection db = new DBConnection();
    Font font = new Font("Footlight MT Light", Font.BOLD, 35);
    Font font2 = new Font("Verdana", Font.BOLD, 14);
    Font font3 = new Font("Verdana", Font.BOLD, 20);
    Connection conn = null;
    private String query = null;
    private ResultSet rs;
    static Statement statement = null;
    String url = ("jdbc:derby://localhost:1527/dbatm");
    String usrName = "kullanici";
    String pwd = "123456";
    AnaEkran aekrn;
    MainGui mng;
    HesapAcGui hg;

    public Olaylar(AnaEkran aekrn, MainGui mng, HesapAcGui hg) {
        this.aekrn = aekrn;
        this.mng = mng;
        this.hg = hg;
    }

    public Olaylar() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Ana ekran içindeki Button Olayları
        if (aekrn != null) {
            if (e.getSource() == aekrn.getBtn()) {

                aekrn.getJf().add(aekrn.getJpParaCekme());
                aekrn.getJpParaCekme().setVisible(true);
                aekrn.getJp().setVisible(false);
            }
            if (e.getSource() == aekrn.getBtn6()) {
                MainGui mng = new MainGui();
                aekrn.getJf().setVisible(false);
            }
            if (e.getSource() == aekrn.getBtn2()) {
                aekrn.getJf().add(aekrn.getJpParaYatirma());
                aekrn.getJpParaYatirma().setVisible(true);
                aekrn.getJp().setVisible(false);
            }
            if (e.getSource() == aekrn.getBtn3()) {
                aekrn.getJf().add(aekrn.getJpTransfer());
                aekrn.getJpTransfer().setVisible(true);
                aekrn.getJp().setVisible(false);
            }
            if (e.getSource() == aekrn.getBtn5()) {

                aekrn.getJf().add(aekrn.getJpSifre());
                aekrn.getJpSifre().setVisible(true);
                aekrn.getJp().setVisible(false);
            }
            if (e.getSource() == aekrn.getBtnsifregeri()) {
                aekrn.getJp().setVisible(true);
                aekrn.getJpSifre().setVisible(false);
            }
            if (e.getSource() == aekrn.getBtndegistir()) {
                Preferences pref = Preferences.userNodeForPackage(MainGui.class);
                String sifredurum = db.sifredegis(aekrn.getTxt_eskisifre().getText(), aekrn.getTxt_yenisifre().getText(), pref.get("kartno", ""));
                if (sifredurum.equals("1")) {
                    System.out.println("Sifre Değiştirme Başarılı");
                    aekrn.getLblsifre().setText("Sifre Değiştirme Başarılı");
                } else {
                    aekrn.getLblsifre().setText("Eski Parolanız Hatalı");
                    System.out.println("Eski Parolanız Hatalı");
                }
            }
            if (e.getSource() == aekrn.getBtn4()) {
                aekrn.getJf().add(aekrn.getJpbakiye());

                aekrn.getJpbakiye().setVisible(true);

                Preferences pref = Preferences.userNodeForPackage(MainGui.class);
                aekrn.getLblbakiye2().setText(db.bakiye(pref.get("kartno", "")) + " TL");
                aekrn.getJp().setVisible(false);
            }
            if (e.getSource() == aekrn.getBtnbakiyegeri()) {

                aekrn.getJp().setVisible(true);
                aekrn.getJpbakiye().setVisible(false);
            }

            //pARA TRANSFERİ
            if (e.getSource() == aekrn.getBtngeri()) {
                aekrn.getJp().setVisible(true);
                aekrn.getJpTransfer().setVisible(false);
            }
            if (e.getSource() == aekrn.getBtngonder()) {
                if (aekrn.getTxt_tutar().getText().equals("")) {
                    System.out.println("Gerekli alanları doldurunuz");
                } else {
                    double ttr = (Double.parseDouble(aekrn.getTxt_tutar().getText()));
                    String kartno = aekrn.getTxt_kno().getText();
                    System.out.println(db.ParaGonderimi(kartno, ttr));
                }

            }

            //para çekme 
            if (e.getSource() == aekrn.getCekmeBtngeri()) {
                aekrn.getJp().setVisible(true);
                aekrn.getJpParaCekme().setVisible(false);
                    aekrn.getcekmeBtngonder().setEnabled(true);
                    aekrn.getcekmeBtngonder().setBackground(Color.green);
                    aekrn.getcekmeBtngonder().setForeground(Color.white);
            } else if (e.getSource() == aekrn.getcekmeBtngonder()) {
                if (aekrn.getTxt_tutarcekme().getText().equals("")) {

                    aekrn.getLblcekildi().setText("Lütfen önce bir tutar giriniz.");

                } else if ((Double.parseDouble(aekrn.getTxt_tutarcekme().getText()) % 10 == 0)) {
                            Preferences pref = Preferences.userNodeForPackage(MainGui.class);
                    if (Double.parseDouble(aekrn.getTxt_tutarcekme().getText()) < Double.parseDouble(db.bakiye(pref.get("kartno", "")))) 
                    {
                    aekrn.getTxt_tutarcekme().setText("");
                    aekrn.getcekmeBtngonder().setEnabled(false);
                    aekrn.getcekmeBtngonder().setBackground(Color.gray);
                    aekrn.getcekmeBtngonder().setForeground(Color.white);
                    }
                    aekrn.getLblcekildi().setText(db.ParaCekme(Double.parseDouble(aekrn.getTxt_tutarcekme().getText())));
                    
                     
                } else {
                    aekrn.getLblcekildi().setText("Yalnızca 10 ve katlarını çekebilirsiniz");
                }

            } else if (e.getSource() == aekrn.getBtn10()) {
                aekrn.getLblcekildi().setText(db.ParaCekme(10.0));
            } else if (e.getSource() == aekrn.getBtn20()) {
                aekrn.getLblcekildi().setText(db.ParaCekme(20.0));
            } else if (e.getSource() == aekrn.getBtn50()) {
                aekrn.getLblcekildi().setText(db.ParaCekme(50.0));
            } else if (e.getSource() == aekrn.getBtn100()) {
                aekrn.getLblcekildi().setText(db.ParaCekme(100.0));
            } else if (e.getSource() == aekrn.getBtn200()) {
                aekrn.getLblcekildi().setText(db.ParaCekme(200.0));
            }

            //para yatırma
            if (e.getSource() == aekrn.getYatirmaBtngeri()) {
                aekrn.getJp().setVisible(true);
                aekrn.getJpParaYatirma().setVisible(false);
            } else if (e.getSource() == aekrn.getyatirmaBtngonder()) {
                if (aekrn.getTxt_tutaryatirma().getText().equals("")) {

                    aekrn.getLblyatirildi().setText("Lütfen önce bir tutar giriniz.");

                } else if (Double.parseDouble(aekrn.getTxt_tutaryatirma().getText()) % 10 == 0) {
                    aekrn.getLblyatirildi().setText(db.ParaYatirma(Double.parseDouble(aekrn.getTxt_tutaryatirma().getText())));
                } else {
                    aekrn.getLblyatirildi().setText("Yalnızca 10 ve katlarını Yatirabilirsiniz");
                }

            } else if (e.getSource() == aekrn.getBtnYatirma10()) {
                aekrn.getLblyatirildi().setText(db.ParaYatirma(10.0));
            } else if (e.getSource() == aekrn.getBtnYatirma20()) {
                aekrn.getLblyatirildi().setText(db.ParaYatirma(20.0));
            } else if (e.getSource() == aekrn.getBtnYatirma50()) {
                aekrn.getLblyatirildi().setText(db.ParaYatirma(50.0));
            } else if (e.getSource() == aekrn.getBtnYatirma100()) {
                aekrn.getLblyatirildi().setText(db.ParaYatirma(100.0));
            } else if (e.getSource() == aekrn.getBtnYatirma200()) {
                aekrn.getLblyatirildi().setText(db.ParaYatirma(200.0));
            }
        }
        //Ana ekran içindeki Button Olayları Bitiş

        //MainGui içindeki Button Olayları
        if (mng != null) {
            if (e.getSource() == mng.getBtn()) {
                String durum = db.giris(mng.getTxt_usename().getText(), mng.getTxt_password().getText());
                if (durum.equals("1")) {
                    //if(true){
                    Preferences pref = Preferences.userNodeForPackage(MainGui.class);
                    pref.put("isim", db.isim(mng.getTxt_usename().getText()));
                    pref.put("kartno", mng.getTxt_usename().getText());

                    AnaEkran index = new AnaEkran();
                    mng.getJf().setVisible(false);
                } else {
                    System.out.println("Kullanıcı adı veya şifre hatalı");

                }
            }
            if (e.getSource() == mng.getBtn2()) {
                HesapAcGui hg = new HesapAcGui();
                mng.getJf().setVisible(false);
            }
            if (e.getSource() == mng.getBtn3()) { 
                db.guncelle();
            }
        }
        //MainGui içindeki Button Olayları Bitiş

        //Hesap Açma içindeki Button Olayları
        if (hg != null) {
            if (e.getSource() == hg.getBtn3()) {
                String temp = "";
                Random r = new Random();
                int a;
                for (int i = 0; i < 4; i++) {
                    a = (r.nextInt(9000)) + 1000;
                    hg.strtemp = (String.valueOf(a)) + hg.strtemp;
                    temp = (String.valueOf(a)) + " " + temp;

                }
                hg.getLblkrtno2().setForeground(Color.green);
                hg.getLblkrtno2().setFont(font3);
                //Kontrol ettirilicek var mı diye
                hg.getLblkrtno2().setText(temp);
            }
            if (e.getSource() == hg.getBtn()) {

                String StrKrtno = hg.strtemp;
                String StrAd = hg.getName().getText().toUpperCase();
                String StrSoyad = hg.getLastname().getText().toUpperCase();
                String StrTc = hg.getTc().getText();
                String StrDt = hg.getDt1().getText() + "/" + hg.getDt2().getText() + "/" + hg.getDt3().getText();
                String StrSifre = hg.getPassword().getText();

                //Formda boş yer var mı ?
                String temp2 = ("_ _ _ _   _ _ _ _   _ _ _ _   _ _ _ _");

                if (StrKrtno.equals(temp2) || StrAd.equals("") || StrSoyad.equals("") || StrTc.equals("") || StrDt.equals("") || StrSifre.equals("")) {
                    System.out.println("Lütfen Bilgileri Doğru Ve Eksiksiz Girdiğinizden Emin Olun.");
                } //Tc 11 karakter mi ?
                else if (StrTc.length() != 11) {
                    System.out.println("Tc Kimlik Numarası Hatalı");
                } //doğum tarihinde gün doğru girilmiş mi ?
                else if ((Integer.valueOf(hg.getDt1().getText()) < 1) || (Integer.valueOf(hg.getDt1().getText()) > 31)) {
                    System.out.println("Doğum Tarihi Hatalı");
                }//doğum tarihinde ay doğru girilmiş mi ?
                else if ((Integer.valueOf(hg.getDt2().getText()) < 1) || (Integer.valueOf(hg.getDt2().getText()) > 12)) {
                    System.out.println("Doğum Tarihi Hatalı");
                } else {
                    Musteri ms = new Musteri(StrKrtno, StrAd, StrSoyad, StrTc, StrDt, StrSifre);//Nesne Oluşturuldu

                    hg.getLblBasarili().setVisible(true);
                    db.ekle(ms);//Ekleme için nesne fonksiyon ile gönderiliyor
                    hg.getBtn3().setVisible(false);
                    Preferences pref = Preferences.userNodeForPackage(HesapAcGui.class);
                    pref.put("kartnumarasi", (StrKrtno));
                    MainGui mng = new MainGui();
                    hg.getJf().setVisible(false);
                }
            }
            if (e.getSource() == hg.getBtn2()) {
                MainGui mng = new MainGui();
                hg.getJf().setVisible(false);
            }
        }
        //Hesap Açma içindeki Button Olayları Bitiş

    }

}
