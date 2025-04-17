package basicProgram;

import org.testng.annotations.*;

public class AnnotationEx {
    @Test
    public void testMethod1() {
        System.out.println("* Test Method 1 *");
    }
    @Test
    public void testMethod2() {
        System.out.println("* Test Method 2 *");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {        //annotation method
        System.out.println("After Test");
    }

    @BeforeSuite
    public void beforeSuite() {        //annotation method
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {        //annotation method
        System.out.println("After Suite");
    }
}
