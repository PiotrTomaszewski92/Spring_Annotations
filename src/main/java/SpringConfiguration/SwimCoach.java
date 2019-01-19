package SpringConfiguration;

import org.springframework.beans.factory.annotation.Value;
import springdemo.Coach;
import springdemo.FortuneService;

public class SwimCoach implements Coach {

    private FortuneService sadFortuneService;

    @Value("${my.email}")
    private String email;

    @Value("${my.name}")
    private String name;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public SwimCoach(FortuneService sadFortuneService) {
        this.sadFortuneService = sadFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up ";
    }

    @Override
    public String getDailyFortune() {
        return sadFortuneService.getFortune();
    }
}
