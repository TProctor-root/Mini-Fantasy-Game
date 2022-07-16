public class Data {
    
    public static double average(Object[] objects, Measurer meas, Filter f) {
        double sum = 0;
        int reduce = 0;
        
        for (Object obj : objects) {
            if(f.accept(obj) == true) {
                sum = sum + meas.measure(obj);
            }
            else {
                reduce++;
            }
        }
        if (objects.length - reduce > 0) {
            return sum / (objects.length - reduce);
        } 
        else {
            return 0;
        }
    }
    public static Object max(Object[] objects, Measurer meas, Filter f) {
        if (objects.length == 0) {
            return null;
        }
        Object max = objects[0];
        for (Object obj : objects) {
            if (meas.measure(obj) > meas.measure(max)) {
                if(f.accept(obj) == true) {
                    max = obj;
                }
            }
        }
        return max;
    }
} 
