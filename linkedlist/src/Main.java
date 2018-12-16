
import java.util.LinkedList;
import java.util.ListIterator;


public class Main {
    public static void listeyi_bastir(LinkedList<String>gidilecek_yerler) {
        
      /*  for(String s:gidilecek_yerler){   // foreach yazdırma seklı
            System.out.println(s);
            
        }  */
      
        ListIterator<String>iterator = gidilecek_yerler.listIterator();
        while(iterator.hasNext()) {  // hasNext demek ıterator un gosterdıgı deger var demek yanı ıteratorun gosterdıgı deger Null olmadıgı surece calıs
            
        
        System.out.println(iterator.next()); // ıteratorun nextını yazdır yaptık eger next demeseydık sonsuz donguye gırerdı ve hepsını yazdırmazdı
        }
        System.out.println("************");
    }
    
    public static void sirali_ekle(LinkedList<String>gidilecek_yerler,String yeni){
        
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        
        while(iterator.hasNext()) {
            
            int karsilastir = iterator.next().compareTo(yeni);
            
            if(karsilastir == 0){  // eklenecek deger (String yeni) iteratorun gosterdıgı degere esıt ıse..
                System.out.println("Eklemek istediğiniz " + yeni+ " Sehiri zaten listede var!");  
                return; // fonksıyonumuz void oldugu ıcın return edemeyız fakat bır sey dondurmedıgımız ıcın sadece return deyıp donguyu bıtırmek ıcın kullanabılırız
            }
            else if(karsilastir < 0) {  // yeni deger iterator dan daha buyuk ise..
                
                
            }
            else if(karsilastir > 0) { // yeni ekleyecegımız deger ıterator un gosterdıgı degerden (next ınden) daha kucuk ıse..
                
                iterator.previous(); // burda iteratorumuz root u gosterıyor yanı ılk degerıni.. fakat bız daha kucuk bırsey eklemek ıstedıgımız ıcın rootun soluna ekleyecegız 
                iterator.add(yeni); //onun ıcın rootu bır sola kaydırıp yenı degerı oraya eklerız
                return;
               
            }
                
        }
        
        gidilecek_yerler.add(yeni);
    }
    
   
    public static void main(String[] args) {
        
    
    LinkedList<String>gidilecek_yerler = new LinkedList<String>();
    
    /*
    gidilecek_yerler.add("Paris");
    gidilecek_yerler.add("Bruksel");
    gidilecek_yerler.add("Tekirdağ");
    gidilecek_yerler.add("Amsterdam");
    gidilecek_yerler.add("Viyana");
    gidilecek_yerler.add("Tokyo");
    
    listeyi_bastir(gidilecek_yerler);
    gidilecek_yerler.add(4,"Silivri"); 
    listeyi_bastir(gidilecek_yerler);
    gidilecek_yerler.remove(5);
    listeyi_bastir(gidilecek_yerler);
   */
sirali_ekle(gidilecek_yerler,"Torino");
sirali_ekle(gidilecek_yerler,"Roma");
sirali_ekle(gidilecek_yerler,"Madris");
sirali_ekle(gidilecek_yerler,"Londra");
sirali_ekle(gidilecek_yerler,"Malatya");
sirali_ekle(gidilecek_yerler,"Mersin");
sirali_ekle(gidilecek_yerler,"Los Angeles");
sirali_ekle(gidilecek_yerler,"Londra");
listeyi_bastir(gidilecek_yerler);
                        


    
}
}
