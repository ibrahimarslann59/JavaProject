
public abstract class Aday {

private int turkce;
private int matematik;
private int fizik;
private int edebiyat;
private String isim;


public Aday(int turkce,int matematik,int fizik,int edebiyat,String isim) {
    this.edebiyat = edebiyat;
    this.turkce = turkce;
    this.matematik = matematik;
    this.fizik = fizik;
    this.isim = isim;
    
}
public String getIsım() {
    return isim;
}
public void setIsım(String isim) {
    this.isim = isim;
}
public int getTurkce() {
    return turkce;
}
public void setTurkce(int turkce) {
    this.turkce = turkce;
}

public int getEdebiyat() {
    return edebiyat;
}
public void setEdebiyat(int edebiyat) {
    this.edebiyat = edebiyat;
}
public int getMatematik() {
    return matematik;
}
public void setMatematik(int matematik) {
    this.matematik = matematik;
}
public int getFizik() {
    return fizik;
}
public void setFizik(int fizik) {
    this.fizik = fizik;
}
 abstract int puanHesapla();
}
