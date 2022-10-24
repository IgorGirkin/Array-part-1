import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
public class Main {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",");
        //Задача 1
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] clean = {1.57, 7.654, 9.986};
        String[] test = {"USD", "EUR", "JPY", "RUB"};
        // Задача 2
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i < weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < clean.length; i++) {
            System.out.print(clean[i]);
            if (i < clean.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]);
            if (i < test.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Задача 3
        for (int i = 2; i >= weight.length - 3; i--) {
            System.out.print(weight[i]);
            if (i!= 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = clean.length-1; i >=0; i--) {
            System.out.print(clean[i]);
            if (i!= 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 3; i >= test.length - 4; i--) {
            System.out.print(test[i]);
            if (i!= 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
         // Задача 4
        int[] weight4 = new int[3];
        weight4[0] = 1;
        weight4[1] = 2;
        weight4[2] = 3;
        int change = weight4.length;

        for (int i = 0; i < weight4.length; i++) {

            if (weight4[i]%2==1) {
               weight4[i]+=1;
            }
            System.out.println(weight4[i]);
        }
        System.out.println();


    }
}