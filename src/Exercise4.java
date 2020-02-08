public class Exercise4 {
    public static void main(String[] args) {
        int w = 20;
        int h = 10;
        for (int z = 1; z <= w; z++) {
            System.out.print("# ");
        }
        System.out.print("\n\r");
        for (int y = 1; y <= h - 2; y++) {
            System.out.print("# ");
            for (int x = 1; x <= w - 2; x++) {
                System.out.print("O ");
            }
            System.out.print("# \n");
        }
        for (int a = 1; a <= w; a++) {
            System.out.print("# ");
        }
    }
}
