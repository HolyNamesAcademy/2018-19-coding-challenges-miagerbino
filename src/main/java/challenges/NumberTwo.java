package challenges;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class NumberTwo {

    /**
     * Given three numbers, a, b, and c, one is small, one is medium, and one is large. Return
     * true if the three values are evenly spaced, meaning the difference between the small and
     * the medium is the same as the difference between the medium and the large.
     *
     * Example:
     * Given a = 2, b = 4, c = 6
     * Return true
     *
     * Example:
     * Given a = 4, b = 6, c = 2
     * Return true
     *
     * Example:
     * Given a = 5, b = 6, c = 3
     * Return false
     *
     * @return true if the numbers are evenly spaced, otherwise false
     */
    public boolean evenlySpaced(int a, int b, int c){
        // Delete the line below and implement the method!
        //throw new UnsupportedOperationException();
        ArrayList<Integer>nums = new ArrayList<Integer>();
        nums.add(a);
        nums.add(b);
        nums.add(c);
        if (a>c && b>c) {
            nums.add(0, c);
            nums.remove(3);
            if (a > b) {
                nums.add(a);
                nums.remove(1);
            }
        }
        if (a>b && c>b) {
            nums.add(0, b);
            nums.remove(2);
            if (a > c) {
                nums.add(a);
                nums.remove(1);
            }
        }
        if (c>a && b>a) {
            if (b > c) {
                nums.add(b);
                nums.remove(1);
            }
        }
        if ((nums.get(1)-nums.get(0))==(nums.get(2)-nums.get(1))){
            return true;
        }
        else
            return false;
    }
}

