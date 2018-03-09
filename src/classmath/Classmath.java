/*
 * Nigel Howarth Shute
 * classMath.Java
 * This progtram has 4 different math methods.
 */

package classmath;

/**
 *
 * @author nihow4926
 */
import java.text.DecimalFormat;
public class Classmath {
   

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    double number =912.3456;
    DecimalFormat x = new DecimalFormat ("###.##");
    System.out.println(x.format (number)); //rounds the double number to two decimals
    
    double wow = 5;
    double ok = 3;
    System.out.println(Math.pow(wow, ok)); //puts wow to the power of ok 
    
    int a = 54;
    int b = 27;
    System.out.println(Math.max(a,b)); //this returns the higher int
    
    double nigel = 25;
    System.out.println(Math.sqrt(nigel)); //takes the square root of the double nigel
    }  
}
