
import java.util.Scanner;


public class Login {
    public boolean login(Hesap hesap) {
        Scanner sc = new Scanner(System.in);
        
        String kullanici_adi;
        String parola;
        
        System.out.print("kullanici adini giriniz: ");
        kullanici_adi = sc.nextLine();
        System.out.print("parola giriniz: ");
        parola = sc.nextLine();
        
        if(hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)) {
      return true;
    }
        else {
            return false;
        }
    }
}