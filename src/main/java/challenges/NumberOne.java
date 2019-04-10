package challenges;
import java.util.ArrayList;
import java.util.List;

public class NumberOne {

    /**
     * Given an array of integers, return the indices of the two numbers that they add up to the specified target.
     *
     * You may assume that each input will have exactly one solution, and you may not use the same element twice.
     *
     * Example:
     * Given numbers = [2, 7, 11, 15], target = 9,
     *
     * Because numbers[0] + numbers[1] = 2 + 7 = 9,
     * return [0, 1].
     *
     * @param numbers the array of integers to choose from
     * @param target the value the two integers need to sum to
     * @return an array with two values in it, the indices from the array numbers for the two numbers that sum to target
     */
    public int[] findTwoValuesThatSumToTarget(int[] numbers, int target) {
        // Delete the line below and implement the method!
        //throw new UnsupportedOperationException();
        ArrayList possibleNums = new ArrayList();
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i]<=target)
                possibleNums.add(numbers[i]);
        }
        int [] indices = new int[2];
        for(int i = 0; i<possibleNums.size(); i++){
            for (int j = 0; j<possibleNums.size(); j++){
                if ((target == ((int)possibleNums.get(i)+(int)possibleNums.get(j))) && (i!=j)) {
                    indices[0] = i-1;
                    indices[1] = j+1;
                    break;
                }
            }
        }
        return indices;
    }
}
