package Lesson_1.marathon.Obstacle;

import Lesson_1.marathon.Team.*;

public class Course {

    private Obstacle[] course;

    public Course(Cross cross, Wall wall, Water water) {
        this.course = new Obstacle[]{cross, wall, water};
    }

    public void doIt(Team team){
        for (Competitor c : team.competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }

}
