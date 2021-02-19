public class Array {

    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Adrianto";
        stringArray[1] = "Meritus";
        stringArray[2] = "Tuhu";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[2] = "Jaswan";

        System.out.println(stringArray[2]);

        String[]names = {
                "Adrianto", "Meritus", "Tuhu"
        };

        int[] arrayInt = new int[]{
                10, 20, 30, 40, 50, 60, 70
        };

        long[] arrayLong = {
            10L, 20L, 30L, 40L, 50L, 60L, 70L
        };

        System.out.println(arrayLong.length);

        String[][] members = {
                {"adri", "tuhu"},
                {"jaswan", "tuhu"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);

    }

}
