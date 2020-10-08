//1 uncheaked exciption with multiple catch block

package ex;


public class DemoEx {

    
    public static void main(String[] args) {
     int a[]=new int[4];      
        try{
            for(int c=0;c<=4;c++)
            {
            a[c]=c+1;
            }
        }
        
        catch(ArithmeticException e){
            System.out.println(e);
            
        }
        
        catch(ArrayIndexOutOfBoundsException l){
            System.out.println(l);
        }
        
        
    }
    
}
