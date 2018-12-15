
import java.util.Scanner;


public class Test {
private static Sarkici sarkici = new Sarkici(); 
private static Scanner sc = new Scanner(System.in);

public static void islemleri_bastir() throws InterruptedException {
    System.out.println("\n/t 0-İslemleri Goruntule");
    System.out.println("/t 1-Sarkicilari Goruntule");
    System.out.println("/t 2-Sarkici Ekle");
    System.out.println("/t 3-Sarkici Guncelle");
    System.out.println("/t 4-Sarkici Sil");
    System.out.println("/t 5-Sarkici Ara");
    System.out.println("/t 6-İslemleri Goruntule");
    System.out.println("/t q- Cıkıs");

 
}

public static void main(String[] args) throws InterruptedException {
        
  System.out.println("Sarkici Programina Hosgeldiniz..\n");
   while(true) {
       
      
       
       islemleri_bastir();   String islem;     
       

       System.out.println("Bir islem seciniz:");
       islem = sc.nextLine();
       
       if(islem.equals("0")) {
         System.out.println("İslemler goruntuleniyor.. Lutfen Bekleyiniz");
           Thread.sleep(2000);
           islemleri_bastir();
       }
       
       else if(islem.equals("1")) {
           System.out.println("Sarkicilar goruntuleniyor.. Lutfen Bekleyiniz");
           Thread.sleep(1000);
           sarkici.sarkicilari_bastir();
       }
       
       else if(islem.equals("2")) {     
        String isim = null;

        System.out.print("Eklemek istediğiniz sarkicinin ismini giriniz:");
        isim = sc.nextLine();
        System.out.println("Sarkici listesine "+isim+" ekleniyor.. Lutfen Bekleyiniz");
        Thread.sleep(2000);
        sarkici.sarkici_ekle(isim);
       }
       
       else if(islem.equals("3")) {
           String isim = null;  int pozisyon;
           
           System.out.print("Guncellemek istediğiniz sarkiciyi giriniz:");
           isim = sc.nextLine();
           System.out.print("Guncellemek istediğiniz sarkicinin pozisyonunu giriniz:");
           pozisyon = sc.nextInt();
           sc.nextLine();
           System.out.println("Sarkici Listesi Guncelleniyor... Lutfen bekleyiniz");
           Thread.sleep(3000);
           sarkici.sarkici_guncelle(isim, pozisyon);

           
       }
       else if(islem.equals("4")) {
           int pozisyon;
           System.out.print("Silmek istediginiz sarkıcının Pozisyonunu giriniz");
           pozisyon = sc.nextInt();
           sc.nextLine();
           System.out.println("Sarkici siliniyor... Lutfen Bekleyiniz");
           Thread.sleep(2000);
           sarkici.sarkici_sil(pozisyon);
   
       }
       else if(islem.equals("5")) {
           String isim = null;
           System.out.print("Aramak istediginiz sarkıcının ısmını gırınız:");
           isim = sc.nextLine();
           System.out.println("Sarkici aranıyor... Lutfen Bekleyiniz");
           Thread.sleep(2000);
           sarkici.sarkici_Ara(isim);
           
       }
       else if(islem.equals("6")) {
           islemleri_bastir();
       }
       else if(islem.equals("q")) {
           System.out.println("Programdan Cıkıs Yapılıyor.. Lutfen Bekleyiniz");
           Thread.sleep(1500);

           break;
       }
       else {
           System.out.println("Hatali islem sectiniz... Lutfen tekrar deneyınız");
           
       }
       
   }  
      
}
}  
