package Car;

public class Car {
    private String model;
    private int maxSpeed;

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Модель: " + model + ", макс. скорость: " + maxSpeed + " км/ч";
    }
}
/*
 * Комментарий:
 * Простой класс автомобиля.
 * Поля: модель и максимальная скорость.
 * Конструктор для инициализации, геттеры для доступа.
 * Переопределил toString для удобного вывода информации об авто.
 */
