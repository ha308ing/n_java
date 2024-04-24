// https://dev.java/learn/classes-objects/more-on-classes#initializing-instance-members
package classesObjects.initializingInstanceMembers;

public class InitializingInstanceMembers {
    public static void main(String[] args) {

    }

    public static class Person {

        /*
         * besides a constructor, to initialize instance members can be used:
         * - initializer blocks
         * - final methods
         */

        /*
         * initializer block
         * (like field initializer static, but not static):
         * { ... code for initialization ... }
         */

        /*
         * final method
         * 
         * cannot be overridden in a subclass
         * 
         * useful if subclasses might want to
         * reuse the initialization method
         * 
         * final, b.c. calling non-final methods
         * during instance initialization can cause problems
         */

        private int height = initializeInstanceVariable();

        protected final int initializeInstanceVariable() {
            // initialization code
            return 12;
        }

        public int getHeight() {
            return height;
        }
    }

}
