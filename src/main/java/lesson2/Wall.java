package lesson2;

public class Wall extends Competition {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void cross(Athletics athlete) {
        athlete.jump(height);
    }
}