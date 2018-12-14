
import java.awt.Color;
import java.awt.Graphics;


public class Catı extends Prototip{
    @Override
    void draw(Graphics cizim){
         cizim.setColor(Color.red);
            int[] xSin = {254, 145, 245, 144, 245};
            int[] ySin = {245, 245, 1445, 145, 245};
            
             
        cizim.drawPolyline(xSin, ySin, xSin.length);
      
        
    }
    
}
