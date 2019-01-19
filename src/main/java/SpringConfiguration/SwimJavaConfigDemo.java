package SpringConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

    //Read Spring configuration File
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

    //get a bean from Spring container


    //call a method from a bean

    //close the context
}
