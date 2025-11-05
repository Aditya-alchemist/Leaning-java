public class pattern4 {
    public static void main(String[] args) {
        int r = 4;
        for (int i = r; i >= 1; i--) {       // outer loop: rows decrease
            for (int j = 1; j <= i; j++) {   // inner loop: stars decrease
                System.out.print("* ");
            }
            System.out.println();             // next line
        }
    }
}
