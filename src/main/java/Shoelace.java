public class Shoelace {
    public double area(int[][] arr) {
        int n = arr.length;
        double det = 0.0;
        for (int i = 0; i < n; i++)
            det += (double) (arr[i][0] * arr[(i + 1) % n][1]);
        for (int i = 0; i < n; i++)
            det -= (double) (arr[i][1] * arr[(i + 1) % n][0]);
        det = Math.abs(det);
        det /= 2;
        return det;
    }
}