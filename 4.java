
//4-finally

package ex;


public class DemoEx {

    
    public static void main(String[] args) {
      int i=8,j=0,k=0;
      
        try{
            k=i/j;
            System.out.println("bye");//exception occur in above statement and not execute this ine and jump to catch block.
        }
        
        catch(Exception e){
            System.out.println(e);
            
        }
        
        finally{
            System.out.println("bye");//if exception occur or not finally block will executed.
        }
        
        System.out.println(k);
    }
    
}

