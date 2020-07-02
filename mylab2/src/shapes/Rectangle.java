package shapes;

public class Rectangle implements Shape {

    private float width_;
    private float  length_;
    private int angle_;

    public Rectangle(float width, float length, int angle) {
        if((width <= 0)||( length <= 0))
        {
            throw new IllegalArgumentException("Sides length must be greater than zero");
        }
        if((angle < 0) || (angle > 360))
        {
            throw new IllegalArgumentException("Angle  must be in [0, 360] range");
        }

        width_ = width;
        length_ =  length;
        angle_ = angle;
    }

    @Override
    public float getArea() {
        return width_ *  length_;
    }

    @Override
    public int getRotation() {
        return angle_;
    }

    @Override
    public void printShape() {
        System.out.println("Rectangle a = " + width_ + ", b = " +  length_ + ", area =  " + getArea());
    }
}
