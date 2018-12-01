
public abstract class Sekil {
    private String isim;
    public Sekil(String isim){
        this.isim = isim;
        
    }
    public String getİsim(){
        return isim;
    }
    public void setİsim(String isim){
        this.isim = isim;
    }
    
    public void ismini_soyle(String isim){
        System.out.println("Bu obje"+getİsim()+"objesıdır");
    }
    
    abstract void alan_hesapla();
    
}
