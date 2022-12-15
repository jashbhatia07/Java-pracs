//10.	WAP to find whether the entered 4 digit number is vampire or not. Combination of digits from this number forms 2-digit number. When they are multiplied by each other we get the original number. (1260=21*60, 1395=15*93, 1530=30*51)

import java.util.Scanner;

class Vampire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int k = 0;
        System.out.print("Enter a 4 digit number :");
        s = sc.next();
        String a[] = new String[12];
        a[0] = "" + (s.charAt(0)) + (s.charAt(1));
        a[1] = "" + s.charAt(0) + s.charAt(2);
        a[2] = "" + s.charAt(0) + s.charAt(3);
        a[3] = "" + s.charAt(1) + s.charAt(0);
        a[4] = "" + s.charAt(1) + s.charAt(2);
        a[5] = "" + s.charAt(1) + s.charAt(3);
        a[7] = "" + s.charAt(2) + s.charAt(0);
        a[8] = "" + s.charAt(2) + s.charAt(1);
        a[9] = "" + s.charAt(2) + s.charAt(3);
        a[10] = "" + s.charAt(3) + s.charAt(0);
        a[11] = "" + s.charAt(3) + s.charAt(1);
        a[6] = "" + s.charAt(3) + s.charAt(2);
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (i == j)
                    continue;
                else if (Integer.parseInt(a[i]) * Integer.parseInt(a[j]) == Integer.parseInt(s)) {
                    System.out.println("It is a vampire number");
                    k = 1;
                    break;
                }
            }
            if (k == 1)
                break;
        }
        if (k == 0) {
            System.out.println("It is not vampire number");
        }
    }
}