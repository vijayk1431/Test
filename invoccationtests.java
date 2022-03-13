package TestNg;

import org.testng.annotations.Test;

public class invoccationtests 
{
	//if u want to run multiple times
   @Test(invocationCount=5)
   public void test1()
   {
	   System.out.println("this is test1");
   }
}
