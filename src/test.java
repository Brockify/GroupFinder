import org.junit.Before;
import org.junit.Test;
import sun.nio.cs.Surrogate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by vagrant on 4/10/15.
 */
public class test {
    private List<String> names;

    @Test
    public void findGroup() throws Exception {
        List<String> names = new ArrayList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");
        names.add("f");
        grouppicker generator = new grouppicker(names);
        String name = "a";
        ArrayList<String>groups = generator.createGroup(name);
        assertEquals(groups.contains(name), true);
    }
    @Before
    public void setUp() {
        this.names = new ArrayList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");
        names.add("f");
    }

    @Test
    public void groupSize() {
        grouppicker generator = new grouppicker(this.names);
        System.out.println(this.names.size());
    }
}
