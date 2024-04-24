package classesObjects.nestedClasses.dataStructure;

public class DataStructure {

    // create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {
        // print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {
    }

    // inner class implements int iterator interface
    public class EvenIterator implements DataStructureIterator {
        // start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {
            return nextIndex < SIZE;
        }

        public Integer next() {

            // record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // get the next even index
            nextIndex += 2;

            return retValue;
        }
    }

    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
