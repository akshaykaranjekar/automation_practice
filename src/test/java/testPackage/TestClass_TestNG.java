package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass_TestNG {

@BeforeClass
public void beforeClass()
{
	System.out.println("beforeClass");
}

@BeforeMethod
public void beforeMethod()
{
	System.out.println("beforeMehod");
}




@Test
public void testB()
{
	System.out.println("testB");
}


@Test
public void testC()
{
	System.out.println("testc");
}


@AfterMethod
public void  aftermethod()
{
	System.out.println("afterMethod");
}

@AfterClass
public void afterClass()
{
	System.out.println("afterClass");
}

















}
