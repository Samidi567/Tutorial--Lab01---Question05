public class MainCalculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to find square of a number
    public int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        MainCalculator calc = new MainCalculator();

        // Expression 1: (3 * 4 + 5 * 7)^2
        int part1 = calc.multiply(3, 4);
        int part2 = calc.multiply(5, 7);
        int sum1 = calc.add(part1, part2);
        int result1 = calc.square(sum1);

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int sum2 = calc.add(4, 7);
        int square1 = calc.square(sum2);

        int sum3 = calc.add(8, 3);
        int square2 = calc.square(sum3);

        int result2 = calc.add(square1, square2);

        // Print results
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}

