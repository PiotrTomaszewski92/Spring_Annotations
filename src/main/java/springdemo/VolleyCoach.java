package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VolleyCoach implements Coach{

    private FortuneService fortuneService;

    @Autowired
    public VolleyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Score 25 points in each set";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
