

public class SwapNumbers {
    public static void main(String[] args) {
        int x = -5;
        int y = -10;

        System.out.println("Before swapping: x = " + x + ", y = " + y);

        x = x + y;   // x becomes 15 (5 + 10)
        y = x - y;   // y becomes 5 (15 - 10)
        x = x - y;   // x becomes 10 (15 - 5)

        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}
