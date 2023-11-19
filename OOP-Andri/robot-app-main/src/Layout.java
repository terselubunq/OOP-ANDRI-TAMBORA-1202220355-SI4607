public class Layout {
    private char[][] area;

    public Layout(int width, int height, char emptyIcon) {
        this.area = new char[height][width];
        for (char[] row : area) {
            for (int i = 0; i < row.length; i++) {
                row[i] = emptyIcon;
            }
        }
    }

    public char[][] getArea() {
        return area;
    }
}
