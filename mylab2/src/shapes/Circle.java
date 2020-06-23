package shapes;

public class Circle implements Shape {

    private Dot center_;
    private float radius_;

    public Circle(Dot center, float radius) {
        if (radius <= 0)
        {
            throw new NumberFormatException("Radius must be greater than zero");
        }

        center_ = center;
        radius_ = radius;

    }

    @Override
    public float getArea() {
        return (float)Math.PI * radius_ * radius_;
    }

    @Override
    public int getRotation() {
        return 0;
    }

    @Override
    public void printShape() {
        System.out.println("Circle radius = " + radius_ + ", center = " + center_.getX() + ", " + center_.getY() + ", area = " + getArea());
    }

}
