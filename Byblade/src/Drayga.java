
public class Drayga extends Beyblade{
    
    private String kutsalCanavar;
    
    public Drayga(String beybladeci,int donusHizi,int saldiriHizi,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriHizi);
    this.kutsalCanavar = kutsalCanavar;    
        
    }
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı :"+kutsalCanavar);
        
    }
    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getbeybladeci() + " " + kutsalCanavar + " ı ortaya cıkarıyor..");
        System.out.println(getbeybladeci() + " in saldirisi: Kaplan Pencesi");  
    }
    
    
}
