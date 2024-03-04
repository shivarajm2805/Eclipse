package Learning_5.SpringPrg_Wiring_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        
        Mobile mo1=(Mobile)ctx.getBean("m1");
        System.out.println(mo1);
        
        Mobile mo2=(Mobile)ctx.getBean("m2");
        System.out.println(mo2);
        Mobile mo3=(Mobile)ctx.getBean("m3");
        System.out.println(mo3);
        
        Person po1=(Person)ctx.getBean("p1");
        System.out.println(po1);
        
//        Person po2=(Person)ctx.getBean("p2");
//        System.out.println(po2);
//        
//        Person po3=(Person)ctx.getBean("p3");
//        System.out.println(po3);
    }
}
