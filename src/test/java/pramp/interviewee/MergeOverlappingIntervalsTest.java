package pramp.interviewee;

import org.junit.Assert;
import org.junit.Test;
import pramp.interviewee.MergeOverlappingIntervals;


/**
 * Created by makoto on 24/03/17.
 */
public class MergeOverlappingIntervalsTest {

    @Test
    public void testIntervals() {
        MergeOverlappingIntervals.Interval intervals =
                new MergeOverlappingIntervals.Interval(1, 3);
        intervals.next = new MergeOverlappingIntervals.Interval(2, 4);
        intervals.next.next = new MergeOverlappingIntervals.Interval(5, 7);
        intervals.next.next.next = new MergeOverlappingIntervals.Interval(6, 8);


        new MergeOverlappingIntervals().merge(intervals);

        Assert.assertEquals("Interval{start=1, end=4}", intervals.toString());
        Assert.assertEquals("Interval{start=5, end=8}", intervals.next.toString());
    }

    @Test
    public void withoutIntervals() {
        MergeOverlappingIntervals.Interval intervals =
                new MergeOverlappingIntervals.Interval(1, 3);
        intervals.next = new MergeOverlappingIntervals.Interval(5, 7);
        intervals.next.next = new MergeOverlappingIntervals.Interval(8, 11);


        new MergeOverlappingIntervals().merge(intervals);

        Assert.assertEquals("Interval{start=1, end=3}", intervals.toString());
        Assert.assertEquals("Interval{start=5, end=7}", intervals.next.toString());
        Assert.assertEquals("Interval{start=8, end=11}", intervals.next.next.toString());
    }

    @Test
    public void oneInterval() {
        MergeOverlappingIntervals.Interval intervals =
                new MergeOverlappingIntervals.Interval(1, 5);
        intervals.next = new MergeOverlappingIntervals.Interval(5, 7);


        new MergeOverlappingIntervals().merge(intervals);

        Assert.assertEquals("Interval{start=1, end=7}", intervals.toString());
    }

    @Test
    public void oneIntervalClosed() {
        MergeOverlappingIntervals.Interval intervals =
                new MergeOverlappingIntervals.Interval(1, 5);
        intervals.next = new MergeOverlappingIntervals.Interval(2, 3);


        new MergeOverlappingIntervals().merge(intervals);

        Assert.assertEquals("Interval{start=1, end=5}", intervals.toString());
        Assert.assertNull(intervals.next);
    }
}
