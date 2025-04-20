package JavaTesting.Video4;

import com.sun.source.tree.AssertTree;
import javaTesting.Resources.AppParameters;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AppParametesTest {
    public static final String DOMAIN_EXPECTED = "127.0.0.1";
    public static final String PORT_EXPECTED ="80";
    public static final String URL_EXPECTED = "https://"+DOMAIN_EXPECTED+":"+PORT_EXPECTED;

    @Test
    public void domainURLCorrect(){
        Assert.assertEquals("Retorna la part FQDN ", DOMAIN_EXPECTED, AppParameters.DOMAIN);
    }

    @Test
    public void CorrectPort(){
        Assert.assertEquals("Retorna el port correcte",PORT_EXPECTED, AppParameters.PORT);
    }

    @Test
    public void CorrectURL(){
        Assert.assertEquals("Retorna la URL correcte",URL_EXPECTED, AppParameters.deployedURL());
    }

    @Test
    public void singletornCorrectness(){

        AppParameters inst1 = AppParameters.getInstance();
        AppParameters inst2 = AppParameters.getInstance();
        Assert.assertTrue("Comprovacio unicament instanciada del sigleton",(inst1 == inst2));
    }



}
