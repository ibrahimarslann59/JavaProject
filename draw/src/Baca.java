
import java.awt.Graphics;


public class Baca extends Prototip{

void draw(Graphics cizim){
super.paintComponent(cizim);
        int[] xSin = {1, 2, 3, 4, 5, 6};
        int[] ySin = {1, 2, 3, 4, 5, 6};

        cizim.drawPolyline(xSin, ySin, xSin.length);
        cizim.drawLine(150, 0, 150, 300);
        cizim.drawLine(0, 150, 300, 150);
}
}
