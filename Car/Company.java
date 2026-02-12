package Car;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Car> cars;

    public Company(String name) {
        this.name = name;
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    // Поиск первого автомобиля, скорость которого попадает в диапазон [minSpeed, maxSpeed]
    public Car findCarBySpeedRange(int minSpeed, int maxSpeed) {
        for (Car car : cars) {
            int speed = car.getMaxSpeed();
            if (speed >= minSpeed && speed <= maxSpeed) {
                return car;
            }
        }
        return null; // ничего не найдено
    }

    public String getName() {
        return name;
    }
}
/*
 * Комментарий:
 * Класс компании. Хранит название и список автомобилей.
 * Для хранения используется ArrayList – он прост в использовании и позволяет легко добавлять новые объекты.
 * Метод findCarBySpeedRange проходит по всем автомобилям обычным циклом for-each,
 * сравнивает скорость с границами диапазона и возвращает первый подходящий автомобиль.
 * Никаких "умных" стримов или Optional – только базовые конструкции.
 */