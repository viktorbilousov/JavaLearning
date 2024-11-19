
# 1. Вступление, Hello world и типы данных

## Вступление

* Базовые понятия о програмировании:
  * цели
  * алгоритм и данные 
  * как работает java 
  * компиляток, файлы, код 
* Установка Java , JDK, Inltellij idea
* Ознакомление с книгами

* https://w3schools.com/java/java_data_types.asp

## Hello World и типы данных

* Запустить первую программу 
* Базовые понятия о классе 
* Функция main 
* Области видимости
* Типы данных 
    * int, double, char, String, boolean
    * чем 'M' отличается от "M" ?
* пример простой конвектор 
  * km -> m -> sm -> mm

## Задания:       
*  Вывести полную информацию о себе на экран
    * имя и фамилия
    * номер телефона
    * Pass
    * инд код 
    * возраст 
    * вес (любой =) ) (1 знак после запятой)
    * рост 

* Написать программу, которая выводит два сообщения подряд, используя разные функции вывода (например, System.out.print и System.out.println).

* Написать конвектор 
  * byte -> kb -> mb -> gb 
  * gb -> mb -> kb -> byte 
  * sec -> minutes -> hours -> days -> years 
  * days -> hours -> minutes -> sec

```

public class Main {
    public static void main(String[] args) {

        int sizeInBytes = 8124;
        
        System.out.println("bytes = " + sizeInBytes);
        System.out.println("kb = " + sizeInBytes/1024);
        //...
        
    }
}

```
