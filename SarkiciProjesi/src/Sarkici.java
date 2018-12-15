
import java.util.ArrayList;


public class Sarkici {
    
    private ArrayList<String> sarkici_listesi = new ArrayList<String>();
   
    public void sarkicilari_bastir() {
        System.out.println("Sarkici listesinde "+ sarkici_listesi.size()+" sarkıcı vardır");
        
        for(int i = 0;i<sarkici_listesi.size();i++) {
            System.out.println((i+1)+ ". sarkici:"+sarkici_listesi.get(i));
        }
    }

    public void sarkici_ekle(String isim) {
        
        sarkici_listesi.add(isim);
        System.out.println("Sarkici listesine "+ isim+" i eklediniz");
    }
    
    public void sarkici_guncelle(String yeni_isim,int pozisyon) {
        sarkici_listesi.set(pozisyon, yeni_isim);
        System.out.println("Sarkici listesi guncelledi");
    }
    public void sarkici_sil(int pozisyon) {
        
        String isim = sarkici_listesi.get(pozisyon);
        sarkici_listesi.remove(pozisyon);
        System.out.println(isim +" isimli sarkici listeden  silindi..");
    }
    public void sarkici_Ara(String sarkici_ismi) {
        int pozisyon = sarkici_listesi.indexOf(sarkici_ismi);
        
        if(pozisyon >=0) {
            System.out.println("Aranan sarkici:"+sarkici_ismi +"->" +(pozisyon+1)+". indexte bulundu.");
        }
        else {
            System.out.println("Aranan sarkıcı bulunamadı..");
        }
        
    }

   
}
