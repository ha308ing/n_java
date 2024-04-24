// https://dev.java/learn/classes-objects/enums#adding-members-to-enums

package classesObjects.enums.addMembersToEnumDemo;

/* 
 * Enums are classes where all instances are known to the compiler
 * 
 * public enum DayOfWeek { MONDAY, TUESDAY }
 *
 * enums can have constructors, methods and fields
 * all enums implicitly extend java.lang.Enum and connot have any subclasses
 * 
 * Special methods:
 * instance methods:
 * - name() - get the name of the enum constant  
 *     DayOfWeek.MONDAY.name(); // "MONDAY"
 * - ordinal() - get the position of the enum constant in the declaration
 *     DayOfWeek.MONDAY.ordinal(); // 0
 * 
 * static methods:
 * - values() - array of instances of the enum
 *      DatOfWeek[] days = DayOfWeek.values();
 * - valueOf(String) - get the specific instance by its name
 *      DayOfWeek monday = DayOfWeek.valueOf("MONDAY")
 */

public class AddMemberToEnum {

    public enum DayOfWeek {
        MONDAY("MON"), TUESDAY("TUE");

        private final String abbreviation;

        DayOfWeek(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation() {
            return abbreviation;
        }
    }

}
