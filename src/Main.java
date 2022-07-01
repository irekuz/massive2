public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        //задание №1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + "рублей");
        //задание №2
        int maxCostsPerDay = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCostsPerDay) {
                maxCostsPerDay = arr[i];
            }
        }
        System.out.println("-------------");
        int minCostsPerDay = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minCostsPerDay) {
                minCostsPerDay = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxCostsPerDay + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minCostsPerDay + " рублей");
        System.out.println("---------");
        //Задание №3

        System.out.println("Средняя сумма трат за месяц составила " + (float)sum/arr.length + " рублей");

        System.out.println("--------");
        //Задание №4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int i = reverseFullName.length -1; i>=0;i--)
            System.out.print(reverseFullName[i]);
    }
}

