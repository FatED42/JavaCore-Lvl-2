package Lesson_1.marathon.Obstacle;

import Lesson_1.marathon.Team.Competitor;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public Boolean doIt(Competitor competitor) {
        competitor.jump(height);
        return null;
    }
}