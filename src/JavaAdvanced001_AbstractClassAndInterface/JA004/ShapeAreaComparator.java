package JavaAdvanced001_AbstractClassAndInterface.JA004;

public class ShapeAreaComparator {

    public static void compareAreas(double area1, double area2, double area3, double area4) {
        if (area1 < area2 && area1 < area3 && area1 < area4) {
            System.out.println("The smallest area is " + area1);
        } else if (area2 < area1 && area2 < area3 && area2 < area4) {
            System.out.println("The smallest area is " + area2);
        } else if (area3 < area1 && area3 < area2 && area3 < area4) {
            System.out.println("The smallest area is " + area3);
        } else {
            System.out.println("The smallest area is " + area4);
        }
    }
}