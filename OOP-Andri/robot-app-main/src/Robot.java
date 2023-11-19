public class Robot {
    private int x;
    private int y;
    private char icon;
    private Layout layout;

    public Robot(int x, int y, char icon, Layout layout) {
        this.x = x;
        this.y = y;
        this.icon = icon;
        this.layout = layout;
    }

    public char getIcon() {
        return icon;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveRight(int steps) {
        if (x + steps < layout.getArea()[0].length) {
            x += steps;
        } else {
            System.out.println("Robot tidak boleh keluar dari area permainan.");
        }
    }

    public void moveLeft(int steps) {
        if (x - steps >= 0) {
            x -= steps;
        } else {
            System.out.println("Robot tidak boleh keluar dari area permainan.");
        }
    }

    public void moveUp(int steps) {
        if (y - steps >= 0) {
            y -= steps;
        } else {
            System.out.println("Robot tidak boleh keluar dari area permainan.");
        }
    }

    public void moveDown(int steps) {
        if (y + steps < layout.getArea().length) {
            y += steps;
        } else {
            System.out.println("Robot tidak boleh keluar dari area permainan.");
        }
    }
}
