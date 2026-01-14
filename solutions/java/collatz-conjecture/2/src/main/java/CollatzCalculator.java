class CollatzCalculator {

    public static int computeStepCount(int start) {
        int num_steps = 0;
        int num = start;
        if (start <= 0) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }

        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }
            num_steps++;
        }
        return num_steps;
    }

}
