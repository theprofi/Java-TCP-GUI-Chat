/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.io.Serializable;

/**
 * This class holds all the data which the clients need to pass as fields.<br>
 * The clients send this class as a string to the server (Using the class
 * SerializeDeserialize).
 *
 * @author Eli Eliyahu 312328016 Noam Gruber 312325384
 */
public class ClientInfoSeirialized implements Serializable {

    private final static long serialVersionUID = 1;//Adding a serialVersionUID
    //to the class protects against a problem when new fields being added

    String name; //Client's name

    String msg; //The message that the client wants to send

    String recipient; //Holds other client's name to send a private message
    //or 'all' to send a message to everyone

    boolean showOnline; //If it's true server returns a string with all the 
    //online user

}
