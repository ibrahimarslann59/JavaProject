
import java.util.Scanner;


public class Vec {
    private String isim;
    private int i;
    private int j;
    private int k;
    
    public Vec(String isim){
        
        this.isim = isim;
        
        Scanner sc = new Scanner(System.in);
        System.out.println(isim+ " in i.j ve k degerlerını gırınız:");
        
        System.out.print("i degeri: ");
        this.i = sc.nextInt();
        System.out.print("j degeri: ");
        this.j = sc.nextInt();
        System.out.print("k degeri: ");
        this.k= sc.nextInt();
        
    }
    public void setİsim(String isim){
        this.isim = isim;
    }
    public String getİsim(){
        return  isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
    
    
    
   
    
}
