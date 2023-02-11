
import junit.framework.*;

public class OperationTests extends TestCase{
     int a, b,result;
     double resultD;
Operations op=new Operations();
    // assigning the values
    protected void setUp(){
        a = 3;
        b = 3;
    }

    // test method to add two values
  public void testAdd() {
      result = op.add(a, b);
      assertTrue(result == 6);
  }
    // test method to subtract two values
    public void testSub() {
        result = op.sub(a, b);
        assertTrue(result == 0);
    }

    // test method to multiply two values
    public void testMul() {
        result = op.mul(a, b);
        assertTrue(result == 9);
    }
    // test method to divide two values
    public void testDiv() {
        resultD = op.div(a, b);
        assertEquals( 1,resultD,0.0001);
    }
    public void testPow(){
        result=op.pow(a,b);
        assertTrue(result == 27);


    }
}
