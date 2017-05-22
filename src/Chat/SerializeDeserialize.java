/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

/**
 * This class has one method to serialize an object and one to deserialize.
 * @author Eli Eliyahu 312328016 Noam Gruber 312325384
 */
public class SerializeDeserialize {

    /**
     * Read the object from Base64 string.
     * @param s holds the serialized object with all the data from the client.
     * @return Object which hold client's data (casting is needed).
     * @throws java.io.IOException IOException has occurred
     * @throws java.lang.ClassNotFoundException If the class wasn't found
     */
    public static Object fromString(String s) throws IOException,
            ClassNotFoundException {
        byte[] data = Base64.getDecoder().decode(s);
        Object o = null;
        try (ObjectInputStream ois = new ObjectInputStream(
                new ByteArrayInputStream(data))) {
            o = ois.readObject();
        } catch (Exception e) {
            
        }
        return o;
    }

    /**
     * Write the object to a Base64 string.
     * @param o the object that holds client's data which is used by the server.
     * @return String representing the object with all the data.
     * @throws java.io.IOException IOException has occurred
     */
    public static String toString (Serializable o) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(o);
        }
        catch(Exception e){
            return null;
        }
        return Base64.getEncoder().encodeToString(baos.toByteArray());
    }
}
