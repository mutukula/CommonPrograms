package test.com.company; 

import com.company.addMethod;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/** 
* addMethod Tester. 
* 
* @author <Authors name> 
* @since <pre>Jun 29, 2021</pre> 
* @version 1.0 
*/

public class addMethodTest {

    @Before
    public void before() throws Exception {
        System.out.println("Executed this before statement");
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: add(int i, int j)
     */
    @Test
    public void testAdd() throws Exception {
//TODO: Test goes here..

            addMethod addition = new addMethod();

            int sum;
            sum = addition.add(11, 12);
            //Assert.assertEquals(77.1, addition.getI(7),77.1);
            //Assert.assertEquals(0,addition.getJ());
            // Assert.assertEquals(23,sum);
            // Assert.assertEquals(23, addition.add();)
            int summation = 23;
            Assert.assertEquals(summation, sum);


    }
}



