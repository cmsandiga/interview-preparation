package leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeMap;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-08-22
 */
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length == 0) {
            return nums;
        }

        TreeMap<Integer, LinkedList<Integer>> map = new TreeMap<>(Collections.reverseOrder());

        int[] result = new int[nums.length - k + 1];

        int tail = 0;
        int head = 0;

        while (head < k) {
            addElementToMap(nums[head], map, head);
            head++;
        }
        result[tail] = map.firstKey();
        tail++;

        while (head < nums.length) {
            removeElementFromMap(nums[tail - 1], map);
            addElementToMap(nums[head], map, head);

            result[tail] = map.firstKey();
            tail++;
            head++;
        }

        return result;
    }

    private void removeElementFromMap(int num, TreeMap<Integer, LinkedList<Integer>> map) {
        LinkedList<Integer> values = map.get(num);

        if (values.size() > 1) {
            values.pollFirst();
        } else {
            map.remove(num);
        }
    }

    private void addElementToMap(int num, TreeMap<Integer, LinkedList<Integer>> map, int head) {
        LinkedList<Integer> values = map.get(num);

        if (values == null) {
            values = new LinkedList<>();
        }
        values.add(head);
        map.put(num, values);
    }

}
