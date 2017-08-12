package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by makoto on 09/07/17.
 */
public class TrieContactTest {

    @Test
    public void add() throws Exception {
        TrieContact trieContact = new TrieContact();
        //trieContact.add("hacm");
        trieContact.add("hack");
        trieContact.add("hackerrank");
        trieContact.add("hackerranks");

        System.out.println(trieContact.countSearch("hack"));
    }

    @Test
    public void find() throws Exception {
    }

}