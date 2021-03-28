public class Robot {
    int x, y;

    public void moveRight(int steps) {
        x += steps;
    }

    public void moveUp(int steps) {
        y += steps;
    }

    public void moveLeft(int steps) {
        x -= steps;
        if (x < 0) {
            x = 0;
        }
    }

    public void moveDown(int steps) {
        y -= steps;
        if (y < 0) {
            y = 0;
        }
    }
    public static void main(String[] args) {
        Robot ben = new Robot();

        ben.moveRight(3);
        ben.moveUp(2);
        ben.moveLeft(4);
        ben.moveUp(2);
        ben.moveRight(1);
    System.out.println(ben.x + " " + ben.y);
    }
}