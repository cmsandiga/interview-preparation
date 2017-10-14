package dpbook;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-09-14
 * Question 1.1
 */
public class Factorial {

    public int factorial(int n) {

        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
