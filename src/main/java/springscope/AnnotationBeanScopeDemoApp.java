package springscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.Coach;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        //load spring cofig file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve a bean
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //check if they are the same
        boolean result = (theCoach == alphaCoach);
        System.out.println("Pointing to the same object: "+result);
        System.out.println("Memory location of theCoach: "+theCoach+"\nMemory location for alphaCoach: "+alphaCoach);

        //close the context
        context.close();
    }
}
