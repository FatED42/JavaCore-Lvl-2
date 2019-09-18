package Lesson_1.marathon.Obstacle;

import Lesson_1.marathon.Team.Competitor;

public class Water extends Obstacle {
    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public Boolean doIt(Competitor competitor) {
        competitor.swim(length);
        return null;
    }
}