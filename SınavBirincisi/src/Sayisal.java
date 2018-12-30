
public class Sayisal extends Aday{
    public Sayisal(int turkce,int matematik,int fizik,int edebiyat,String isim) {
        super(turkce, matematik, fizik, edebiyat,isim);             // ust sınıfın consturctoruna erısırız ve burda tekrar constructor
                                                              // yazıp get set olusturmamıza gerek yok boylece kod tekrarından kurtuluruz
    }
    @Override
    public int puanHesapla() {
        return getFizik()*4+getMatematik()*5+getEdebiyat()*1+getFizik()*4;
         
     }
    
    
    
}
