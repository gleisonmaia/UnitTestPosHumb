import junit.framework.TestCase;
import org.junit.Assert;


public class ValoresTest extends TestCase {


    Valores operationsVector = new Valores();


    public void testInsertValue() {


        assertTrue(operationsVector.InsertValue(5));
        assertFalse(operationsVector.InsertValue(-1));
        operationsVector.InsertValue(7);
        assertEquals(2,operationsVector.SizeVector());

    }

    public void testDeleteValue() {
        operationsVector.InsertValue(5);
        int retorno = operationsVector.DeleteValue(0);
        assertEquals(retorno,5);
    }


};
