package dynamicprogramming;

import dynamicprogramming.ch1.MatematicalTable;
import org.junit.Test;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-09-15
 */
public class MatematicalTableTest {

    @Test
    public void tableSequencial(){
        new MatematicalTable().printTable(10);
    }

    @Test
    public void tableRecursive(){
        new MatematicalTable().printTableRecursive(10);
    }


}