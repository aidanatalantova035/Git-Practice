package runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.TestConvert;
import tests.TestToyota;



@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                TestToyota.class,
                TestConvert.class
        }
)
public class SmokeRunner {
    @BeforeClass
    public  static void beforeAll(){
        System.out.println("Before class запускается первым");
    }

    @AfterClass
    public  static  void  afterClass(){
        System.out.println("After class");
    }
}
