package TestNg;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Annotations 
{
	@BeforeSuite()
	public void beforesuite()
	{
		System.out.println("print before suite");
	}
	
	public void beforetest()
	{
		System.out.println("print before test");
	}
	@BeforeClass()
	public void beforeclass()
	{
		System.out.println("print before class");
	}
	@BeforeMethod()
	public void beforemethod()
	{
		System.out.println("print before method");
	}
/*
@Test(priority=1)
   public void test1()
  {
	System.out.println("test1");
  }
@Test(priority=2)
  public void test2()
  {
	System.out.println("test2");
  }*/
@AfterMethod()
public void aftermethod()
{
	System.out.println("print after methods");
}
@AfterClass()
public void afterclass()
{
	System.out.println("print after class");
}
@AfterTest()
public void aftertest()
{
	System.out.println("print after test");
}
@AfterSuite()
public void aftersuite()
{
	System.out.println("print after suite");
}
}
