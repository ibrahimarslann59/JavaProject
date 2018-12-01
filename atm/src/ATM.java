
import java.util.Scanner;


public class ATM {
    
   public void calis(Hesap hesap) {
    Login login = new Login();
    
    Scanner sc = new Scanner(System.in);
       System.out.println("Bankamiza hosgeldiniz..");
       System.out.println("*************************");
       System.out.println("Kullanici girisi");
        System.out.println("*************************");
            int giris_hakki = 3;
            
            while(true) {
                if(login.login(hesap)) {
                    System.out.println("Giris basarili..");
                    break; 
                }
                else {
                    giris_hakki -=1;
                    System.out.println("Giris basarisizdir..");
                    System.out.println("Kalan giris hakkiniz:"+giris_hakki);
                }
                if(giris_hakki ==0) {
                    System.out.println("Giris hakkiniz bitmistir");
                    return;
                }
            }
            System.out.println("***********");
            String islemler = "1. bakiye goruntuleme\n"
                    + "2. para yatırma\n"
                    +"3. para cekme\n"
                    +"cikis icin q 'ya basiniz";
            System.out.println(islemler);
            System.out.println("***************");
            
            while(true) {
                System.out.println("İslem seciniz: ");
                String islem = sc.nextLine();
                if(islem.equals("q")) {
                    break;
                }
                else if(islem.equals("1")) {
                    System.out.println("bakiyeniz: "+hesap.getBakiye());
                }
                else if(islem.equals("2")) {
                    System.out.println("yatirmak istediginiz  tutari giriniz: ");
                     int tutar;
                    tutar = sc.nextInt();
                    sc.nextLine();
                    hesap.paraYatir(tutar);
                }
                else if(islem.equals("3")) {
                    System.out.println("cekmek istediginiz tutari giriniz: ");
                    int tutar;
                    tutar = sc.nextInt();
                    sc.nextLine();
                    hesap.paraCek(tutar);
                }
                else {
                    System.out.println("gecersiz islem...");
                }
            }
   }
}
