import java.awt.Rectangle;

public class PerimeterMeasurer implements Measurer {
    public double measure(Object anObject) {
        Rectangle object = (Rectangle) anObject;
        double peri = 2 * (object.getWidth() + object.getHeight());
        return peri;
    }
}