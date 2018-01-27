import com.sdabyd2.programowanie.PTestImpl;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PTests {

    @Test
    public void shouldFindLastElementFromList()throws Exception{
        assertThat(PTestImpl.last(asList("a", "b", "c", "d")), is(equalTo("d")));
    }
}
