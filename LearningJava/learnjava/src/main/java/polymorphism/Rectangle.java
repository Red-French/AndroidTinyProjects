package polymorphism;

/**
 * Created by user on 2/12/17.
 */

public class Rectangle extends Shape {

    @Override
    public void calculateArea(int length, int width) {
        this.area = length * width;
        super.calculateArea();
    }
}
