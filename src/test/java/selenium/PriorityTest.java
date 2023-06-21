package selenium;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = -1)
    public void b_method(){
        System.out.println("I'm in Method B");
    }

    @Test(priority = 1)
    public void d_method(){
        System.out.println("I'm in Method D");
    }

    @Test
    public void c_method(){
        System.out.println("I'm in Method C");
    }

    @Test
    public void a_method(){
        System.out.println("I'm in Method A");
    }

    @Test()
    public void e_method(){
        System.out.println("I'm in Method E");
    }
}
