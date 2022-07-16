import java.awt.Rectangle;

public class PerimeterFilter implements Filter {
    
    public boolean accept(Object x) {
        Rectangle object = (Rectangle) x;
        double peri = 2 * (object.getWidth() + object.getHeight());
        if(peri <= 100) {
            return true ;
        }
        else {
            return false;
        }
    }
}