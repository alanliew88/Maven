package com.sdet;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class apptest{

    @Test
    void testlogin1()
    {

        App myapp = new App();
        Assert.assertEquals(0, myapp.userLogin("abc","abc123"));

    }

    @Test
    void testlogin2()
    {
        App myapp = new App();
        Assert.assertEquals(1,myapp.userLogin("abc","abc@123"));

    }
}
