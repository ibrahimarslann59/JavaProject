
public class MakineMuhendisi implements IMuhendis {
  private boolean adli_sicil;
private boolean askerlik;

public MakineMuhendisi(boolean adli_sicil,boolean askerlik){
this.adli_sicil = adli_sicil;
this.askerlik = askerlik;

}

  @Override
  public void askerlik_durumu_sorgula(){
      if(askerlik){
          System.out.println("Askerlik yapıldı.");
      }
      else{
          System.out.println("Askerlik yapılmadı");
      }
    
}
  @Override
  public void adli_sicil_sorgula(){
      if(adli_sicil){
          System.out.println("Adli sicil kaydım bulunuyor..");
      }
      else {
          System.out.println("Adli sıcıl kaydım bulunmuyor");
      }
      
  }
  @Override
  public void is_tecrubesi(String[] array){
     
      if(array.length == 0){
          System.out.println("Hic is tecrubem yok");
      }
      else{
          System.out.println("Makine muhendisi olarak calısıtıgım firmalar:");
          for(int i=0;i<array.length;i++)
          System.out.println(array[i]);
      }
      
  }
  public void referans_getir(String[] array){
      
      if(array.length==0){
          System.out.println("Hic referansım yok");
      }
      else{
          System.out.println("Referanslarım");
          for(int i=0;i<array.length;i++){
              System.out.println(array[i]);
      }
      }
      
  
  }

  @Override
  public String mezuniyet_ortalamasi(double derece){
      return "ortalamam:" + derece;
      
  }
  
}
