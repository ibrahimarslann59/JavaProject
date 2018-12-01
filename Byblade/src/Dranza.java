
public class Dranza extends Beyblade {
    private String kutsalCanavar;
    
    public Dranza(String beybladeci,int saldiriGucu,int donusHizi,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        
    }
    
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi:"+kutsalCanavar);
    }
    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getbeybladeci() + " " + kutsalCanavar + " ortaya cıkarıyor.");
        System.out.println(getbeybladeci()+ " in saldırısı: Alev Kılıcı");
        
    
    }
}
