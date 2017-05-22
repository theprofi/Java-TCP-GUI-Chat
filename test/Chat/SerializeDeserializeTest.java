/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.io.Serializable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Power
 */
public class SerializeDeserializeTest {
    
    public SerializeDeserializeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of both methods, of class SerializeDeserialize.
     */
    @Test
    public void testFromString() throws Exception {
        System.out.println("Start tests:");
        ClientInfoSeirialized cinfo = new ClientInfoSeirialized();
        cinfo.name = "my name";
        cinfo.recipient = "My recipeint";
        cinfo.msg = "My message$#@$#@$#@!$!GDS  GAERR \'\\t\\y\\'e6";
        String serialized = SerializeDeserialize.toString(cinfo);
        ClientInfoSeirialized cinfoDeserialized = (ClientInfoSeirialized)SerializeDeserialize.fromString(serialized);
        assertTrue(cinfo.name.equals(cinfoDeserialized.name));
        assertTrue(cinfo.msg.equals(cinfoDeserialized.msg));
        assertTrue(cinfo.recipient.equals(cinfoDeserialized.recipient));
    }
}
