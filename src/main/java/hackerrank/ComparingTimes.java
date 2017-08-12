package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by makoto on 09/07/17.
 */
public class ComparingTimes {
    static String timeCompare(String t1, String t2){
        Time time1 = extract(t1);
        Time time2 = extract(t2);

        if(time1.meridian != time2.meridian){
            if(time1.meridian < time2.meridian){
                return "First";
            }else{
                return "Second";
            }
        } else {
            if(time1.time < time2.time){
                return "First";
            }else{
                return "Second";
            }
        }
    }

    public static Time extract(String t){
        Pattern p1 = Pattern.compile("([0-9]{2}):([0-9]{2})([APM]{2})");

        Time time = new Time();
        Matcher matcher = p1.matcher(t);
        matcher.matches();
        time.time = Integer.parseInt(matcher.group(1) + matcher.group(2));
        time.meridian =  matcher.group(3).equals("AM") ? 1 : 2;

        return time;
    }

    public static class Time{
        int time;
        int meridian;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String t1 = in.next();
            String t2 = in.next();
            String result = timeCompare(t1, t2);
            System.out.println(result);
        }
    }
}
