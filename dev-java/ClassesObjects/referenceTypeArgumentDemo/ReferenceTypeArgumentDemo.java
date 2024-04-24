package classesObjects.referenceTypeArgumentDemo;

// https://dev.java/learn/classes-objects/calling-methods-constructors#passing-reference-data-type-arguments

public class ReferenceTypeArgumentDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle(2, 3);

        myCircle.printCircle();

        moveCircle(myCircle, 7, 7);

        myCircle.printCircle();

    }

    public static void moveCircle(Circle circle, int deltaX, int deltaY) {
        // props of outer circle are changed:
        circle.x += deltaX;
        circle.y += deltaY;

        // circle.printCircle();

        // this circle will be dismissed after method
        // because inside of the method
        // This reassignment has no permanence
        circle = new Circle(5, 5);

        circle.printCircle();
    }

    static class Circle {
        int x;
        int y;

        public Circle(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void printCircle() {
            System.out.println("x: " + x + ", y: " + y);
        }

    }
}
