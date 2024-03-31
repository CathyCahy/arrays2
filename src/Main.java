public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] spending = new int[5];
        int sum = 0;
        spending[0] = 569845;
        spending[1] = 860100;
        spending[2] = 500458;
        spending[3] = 120885;
        spending[4] = 395260;
        for (int i : spending) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задача 2
        int[] spending1 = new int[5];
        int sumMax = 0;
        spending1[0] = 500845;
        spending1[1] = 800100;
        spending1[2] = 200458;
        spending1[3] = 120885;
        spending1[4] = 399269;
        for (int i = 0; i < spending1.length; i++) {
            if (spending1[i] > sumMax) {
                sumMax = spending1[i];
            }
        }
        int sumMin = sumMax;
        for (int i = 0; i < spending1.length; i++) {
            if (spending1[i] < sumMin) {
                sumMin = spending1[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + sumMin + " рублей. Максимальная сумма трат за неделю составила " + sumMax + " рублей");

        //Задача 3
        int[] spending2 = new int[5];
        int sumAverage = 0;
        int sum3 = 0;
        spending2[0] = 1500845;
        spending2[1] = 800100;
        spending2[2] = 900458;
        spending2[3] = 1208850;
        spending2[4] = 309270;
        for (int i  : spending2) {
            sum3+=i;
        }
        sumAverage = sum3/spending2.length;
        System.out.println("Средняя сумма трат за месяц составила " + sumAverage + " рублей");

        //Задача 4
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
        //System.out.print(reverseFullName[reverseFullName.length]);

    }
}