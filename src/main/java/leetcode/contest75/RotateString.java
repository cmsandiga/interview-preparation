package leetcode.contest75;

public class RotateString {

    public boolean isRotateString(String a, String b){
        StringBuilder sb = new StringBuilder(a);

        for(int i = 0; i < a.length(); i++){
            char firstCh = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(firstCh);

            if(sb.toString().equals(b)){
                return true;
            }
        }

        return false;
    }
}
