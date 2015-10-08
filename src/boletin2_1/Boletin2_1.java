
package boletin2_1;

import java.util.Scanner;

public class Boletin2_1 {

    public static void main(String[] args) {
  //entrada por telcado
        float base,altura ;
        Scanner obx = new Scanner(System.in);
        System.out.println ("teclea base :") ;
        base = obx.nextFloat() ;
        System.out.print(System.getProperty("line.separator"));
        System.out.println("teclea altura :") ;
        altura = obx.nextFloat() ;
        System.out.println("area ="+ base*altura/2);
    }
    
    
    
    
    
}
