public class Point {
    double x;
    double y;

    public Point()
    {
        x = 0;
        y = 0;
    }

    public Point(double v)
    {
        x = y = v;
    }

    public Point(double x,double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point(Point point)
    {
        x = point.x;
        y = point.y;
    }

    void print() {
        System.out.println("Class Point. ");
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }

    double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    double length(Point other){
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }
}
