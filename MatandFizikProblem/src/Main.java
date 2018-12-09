
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Matematik ve Fizik problemlerıne hosgeldınız...");
        
        String islemler = "İslemler ....\n"
                + "1. Daire alanı hesaplama \n"
                + "2. Ucgen Cevresi hesaplama\n"
                + "3. Vektorlerın ıc carpımını hesaplama\n"        
                + "Cıkıs : q";
        
        while(true){
            System.out.println(islemler);
            System.out.println("\nBir islem secınız.");
            String islem = sc.nextLine();
            
            
            if(islem.equals("q")){
                System.out.println("Programdan cıkılıyor...");
                break;
            }
            if(islem.equals("1")){
                System.out.println("Yaricapi giriniz:");
                int yaricap = sc.nextInt();
                sc.nextLine();
                Problem.Matematik.daire_alan(yaricap);
                
            }
            
            else if(islem.equals("2")){
                System.out.print("Ucgenin kenar1 , kenar2 ve kenar3 degerlerını gırınız:");
                int kenar1 = sc.nextInt();
                int kenar2 = sc.nextInt();
                int kenar3 = sc.nextInt();
                sc.nextLine();
                
                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
                
                
            }
            else if(islem.equals("3")){
                Vec vec1 = new Vec("Vektor1");
                Vec vec2 = new Vec("Vector2");
                
                Problem.Fizik.icCarpim(vec1, vec2);
                
                
            }
            else{
                System.out.println("Gecersiz bir islem sectiniz.. Lutfen tekrar seciniz..\n");
                
            }
        }
    }
}
