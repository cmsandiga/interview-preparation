package pramp.interviewee;

import java.util.Comparator;
import java.util.List;

/**
 * Created by makoto on 27/02/17.
 * <p>
 * The mall management is trying to figure out what was the busiest moment in the mall in the last year.
 * You are given data from the door detectors: each data entry includes a timestamp (seconds in Unix Epoch format), an amount of people and whether they entered or exited.
 * <p>
 * Example of a data entry:
 * { time: 1440084737,  count: 4,  type: "enter" }
 * <p>
 * Find what was the busiest period in the mall on the last year. Return an array with two Epoch timestamps representing the beginning and end of that period. You may assume that the data your are given is accurate and that each second with entries or exits is recorded. Implement the most efficient solution possible and analyze its time and space complexity.
 */
public class BusiestTime {
    public static void main(String[] args) {
        String pramp = "Practice Makes Perfect";
        System.out.println(pramp);
    }

    public long[] maxBussinetTime(List<Entry> entries) {

        int i = 0;
        long max = 0;
        int[] indexed = new int[2];

        entries.sort(new CompareEntry());

        int j = 1;
        while (i < entries.size()) {
            Entry exit = entries.get(j);

            if ("exit".equals(exit.type)) {
                long deltatime = exit.time - entries.get(i).time;

                if (deltatime > max) {
                    max = deltatime;
                    indexed[0] = i;
                    indexed[1] = j;
                }

                int countdelta = entries.get(i).count - exit.count; // 4, 2 | 4 , 6  2

                if (countdelta <= 0) {
                    while (true) {
                        i++;
                        if ("enter".equals(entries.get(i))) {
                            break;
                        }
                    }
                } else {
                    exit.count = Math.abs(countdelta);
                }

            } else {
                j++;
            }
        }
        return new long[]{
                entries.get(indexed[0]).time, entries.get(indexed[1]).time
        };
    }

    public static class Entry implements Comparator<Entry> {
        long time;
        int count;
        String type;

        @Override
        public int compare(Entry o1, Entry o2) {
            return Long.compare(o1.time, o2.time);
        }
    }

    public static class CompareEntry implements Comparator<Entry> {

        @Override
        public int compare(Entry o1, Entry o2) {
            return Long.compare(o1.time, o2.time);
        }
    }
}


// 1 { time: 1440084737,  count: 4,  type: "enter" }
// 2 { time: 1440090000,  count: 4,  type: "exit" }
// 3 { 1440084737, 1440090000 }

// n log n
// 1 { time: 1440084737,  count: 4,  type: "enter" }
// 2 { time: 1440084740,  count: 1,  type: "enter" }
// 3 { time: 1440090000,  count: 2,  type: "exit" }
// 4 { time: 1440084740,  count: 2,  type: "enter" }
// 5 { time: 1440090050,  count: 3,  type: "exit" }

// 1440084737, 1440084740
