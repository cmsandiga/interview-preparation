package pramp.interviewee;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by makoto on 22/02/17.
 */
public class FlattenDictionaryTest {


    @Test
    public void baseCase() {
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        Map<String, String> result = FlattenDictionary.resolve(map, new HashMap<>(), "");
        Assert.assertEquals("value1", result.get("key1"));

    }

    @Test
    public void innerCase() {
        Map<String, Object> innerMap = new HashMap<>();
        innerMap.put("key2", "value2");
        innerMap.put("key4", "value3");
        Map<String, Object> map = new HashMap<>();
        map.put("key1", innerMap);
        Map<String, String> result = FlattenDictionary.resolve(map, new HashMap<>(), "");
        Assert.assertEquals("value2", result.get("key1.key2"));
        Assert.assertEquals("value3", result.get("key1.key4"));

    }
// {key1: {key2:{key3:5}}}
// map = {key1: {key2:{key3:5}}}
// result = {}
// concat = ""

// map = {key2:{key3:5}}
// result = {}
// "" key1

// map = {key2:{key3:5}}
// result = {}
// "" key1 . key2

// map = { key3:5}
// result = {}
// "" key1 . key2 . key3 : 5


}
