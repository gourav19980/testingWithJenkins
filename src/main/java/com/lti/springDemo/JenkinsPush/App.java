package com.lti.springDemo.JenkinsPush;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Emp e=new Emp(101,"Gautam");
        System.out.println(e.getEmpId()+" "+e.getEmpName());
    }
}
