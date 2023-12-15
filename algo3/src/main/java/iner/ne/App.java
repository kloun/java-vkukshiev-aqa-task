
package iner.ne;


public class App 
{
    public static void main( String[] args ) {
        int[] nums = {104,45,2,3,9,1025,16,27};
        for (int i : nums) {
            if (i % 3 == 0) System.out.println(i);
        }
        
    }
}