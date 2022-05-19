public class Main {
    public static void main(String[] args) {
        Point pointObj = new Point(5, -10.2);
        pointObj.x = 5;
        pointObj.y = -10.2;

        Line lineObj = new Line();
        lineObj.x1 = 5;
        lineObj.y1 = -5;
        lineObj.x2 = 22.25;
        lineObj.y2 = 10.8;

        Person personObj = new Person();
        personObj.name = "Max";
        personObj.surname = "Smith";
        personObj.age = 32;

        pointObj.print();
        System.out.println("Length from (0;0) to point: " + pointObj.length());

        Point bp = new Point();
        bp.x = 5;
        bp.y = 2;
        System.out.println("Length from (5;2) to point: " + pointObj.length(bp));
        System.out.println();

        lineObj.print();
        System.out.println("Length: " + lineObj.length());
        System.out.println("Length from (5;2) to line: " + lineObj.length(bp));
        System.out.println();

        personObj.print();
        System.out.println("Count of month: " + personObj.countOfMonth());
        System.out.println("Count of month from 2000: " + personObj.countOfMonth(2000));


        Point p1 = new Point();
        System.out.println("Point constructor 1: ");
        p1.print();
        System.out.println();

        Point p2 = new Point(5);
        System.out.println("Point constructor 2: ");
        p2.print();
        System.out.println();

        Point p3 = new Point(8, 5);
        System.out.println("Point constructor 3: ");
        p3.print();
        System.out.println();

        Point p4 = new Point(p3);
        System.out.println("Point constructor 4: ");
        p4.print();
        System.out.println();
    }
}
