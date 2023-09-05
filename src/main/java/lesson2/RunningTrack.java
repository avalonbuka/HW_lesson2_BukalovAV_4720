package lesson2;

public class RunningTrack extends Competition {

    private final int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public void cross(Athletics athlete) {
        athlete.run(length);
    }
}
