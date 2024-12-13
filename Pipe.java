public class Pipe {
    double x, y;
    boolean passed;
    boolean isTop;

    Pipe(double x, double y, boolean isTop) {
        this.x = x;
        this.y = y;
        this.isTop = isTop;
        this.passed = false;
    }
}