package pramp.interviewee;

/**
 * Created by makoto on 24/03/17.
 * Merge Overlapping Intervals
 * Given start set of time intervals in any order, merge all overlapping intervals
 * into one and output the result which should have only mutually exclusive intervals.
 * Let the intervals be represented as pairs of integers for simplicity.
 * For example, let the given set of intervals be {{1,3}, {2,4}, {5,7}, {6,8} }.
 * The intervals {1,3} and {2,4} overlap with each other, so they should be merged and become {1, 4}.
 * Similarly {5, 7} and {6, 8} should be merged and become {5, 8}
 */
public class MergeOverlappingIntervals {

    public void merge(Interval intervals) {

        Interval it = intervals;

        while (it != null && it.next != null) {

            if (it.start <= it.next.start && it.end >= it.next.start) {
                it.end = it.end >= it.next.end ? it.end : it.next.end;
                it.next = it.next.next;
            } else {
                it = it.next;
            }
        }
    }

    public static class Interval {
        int start;
        int end;
        Interval next;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
}

