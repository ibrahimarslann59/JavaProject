
public class Main {
    public static void main(String[] args) {
        PcMuhendisi muhendis = new PcMuhendisi(true, false);
        muhendis.adli_sicil_sorgula();
        muhendis.askerlik_durumu_sorgula();
        muhendis.mezuniyet_ortalamasi(3.4);

      String[] tecrube = {"VESTEL,ASELSAN","BINANCE","BITFINEX","CORDATUS"}; 
       muhendis.is_tecrubesi(tecrube);
  System.out.println("-----------------------");
    PcMuhendisi muhendis2 = new PcMuhendisi(true, true);
    muhendis2.adli_sicil_sorgula();
    muhendis2.askerlik_durumu_sorgula();
        muhendis2.mezuniyet_ortalamasi(3.02);
        String[] tecrube2 = {"HYLOSX PROJECT","CORDATUS PROJECT","HYDRO PROTOCOL","COINBASE"};
        muhendis2.is_tecrubesi(tecrube2);
 System.out.println("-----------------------");
      MakineMuhendisi muhendis3 = new MakineMuhendisi(true, false);
      muhendis3.adli_sicil_sorgula();
      muhendis3.askerlik_durumu_sorgula();
      muhendis3.mezuniyet_ortalamasi(2.31);
      String[] referans3 = {"İbrahim Arslan"};
      String[] tecrube3 = {"VASTAS","ARCELİK","DEVA"};
      muhendis3.is_tecrubesi(tecrube3);
      muhendis3.referans_getir(referans3);
        
    }
}
