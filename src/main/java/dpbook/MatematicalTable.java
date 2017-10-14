package dpbook;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-09-15
 */
public class MatematicalTable {

    public void printTable(int n) {
        for (int i = 1; i < n; i++) {
            System.out.printf("%d * %d = %d\n", n, i, (n * i));
        }
    }

    public void printTableRecursive(int n) {
        printTableRecursiveUtil(n,1);
    }

    public void printTableRecursiveUtil(int n, int i) {

        if (i > n) return;

        System.out.printf("%d * %d = %d\n", n, i, (n * i));
        printTableRecursiveUtil(n, i + 1);
    }
}
