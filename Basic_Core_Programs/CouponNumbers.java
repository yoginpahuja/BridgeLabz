package LogicalPrograms;

import java.util.Scanner;

public class CouponNumbers {
    public static int collectCoupons(int n) {
        boolean[] isCollected = new boolean[n];
        int count = 0;
        int distinct = 0;

        while (distinct < n) {
            int value = (int) (Math.random() * n);
            count++;
            if (!isCollected[value]) {
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }
}
