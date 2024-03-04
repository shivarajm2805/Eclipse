package Learning_4.SpringPrg_Wiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("cfg.xml");
        Employee empo1=(Employee)ctx.getBean("emp1");
        System.out.println(empo1);
        
        Employee empo2=(Employee)ctx.getBean("emp2");
        System.out.println(empo2);
        
        CompanyXYZ cmpo=(CompanyXYZ)ctx.getBean("cmp1");
        System.out.println(cmpo);
        
        
    }
}
