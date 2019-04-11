
public class Question05{
    
    // Create new method for area of circle
     static double area(double r, double n){
         
         // list variables
        double delta = (r / n);
        double a = 0;
        double x = 0;
        
        // Create loop
        while( x <= r - delta){
            a = a + (delta * (Math.sqrt((r * r) - (x * x))));
            x = x + delta;
        }
        
    // Return value multiplied by 4.
    return  4 * a;    
    }
     
     // This program will estimate the area of a circle with said radius.
    public static void main(String[] args) {
        
        // will print out: 0.0 
        System.out.println(area(0,0));
        
        // will print out: 3.1547743373871793
        System.out.println(area(1,100));
        
        // will print out: 3.1433766261997773
        System.out.println(area(1,1000));
        
        //will print out: 78.58888667277685
        System.out.println(area(5,1000));
        
}
   
}