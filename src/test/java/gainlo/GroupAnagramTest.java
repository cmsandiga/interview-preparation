package gainlo;

import org.junit.Test;

import javax.swing.text.StyledEditorKit;
import java.util.List;
import java.util.Set;

/**
 * Created by makoto on 25/06/17.
 */
public class GroupAnagramTest {

    @Test
    public void groupAnagrams() {

        String[] words = {"cat", "dog", "act", "door", "odor"};

        List<Set<String>> groupAnagrams = GroupAnagram.groupAnagrams(words);

        for(Set<String> sets : groupAnagrams){
            System.out.println(sets);
        }
    }
}
