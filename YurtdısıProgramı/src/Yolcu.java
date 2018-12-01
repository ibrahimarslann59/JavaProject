
import java.util.Scanner;


public class Yolcu implements YurtdisiKurallari{

 private int harc;   
private boolean siyasiYasak;
private boolean vizeDurumu;
    public Yolcu(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Yatırmıs oldugunuz harc bedelını gırınız:");
        this.harc = sc.nextInt();
        sc.nextLine();
        System.out.print("Herhangı bır sıyası yasagınız buluyor mu? (evet ya da hayır)");
        String cevap = sc.nextLine();
        if(cevap.equals("evet")){
            this.siyasiYasak = true;
        }
        else{
            this.siyasiYasak = false;
        }
        
        System.out.print("Vizeniz bulunuyor mu?:(evet ya da hayır)");
        String cevap2 = sc.nextLine();
        if(cevap2.equals("evet")) {
            this.vizeDurumu  = true;
        }
        else{
            this.vizeDurumu = false;
        }    
    }
    
    @Override
    public boolean yurtdisiHarciKontrol(){
        if(this.harc<15){
            System.out.println("Lutfen yeterlı harc mıktarını yatırınız..");
            return false;
        }
        else{
            System.out.println("Yurtdısı harcı ıslemı tamam.");
            return true;
        }
        
        
    }
 @Override
    public boolean siyasiYasakKontrol(){
        
        if(this.siyasiYasak==true){
            System.out.println("Sıyası yasagınız bulunuyor.. Yurtdısına cıkamazsınız");
            return false;
        }
        else{
            System.out.println("Sıyası yasagınız bulunmuyor");
            return true;
        }
    }
 @Override
    public boolean vizeDurumuKontrol(){
        if(vizeDurumu==true){
            System.out.println("Vızenız vardır.. ");
            return true;
        }
        else{
            {
                System.out.println("Vizenız bulunmamaktadır..Yurrtdısına cıkıs yapamazsınız");
                return false;
            }
        }
    }
}
