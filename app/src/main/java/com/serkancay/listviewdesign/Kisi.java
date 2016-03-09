package com.serkancay.listviewdesign;

/**
 * Created by serkan on 9.03.2016.
 */
public class Kisi {
    // Kişi sınıfımız kişiye ait özellikler içeriyor.
    private String ad;
    private String soyad;
    private String sehir;
    private String ilgiAlani;
    private int resimId;

    // Yapıcı metodumuzda bilgileri alıyoruz.
    public Kisi(String ad, String soyad, String sehir, String ilgiAlani, int resimId) {
        this.setAd(ad);
        this.setSoyad(soyad);
        this.setSehir(sehir);
        this.setIlgiAlani(ilgiAlani);
        this.setResimId(resimId);
    }

    // Getter setter metodlar
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getIlgiAlani() {
        return ilgiAlani;
    }

    public void setIlgiAlani(String ilgiAlani) {
        this.ilgiAlani = ilgiAlani;
    }

    public int getResimId() {
        return resimId;
    }

    public void setResimId(int resimId) {
        this.resimId = resimId;
    }
}
