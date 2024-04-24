package classesObjects.nestedClasses.shadowingDemo;

public class ShadowingDemo {
    public int x = 0;

    class FirstLevel {
        public int x = 1;

        void methodInFirstLevel(int x) {
            // x from method parameter:
            System.out.println("x = " + x);

            // this.x from FirstLevel
            System.out.println("this.x = " + this.x);

            // to access this.x from the outer:
            System.out.println("ShadowingDemo.this.x = " + ShadowingDemo.this.x);
        }
    }

    public static void main(String... args) {
        ShadowingDemo sd = new ShadowingDemo();
        ShadowingDemo.FirstLevel fl = sd.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
