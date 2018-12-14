
import java.awt.Color;
import java.awt.Graphics;


public class Pencere extends Prototip{
    @Override
     void draw(Graphics cizim){
        cizim.setColor(Color.yellow);
         cizim.fillRect(480, 360, 100, 120);
         cizim.setColor(Color.white);
         cizim.fillRect(820, 360, 100, 120);

        
    }
    
}
