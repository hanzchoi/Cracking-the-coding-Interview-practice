package nyc.c4q.personabe1984;

/**
 * Given two strings, write a method to decide if one is a permutation of the other
 */
public class CheckPermutation {

    public static void main(String[] args) {

    }

    //Solution 1: Sort out the string first

    /**
     * If two strings are permutation, then we know they have the same character, but in different order
     * Thus, sorting the string will put the character from two permutation in the same order.
     */
    public static String sort(String s){
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String (content);
    }

    public static boolean permutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        return sort(s).equals(sort(t));
    }

    //Solution 2: Check if the two string have identical character counts
    public static boolean permutationv2(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] letters = new int[128]; //Assumption

        char[] s_array = s.toCharArray();
        for(char c : s_array){ //Count the number of each char in s.
            letters[c]++;
        }

        for(int i = 0; i < t.length(); i++){
            int c = (int) t.charAt(i);
            letters[c]--;
            if(letters[c] < 0){
                return false;
            }
        }
        return true;
    }

}
