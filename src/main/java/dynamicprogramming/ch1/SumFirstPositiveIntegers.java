package dynamicprogramming.ch1;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-09-14
 */
public class SumFirstPositiveIntegers {


    public int sum(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return n + sum(n - 1);
    }
}
