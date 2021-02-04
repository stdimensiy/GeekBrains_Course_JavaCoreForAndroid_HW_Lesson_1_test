package ru.geekbrains.JavaCoreForAndroid;

/**
 * Сourse: java core for android
 * Faculty of Geek University Android Development
 *
 * @Author Student Dmitry Veremeenko aka StDimensiy
 * Group 24.12.2020
 * <p>
 * HomeWork for lesson1
 * Created 04.02.2021
 * v2.0
 */
public class Lesson1 {
    public static void main(String[] args) {
        // Задание №1 "создать проект"
        System.out.println("Здравствуй мир!");
        System.out.println("\nПункт №1 Домашнего задания выполнен! Новый проект сформирован.");

        // Задание №2 "создать переменные всех пройденных типов..."
        byte bateVal_a = 12;
        byte bateVal_b = -4;
        short shortVal_a = 24;
        short shortVal_b = -4;
        int intVal_a = 56;
        int intVal_b = -8;
        long longVal_a = 1234567890L;
        long longVal_b = -12345L;
        float floatVal_a = -12.23f;
        float floatVal_b = 12.23f;
        double doubleVal_a = -123.123;
        double doubleVal_b = 123.123;
        char charVal_a = 'a';      // просто символ латинская "a" в нижнем регистре
        char charVal_b = 'B';      // просто символ латинская "b" в верхнем регистре
        char charVal_d = '\u2242'; // код символа приблизительно равно согласно таблицы символов юникод
        char charVal_e = '\u263B'; // код символа смайлика согласно таблицы символов юникод
        char charVal_f = '\u2714'; // код символа галочки согласно таблицы символов юникод
        boolean boolVal_a = false;
        boolean boolVal_b = true;
        String stringVal = "таки здравствуйте..."; // Данная переменная определена и инициализирована, но нигде далее не используется
        // специально для проверки работы интерактивной среды разработки (среда реагирует
        // и сообщает цветом и сообщениями что данная переменная нигде не задействована)

        // присвоение с вычислением
        byte bateVal_c = (byte) (bateVal_a+bateVal_b);
        byte bateVal_d = (byte) (bateVal_a-bateVal_b);
        byte bateVal_e = (byte) (bateVal_a/bateVal_b);
        byte bateVal_f = (byte) (bateVal_a*bateVal_b);

        short shortVal_c = (short) (shortVal_a+shortVal_b);
        short shortVal_d = (short) (shortVal_a-shortVal_b);
        short shortVal_e = (short) (shortVal_a/shortVal_b);
        short shortVal_f = (short) (shortVal_a*shortVal_b);

        int intVal_c = intVal_a+intVal_b;
        int intVal_d = intVal_a-intVal_b;
        int intVal_e = intVal_a/intVal_b;
        int intVal_f = intVal_a*intVal_b;

        long longVal_c = longVal_a+longVal_b;
        long longVal_d = longVal_a-longVal_b;
        long longVal_e = longVal_a/longVal_b;
        long longVal_f = longVal_a*longVal_b;

        float floatVal_c = floatVal_a+floatVal_b;
        float floatVal_d = floatVal_a-floatVal_b;
        float floatVal_e = floatVal_a/floatVal_b;
        float floatVal_f = floatVal_a*floatVal_b;

        double doubleVal_c = doubleVal_a+doubleVal_b;
        double doubleVal_d = doubleVal_a-doubleVal_b;
        double doubleVal_e = doubleVal_a/doubleVal_b;
        double doubleVal_f = doubleVal_a*doubleVal_b;

        char charVal_c = (char) (charVal_a + charVal_b);

        boolean boolVal_c = !boolVal_a;
        boolean boolVal_d = boolVal_a || boolVal_b;
        boolean boolVal_e = boolVal_a && boolVal_b;
        boolean boolVal_f = !(boolVal_a && boolVal_b);

        System.out.println("\nПункт №2 Домашнего задания выполнен! Переменные всех примитивных типов и одного ссылочного объявлены и инициализированы.");
        System.out.println("Краткий отчет о поведении значений в них представлен в таблице: 2.1");
        System.out.println("------------------------------------------------------------------------------------------------------------- Таблица 2.1---");
        System.out.println("|  Пример присвоения значений и вычислений               |  Результат вывода значения переменной при помощи printLn(val)   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|  byte bateVal_a = 12;                                  |   " + bateVal_a +"                                                            |");
        System.out.println("|  byte bateVal_b = -4;                                  |   " + bateVal_b +"                                                            |");
        System.out.println("|  byte bateVal_c = (byte) (bateVal_a + bateVal_b);      |   " + bateVal_c +"                                                             |");
        System.out.println("|  byte bateVal_d = (byte) (bateVal_a - bateVal_b);      |   " + bateVal_d +"                                                            |");
        System.out.println("|  byte bateVal_e = (byte) (bateVal_a / bateVal_b);      |   " + bateVal_e +"                                                            |");
        System.out.println("|  byte bateVal_e = (byte) (bateVal_a * bateVal_b);      |   " + bateVal_f +"                                                           |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|  short shortVal_a = 24;                                |   " + shortVal_a +"                                                            |");
        System.out.println("|  short shortVal_b = -4;                                |   " + shortVal_b +"                                                            |");
        System.out.println("|  short shortVal_c = (short) (shortVal_a + shortVal_b); |   " + shortVal_c +"                                                            |");
        System.out.println("|  short shortVal_d = (short) (shortVal_a - shortVal_b); |   " + shortVal_d +"                                                            |");
        System.out.println("|  short shortVal_e = (short) (shortVal_a / shortVal_b); |   " + shortVal_e +"                                                            |");
        System.out.println("|  short shortVal_e = (short) (shortVal_a * shortVal_b); |   " + shortVal_f +"                                                           |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|  int intVal_a = 56;                                    |   " + intVal_a +"                                                            |");
        System.out.println("|  int intVal_b = -8;                                    |   " + intVal_b +"                                                            |");
        System.out.println("|  int intVal_c = intVal_a + intVal_b;                   |   " + intVal_c +"                                                            |");
        System.out.println("|  int intVal_d = intVal_a - intVal_b;                   |   " + intVal_d +"                                                            |");
        System.out.println("|  int intVal_e = intVal_a / intVal_b;                   |   " + intVal_e +"                                                            |");
        System.out.println("|  int intVal_e = intVal_a * intVal_b;                   |   " + intVal_f +"                                                          |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|  long longVal_a = 1234567890L;                         |   " + longVal_a +"                                                    |");
        System.out.println("|  long longVal_b = -12345L;                             |   " + longVal_b +"                                                        |");
        System.out.println("|  long longVal_c = intVal_a + intVal_b;                 |   " + longVal_c +"                                                    |");
        System.out.println("|  long longVal_d = intVal_a - intVal_b;                 |   " + longVal_d +"                                                    |");
        System.out.println("|  long longVal_e = intVal_a / intVal_b;                 |   " + longVal_e +"                                                       |");
        System.out.println("|  long longVal_e = intVal_a * intVal_b;                 |   " + longVal_f +"                                               |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|  float floatVal_a = " + floatVal_a +"f;                           |   " + floatVal_a +"                                                        |");
        System.out.println("|  float floatVal_b = " + floatVal_b +"f;                            |   " + floatVal_b +"                                                         |");
        System.out.println("|  float floatVal_c = floatVal_a + floatVal_b;           |   " + floatVal_c +"                                                           |");
        System.out.println("|  float floatVal_d = floatVal_a - floatVal_b;           |   " + floatVal_d +"                                                        |");
        System.out.println("|  float floatVal_e = floatVal_a / floatVal_b;           |   " + floatVal_e +"                                                          |");
        System.out.println("|  float floatVal_e = floatVal_a * floatVal_b;           |   " + floatVal_f +"                                                    |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|  double doubleVal_a = " + doubleVal_a +";                        |   " + doubleVal_a +"                                                      |");
        System.out.println("|  double doubleVal_b = " + doubleVal_b +";                         |   " + doubleVal_b +"                                                       |");
        System.out.println("|  double doubleVal_c = doubleVal_a + doubleVal_b;       |   " + doubleVal_c +"                                                           |");
        System.out.println("|  double doubleVal_d = doubleVal_a - doubleVal_b;       |   " + doubleVal_d +"                                                      |");
        System.out.println("|  double doubleVal_e = doubleVal_a / doubleVal_b;       |   " + doubleVal_e +"                                                          |");
        System.out.println("|  double doubleVal_e = doubleVal_a * doubleVal_b;       |   " + doubleVal_f +"                                           |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|  char charVal_a = 'a';                                 |   " + charVal_a +"                                                             |");
        System.out.println("|  char charVal_b = 'B';                                 |   " + charVal_b +"                                                             |");
        System.out.println("|  char charVal_c = (char) (charVal_a + charVal_b);      |   " + charVal_c +"                                                             |");
        System.out.println("|  char charVal_d = '\\u2242';                            |   " + charVal_d +"                                                             |");
        System.out.println("|  char charVal_e = '\\u263B';                            |   " + charVal_e +"                                                            |");
        System.out.println("|  char charVal_f = '\\u2714';                            |   " + charVal_f +"                                                             |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|  boolean boolVal_a = false;                            |   " + boolVal_a +"                                                         |");
        System.out.println("|  boolean boolVal_b = true;                             |   " + boolVal_b +"                                                          |");
        System.out.println("|  boolean boolVal_c = !boolVal_a;                       |   " + boolVal_c +"                                                          |");
        System.out.println("|  boolean boolVal_d = boolVal_a || boolVal_b;           |   " + boolVal_d +"                                                          |");
        System.out.println("|  boolean boolVal_e = boolVal_a && boolVal_b;           |   " + boolVal_e +"                                                         |");
        System.out.println("|  boolean boolVal_f = !(boolVal_a && boolVal_b);        |   " + boolVal_f +"                                                          |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");

        // Задание №3 "Написать метод вычисляющий выражение a * (b + (c / d))..."
        System.out.println("\nПункт №3 Домашнего задания выполнен! Метод, вычисляющий значение выражения a * (b + (c / d)) и возвращающий результат создан.");
        System.out.println("Проверка работоспособности метода 'getResult':");
        System.out.println("----- значение передаваемых параметров: а = 12.34   b = 23.45    c = 34.56   d = 45.67");
        System.out.println("      >> Результат:"+getResult(12.34f, 23.45f,34.56f,45.67f));
        System.out.println("----- значение передаваемых параметров: а = 2.0f   b = 3.0f    c = 16.0f   d = 4.0f");
        System.out.println("      >> Результат:"+getResult(2.0f, 3.0f,16.0f,4.0f));

        // Задание №4 "Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно)..."
        System.out.println("\nПункт №4 Домашнего задания выполнен! Метод, определяющий нахождение суммы чисел в пределах заданного диапазона (10<=x<=20) создан.");
        System.out.println("Проверка работоспособности метода 'isInside':");
        System.out.println("----- значение передаваемых параметров: а = 5   b = 6");
        System.out.println("      >> Результат:"+isInside(5, 6));
        System.out.println("----- значение передаваемых параметров: а = 10   b = 11");
        System.out.println("      >> Результат:"+isInside(10, 11));


    }
    //МЕТОДЫ создаваемые для непосредственного выполнения домашнего задания.

    //Задание №3 Метод вычисляет значение по формуле и возвращает значение в точку вызова.
    public static float getResult(float a, float b, float c, float d) {

        return a * (b + (c / d));
    }

    //Задание №4 метод определяет находится ли сумма чисел (параметров)
    // внутри диапазона от 10 до 20 включительно.
    // возвращает булево значение.
    public static boolean isInside(int a, int b) {

        return (a + b) > 9 && (a + b) < 21;
    }

}
