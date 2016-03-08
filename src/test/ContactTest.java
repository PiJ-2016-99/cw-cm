package test;

import cm.Contact;
import cm.ContactImpl;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by Solomon Negash on 08/03/2016.
 */

public class ContactTest {

    /**
     * The Contact to test.
     */
    private Contact contact;

    /**
     * The expected ID at the start
     */
    private int ID = 1;

    @Before
    public void before() {
        this.contact = new ContactImpl(ID);
    }
    /**
     * Testing if first ID was created.
     */
    @Test
    public void testFirstId() {
        Integer id = contact.getId();
        assertTrue(ID == id);
    }
}
