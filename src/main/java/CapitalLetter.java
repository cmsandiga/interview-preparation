/**
 * Created by makoto on 19/02/17.
 */
public class CapitalLetter {

    public static void main(String[] args) {

        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("flaG"));
        System.out.println(detectCapitalUse("Flag"));


    }
    public static boolean detectCapitalUse(String word) {

        if (word.length() == 1 && !(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')) {
            return false;
        }

        boolean allTrue = true;
        boolean allLower = true;
        boolean firstLower = true;

        boolean firstCharacter = false;

        int first = word.charAt(0);

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (allTrue && !(c >= 'A' && c <= 'Z')) {
                allTrue = false;
            }

            if (allLower && !(c >= 'a' && c <= 'z')) {
                allLower = false;
            }

            if(!firstCharacter && first >= 'A' && first <= 'Z'){
                firstCharacter = true;
            }

            if(firstCharacter){
                if(i > 0 && !(c >= 'a' && c <= 'z')){
                    firstLower = false;
                }
            } else{
                if(!( c >= 'a' && c <= 'z')) {
                    firstLower = false;

                }
            }
        }
        return allTrue || allLower || firstLower;
    }

}
