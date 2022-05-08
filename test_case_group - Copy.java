package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_case_group 
{
	@BeforeMethod(groups={"sanity"})//groupwise selection
	public void before()
	{
		System.out.println("this is before method");
	}
    @Test(groups={"smoke"})
    public void group1()
    {
    	System.out.println("this is group 1 test case");
    }
    @AfterClass(groups={"regression"})
    public void group2()
    {
    	System.out.println("this is regression testing");
    }
}
