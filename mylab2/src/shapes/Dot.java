package shapes;

public class Dot implements Point {

    private float x_;
    private float y_;

    public Dot (float x, float y) {
        x_ = x;
        y_ = y;
    }

    //реализованные методы Point
    @Override
    public float getX() {
        return x_;
    };

    @Override
    public float getY() {
        return y_;
    };

}
