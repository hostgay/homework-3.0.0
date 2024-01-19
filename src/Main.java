public class Main {

    public static void main(String[] args) {
        double[] fractionalArray = generateFractionalArray(15);
        double average = calculateAverageAfterNegative(fractionalArray);
        System.out.println("среднее арифметическое положительных чисел : " + average);
    }

    public static double[] generateFractionalArray(int size) {
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            array[i] = Math.random() * 20 - 10;
        }

        return array;
    }
    public static double calculateAverageAfterNegative(double[] array) {
        boolean foundNegative = false;
        double sum = 0;
        int count = 0;

        for (double number : array) {
            if (foundNegative && number > 0) {
                sum += number;
                count++;
            } else if (number < 0) {
                foundNegative = true;
            }
        }
        if (count > 0) {
            return sum / count;
        } else {
            return 0;
        }
    }
}














