package JavaTesting.Video5;

import DomainEntities.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void conturctUserTest(){
        User usuari = new User("Tomeu","secret");

        Assert.assertTrue(usuari != null);
        Assert.assertEquals(usuari.getName(),"Tomeu");
        Assert.assertTrue(usuari.verifyPassword("secret"));
    }
}
