public class Assignment1 {
    public static void main(String[] args) {
        System.out.println(computePointOfInterception(2, 4));
    }
    public static int computePointOfInterception(int x, int y) {
        int ans = 0;
        while (true) {
            if (x > 12) {
                x = x - 12;
            }
            if (y > 12) {
                y = y - 12;
            }
            if (x == y) {
                ans = x;
                break;
            }
            x = x + 2;
            y = y + 1;
        }
        return ans;
    }
}

