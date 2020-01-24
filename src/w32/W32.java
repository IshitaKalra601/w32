/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w32;

/**
 *
 * @author jyoti
 */
public class W32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       rectangle r1 = new rectangle(4,5); // Jan 24
       rectangle r2 = new rectangle(4,5);
       int a = r1.compareTo(r2);
       if(a==1){
           System.out.println("r1 is bigger than r2");
       }
       else if(a == -1){
           System.out.println("r2 is bigger than r1");
           
       }
           else {System.out.println("r1 is equals to r2");
       }
    }
    
}
