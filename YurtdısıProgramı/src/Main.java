
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sahıba Gokcen Havalimanına Hosgeldınız..");
    
    
    String sartlar = "Yurtdısı cıkıs kuralları:\n"
            + "Herhangı bır sıyası yasagınız bulunmamalıdır.\n"
            + "15 tl harc bedelını tam olarak yatırmanız gerekmektedır.\n"
            + "Gidecegınız ulkeye vızenız olması gerekmektedır.";
  
    String message = "Yurtdısı sartlarından hepsını saglamanız gerekmektedır.";
    
        
        while(true){
            
         System.out.println(message);   
        System.out.println("************");
        System.out.println(sartlar);
        
        Yolcu yolcu = new Yolcu();
            System.out.println("Harc bedelı kontrol edılıyor..");
            Thread.sleep(3000);
            if(yolcu.yurtdisiHarciKontrol()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi bilgileriniz kontrol ediliyor..");
            Thread.sleep(3000);
            if(yolcu.siyasiYasakKontrol()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Vizebılgılerınız kontrol edılıyor..");
            Thread.sleep(3000);
            if(yolcu.vizeDurumuKontrol()==false){
                System.out.println(message);
                continue;
                
            }
            System.out.println("Yurtdısına cıkabılırsınız..");
            break;
            
        
        }
    
    }
}