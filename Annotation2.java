package TestNg;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Annotation2 
{
	//dependsOnMethod
	    @Test(dependsOnMethods={"cbb"})//if cbb() method fail b() method also fail. 
	    public void b()
	    {
	    	System.out.println("after suite");
	    }
	//Always Run
	    @Test(invocationCount=5)//if u want to run multiple times then invocation count=5
	    public void cbb()
	    {
	    	System.out.println("test1");
	    	Assert.fail();//assert is a class fail() is a method to abort the execution 
	    }
	    @Test(alwaysRun=true)
	    public void cab()
	    {
	    	Assert.fail();
	    	System.out.println("before suite");
	    	
	    }

}