import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Задание 1
        double rubles = 30002.7;
        double rateUSD = 78.5;
        double dollars = rubles / rateUSD;
        System.out.printf("У вас на счету %.2f рублей." +
                " В долларах это %.2f долларов. Так держать!\n", rubles, dollars);

        // Задание 2
        System.out.print("Введите погодные условия: ");
        String weather = scanner.next();
        String addition1 = "Люблю гулять!";
        System.out.println(weather.equals("Дождь") ? ("Беру с собой зонт. " + addition1) :
                ("Иду налегке. " + addition1));

        // Задание 3 (Увидел особенность в условиях, если всего 3 яйца, но очень нравятся тернарные операторы)
        System.out.print("Укажите сколько у вас яиц: ");
        short numberOfEgg = scanner.nextShort();
        String addition2 = "Приятного аппетита!";
        System.out.println(numberOfEgg > 3 ? ("Рекомендую приготовить омлет. " + addition2) :
                ("Рекомендую позавтракать бутербродами. " + addition2));
    }
}