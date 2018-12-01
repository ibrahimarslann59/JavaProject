
public class Draciel extends Beyblade {
    
    private String  kutsalCanavar;        
            
    public Draciel(String beybladeci,int donusHizi,int saldiriGucu,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }
    
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adi: "+kutsalCanavar);
        
    }
    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getbeybladeci()+" "+kutsalCanavar+ " ı ortaya cıkardi." );
        System.out.println(getbeybladeci()+"ın savunması: Kale Savunmasi");
    }
}
