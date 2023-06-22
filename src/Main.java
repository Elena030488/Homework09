public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        //Задача 1
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        //Задача 2
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxExpense = 0;
        int minExpense = 200_000;
        for (int current : arr) {
            if (current > maxExpense) {
                maxExpense = current;
            } else if (current < minExpense) {
                minExpense = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей. Максимальная сумма трат за день составила " + maxExpense + " рублей");
    }
    public static void task3() {
        //Задача 3
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        int days = 30;
        float monthlyAvarage;
        for (int element : arr) {
            sum += element;
        }
        monthlyAvarage = (float) sum / days;
        System.out.println("Средняя сумма трат за месяц составила " + monthlyAvarage + " рублей");
    }
    public static void task4() {
        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = new char[reverseFullName.length];
        for (int i = 0; i < reverseFullName.length; i++) {
            fullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            System.out.print(fullName[i]);
        }
    }
}
