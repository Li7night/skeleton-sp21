/** Class that prints the Collatz sequence starting from a given number.
 *  @author Li7night
 */
public class Collatz {

    /** To get next number */
    public static int nextNumber(int n) {
        if(n%2==0)
        {
            return n/2;
        }
        return 3*n+1;
    }

    public static void main(String[] args) {
       int n=5;
       while(n!=1)
       {
           System.out.println(n);
           n=nextNumber(n);
       }
       System.out.println(n);
    }
}

