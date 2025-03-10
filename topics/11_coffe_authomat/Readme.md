# Учебное задание: Симуляция автомата по продаже кофе

**Цель:** Написать консольную программу, которая имитирует работу автомата по продаже кофе. Пользователь сможет выбрать напиток, оплатить его, получить кофе и, при необходимости, сдачу.

## Описание задания

 Задача — создать симуляцию кофейного автомата. Автомат должен предлагать пользователю несколько вариантов кофе с разной стоимостью, принимать оплату, проверять, достаточно ли средств для покупки, и выдавать сдачу, если пользователь внес больше денег, чем требуется.

## Требования к программе

1. **Меню кофе**: У пользователя должно быть несколько вариантов кофе на выбор, каждый из которых имеет своё название и цену. Пример:
    - Эспрессо — 1.50 €
    - Американо — 2.00 €
    - Капучино — 2.50 €
    - Латте — 3.00 €

2. **Выбор напитка**:
    - Программа должна вывести меню напитков и предложить пользователю выбрать один из них.
    - Пользователь вводит номер или название напитка для выбора.

3. **Внесение денег**:
    - После выбора напитка программа сообщает цену и предлагает пользователю ввести сумму для оплаты.
    - Пользователь может ввести деньги одной суммой или несколькими частями, пока не достигнет необходимой суммы.

4. **Проверка достаточности средств**:
    - Если введенной суммы недостаточно, программа должна сообщить об этом и попросить внести недостающую сумму.
    - Если внесенная сумма превышает стоимость выбранного напитка, программа должна вернуть сдачу.

5. **Выдача кофе и сдачи**:
    - Если внесено достаточно средств, программа должна поздравить пользователя с покупкой и сообщить, что кофе готов.
    - Если есть сдача, программа должна сообщить её размер и вернуть её пользователю.

6. **Выход из программы**:
    - После завершения покупки программа должна предложить пользователю завершить работу или сделать новый выбор.

## Диаграмма Классов

![img.png](img.png)

### Описание классов:
* CoffeeMachine – главный класс, который управляет процессом покупки кофе, включая меню, внесение денег, проверку средств, выдачу напитка и сдачи.
* Coffee – класс для представления различных видов кофе с их названиями и ценами.
* User – представляет пользователя, который выбирает напиток и вносит деньги.

Это базовая модель, но ее можно расширить, добавив, например, обработку исключений, управление запасами ингредиентов и интерфейс взаимодействия.

#### Описание функций класса `CoffeeMachine`

* `void displayMenu()`
  - Отображает список доступных напитков и их цены.
  - Позволяет пользователю увидеть варианты выбора перед покупкой.

* `Coffee selectCoffee(int choice)`
  - Позволяет пользователю выбрать напиток по его номеру из меню.
  - Возвращает объект `Coffee`, если выбор корректный, иначе `null`.

* `void insertMoney(double amount)`
  - Позволяет пользователю вносить деньги в автомат.
  - Увеличивает баланс автомата на внесенную сумму.
  - Игнорирует отрицательные и нулевые значения.

* `boolean checkFunds(Coffee coffee)`
  - Проверяет, достаточно ли внесенных пользователем средств для покупки выбранного кофе.
  - Возвращает `true`, если денег хватает, иначе `false`.

* `Double getChange(Coffee coffee)`
  - Рассчитывает сумму сдачи, если внесенная сумма превышает цену напитка.
  - Возвращает размер сдачи или `0.0`, если сдачи нет.

* `void dispenseCoffee(Coffee coffee)`
  - Проверяет, достаточно ли средств для покупки.
  - Если денег хватает, завершает покупку, выдавая напиток.
  - Сообщает пользователю о готовности кофе.
  - Если была переплата, возвращает сдачу.
  - Если средств недостаточно, уведомляет пользователя и предлагает внести недостающую сумму.


### Описание методов класса `User`

*  `boolean hasEnoughMoney(double money)`
  - Проверяет, достаточно ли у пользователя денег для покупки кофе.
    - **Возвращает:**
        - `true`, если у пользователя есть достаточно денег.
        - `false`, если средств недостаточно.

* `void addMoneyToBalance(double money)`
  - Добавляет указанную сумму к текущему балансу пользователя.


* `void insertMoney(CoffeeMachine machine, double amount)`
  - Позволяет пользователю внести деньги в кофемашину.

* `void selectCoffee(CoffeeMachine machine, int choice)`
  - Позволяет пользователю выбрать напиток из меню кофемашины.


### Диаграмма процесса покупки

![img_1.png](img_1.png)


Описание процесса:
1. Пользователь запрашивает меню, и кофейный автомат выводит список доступных напитков.
2. Пользователь выбирает напиток, после чего автомат сообщает его стоимость.
3. Пользователь вносит деньги, автомат обновляет баланс.
4. Если денег недостаточно, автомат просит доплатить, и пользователь вносит недостающую сумму.
5. Если денег хватает, автомат рассчитывает сдачу (если есть) и выдает кофе.
6. Пользователь либо завершает покупку, либо делает новый выбор.

## Пример работы программы

```plaintext
Добро пожаловать в автомат по продаже кофе!

Меню:
1. Эспрессо — 1.50 €
2. Американо — 2.00 €
3. Капучино — 2.50 €
4. Латте — 3.00 €

Выберите ваш напиток (введите номер или название):
> 3

Вы выбрали Капучино. Пожалуйста, внесите 2.50 €.

Введите сумму:
> 2.00
Внесенная сумма: 2.00 €. Недостаточно. Пожалуйста, внесите ещё 0.50 €.

Введите сумму:
> 1.00

Внесено достаточно! Ваш Капучино готов.
Ваша сдача: 0.50 €.

Спасибо за покупку! Хотите сделать новый заказ? (да/нет)
> нет

До свидания!
```

## Подсказки

* Используй методы для логического разделения программы на части, такие как вывод меню, обработка выбора напитка, внесение денег и выдача сдачи.
* Работа с циклами: Используйте циклы для того, чтобы дать пользователю возможность вносить деньги по частям и повторять процесс покупки.
* Обработка ошибок: Добавьте проверку на ввод, чтобы программа не завершалась из-за некорректных данных (например, букв вместо чисел).
* Сдача: Расчет сдачи можно сделать, просто вычитая стоимость напитка из внесенной суммы.

## Дополнительные задания
Добавьте больше напитков или измените их цены для практики.
Сделайте автомат с ограниченным количеством ингредиентов (например, «заканчивается молоко»), чтобы после определенного количества продаж нельзя было выбрать, например, латте.
Сделайте так, чтобы программа могла "запоминать" количество внесенных денег и сдачу, если пользователь вносит деньги в нескольких частях.