import java.util.Scanner;
public class Test {
    
    public static void main(String[] args) {
        
        System.out.println("Beyblade programına hosgeldınız..");
        System.out.println("Cıkıs ıcın q'ya basınız..");
           Scanner sc = new Scanner(System.in);
           
           while(true) {
               
             System.out.println("Hangi beybladeyi uretmek ıstersınız?");
             String islem = sc.nextLine();
             if(islem.equals("q")) {
                 System.out.println("Programdan cıkılıyor");
                 break;
             }
             
             else {
                 BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                 Beyblade beyblade = fabrika.beybladeUret(islem);
             
                 if(beyblade == null) {
                     System.out.println("Lutfen gecerli bir beyblade ismi giriniz:");
                     
                 }
                 else {
                     beyblade.bilgileriGoster();
                     beyblade.saldir();
                     beyblade.kutsalCanavarOrtayaCikar();
                 }
             }
             
            
             
             
           }
    
    }
}
