
public class esitAgirlik extends Aday {
    
    public esitAgirlik(int turkce,int matematik,int fizik,int edebiyat,String isim) {
        super(turkce, matematik, fizik, edebiyat,isim);
        
    }
    @Override
    public int puanHesapla() {
        return getEdebiyat()*4+getFizik()*1+getMatematik()*5+getTurkce()*5;
    }
}
