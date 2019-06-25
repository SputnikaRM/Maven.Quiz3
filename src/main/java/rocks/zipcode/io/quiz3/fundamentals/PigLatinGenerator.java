package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        int x = 0;
        if (VowelUtils.isVowel(str.charAt(0))){
            str = str + "way";
            return str;

        }
        else {
           x= VowelUtils.getIndexOfFirstVowel(str);
            str=str.substring(x,str.length())+str.substring(0,x)+"ay";
                return str;}




    }
}