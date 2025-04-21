package JavaTesting.Video6;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraysTest {
    @Test
    public void exempleArraysSenzill(){
        String[] numerals = {"zero","un","dos","tres"};

        assertEquals("zero",numerals[0]);

        String nombres= "";
        for(String n: numerals){
            nombres += n+'|';
        }

        assertEquals(nombres,"zero|un|dos|tres|" );
    }

    @Test
    public void provaesOrdenacioArray(){
        String[] numerals = {"zero","un","dos","tres"};

        Arrays.sort(numerals);
        for(int i = 0; i<numerals.length -1;i++){
            assertTrue(numerals[i].compareTo(numerals[i+1])<0);
        }

    }

    @Test
    public void farcirArrayParcialment(){
        int[] nums = {0,1,2,3,4,5,6,7,8,9};

        Arrays.fill(nums,5,10,-1);

        for(int i = 5; i<nums.length ;i++){
            assertTrue(nums[i] == -1);
        }


    }

    @Test
    public void copiaRangMatriu (){
        String [] dies = {"dilluns","dimarts","dimecres", "dijous","divendres","dissabe","diumenge"};

        String[] feiners = Arrays.copyOfRange(dies,0,5);
        assertTrue(feiners.length == 5);
        assertTrue(feiners[1].equals("dimarts"));

        String[] feinersEsclaus = Arrays.copyOfRange(feiners, 0,7);

        assertTrue(feinersEsclaus[0].equals("dilluns") );
        assertEquals(feinersEsclaus[5],null);

        feinersEsclaus[5]="dissabte de fiena";
        feinersEsclaus[6]="descans";
        assertEquals(feinersEsclaus[6],"descans");

    }

    public void arraysIrregularsTest(){
        int[][] arrayIrregular ={
                {0,1,2,3,4,5},
                {0,1,2,3,4},
                {0,1,2,3},
                {0,1,2},
                {0,1},
                {0}};

        assertEquals(arrayIrregular.length, 6);
        assertEquals(arrayIrregular[0].length, 6);
        assertEquals(arrayIrregular[5].length, 1);

    }

}
