package Lesson_1.marathon.Team;

public class Team {

    public Competitor[] competitors;

    public Team(Human human, Cat cat, Dog dog) {
        this.competitors = new Competitor[]{human, cat, dog};
    }

    public void showResults(){
        for (Competitor c : this.competitors) {
            c.info();
        }
    }

}
