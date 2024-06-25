package casting;


/*
 * Casting: operation of transforming one data type into another
 * Widening casting vc Narrowing casing
 */
public class Casting {
    public static void main(String[] args) {
        // widening casting
        byte smallVariable = 1;
        int bigVariable = smallVariable;

        short shortVariable = 10;
        int intVariable = shortVariable;

        System.out.println(bigVariable);
        System.out.println(intVariable);
    }
}
