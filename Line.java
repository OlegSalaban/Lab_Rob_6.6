public class Line {
    double x1;
    double y1;
    double x2;
    double y2;

    void print() {
        System.out.println("Class Line. Object: lineObj");
        System.out.println("X1 = " + x1);
        System.out.println("Y1 = " + y1);
        System.out.println("X2 = " + x2);
        System.out.println("Y2 = " + y2);
    }

    double length() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    double length(Point p) {
        return Math.sqrt(Math.pow(x2 - p.x, 2) + Math.pow(y2 - p.y, 2));
    }
}
