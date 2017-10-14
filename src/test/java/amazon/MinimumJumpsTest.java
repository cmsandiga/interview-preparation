package amazon;

import org.junit.Test;
import org.omg.CORBA.INTERNAL;

import javax.xml.bind.SchemaOutputResolver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class MinimumJumpsTest {


    @Test
    public void test(){
        int[] a = {1,3,1,1};
        MinimumJumps minimumJumps = new MinimumJumps();
        int jumps = minimumJumps.minJumps(a);
        System.out.println(jumps);


    }

}