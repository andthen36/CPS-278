package edu.wcc.emeyer.cps278_mp2_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class IOCApp1 {
	public static void main( String[] args )
    {
		ApplicationContext context = new FileSystemXmlApplicationContext("bean.xml");
		Battle bg = (Battle)context.getBean("bg");
		System.out.println(bg);
    }

}
