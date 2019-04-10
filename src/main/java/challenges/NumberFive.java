package challenges;
import java.util.ArrayList;

public class NumberFive {

    /**
     * Two strings, word1 and word2, are called anagrams if they contain all the same characters in the same
     * frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
     *
     * Example:
     * word 1 - cat
     * word 2 - act
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - acT
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - actt
     * false
     *
     * Example:
     * word 1 - cat
     * word 2 - acts
     * false
     *
     * @return true if word1 and word2 are case-insensitive anagrams, false otherwise.
     */
    public boolean isAnagram(String word1, String word2) {
        // Delete the line below and implement the method!
        //throw new UnsupportedOperationException();
        if(word1.length()!=word2.length()){
            return false;
        }
        ArrayList <Character> word1letters = new ArrayList <Character>();
        ArrayList <Character> word2letters = new ArrayList <Character>();
        for(int i = 0; i<word1.length(); i++){
            word1letters.add(word1.charAt(i));
            word2letters.add(word2.charAt(i));
        }
        for (int i = 0; i<word1letters.size(); i++){
            for (int j = 0; j<word1letters.size(); j++){
                if(word1letters.get(i).equals(word2letters.get(j))){
                    word1letters.remove(i);
                    word2letters.remove(j);
                    i--;
                    j--;
                }
            }
        }
        if(word1letters.isEmpty()){
            return true;
        }
        return false;
    }
}
