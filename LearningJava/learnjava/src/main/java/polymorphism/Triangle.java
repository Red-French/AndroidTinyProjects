package polymorphism;

/**
 * Created by user on 2/12/17.
 */

public class Triangle extends Shape {

    @Override
    public void calculateArea(int base, int height) {
        this.area = (base * height) / 2;
        super.calculateArea();
    }
}
