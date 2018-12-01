
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Idman programına hosgeldınız..");
        String hareketler = "Gecerli Hareketler..:\n"
                + "Burpee \n"
                              + "Squat\n"
                              + "Pushup\n"
                              + "Situp";
        System.out.println(hareketler);
      
        System.out.print("Burpee sayisini giriniz: ");
        int burpee = sc.nextInt();
        System.out.print("Squat sayisini giriniz: ");
        int squat = sc.nextInt();
        System.out.print("pushup sayisini giriniz: ");
        int pushup = sc.nextInt();
        System.out.print("situp sayisini giriniz: ");
        int situp = sc.nextInt();
        sc.nextLine();
        
        Idman idman = new Idman(burpee, pushup, situp, squat); // constructor a yukarıdakı degerlerı gonderdık..
        System.out.println("ıdmaniniz basliyor..");
        
        while(idman.idmanBittiMi()==false) {
            System.out.println("hareket Türü (Burpee,Pushup,Situp,Squat) :");
            String tur = sc.nextLine();
            System.out.println("");
            System.out.println(tur+ " hareketinden kac tane yapacaksınız ? : ");
            int sayi = sc.nextInt();
            sc.nextLine();
            idman.hareketYap(tur, sayi);

        }
    }
}
