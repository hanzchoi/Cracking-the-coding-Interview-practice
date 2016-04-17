package nyc.c4q.personabe1984;
/**
 * Implement an algorithm to determine if a string has all unique character.
 * what if you cannot use additional data structure.
 *
 * */
public class IsUnique {

    public static void main(String[] args){
        //String test00 = "abcdefg";
        //String test01 = "aabbcca";
        String test02 = "abc";

        //System.out.println(isUniqueChars(test00));
        //System.out.println(isUniqueChars(test01));
        System.out.println(isUniqueChars(test02));
    }

    public static boolean isUniqueChars(String str){
        if(str.length() > 128) return false;  //Assuming that this is a ASCII there cannot be more than 128 unique char in english alphabet

        boolean[] char_set = new boolean[128];
        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) { // Already found this char in string
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}

    /*
    This one uses the bit Vector
    private static boolean isUniqueChars(String str){
        int checker = 0;
        for(int i=0; i < str.length(); i++){
            int val = str.charAt(i) - 'a';
            if((checker & (1 << val)) > 0){
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
    */

