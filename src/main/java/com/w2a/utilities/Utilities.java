package com.w2a.utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import com.w2a.base.Page;

public class Utilities extends Page

{
	public static String screenshotpath;	
	public static String screenshotName;
public static void captureScreenshot() throws IOException
{
	File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Date d=new Date();
	screenshotName=d.toString().replace(":", "_").replace(" ", "_")+".jpg";

	FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+screenshotName));
}

@DataProvider(name="dp")
public Object[][] getData(Method m)
{
String SheetName = m.getName();
int rows = excel.getRowCount(SheetName);
int cols = excel.getColumnCount(SheetName);

Object[][] data = new Object[rows-1][1];
Hashtable<String, String> table = null;
for(int rownum = 2 ; rownum <= rows ; rownum++)
{
	table = new Hashtable<String,String>();
	for(int colnum = 0; colnum<cols; colnum++)
	{
		table.put(excel.getCellData(SheetName, colnum, 1),excel.getCellData(SheetName,colnum,rownum));
		data[rownum-2][0]=table;
	}
}

return data;
}
public static boolean isTestRunnable(String testName, ExcelReader excel)
{
	String sheetName = "test_suite"	;
	int rows=excel.getRowCount(sheetName);
	for(int rNum=2;rNum<=rows;rNum++)
	{
		String testCase=excel.getCellData(sheetName, "TCID", rNum);
		if(testCase.equalsIgnoreCase(testName))
		{
			String runmode=excel.getCellData(sheetName, "Runmode", rNum);
			if(runmode.equalsIgnoreCase("Y"))
				return true;
			else
				return false;
		}
		
	}
	return false;
}
}