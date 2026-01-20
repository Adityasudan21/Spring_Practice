package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext ap = new ClassPathXmlApplicationContext("Config.xml");// Object is created here for beans with singleton scope which is default

        System.out.println("In Office");

        Programmer Programmer1= (Programmer) ap.getBean("p1"); //Object is created here if the scope of bean is prototype
        Programmer Programmer2= ap.getBean("p1",Programmer.class); // This is also a way to intialize bean with Casting
        Programmer Programmer3= ap.getBean(Programmer.class); //This is way to generally getbean byType in the config (primary attribute
        //help if two or more beans of Programmer.class are there to prevent conflict and error


//        Computer obj2=(Computer) ap.getBean("c1");
//        Programmer1.code();
        Programmer1.setAge(23);

        System.out.println("Age of Programmer 1: "+Programmer1.getAge());

//        Programmer Programmer2= (Programmer) ap.getBean("p1");

        System.out.println("Age of Programmer 2: "+Programmer2.getAge());

        Programmer1.code();
    }
}
