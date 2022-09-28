public class Main {
    public static void main(String[] args) {
//        1 задача.
        System.out.println("Задача - 1.");

        int[] iArr = new int[3];
        for (int i = 0; i<3; i++) {
            iArr[i] = i + 1;
        }
        double[] dArr = {1.57, 7.654, 9.986};
        short[] sArr = {0, 1, 2};

//        2 задача.
        System.out.println("Задача - 2.");

        for (int i = 0; i < iArr.length; i++) {
            System.out.print(iArr[i]);
            if (i != iArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < dArr.length; i++) {
            System.out.print(dArr[i]);
            if (i != dArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < sArr.length; i++) {
            System.out.print(sArr[i]);
            if (i != sArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

//        3 задача.
        System.out.println("Задача - 3.");

        for (int i = iArr.length - 1; i >= 0; i--) {
            System.out.print(iArr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = dArr.length - 1; i >= 0; i--) {
            System.out.print(dArr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = sArr.length - 1; i >= 0; i--) {
            System.out.print(sArr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

//        4 задача.
        System.out.println("Задача - 4.");

        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] % 2 != 0) {
                iArr[i]++;
            }
            System.out.print(iArr[i]);
            if (i != sArr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}