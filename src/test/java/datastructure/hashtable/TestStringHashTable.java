package datastructure.hashtable;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by makoto on 17/06/17.
 */
public class TestStringHashTable {


    @Test
    public void test1() {
        StringHashTable sht = new StringHashTable(10);
        sht.add("72543855", "makoto");
        sht.add("72543856", "abc");

        Assert.assertEquals("makoto", sht.get("72543855"));
        Assert.assertEquals("abc", sht.get("72543856"));

        sht.remove("72543855");
        Assert.assertEquals(null, sht.get("72543855"));
        Assert.assertEquals("abc", sht.get("72543856"));

        sht.remove("72543856");
        Assert.assertEquals(null, sht.get("72543855"));
        Assert.assertEquals(null, sht.get("72543856"));
    }
}
