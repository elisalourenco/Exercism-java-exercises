class CollatzCalculator {

    int computeStepCount(int start) {
        int num_steps = 0;
        int num = start;

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
