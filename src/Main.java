public class Main {
    public static void main(String[] args) {

        double[] numbers = {100.0, 100.0, -2.0, -4.0, 2.0, 3.0, 6.0, -7.0, 1.5, 2.5, -3.5, 4.5, -5.5};

        double sum = 0.0;
        int count = 0;

        for (double number : numbers) {
            if (number > 0) {
                sum += number;
                count++;
            } else if (count > 0) {

                break;
            }
        }


        double average = sum / count;

        System.out.println("Среднее арифметическое положительных чисел : " + average);
    }
}
