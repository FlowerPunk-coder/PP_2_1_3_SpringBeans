package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
public class AnimalsCage {

    @Qualifier("dog")
    private Dog dog;
    @Qualifier("cat")
    private Cat cat;

    private Timer timer;
    public AnimalsCage( Cat cat, Dog dog, Timer timer) {
        this.cat = cat;
        this.dog = dog;
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
}
