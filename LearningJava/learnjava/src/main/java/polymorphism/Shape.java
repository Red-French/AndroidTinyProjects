package polymorphism;

/**
 * Created by user on 2/12/17.
 */

public class Shape {

    protected int area;

    public void calculateArea(int length, int width) {

    }

    public void calculateArea() {
        System.out.println("Area: " + area);
    }
}
