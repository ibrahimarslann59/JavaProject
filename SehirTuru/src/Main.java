
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;



public class Main {
    
    public static void islemleri_bastir() {
        
        System.out.println("0- İslemleri goruntule..");
        System.out.println("1- Bir sonrakı sehıre gıt..");
        System.out.println("2- Bir oncekı sehıre gıt..");
        System.out.println("3- Cıkıs..");

    }
    
    
    public static void sehirleri_turla(LinkedList<String> sehirler) throws InterruptedException{
        
        ListIterator<String> iterator = sehirler.listIterator();
        
        Scanner sc = new Scanner(System.in);
        
        
        if(!iterator.hasNext()) { // lınklıst bos ıse ekrana durum mesajı yazdırır
            System.out.println("Listenızde hıc eleman bulunmuyor..");
        }
        
        boolean cikis = false;
        boolean ileri = true;
        
        while(!cikis) {
            
            System.out.println("Bir islem seciniz..");
            int islem = sc.nextInt();
            sc.nextLine();
            
        switch(islem) {
            case 0: 
                    islemleri_bastir();
                    break;
            case 1: 
                if(!ileri) {
                    if(iterator.hasNext()) {
                        iterator.next();
                    }
                    ileri = true;
                    
                }
                if(iterator.hasNext()){
                    System.out.println("Sehre gidiliyor.. "+iterator.next());
                }
                
                else {
                    System.out.println("Gidilecek sehır kalmadı..");
                }
                break;
                
            case 2:
                if(ileri) {
                    if(iterator.hasPrevious()) {
                        iterator.previous();
                    }
                    ileri = false;
                }
                if(iterator.hasPrevious()) { // root un oncesınde sehır varsa gıt yoksa else bloguna gırer
                    
                    System.out.println("Onceki sehre gidiliyor.. " +iterator.previous());  // iterator.previous oncekı elemana gıder ...  iterator.hasPrevious bır boolean dır yanı oncesınde eleman var mı (sonucu 1 veya 0 dır)
                }
                else {  // oncesınde sehır yoksa yanı root ta ıse ..
                    System.out.println("Sehir turu basliyor..");
                }
                break;
                
            case 3:
                System.out.println("Uygulamadan cıkıs yapılıyor.. Lutfen Bekleyınız");
                Thread.sleep(1000);
                cikis = true;   
                break;
        }
        
    }
    }
    public static void main(String[] args) throws InterruptedException {
        
        LinkedList<String>sehirler = new LinkedList<String>();
        
        sehirler.add("Istanbul");
        sehirler.add("Bursa");
        sehirler.add("Edırne");
        sehirler.add("Canakkale");
        
        islemleri_bastir();
        sehirleri_turla(sehirler);
        
        
        
        
    }
}
