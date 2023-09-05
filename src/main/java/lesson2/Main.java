package lesson2;

public class Main {

    public static void main(String[] args) {

        Athletics[] athletes = {
                new Human(700, 20),
                new Cat(100, 200),
                new Robot(700, 5),
                new Cat(120, 10),
                new Human(1200, 100)
        };

        Competition[] equipments = {
                new Wall(4),
                new RunningTrack(700),
                new Wall(20)
        };


        for (Athletics athlete : athletes) {
            for (Competition equipment: equipments) {
                equipment.cross(athlete);
            }
        }
    }
}
