/**
 * Rectancle
 */
public class Rectancle {

    protected int width, height;

    public Rectancle() {
	}

    public Rectancle(int width, int height) {
		this.width = width;
		this.height = height;
	}
    public int getArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
/*
 * Our Square class extends
 * the Rectangle class.
 * We set
 * height and
 * width to
 * the same
 * value in
 * the constructor, but we do
 * not want
 * 
 * any client (someone who uses our class in their code) to change
 * height or weight in a way that can violate the square property.
 */


class Square extends Rectancle {
    public Square() {
    }

    public Square(int size) {
        width = height = size;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
} 

class Test {

    static void getAreaTest(Rectancle r) {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
    }

    public static void main(String[] args) {
        Rectancle rc = new Rectancle(2, 3);
        getAreaTest(rc);

        Rectancle sq = new Square();
        sq.setWidth(5);
        getAreaTest(sq);
    }
}