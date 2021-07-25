class Square {
    public static void main(String[] args) {
        int x = 0, y = 0;

        while(x < 4) {
            y = 0;
            while(y < 4) {
                System.out.print("*");

                ++y;
            }

            System.out.print("\n");
            ++x;
        }
    }
}