import java.util.Scanner;

public class CoffeeMachine {
    // Массивы с названиями, ценами и количеством ингредиентов для каждого напитка
    private static final String[] COFFEE_NAMES = {"Эспрессо", "Американо", "Капучино", "Латте"};
    private static final double[] COFFEE_PRICES = {1.50, 2.00, 2.50, 3.00};
    private static final int[] COFFEE_INGREDIENTS = {5, 5, 3, 3}; // Количество порций каждого напитка

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Добро пожаловать в автомат по продаже кофе!");
            printMenu();

            System.out.print("Выберите ваш напиток (введите номер): ");
            int choice = scanner.nextInt() - 1;

            // Проверяем корректность выбора и наличие ингредиентов
            if (choice < 0 || choice >= COFFEE_NAMES.length) {
                System.out.println("Неверный выбор. Попробуйте снова.");
                continue;
            }
            if (!hasIngredients(choice)) {
                System.out.printf("Извините, %s закончился.\n", COFFEE_NAMES[choice]);
                continue;
            }

            double price = COFFEE_PRICES[choice];
            String coffeeName = COFFEE_NAMES[choice];
            System.out.printf("Вы выбрали %s. Пожалуйста, внесите %.2f €.\n", coffeeName, price);
            double amountInserted = 0.0;

            // Принимаем оплату по частям
            while (amountInserted < price) {
                System.out.print("Введите сумму: ");
                double inserted = scanner.nextDouble();
                amountInserted += inserted;
                System.out.printf("Внесенная сумма: %.2f €.\n", amountInserted);

                if (amountInserted < price) {
                    double remaining = price - amountInserted;
                    System.out.printf("Недостаточно. Пожалуйста, внесите ещё %.2f €.\n", remaining);
                }
            }

            // Выдача сдачи, если она есть
            double change = amountInserted - price;
            if (change > 0) {
                System.out.printf("Ваша сдача: %.2f €.\n", change);
            }

            // Выдача кофе и уменьшение ингредиентов
            System.out.printf("Ваш %s готов. Спасибо за покупку!\n", coffeeName);
            reduceIngredients(choice);

            // Запрос на продолжение или завершение
            System.out.print("Хотите сделать новый заказ? (да/нет): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("нет")) {
                isRunning = false;
                System.out.println("До свидания!");
            }
        }

        scanner.close();
    }

    // Метод для вывода меню
    private static void printMenu() {
        System.out.println("Меню:");
        for (int i = 0; i < COFFEE_NAMES.length; i++) {
            System.out.printf("%d. %s — %.2f €\n", i + 1, COFFEE_NAMES[i], COFFEE_PRICES[i]);
        }
    }

    // Метод для проверки наличия ингредиентов
    private static boolean hasIngredients(int choice) {
        return COFFEE_INGREDIENTS[choice] > 0;
    }

    // Метод для уменьшения количества ингредиентов после продажи
    private static void reduceIngredients(int choice) {
        COFFEE_INGREDIENTS[choice]--;
    }
}
