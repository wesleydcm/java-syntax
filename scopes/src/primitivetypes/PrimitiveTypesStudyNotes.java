package primitivetypes;

public class PrimitiveTypesStudyNotes {
    /*
     * Primitive typoes study notes
     */
    public static void main(String[] args) {
        // characters
        char firstLeterName = 'W';
        char firstLeterNameASCII = 87;

        System.out.println(firstLeterName);
        System.out.println(firstLeterNameASCII);


        // Integers
        byte grade = 10; // -128 to 127
        short purchasedItems = 2; // -32768 to 32767
        int stockQuantity = 23_366; // -2_147_483_648 até 2_147_483_647
        long numberveryLargeNumbers = 999999999999999999L; // 19 digits

        // Dicimals
        float weight = 1.5f; // 6 - 7 decimal place
        double price = 24.99; // ~ 15 decimal place

        // Booleans
        boolean trueVariable = true;
        boolean falseVariable = false;
    }
}
