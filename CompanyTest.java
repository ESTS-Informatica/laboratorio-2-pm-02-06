import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    private Company comp1;

    /**
     * Default constructor for test class CompanyTest
     */
    public CompanyTest()
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
        comp1 = new Company();
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
        assertNotNull(comp1.getProperties());
        assertNotNull(comp1.getClients());
        assertNotNull(comp1.getSellers());
        assertNotNull(comp1.getSells());
    }

    @Test
    public void testRegisterClient(){
        User u1 = new User("João", "999888777", "joaogmail");
        assertTrue(comp1.registerClient(u1));
    }

    @Test
    public void testRegisterClients(){
        User u1 = new User("João", "999888777", "joaogmail");
        User u2 = new User("Ana", "111222333", "anagmail");
        assertTrue(comp1.registerClient(u1));
        assertTrue(comp1.registerClient(u2));
    }

    @Test
    public void testRegisterClientDuplicate(){
        User u1 = new User("João", "999888777", "joaogmail");
        assertTrue(comp1.registerClient(u1));
        assertFalse(comp1.registerClient(u1));
    }

    @Test
    public void testRegisterClientNull(){
        User u3 = null;
        assertFalse(comp1.registerClient(u3));
    }

    @Test
    public void testRegisterSeller(){
        User u1 = new User("Miguel", "999834377", "miguelgmail");
        assertTrue(comp1.registerSeller(u1));
    }

    @Test
    public void testRegisterSellers(){
        User u1 = new User("Miguel", "999834377", "miguelgmail");
        User u2 = new User("Miguela", "111266533", "miguelagmail");
        assertTrue(comp1.registerSeller(u1));
        assertTrue(comp1.registerSeller(u2));
    }

    @Test
    public void testRegisterSellerDuplicate(){
        User u1 = new User("Miguel", "999834377", "miguelgmail");
        assertTrue(comp1.registerSeller(u1));
        assertFalse(comp1.registerSeller(u1));
    }

    @Test
    public void testRegisterSellerNull(){
        User u3 = null;
        assertFalse(comp1.registerSeller(u3));
    }

    @Test
    public void testRegisterProperty(){
        Property prop1 = new Property("Viso", 140000.0);
        assertTrue(comp1.registerProperty(prop1));
    }

    @Test
    public void testRegisterProperties(){
        Property prop1 = new Property("Viso", 140000.0);
        Property prop2 = new Property("Setubal", 5.0);
        assertTrue(comp1.registerProperty(prop1));
        assertTrue(comp1.registerProperty(prop2));
    }

    @Test
    public void testRegisterPropertyDuplicate(){
        Property prop1 = new Property("Viso", 140000.0);
        assertTrue(comp1.registerProperty(prop1));
        assertFalse(comp1.registerProperty(prop1));
    }

    @Test
    public void testRegisterPropertyNull(){
        Property prop3 = null;
        assertFalse(comp1.registerProperty(prop3));
    }

}
