public class Trycatch {
    public static void main(String args[]){
        try{
            int d=90/0;
        }catch(ArithmeticException v)
        {
            System.out.println("Bad Request");
        }
        try{
            int d=90/0;
        }catch(ArithmeticException v){
            System.out.println("catch block is running");
        }finally{
            System.out.println("finally is running");
        }
    }
    
}
/* Bad Request
catch block is running
finally is running */
