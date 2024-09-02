//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i < weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] weight1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < weight1.length; i++) {
            System.out.print(weight1[i]);
            if (i < weight1.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        int[] weight2 = {9999, 1, 3333, 2, 555555, 7, 400009999, 8, 7, 1, 2, 10, 2, 1, 2, 3, 123, 124, 125};
        for (int i = 0; i < weight2.length; i++) {
            System.out.print(weight2[i]);
            if (i < weight2.length - 1) {
                System.out.print(", ");
            }
        }
    }
}