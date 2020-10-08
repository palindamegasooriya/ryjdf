//1 uncheaked exciption- These exceptions cannot handle.

package ex;


public class DemoEx {

    
    public static void main(String[] args) {
      int i=8,j=0,k=0;
      
        try{
            k=i/j;
        }
        
        catch(Exception e){
            System.out.println(e);
            
        }
        
        System.out.println(k);
    }
    
}

