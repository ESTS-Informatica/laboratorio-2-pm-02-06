import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PropertyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PropertyTest
{
    private Property p1;
    
    /**
     * Default constructor for test class PropertyTest
     */
    public PropertyTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        p1 = new Property("T3 Monte Belo", 150000.0);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testConstructor(){
        assertEquals("T3 Monte Belo", p1.getDescription());
        assertEquals(150000.0, p1.getPrice());
    }
    
    @Test
    public void testToString(){
        assertEquals("Descricao : T3 Monte Belo\nPreco : 150000.0", p1.toString());
    }
}
