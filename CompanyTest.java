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
    private User client1;
    private User seller1;
    private Property prop1;
    private Sell sell1;

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
        client1 = new User("João", "999888777", "joaogmail");
        seller1 = new User("Miguel", "999834377", "miguelgmail");
        prop1 = new Property("Viso", 140000.0);
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
        assertTrue(comp1.registerClient(client1));
    }

    @Test
    public void testRegisterClients(){
        User u2 = new User("Ana", "111222333", "anagmail");
        assertTrue(comp1.registerClient(client1));
        assertTrue(comp1.registerClient(u2));
    }

    @Test
    public void testRegisterClientDuplicate(){
        assertTrue(comp1.registerClient(client1));
        assertFalse(comp1.registerClient(client1));
    }

    @Test
    public void testRegisterClientNull(){
        User u3 = null;
        assertFalse(comp1.registerClient(u3));
    }

    @Test
    public void testRegisterSeller(){
        assertTrue(comp1.registerSeller(seller1));
    }

    @Test
    public void testRegisterSellers(){
        User u2 = new User("Miguela", "111266533", "miguelagmail");
        assertTrue(comp1.registerSeller(seller1));
        assertTrue(comp1.registerSeller(u2));
    }

    @Test
    public void testRegisterSellerDuplicate(){
        assertTrue(comp1.registerSeller(seller1));
        assertFalse(comp1.registerSeller(seller1));
    }

    @Test
    public void testRegisterSellerNull(){
        User u3 = null;
        assertFalse(comp1.registerSeller(u3));
    }

    @Test
    public void testRegisterProperty(){
        assertTrue(comp1.registerProperty(prop1));
    }

    @Test
    public void testRegisterProperties(){
        Property prop2 = new Property("Setubal", 5.0);
        assertTrue(comp1.registerProperty(prop1));
        assertTrue(comp1.registerProperty(prop2));
    }

    @Test
    public void testRegisterPropertyDuplicate(){
        assertTrue(comp1.registerProperty(prop1));
        assertFalse(comp1.registerProperty(prop1));
    }

    @Test
    public void testRegisterPropertyNull(){
        Property prop3 = null;
        assertFalse(comp1.registerProperty(prop3));
    }

    @Test
    public void testCreateSell(){
        comp1.registerClient(client1);
        comp1.registerSeller(seller1);
        comp1.registerProperty(prop1);
        assertTrue(comp1.createSell(client1, seller1, prop1));
    }
    
    @Test
    public void testCalculateSellsOfTheYear(){
        comp1.registerClient(client1);
        comp1.registerSeller(seller1);
        comp1.registerProperty(prop1);
        comp1.createSell(client1, seller1, prop1);
        User client2 = new User("Jonas", "922288777", "jonasgmail");
        User seller2 = new User("Rui", "889834377", "ruigmail");
        Property prop2 = new Property("Monte belo", 130000.0);
        comp1.registerClient(client2);
        comp1.registerSeller(seller2);
        comp1.registerProperty(prop2);
        comp1.createSell(client2, seller2, prop2);
        assertEquals(2, comp1.calculateSellsOfTheYear(2024));
    }
    
    @Test
    public void testFindSellerOfTheYear(){
        
    }
}