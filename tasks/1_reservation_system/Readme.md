# Система бронирования столиков в ресторане

## Описание задания:
Необходимо создать систему бронирования столиков в ресторане. В системе должны быть:

* Столики (`Table`) с номером, количеством мест и статусом (свободен/забронирован).
* Клиенты (`Customer`) с именем и контактным телефоном.
* Сервис бронирования (`ReservationService`), который управляет бронированием столиков.

## Функциональность:
* Клиент может забронировать столик, если он свободен.
* Клиент может отменить бронь.
* Можно просмотреть список доступных столиков.

## Диаграмма классов 

![img.png](img.png)


## Описание классов, методов и полей

### Класс `Table`

#### Поля:
- `int tableNumber` – номер столика.
- `int seats` – количество мест за столиком.
- `boolean isReserved` – флаг, указывающий, забронирован ли столик.

#### Методы:
- `Table(int tableNumber, int seats)` – конструктор, принимает номер столика и количество мест.
- `int getTableNumber()` – возвращает номер столика.
- `int getSeats()` – возвращает количество мест за столиком.
- `boolean isReserved()` – возвращает статус брони (`true`, если столик забронирован, `false`, если свободен).
- `void reserve()` – устанавливает статус столика как забронированный.
- `void cancelReservation()` – отменяет бронь столика.
- `String toString()` – возвращает строковое представление столика.

---

### Класс `Customer`

#### Поля:
- `String name` – имя клиента.
- `String phone` – номер телефона клиента.

#### Методы:
- `Customer(String name, String phone)` – конструктор, принимает имя и номер телефона.
- `String getName()` – возвращает имя клиента.
- `String getPhone()` – возвращает номер телефона клиента.
- `String toString()` – возвращает строковое представление клиента.

---

### Класс `ReservationService`

#### Поля:
- `List<Table> tables` – список всех столиков в ресторане.

#### Методы:
- `void addTable(Table table)` – добавляет столик в систему бронирования.
- `void showAvailableTables()` – выводит список всех доступных столиков.
- `void reserveTable(int tableNumber, Customer customer)` – бронирует столик для указанного клиента.
- `void cancelReservation(int tableNumber)` – отменяет бронь указанного столика.




## Демонстрация работы

```java
public class RestaurantBooking {
    public static void main(String[] args) {
        // Создаем сервис бронирования
        ReservationService reservationService = new ReservationService();

        // Добавляем столики
        reservationService.addTable(new Table(1, 2));
        reservationService.addTable(new Table(2, 4));
        reservationService.addTable(new Table(3, 6));

        // Показываем доступные столики
        reservationService.showAvailableTables();

        // Создаем клиентов
        Customer customer1 = new Customer("Алексей", "123-456-789");
        Customer customer2 = new Customer("Мария", "987-654-321");

        // Клиенты бронируют столики
        reservationService.reserveTable(1, customer1);
        reservationService.reserveTable(2, customer2);

        // Показываем доступные столики после брони
        reservationService.showAvailableTables();

        // Отмена бронирования
        reservationService.cancelReservation(1);
        reservationService.showAvailableTables();
    }
}
```

## Вывод в консоли

```text
  Свободные столики:
    - Столик №1 (2 мест) - Свободен
    - Столик №2 (4 мест) - Свободен
    - Столик №3 (6 мест) - Свободен
  Столик №1 успешно забронирован.
  Клиент: Алексей (тел. 123-456-789) забронировал столик №1
  Столик №2 успешно забронирован.
  Клиент: Мария (тел. 987-654-321) забронировал столик №2
  Свободные столики:
    - Столик №3 (6 мест) - Свободен
  Бронирование столика №1 отменено.
  Свободные столики:
    - Столик №1 (2 мест) - Свободен
    - Столик №3 (6 мест) - Свободен
```


# Усложнение: хранение бронирований в файле 

Можно добавить методы `saveReservationsToFile` и `loadReservationsFromFile` в класс `ReservationService` , которые позволят сохранять и загружать данные о бронировании из файла. Это позволит сделать систему более удобной и устойчивой к перезапуску.

## Пример файла 

```text
1;4;Иван Иванов;+79123456789
2;2;
3;6;Мария Петрова;+79234567890
```
Где каждая строка значит следующее:

`1`;`4`;`Иван Иванов`;`+79123456789`
* `1` - первый столик
* `4` - на 4 мест
* `Иван Иванов` - резервация на это имя (отсутствует если не зарезервировано)
* `+79123456789` - резервация на этот номер (отсутствует если не зарезервировано)


## Пример Использования
```java
public class Main {
    public static void main(String[] args) {
        ReservationService service = new ReservationService();

        // Загрузка данных из файла
        try {
            service.loadReservationsFromFile("reservations.json");
            System.out.println("Данные о бронированиях загружены.");
        } catch (IOException e) {
            System.out.println("Не удалось загрузить бронирования. Файл будет создан.");
        }

        // Добавляем столики, если они не загружены из файла
        if (service.getTables().isEmpty()) {
            service.addTable(new Table(1, 4));
            service.addTable(new Table(2, 2));
            service.addTable(new Table(3, 6));
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Показать доступные столики");
            System.out.println("2. Забронировать столик");
            System.out.println("3. Отменить бронирование");
            System.out.println("4. Выйти и сохранить данные");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем символ новой строки

            switch (choice) {
                case 1:
                    service.showAvailableTables();
                    break;
                case 2:
                    System.out.print("Введите номер столика: ");
                    int tableNumber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Введите имя клиента: ");
                    String name = scanner.nextLine();

                    System.out.print("Введите телефон клиента: ");
                    String phone = scanner.nextLine();

                    service.reserveTable(tableNumber, new Customer(name, phone));
                    break;
                case 3:
                    System.out.print("Введите номер столика для отмены брони: ");
                    int cancelTableNumber = scanner.nextInt();
                    service.cancelReservation(cancelTableNumber);
                    break;
                case 4:
                    try {
                        service.saveReservationsToFile("reservations.json");
                        System.out.println("Данные сохранены. Выход...");
                    } catch (IOException e) {
                        System.out.println("Ошибка сохранения данных.");
                    }
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }
}

```
