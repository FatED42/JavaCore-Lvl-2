package Lesson_1.marathon.Obstacle;

import Lesson_1.marathon.Team.Competitor;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public Boolean doIt(Competitor competitor) {
        competitor.run(length);
        return null;
    }
}