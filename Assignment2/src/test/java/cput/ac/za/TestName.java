package cput.ac.za;

import cput.ac.za.Config.AppConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.BeforeMethod;

/**
 * Unit test for simple App.
 */
public class TestName
{
    private NameAndSurname names;


    @BeforeMethod
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        names = (NameAndSurname) ctx.getBean("name");
    }

    @Test
    public void testName() throws Exception {
        setUp();
        String result = names.combineName("Name","Surname");
        Assert.assertEquals("This person's name : ","Name Surname",result);
        System.out.print(result);
    }
}
