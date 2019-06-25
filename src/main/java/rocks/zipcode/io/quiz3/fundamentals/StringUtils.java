package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
       str= str.substring(0,indexToCapitalize)+ Character.toUpperCase(str.charAt(indexToCapitalize)) + str.substring(indexToCapitalize+1,str.length());
       return str;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
       if( baseString.charAt(indexOfString)==characterToCheckFor)
        return true;
       return false;
    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){

        return null;
    }
}
