package cput.ac.za;

import org.junit.Assert;
import org.junit.Test;

public class TestStaffNumber
{

    @Test
    public void testStaffNumber() {
        Staff staffNumberTest = new Staff(100);
        Assert.assertEquals(100 , staffNumberTest.getStaffNumber());
        System.out.print("Test Success: " + staffNumberTest.getStaffNumber());

    }
}
