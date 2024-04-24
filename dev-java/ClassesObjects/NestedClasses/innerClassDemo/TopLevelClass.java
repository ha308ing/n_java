package classesObjects.nestedClasses.innerClassDemo;

public class TopLevelClass {
    void accessMembers(OuterClass outer) {
        // cannot static reference to the non-static field
        // System.out.println(OuterClass.outerField);
        System.out.println(outer.outerField);
        System.out.println(OuterClass.staticOuterField);
    }
}
