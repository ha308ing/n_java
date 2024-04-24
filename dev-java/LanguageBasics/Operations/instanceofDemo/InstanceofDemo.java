package languageBasics.operations.instanceofDemo;

public class InstanceofDemo {
    public static void main(String[] args) {

        Parent parent = new Parent();
        Child child = new Child();

        System.out.println("parent instanceof Parent: " + (parent instanceof Parent));

        System.out.println("parent instanceof Child: " + (parent instanceof Child));

        System.out.println("parent instanceof MyInterface: " + (parent instanceof MyInterface));

        System.out.println("child instanceof Parent: " + (child instanceof Parent));

        System.out.println("child instanceof Child: " + (child instanceof Child));

        System.out.println("child instanceof MyInterface: " + (child instanceof MyInterface));

    }
}

class Parent {
}

class Child extends Parent implements MyInterface {
}

interface MyInterface {
}
