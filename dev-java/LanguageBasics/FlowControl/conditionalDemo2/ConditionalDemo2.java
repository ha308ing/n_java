package languageBasics.flowControl.conditionalDemo2;

public class ConditionalDemo2 {
    public static void main(String[] args) {
        int value1 = 1, value2 = 2, result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;
        System.out.println(result + " = " + someCondition + " ? " + value1 + " : " + value2);
    }
}
