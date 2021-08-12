package tests;

import org.junit.Assert;
import org.junit.Test;
import toyota.Toyota;

public class TestToyota {

    Toyota camry = new Toyota(3.5,  "Черный",  "camry70",  2021, 25000,"mehanica");

    @Test
    public void  testEngine(){
        Assert.assertEquals(4.5, camry.getEngine(), 1);
    }

    @Test
    public void testColor(){
        Assert.assertTrue(camry.getColor().equals("Черный"));
    }

    @Test
    public  void  failTheTest(){
        Assert.assertTrue(true);
    }

}
