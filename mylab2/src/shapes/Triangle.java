package shapes;

public class Triangle implements Shape {

    private Dot[] vertexes_;
    private int angle_;

    public Triangle (Dot dots[], int angle) {
        if(dots.length != 3)
        {
            throw new IllegalArgumentException("Triangle must have 3 vertexes");
        }
        if((angle < 0) || (angle > 360))
        {
            throw new IllegalArgumentException("Angle  must be in [0, 360] range");
        }
        vertexes_ = dots;
        angle_ = angle;
    }

    public float getLength(Dot a, Dot b) {
        return (float)Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
    }

    public float getPerimeter()
    {
        float[] sizeLength = new float[3];
        for(int i = 0; i < 2; i++)
        {
            sizeLength[i] = getLength(vertexes_[i], vertexes_[i + 1]);
        }
        sizeLength[2] = getLength(vertexes_[2], vertexes_[0]);

        float p = 0;
        for(int i = 0; i < 3; i++)
        {
            p += sizeLength[i];
        }
        return p;
    }

    @Override
    public float getArea() {
        float[] sizeLength = new float[3];
        for(int i = 0; i < 2; i++)
        {
            sizeLength[i] = getLength(vertexes_[i], vertexes_[i + 1]);
        }
        sizeLength[2] = getLength(vertexes_[2], vertexes_[0]);

        float p = getPerimeter() / 2;

        float area = 1;
        for(int i = 0; i < 3; i++)
        {
            area *= p - sizeLength[i];
        }
        return (float)Math.sqrt(p * area);
    }

    @Override
    public int getRotation() {
        return angle_;
    }

    @Override
    public void printShape() {
        System.out.println("Triangle (" + vertexes_[0].getX() + ", " + vertexes_[0].getY()
                +  "), (" + vertexes_[1].getX() + ", " + vertexes_[1].getY() +  "), ("
                + vertexes_[2].getX() + ", " + vertexes_[2].getY() +  ")" + ", area =  " + getArea());
    }

    public static void main (String[] args) {

    }
}
