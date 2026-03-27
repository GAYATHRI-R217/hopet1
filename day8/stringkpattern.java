package day8;
//Kpattern
//_ is space
//H_ _ _ O
//E_ L
//LL
//L_ E
//O_ _ _H
public class stringkpattern {

    public static void main(String[] args) {
        String s = "DURGANAITHARSHINI";
        int n = s.length();
        int center = n / 2;

        for (int i = 0; i < n; i++) {

            // left character
            System.out.print(s.charAt(i));

            // gap spaces
            int gap = Math.abs(i - center);
            for (int j = 0; j < gap; j++) {
                System.out.print(" ");
            }

            // right character
            System.out.print(s.charAt(n - 1 - i));

            System.out.println();
        }
    }
}
        /*String s = "HELLO";
        int n = s.length();

        for (int i = 0; i < n; i++) {

            // Left character
            System.out.print(s.charAt(i));

            // Spaces
            int spaces = Math.abs((n - 1) - 2 * i);
            for (int j = 0; j <spaces; j++) {
                System.out.print(" ");
            }

            // Right character (avoid duplicate in middle)
            //if (i != n - 1 - i) {
                System.out.print(s.charAt(n - 1 - i));
            //}

            System.out.println();
        }
    }
}*/
