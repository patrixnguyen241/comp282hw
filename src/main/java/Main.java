public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        // Implementation needed for Exercise 5
        int sum = 0;

        for (Point p : points){
            sum += p.x;
        }
        return sum;
    }

    public static void main(String[] args) {
        // --- Implement all exercises here ---
        System.out.println("Hello World!");


        //exercise 1
        Point startPoint;

        startPoint = new Point(10,20);

        System.out.println("Starting point is " + startPoint.x);

        startPoint.move(5,-3);
        startPoint.printState();



        //Exercise 2
        int originalValue = 50;
        System.out.println("After method returns, original value is " + originalValue );
        /*
        originalValue is unchaged because java always passes argumanets by value, value of (50)
        is primative so the copy is passed and changes inside the method are passed.
        */


        Point refPoint= new Point(5,7);
        System.out.println("Before resetPoint, refPoint state:");
        refPoint.printState();

        //Exercise 3

        Point defaultPoint= new Point();
        defaultPoint.printState();

        //Exercise 4

        Microwave mw = new Microwave(800, 300);
        mw.printDescription();

        //Exercise 5
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);


        int sum1 = sumCoordinates(p1, p2, p3);
        System.out.println("Sum of x-cordinates: (individiual) " + sum1);

        Point[] pointArray = { new Point(10, 20), new Point(30, 40), new Point(50, 60)};
        int sum2 = sumCoordinates(pointArray);
        System.out.println("Sum of x-cordinates: (Array) " + sum2);

        //Exercise 7
        Device d1 = new Device(500);
        Microwave m1 = new Microwave(800, 300);

        Device polyDevice;

        polyDevice = m1;

        polyDevice.printDescription();

        //Exercise 8

        if (polyDevice instanceof  Microwave) {
            Microwave mwRef = (Microwave) polyDevice;
            mwRef.heatFood();
        }



    }

}
