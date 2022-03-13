package TestNg;
import org.testng.Assert;
import org.testng.annotations.Test;
public class By_groups 
{
   @Test(groups="regression")
   public void test1()
   {
	   System.out.println("the is test1");
	   Assert.fail();
   }
   @Test(groups={"smoke","sanity"})
   public void test2()
   {
	   System.out.println("this is test2");
	  // Assert.fail();
   }
   @Test(groups="retest")
   public void test3()
   {
	   System.out.println("this is test3 rd");
   }
}
