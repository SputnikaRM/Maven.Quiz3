package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        char [] arr = word.toCharArray();
        for(int x=0; x<arr.length;x++){
            if(isVowel(arr[x]))
                return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer y=-1;
        char [] arr = word.toCharArray();
        for(int x=0;x<arr.length;x++){
            if(isVowel(arr[x])){
                y=x;
                break;}
        }
        return y;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));

    }

    public static Boolean isVowel(Character character) {
        character= Character.toLowerCase(character);
        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
            return true;
        return false;
    }
}
