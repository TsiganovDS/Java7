public class z3 {
    public static void main(String[] args) {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = weight.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(weight[i] + ", ");
            } else {
                System.out.print(weight[i]);
            }
        }
        System.out.println();

        double[] weight1 = {1.57, 7.654, 9.986};
        for (int i = weight1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(weight1[i] + ", ");
            } else {
                System.out.print(weight1[i]);
                System.out.println();

                int[] weight2 = {9999, 1, 3333, 2, 555555, 7, 400009999, 8, 7, 1, 2, 10, 2, 1, 2, 3, 123, 124, 125};
                for (int a = weight2.length - 1; a >= 0; a--) {
                    if (a != 0) {
                        System.out.print(weight2[a] + ", ");
                    } else {
                        System.out.print(weight2[a]);


                    }
                }
            }
        }
    }
}