
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class OperationPowerTestWithMockito {
    @Test
    void testPow(){
        PowOperation pow;
        Operations op;
        pow= Mockito.mock(PowOperation.class);
        op=new Operations();
        int a=4;
        int b=2;
        int expected=16;

        when(pow.powAlt(a,b)).thenReturn(expected);
        int actual=op.pow(4,2);
        assertEquals(expected, actual);

    }
}
