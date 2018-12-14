
import java.applet.Applet;
import java.awt.Graphics;


public class Main extends Applet{
    
    
    @Override
    public void paint(Graphics cizim){
        
   Prototip pro[] = new Prototip[5];
    
   pro[0] = new Ev();
   pro[1] = new Pencere();
   pro[2] = new Kapi();
   pro[3] = new Catı();
   pro[4] = new Baca();
   
   pro[0].draw(cizim);
   pro[1].draw(cizim);
   pro[2].draw(cizim);
   pro[3].draw(cizim);

   

    }
    
}
