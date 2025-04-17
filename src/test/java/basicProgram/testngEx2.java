package basicProgram;

import org.testng.annotations.Test;

public class testngEx2 {
    @Test
    public void testMethod1() {
        System.out.println("Test Method 1");
        int div = 10/0;
    }

    public void testMethod3() {
        System.out.println("Test Method 3");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2");
    }
}
