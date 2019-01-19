package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        Coach theCoach;

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        theCoach = context.getBean("tennisCoach",TennisCoach.class);
        // call the method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // get the bean from spring container
        theCoach = context.getBean("volleyCoach",VolleyCoach.class);
        // call the method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call a method to get a daily fortune
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
