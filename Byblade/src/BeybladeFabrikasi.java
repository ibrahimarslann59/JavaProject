
public class BeybladeFabrikasi {
    
    public Beyblade beybladeUret(String beyblade_turu){
        if(beyblade_turu.equals("Dragon")) {
            
            return new Dragon("Takac", 800, 300,"Mavi ejderiyaa","Kutsal Canavarla Konusma");
           
        }
        else if(beyblade_turu.equals("Dranza")) {
            return new Dranza("Kai", 660, 400, "Kırmızı Anka Kusu");
        }
        else if(beyblade_turu.equals("Drayga")) {
            
            return new Drayga("Rei", 800, 250,"Beyaz Kaplan");
}
        
        else if(beyblade_turu.equals("Draciel")) {
            return new Draciel("Max", 400, 1000,"Kara Kaplumbağa");
        }       
        else {
            return null;
        }
        
}
}
