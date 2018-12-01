
public class Beyblade {
    private String beybladeci;
    private int donusHizi;
    private int  saldiriGucu;
    
    public Beyblade (String beybladeci,int donusHizi,int sadiriGucu) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = sadiriGucu;
    }
    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    public int getSaldiriGucu() {
        return saldiriGucu;
    }
    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }
    public int getDonusHizi() {
        return donusHizi;
    }
    public void setbeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
       
    }
    public String getbeybladeci() {
        return beybladeci;
    }
    
    public void saldir() {
        System.out.println(beybladeci+ " " + saldiriGucu + "ve" + donusHizi + " ile saldiriyor.....");
    }
    public void kutsalCanavarOrtayaCikar() {
        System.out.println("bu beyblade'nin kutsal canavaari yok.");
    }
    public void bilgileriGoster() {
        System.out.println("beybladeci ismi: "+beybladeci);
        System.out.println("donushizi:"+donusHizi);
        System.out.println("saldirigucu:"+saldiriGucu);
    }
    
}
