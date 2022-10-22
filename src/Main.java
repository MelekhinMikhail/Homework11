public class Main {
    public static void isALeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void whatVersionNeed(boolean clientOS, int clientDeviceYear) {
        if (clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
            if (clientOS) {System.out.println("Установите версию приложения для Android по ссылке");}
            else {System.out.println("Установите версию приложения для iOS по ссылке");}
        } else if (clientDeviceYear < 2015) {
            if (clientOS) {System.out.println("Установите облегченную версию приложения для Android по ссылке");}
            else {System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        } else {
            System.out.println("Ошибка! Сейчас же 2022 год.");
        }
    }

    public static int totalNumberOfDays(int distance) {
        int totalDays = 1;
        if (distance >= 0 && distance <= 20) {
            return totalDays;
        } else if (distance > 20) {
            for (int i = 20; i < distance; i += 40) {
                totalDays++;
                if (distance > i && distance <= i + 40) {
                    break;
                }
            }
            return totalDays;
        } else {
            throw new RuntimeException("Расстояние не может быть отрицательным");
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void printIntArray(int[] array) {
        for (int k : array) {
            System.out.print(k+" ");
        }
        System.out.println();
    }

    public static int sumIntArray(int[] array) {
        int sum = 0;
        for (int k : array) {
            sum += k;
        }
        return sum;
    }

    public static double averageAmountIntArray(int[] array) {
        return (double) sumIntArray(array) / array.length;
    }

    public static void task1() {
        int currentYear = 2022;
        isALeapYear(currentYear);
    }

    public static void task2() {
        boolean clientOS = false;
        int clientDeviceYear = 2014;
        whatVersionNeed(clientOS, clientDeviceYear);
    }

    public static void task3() {
        int deliveryDistance = 341;
        System.out.println("Для доставки потребуется дней: " + totalNumberOfDays(deliveryDistance));
    }

    public static void task4() {
        int[] dailyPayments = generateRandomArray();
        printIntArray(dailyPayments); // Выводим массив в консоль, чтобы понять с чем имеем дело
        System.out.println("Средняя сумма трат за месяц составила "+averageAmountIntArray(dailyPayments)+" рублей");
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

}