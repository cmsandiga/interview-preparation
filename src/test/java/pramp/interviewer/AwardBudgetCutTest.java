package pramp.interviewer;

import org.junit.Assert;
import org.junit.Test;
import pramp.interviewer.AwardBudgetCut;

/**
 * Created by makoto on 22/02/17.
 * https://www.interviewbit.com/dashboard/
 * // Michael T. Goodrich - Data Structures and Algorithms in Java 6th Edition
 * 110 - 
 */
public class AwardBudgetCutTest {

    @Test
    public void test1() {
        //int[] g = new int[]{20, 10, 40, 60};
        int[] g = new int[]{150, 50, 400, 200};
        // 10, 20, 40, 60
        // 10, 20, 35, 35
        int budget = 400;

        int c = new AwardBudgetCut().findGrantsCap(g, budget);
        Assert.assertEquals(116, c);

        c = new AwardBudgetCut().findGrantsCap2(g, budget);
        Assert.assertEquals(116, c);

        c = new AwardBudgetCut().findGrantsCapPramp(g, budget);
        Assert.assertEquals(116, c);
    }

    @Test
    public void test2() {
        int[] g = new int[]{50, 10, 20, 80};
        // 10, 20, 50, 80
        int budget = 120;

        int c = new AwardBudgetCut().findGrantsCap(g, budget);
        Assert.assertEquals(45, c);

        c = new AwardBudgetCut().findGrantsCap2(g, budget);
        Assert.assertEquals(45, c);

        c = new AwardBudgetCut().findGrantsCapPramp(g, budget);
        Assert.assertEquals(45, c);
    }
    @Test
    public void whenBudgetFitsSoReturnTheGreatherNumberAsCap() {
        int[] g = new int[]{20, 10, 40, 60};

        int budget = 130;

        int c = new AwardBudgetCut().findGrantsCap(g, budget);
        Assert.assertEquals(60, c);

        c = new AwardBudgetCut().findGrantsCapPramp(g, budget);
        Assert.assertEquals(60, c);
    }

    @Test
    public void budgetNotFits() {
        int[] g = new int[]{20, 10, 40, 60};
        // int[] g = new int[]{20, 100, 150, 60};
        // c = 20
        // 20, 10, 40, 40 curBudget = 110
        // 20, 10, 20, 20 curBudget = 70 c=20

        int budget = 10;

        int c = new AwardBudgetCut().findGrantsCap(g, budget);
        Assert.assertEquals(2, c);

        c = new AwardBudgetCut().findGrantsCapPramp(g, budget);
        Assert.assertEquals(2, c);
        //Assert.assertEquals(-1, c);
    }

    @Test
    public void budgetFitsWithFirstElements() {
        int[] g = new int[]{15, 10, 30, 50}; // 105 / 4 = 22
        // {10, 15, 30, 50}
        int budget = 70;

        int c = new AwardBudgetCut().findGrantsCap(g, budget);
        Assert.assertEquals(22, c);

        c = new AwardBudgetCut().findGrantsCapPramp(g, budget);
        Assert.assertEquals(22, c);
    }


    /*
    *
    *
    *
     */
}
