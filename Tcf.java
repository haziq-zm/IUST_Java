public class Tcf {
    public static void main(String[] args){
        int[] x = {1,2,3,4,5,6,7,8,9,10};
        int y;
        try{
            y = x[5];
        }
        catch(Exception e){
            System.out.print("\nText in catch");
        }
        finally{
            System.out.print("\nText in finally");
        }
    }
}
