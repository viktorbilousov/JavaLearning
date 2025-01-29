# Понимание Исключений в Java

## Оглавление
- [Введение](#введение)
- [Иерархия Классов Исключений](#иерархия-классов-исключений)
- [Обработка Исключений](#обработка-исключений)
    - [Использование try-catch](#использование-try-catch)
    - [Использование finally](#использование-finally)
    - [Блок Multi-Catch](#блок-multi-catch)
    - [Ключевое слово throws](#ключевое-слово-throws)
- [Создание Пользовательских Исключений](#создание-пользовательских-исключений)
- [Лучшие Практики](#лучшие-практики)
- [Домашние Задания](#домашние-задания)
- [Заключение](#заключение)

## Введение
Исключения в Java представляют ошибки или необычные ситуации, которые нарушают нормальный ход выполнения программы. Исключения — это объекты, описывающие ошибку или неожиданное событие, и Java предоставляет надежную систему для их обработки.

### Ключевые Понятия
- **Обработка Исключений**: Процесс реакции на исключения, чтобы программа могла восстановиться или завершиться корректно.
- **Throwable**: Суперкласс для всех ошибок и исключений в Java.

## Иерархия Классов Исключений

Исключения в Java являются частью пакета `java.lang`. Вот их иерархия:

1. **Throwable**
    - **Error**: Представляет серьезные проблемы, которые приложения не должны пытаться обрабатывать (например, `OutOfMemoryError`, `StackOverflowError`).
    - **Exception**: Представляет ситуации, которые приложения могут обрабатывать.
        - **RuntimeException**: Представляет непроверяемые исключения (например, `NullPointerException`, `ArrayIndexOutOfBoundsException`).
        - Другие проверяемые исключения (например, `IOException`, `SQLException`).

### Проверяемые и Непроверяемые Исключения
- **Проверяемые Исключения**: Должны быть объявлены в сигнатуре метода с использованием `throws` или обработаны с помощью блока `try-catch` (например, `IOException`).
- **Непроверяемые Исключения**: Не требуют явной обработки. Это подклассы `RuntimeException` (например, `ArithmeticException`).

## Обработка Исключений

### Использование try-catch
Блок `try` содержит код, который может выбросить исключение. Блок `catch` обрабатывает исключение, если оно возникает.

```java
try {
    int result = 10 / 0; // Может выбросить ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Нельзя делить на ноль: " + e.getMessage());
}
```

### Использование finally
Блок `finally` содержит код, который всегда выполняется после блоков `try` и `catch`, независимо от того, было ли выброшено исключение или нет. Обычно используется для задач очистки (например, закрытие ресурсов).

```java
try {
    int[] numbers = {1, 2, 3};
    System.out.println(numbers[5]); // Может выбросить ArrayIndexOutOfBoundsException
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Индекс вне границ: " + e.getMessage());
} finally {
    System.out.println("Выполнение завершено.");
}
```

### Блок Multi-Catch
Вы можете обрабатывать несколько типов исключений в одном блоке `catch`, используя оператор `|`.

```java
try {
    String str = null;
    System.out.println(str.length()); // NullPointerException
} catch (NullPointerException | ArithmeticException e) {
    System.out.println("Обработано исключение: " + e);
}
```

### Ключевое слово throws
Если метод может выбросить проверяемое исключение, оно должно быть объявлено с использованием ключевого слова `throws`.

```java
public void readFile(String filePath) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(filePath));
    System.out.println(reader.readLine());
    reader.close();
}
```

### Пример Чтения Файла с Обработкой Исключений

```java
public class FileReadingExample {
    public static void main(String[] args) {
        String filePath = "example.txt";

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Файл не найден: " + filePath);
        }
        catch (IOException e)
        {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файла: " + e.getMessage());
            }
        }
    }
}
```

## Создание Пользовательских Исключений
Вы можете создавать свои собственные классы исключений, наследуя их от `Exception` (для проверяемых исключений) или `RuntimeException` (для непроверяемых).

### Шаги для Создания Пользовательского Исключения
1. Наследуйте нужный базовый класс (`Exception` или `RuntimeException`).
2. Предоставьте конструкторы для гибкости.

```java
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Использование
public void setAge(int age) throws InvalidAgeException {
    if (age < 0) {
        throw new InvalidAgeException("Возраст не может быть отрицательным.");
    }
    System.out.println("Возраст установлен: " + age);
}
```

## Лучшие Практики
1. **Используйте Специфические Исключения**: Обрабатывайте и выбрасывайте наиболее конкретные типы исключений для ясности.
2. **Избегайте Поглощения Исключений**: Всегда обрабатывайте исключения осмысленно или повторно выбрасывайте их.
3. **Освобождайте Ресурсы**: Используйте `finally` или конструкцию try-with-resources для управления ресурсами.
4. **Документируйте Исключения**: Используйте комментарии Javadoc для объяснения, какие исключения может выбрасывать метод.

## Домашние Задания

1. **Базовый try-catch**
    - Напишите программу, которая делит два числа, введенных пользователем. Используйте блок `try-catch` для обработки `ArithmeticException`, если пользователь вводит ноль в качестве делителя.

2. **Несколько Исключений**
    - Напишите программу, которая считывает целое число и индекс массива от пользователя. Обработайте `NumberFormatException` и `ArrayIndexOutOfBoundsException`, используя блок multi-catch.

```java
    Integer.parseInt("text") // throw exction
```

3. **Использование finally**
    - Напишите программу, которая открывает файл и пытается считать его содержимое. Убедитесь, что файл закрывается в блоке `finally`, даже если возникает исключение.

4. **Пользовательское Исключение**
    - Создайте пользовательское исключение `InvalidPasswordException`, которое выбрасывается, если пользователь вводит пароль короче 8 символов. Напишите метод для проверки паролей и продемонстрируйте его использование.

5. **Ключевое слово throws**
    - Напишите метод, который считывает файл и выбрасывает `IOException`, если файл не найден. Вызовите этот метод из главного метода и обработайте исключение там.

6. **Связанные Исключения**
    - Напишите программу, которая демонстрирует связанные исключения, поймав одно исключение и выбросив другое с пойманным исключением в качестве причины.
```java
    try {
            Integer.parseInt("text");
        }catch (Exception e){
            throw new RuntimeException("Is not a number", e);
        }
```