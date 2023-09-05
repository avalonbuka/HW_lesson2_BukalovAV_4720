package lesson2;

public class Robot extends Athletics {

    private final int maxLength;
    private final int maxHeight;
    boolean isActive;

    public Robot(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.isActive = true;
    }

    @Override
    public void run(int length) {
        if (!isActive) {
        } else {
            System.out.printf("Робот %s пробежал %d\n", maxLength < length ? "не" : "", length);
        }
        if (maxLength < length) {
            isActive = false;
        }
    }

    @Override
    public void jump(int height) {
        if (!isActive) {
        } else {
            System.out.printf("Робот %s успешно прыгнул %d\n", maxHeight < height ? "не" : "", height);
        }
        if (maxHeight < height) {
            isActive = false;
        }
    }
}
