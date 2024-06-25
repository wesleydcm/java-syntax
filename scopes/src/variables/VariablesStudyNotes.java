package variables;
/*
 * Pratice for java variables
 * variables are data containers
 */
public class VariablesStudyNotes {
    public static void main(String[] args) {
        int day = 24;
        int month = 04;
        int year = 2023;

        
        day = 30;

        System.out.println(day);
        System.out.println(month);
        System.out.println(year);

        otherMethod();
    }

    public static void otherMethod() {
        int day = 31;

        System.out.println(day);
    }
}
