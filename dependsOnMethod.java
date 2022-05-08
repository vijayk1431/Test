package TestNg;
import org.testng.Assert;
import org.testng.annotations.Test;
public class dependsOnMethod 
{
   @Test()
   public void test1()
   {
	   System.out.println("this is test1 method");
   }
   @Test()
   public void test2()
   {
	   Assert.fail();
	   System.out.println("this is test2 method");
   }
   @Test(dependsOnMethods={"test2","test4"},alwaysRun=true)
   public void test3()
   {
	   System.out.println("this is test3 method");
   }
   @Test()
   public void test5()
   {
	   System.out.println("this is test4 method");
	   Assert.fail();
	   System.out.println("this is completed");
   }
}
