/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author batuhan
 */
public class Musteri {
    private String KrtNo;
    private String Adi;
    private String Soyadi;
    private String Tc;
    private String Dt;
    private String Sifre;

    public Musteri(String KrtNo,String Adi,String Soyadi,String Tc,String Dt,String Sifre)
    {
        this.KrtNo=KrtNo;
        this.Adi=Adi;
        this.Soyadi=Soyadi;
        this.Tc=Tc;
        this.Dt=Dt;
        this.Sifre=Sifre;
    }
    public void setKrtNo(String KrtNo) {
        this.KrtNo = KrtNo;
    }

    public void setAdi(String Adi) {
        this.Adi = Adi;
    }

    public String getKrtNo() {
        return KrtNo;
    }

    public String getAdi() {
        return Adi;
    }

    public String getSoyadi() {
        return Soyadi;
    }

    public String getTc() {
        return Tc;
    }

    public String getDt() {
        return Dt;
    }

    public String getSifre() {
        return Sifre;
    }

    public void setSoyadi(String Soyadi) {
        this.Soyadi = Soyadi;
    }

    public void setTc(String Tc) {
        this.Tc = Tc;
    }

    public void setDt(String Dt) {
        this.Dt = Dt;
    }

    public void setSifre(String Sifre) {
        this.Sifre = Sifre;
    }
    public void yazdir(){
        System.out.println("Kart Numarası: "+this.KrtNo);
        System.out.println("Ad: "+this.Adi);
        System.out.println("Soyad: "+this.Soyadi);
        System.out.println("T.C: "+this.Tc);
        System.out.println("Doğum Tarihi: "+this.Dt);
        System.out.println("Şifre: "+this.Sifre);
    }
    
}
