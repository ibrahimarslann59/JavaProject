
public class Dragon extends Beyblade{
    
    private String kutsalCanavar;
    private String gizliYetenek;
    
    public Dragon(String beybladeci,int donusHizi,int sadiriGucu,String kutsalCanavar,String gizliYetenek) {
       
        super(beybladeci, donusHizi, sadiriGucu);
       this.kutsalCanavar = kutsalCanavar;
       this.gizliYetenek = gizliYetenek;
    }
    
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("kutsal canavar adi:"+kutsalCanavar);
        System.out.println("gizli yetenek:"+gizliYetenek);
    }
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getbeybladeci()+ " "+kutsalCanavar+ " ı ortaya cikariyor..");
        System.out.println(getbeybladeci()+ "in savunmasi: Hayalet Kasırgası");
        
    }
    
}
