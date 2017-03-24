package pramp.interviewee;

import java.util.Map;

/**
 * Created by makoto on 22/02/17.
 Given a dictionary, write a function to flatten it. Consider the following input/output scenario for better understanding:

 Input:

 {
 'Key1': '1',
     'Key2': {
     'a' : '2',
     'b' : '3',
         'c' : {
         'd' : '3',
         'e' : '1'
         }
     }
 }
 Output:
 {
 'Key1': '1',
 'Key2.a': '2',
 'Key2.b' : '3',
 'Key2.c.d' : '3',
 'Key2.c.e' : '1'
 }
 */
public class FlattenDictionary {

    public static Map<String, String> resolve(Map<String, Object> map, Map<String, String> result, String concat) {

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof String) {
                if ("".equals(concat)) {
                    result.put(entry.getKey(), (String) entry.getValue());
                } else {
                    result.put(concat + "." + entry.getKey(), (String) entry.getValue());
                }

            } else {
                if ("".equals(concat)) {
                    resolve((Map) entry.getValue(), result, entry.getKey());
                } else {
                    resolve((Map) entry.getValue(), result, concat + "." + entry.getKey());
                }
            }
        }
        return result;
    }
}
