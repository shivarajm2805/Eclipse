package Learning_Spring.SpringPrg_AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	// Instructing to spring framework do its activity
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("cfg.xml");
//    	Engine e1=(Engine)ctx.getBean("e1");
//    	System.out.println(e1);
//    	
//    	Engine e2=(Engine)ctx.getBean("e2");
//    	System.out.println(e2);
    	///
    	
    	Car e3=(Car)ctx.getBean("cr");
    	System.out.println(e3);
    }
}
