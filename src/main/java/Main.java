import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shoelace Algorithm Test\n");
        Shoelace s = new Shoelace();
        System.out.println("\nEnter number of points");
        int n = scan.nextInt();
        int[][] arr = new int[n][2];
        System.out.println("Enter " + n + " x, y coordinates");
        for (int i = 0; i < n; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }
        double area = s.area(arr);
        System.out.println("\nArea = " + area);
    }
}
