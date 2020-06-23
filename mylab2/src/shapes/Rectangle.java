package shapes;

public class Rectangle implements Shape {

    private float a_;
    private float b_;
    private int angle_;

    public Rectangle(float a, float b, int angle) {
        if((a <= 0)||(b <= 0))
        {
            throw new IllegalArgumentException("Sides length must be greater than zero");
        }
        if((angle < 0) || (angle > 360))
        {
            throw new IllegalArgumentException("Angle  must be in [0, 360] range");
        }

        a_ = a;
        b_ = b;
        angle_ = angle;
    }

    @Override
    public float getArea() {
        return a_ * b_;
    }

    @Override
    public int getRotation() {
        return angle_;
    }

    @Override
    public void printShape() {
        System.out.println("Rectangle a = " + a_ + ", b = " + b_ + ", area =  " + getArea());
    }
}
