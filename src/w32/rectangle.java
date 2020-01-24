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
public class rectangle implements Comparable<rectangle>
{
    private double height,width;
    public rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double area()
    {
        return height*width;
    }
    public int compareTo(rectangle r)
    {
        if(this.area()>r.area())
            return 1;
        else if(this.area()<r.area())
            return -1;
        else{
            return 0;
        }
        
        
    }
    
}
