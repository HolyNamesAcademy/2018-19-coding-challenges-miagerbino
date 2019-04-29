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
        word1.trim();
        word2.trim();
        if(word1.length()!=word2.length()){
            return false;
        }
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        if(word1.equals(word2)) {
            return true;
        }

        ArrayList <Character> word1letters = new ArrayList <Character>();
        ArrayList <Character> word2letters = new ArrayList <Character>();

        //load arrays with characters of strings
        for(int i = 0; i<word1.length(); i++){
            word1letters.add(word1.charAt(i));
            word2letters.add(word2.charAt(i));
        }

        int length = word1letters.size();

        //check each character against the other word
        for (int i = 0; i<word1letters.size(); i++){
            for (int j = 0; j<word1letters.size(); j++){
                if(word1letters.get(0).equals(word2letters.get(j))){
                    word1letters.remove(0);
                    word2letters.remove(j);
                    break;
                }
            }
        }
        for (int i = 0; i<word1letters.size(); i++){
            for (int j = 0; j<word1letters.size(); j++){
                if(word1letters.get(0).equals(word2letters.get(j))){
                    word1letters.remove(0);
                    word2letters.remove(j);
                    break;
                }
            }
        }

        if(word1letters.isEmpty()||word1letters.equals(word2letters)){
            return true;
        }
        return false;
    }
}
