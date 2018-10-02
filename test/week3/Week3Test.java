package week3;
import org.junit.Assert;
import org.junit.Test;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void Test_Max(){
        Week3 week3 = new Week3();
        Assert.assertEquals(5, week3.max(5,2));
        Assert.assertEquals(4, week3.max(1,4));
        Assert.assertEquals(10, week3.max(5,10));
        Assert.assertEquals(3333, week3.max(3333,2423));
        Assert.assertEquals(1000, week3.max(1000,23));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void Test_minOfArray(){
        int[] A = {1,2,3};
        int[] B ={4,6,3,-1};
        int[] C ={44,50000,623,3434,1212};
        int[] D ={123,421,412,421,221};
        int[] E ={1,1,1,4,2,2,2,1,41};
        Assert.assertEquals(1,Week3.minOfArray(A));
        Assert.assertEquals(-1,Week3.minOfArray(B));
        Assert.assertEquals(44,Week3.minOfArray(C));
        Assert.assertEquals(123,Week3.minOfArray(D));
        Assert.assertEquals(1,Week3.minOfArray(E));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testBMI(){
        Assert.assertEquals("Thiếu cân",Week3.calculateBMI(42,1.7));
        Assert.assertEquals("Bình thường",Week3.calculateBMI(61,1.7));
        Assert.assertEquals("Thừa cân",Week3.calculateBMI(66,1.65));
        Assert.assertEquals("Béo phì",Week3.calculateBMI(80,1.68));
        Assert.assertEquals("Bình thường",Week3.calculateBMI(67,1.81));
    }
}
