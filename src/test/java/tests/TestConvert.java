package tests;

import org.junit.Assert;
import org.junit.Test;
import toyota.Toyota;

public class TestConvert {
    Toyota camry = new Toyota(4.5,  "черый",  "camry70",  2021, 35000,"mehanica");

    @Test
    public  void  Convert(){
        System.out.println(camry.convertToSom(84.5));
        double actualResult= camry.convertToSom(84.5);
        Assert.assertEquals(2957500, actualResult, 1);
    }
}