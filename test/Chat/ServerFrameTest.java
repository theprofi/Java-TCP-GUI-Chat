/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.net.Socket;
import java.util.ArrayList;
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
public class ServerFrameTest {

    public ServerFrameTest() {
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
     * Test of main method, of class ServerFrame.
     */
    @Test
    public void testMain() {
        System.out.println("Start tests");
        String[] args = null;
        ServerFrame serverFrame = new ServerFrame();
        ServerFrame.Server server = serverFrame.new Server();
        Socket clientSocket = new Socket();
        ServerFrame.Server.ClientThread client1 = server.new ClientThread(clientSocket, "client1");
        ServerFrame.Server.ClientThread client2 = server.new ClientThread(clientSocket, "client2");
        ServerFrame.Server.ClientThread client3 = server.new ClientThread(clientSocket, "client3");
        ArrayList<ServerFrame.Server.ClientThread> list = new ArrayList<>();
        list.add(client1);
        list.add(client2);
        list.add(client3);
        assertFalse((server.isLegalName("client3", list)));
        assertTrue((server.isLegalName("client4", list)));
        assertTrue((server.isLegalName("client5", list)));
    }

}
