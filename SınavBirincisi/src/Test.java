
import java.util.Scanner;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sınav Birincilerini Bulma Programi..");
        Scanner sc = new Scanner(System.in);
        String islemler = "Islemler..\n"
                        + "1-Esit Agırlık Ogrencılerı Birincisi \n"
                        + "2-Sayısal Ogrencıleerı Bırıncısı \n";
        
        System.out.println("********");
        System.out.println(islemler);
        System.out.println("*********");
        
        while(true) {
            System.out.println("Cıkıs ıcın q'ya basınız..");
            String cıkıs = sc.nextLine();
            if(cıkıs.equals("q")) {
                System.out.println("Programdan cıkılıyor..");
                Thread.sleep(1000);
                break;
            }
            //Birinci ogrenciyi kullanıcıdan aldık..
            System.out.println("Birinci ogrenci ismini giriniz:");
            String isim1 = sc.nextLine();
            System.out.println("Netleri giriniz(Turkce,Matematik,Fizik,Edebiyat) : ");
            int turkce1 = sc.nextInt();
            int matematik1 = sc.nextInt();
            int fizik1 = sc.nextInt();
            int edebiyat1 = sc.nextInt();
            sc.nextLine();
             //Ikıncı ogrenciyi kullanıcıdan aldık..
            System.out.println("Ikıncı ogrenci ismini giriniz:");
            String isim2 = sc.nextLine();
            System.out.println("Netleri giriniz(Turkce,Matematik,Fizik,Edebiyat) : ");
            int turkce2 = sc.nextInt();
            int matematik2 = sc.nextInt();
            int fizik2 = sc.nextInt();
            int edebiyat2 = sc.nextInt();
            sc.nextLine();
             //Ucuncu ogrenciyi kullanıcıdan aldık..
            System.out.println("Ucuncu ogrenci ismini giriniz:");
            String isim3 = sc.nextLine();
            System.out.println("Netleri giriniz(Turkce,Matematik,Fizik,Edebiyat) : ");
            int turkce3 = sc.nextInt();
            int matematik3 = sc.nextInt();
            int fizik3 = sc.nextInt();
            int edebiyat3 = sc.nextInt();
            sc.nextLine();
       
            System.out.println("Sayısal/EsıtAgırlık ogrencısı secımını yapınız..");
            String islem = sc.nextLine();
            
            
            if(islem.equals("1")) {
                esitAgirlik ogrenci1 = new esitAgirlik(turkce1, matematik1, fizik1, edebiyat1, isim1);
                esitAgirlik ogrenci2 = new esitAgirlik(turkce2, matematik2, fizik2, edebiyat2, isim2);
                esitAgirlik ogrenci3 = new esitAgirlik(turkce3, matematik3, fizik3, edebiyat3, isim3);
                esitAgirlik birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Esit Agırlıkların Birincisi:"+birinci.getIsım());
                System.out.println("Ogrencının Puanı: "+birinci.puanHesapla());
                
            }
            else if(islem.equals("2")) {
                
                Sayisal ogrenci1 = new Sayisal(turkce1, matematik1, fizik1, edebiyat1, isim1);
                Sayisal ogrenci2 = new Sayisal(turkce2, matematik2, fizik2, edebiyat2, isim2);
                Sayisal ogrenci3 = new Sayisal(turkce3, matematik3, fizik3, edebiyat3, isim3);
                Sayisal birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Sayısal Ogrencılerın Birincisi:"+birinci.getIsım());
                System.out.println("Ogrencının Puanı: "+birinci.puanHesapla());
                
            }
            else {
                System.out.println("Gecersiz bir islem sectiniz..Lutfen tekrar secim yapınız.");
            }
        }
    } 
    public static <E extends Aday> E birinci(E e1,E e2,E e3) {
        if(e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()) {
            return e1;
        }
        else if(e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {
            return e2;
        }
        else if(e3.puanHesapla() > e1.puanHesapla() && e3.puanHesapla() > e2.puanHesapla()) {
            return e3;
        }
        else {
            return e1; // hepsi esit ise herhangi birini dondur
        }
    } 
    }
    

