
public class Daire extends Sekil{
    private double yaricap;
    
    public Daire(String isim,double yaricap){
        super(isim);
        this.yaricap = yaricap;
    }
    @Override
    void alan_hesapla(){
        System.out.println(getİsim()+"in alanı: "+(Math.PI*yaricap*yaricap));
    }
    
}
