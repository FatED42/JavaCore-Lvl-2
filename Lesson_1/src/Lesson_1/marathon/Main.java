package Lesson_1.marathon;

import Lesson_1.marathon.Obstacle.*;
import Lesson_1.marathon.Team.*;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Cross(80), new Wall(2),new Water(100));
        Team team = new Team(new Human("Ivan"), new Cat("Barsik"), new Dog("Sharik"));

        c.doIt(team);

        team.showResults();
}
}
