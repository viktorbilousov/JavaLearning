# Классы и объекты

Цель: Изучить основы объектно-ориентированного программирования.

* Классы, объекты, поля, методы, конструкторы.


Задачи

---

### 1: Создание классов и объектов


* Создать класс `Книга` с полями (название, автор, год выпуска) и методом для отображения информации о книге. 

* Создать класс `Schoolboy` с полями для имени, возраста и среднего балла, и метод для отображения информации.

* Создать класс `BankAccount` с полями для номера счета и баланса и методами для пополнения и снятия средств.

* Создать класс `example.model.Dog` с полем `name` (тип String). Добавьте метод `bark()`, который выводит сообщение: `"Woof! Меня зовут <имя>!"`. Создайте объект класса `example.model.Dog` и вызовите метод `bark()`.


---

### 2. Задания на конструкторы

* Создайте класс `Point` с полями `x` и `y` (координаты точки). Реализуй конструктор, который принимает два аргумента и инициализирует поля.  Затем создай объект класса Point и выведите его координаты в консоль.
Добавьте к классу `Point` второй конструктор, который инициализирует координаты значением 0 по умолчанию, если аргументы не переданы.


* Создай класс `Employee` с полями `name`, `position` и `salary`. Реализуйте конструктор, который принимает только имя и позицию, устанавливая зарплату значением 0 по умолчанию. Добавьте второй конструктор, который принимает все три значения. Создайте объекты с помощью обоих конструкторов и выведите информацию о сотрудниках.


* Создайте класс `Rectangle` с полями `width` и `height`. Реализуйте три конструктора:

  * Первый принимает два аргумента для ширины и высоты.
  * Второй принимает один аргумент и создаёт квадрат (ширина и высота одинаковы).
  * Третий создаёт прямоугольник с размерами по умолчанию (например, 1x1).
  Создайте объекты с использованием каждого конструктора и выведите их размеры.



* Создайте класс `Car` с полями `brand`, `model`, `year` и `price`. Реализуйте три конструктора:

  * Один принимает все четыре аргумента.
  * Второй принимает brand и model, устанавливая year текущим годом, а price — значением по умолчанию (например, 10,000).
  * Третий принимает только brand, остальные поля заполняются значениями по умолчанию.
  * Создайте объекты с использованием всех трёх конструкторов и выведите их свойства в консоль.
  
    

---
###  3: Работа с несколькими объектами


* Создай класс `Author` с полями `name` и `email`. Затем создайте класс `Book`, который имеет поля `title`, `author` (тип `Author`) и `price`. Реализуйте конструктор для класса `Book`, который принимает объект Author в качестве параметра. Создайте книгу и выведите информацию о ней в консоль.

* Создай класс `Student` с полями `name` и `age`. Создайте класс `Group`, который содержит список студентов и метод для добавления нового студента. Реализуйте конструктор для `Group`, который сразу принимает массив студентов.

---

### 4: Создание взаимодействующих классов

*  Создайте класс `Engine` с полем `power` (мощность двигателя). Создайте класс `Car`, который имеет поле `engine` (тип Engine). Добавьте метод, который выводит мощность двигателя автомобиля.

*  Реализуйте систему "Учитель и ученики". Класс `Teacher` имеет поле `name` и метод `teach()`, который выводит тему урока. Класс `Student` имеет поле `name` и метод `learn()`, который вызывает метод `teach()` объекта `Teacher`.

---
