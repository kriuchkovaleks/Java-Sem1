// Вывести все простые числа от 1 до 1000

import java.util.*;

public class HomeTask2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            int count = 0;
            for (int j = 1; j < (i - 1); j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 1) {
                sb.append(i);
                sb.append(" , ");
            }
        }
        System.out.println(sb.toString());
    }
}
