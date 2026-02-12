package Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаём компанию и наполняем её автомобилями с реалистичными скоростями
        Company company = new Company("Авто-мир");

        company.addCar(new Car("Lada Granta", 170));
        company.addCar(new Car("Kia Rio", 190));
        company.addCar(new Car("Hyundai Creta", 184));
        company.addCar(new Car("Toyota Camry", 220));
        company.addCar(new Car("BMW 3 Series", 235));
        company.addCar(new Car("Audi Q7", 250));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите минимальную скорость (км/ч): ");
        int min = scanner.nextInt();

        System.out.print("Введите максимальную скорость (км/ч): ");
        int max = scanner.nextInt();

        Car foundCar = company.findCarBySpeedRange(min, max);

        if (foundCar != null) {
            System.out.println("Найден автомобиль: " + foundCar);
        } else {
            System.out.println("В компании \"" + company.getName() + "\" нет автомобилей в диапазоне скоростей "
                    + min + " - " + max + " км/ч.");
        }

        scanner.close();
    }
}
/*
 * Комментарий:
 * Главный класс программы.
 * Использовал Scanner для консольного ввода – так понятно и просто.
 * Создал несколько объектов Car с адекватными скоростями (все значения реальны для указанных моделей).
 * Вызвал метод поиска из Company, вывел результат.
 * Всё написано максимально прямолинейно, без излишеств.
 *
 * Учил все что рассказывали на уроке
 * - Классы, объекты, конструкторы, геттеры.
 * - Цикл for-each для перебора.
 * - Scanner для чтения ввода.
 * - Условный оператор if-else.
 *
 * Код разделён на три отдельных файла, каждый отвечает за свою часть логики.
 */