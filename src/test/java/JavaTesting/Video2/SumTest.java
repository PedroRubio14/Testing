package JavaTesting.Video2;
import org.junit.jupiter.api.Test;



import static org.junit.Assert.assertEquals;

public class SumTest {

    @Test
    public void sumTest(){
        int r = 1+1;
        assertEquals("1 + 1 = 2",2,r);
    }

}
