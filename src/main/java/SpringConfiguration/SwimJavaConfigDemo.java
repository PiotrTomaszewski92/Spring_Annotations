package SpringConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springdemo.Coach;

public class SwimJavaConfigDemo {
    public static void main(String[] args) {


    //Read Spring configuration File
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

    //get a bean from Spring container
    Coach theCoach = context.getBean("swimCoach",Coach.class);
    SwimCoach swimCoach = context.getBean("swimCoach",SwimCoach.class);

    //call a method from a bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(swimCoach.getEmail()+" -> "+swimCoach.getName());

    //close the context
        context.close();

    }
}
