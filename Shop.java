// Формат сдачи: ссылка на репозиторий в GitHub.

// Задание

// -Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// -Создать множество ноутбуков.
// -Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// -Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// -Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.



public class Shop {
    private String model;
    private int ramcapacity;
    private int hddcapacity;
    private String operatingsystem;
    private String color;
    private int diagonal;

    public Shop(String model, int ramcapacity, int hddcapacity, String operatingsystem, String color, int diagonal) {
        this.model = model;
        this.ramcapacity = ramcapacity;
        this.hddcapacity = hddcapacity;
        this.operatingsystem = operatingsystem;
        this.color = color;
        this.diagonal = diagonal;
    }
    // Геттеры
    public String getModel() {
        return model;
    } 
    public int getRamcapacity() {
        return ramcapacity;
    } 
    public int getHddcapacity() {
        return hddcapacity;
    } 
    public String getOperatingsystem() {
        return operatingsystem;
    } 
    public String getColor() {
        return color;
    } 
    public int getDiagonal() {
        return diagonal;
    } 
    // Сеттеры
    public void setModel(String model) {
        this.model = model;
    }public void setRamcapacity(int ramcapacity) {
        this.ramcapacity = ramcapacity;
    }
    public void setHddcapacity(int hddcapacity) {
        this.hddcapacity = hddcapacity;
    }
    public void setOperatingsystem(String operatingsystem) {
        this.operatingsystem = operatingsystem;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
    @Override
    public String toString() {
        return "Модель: " + model + ", Объём ОЗУ: " + ramcapacity + ", Объём HDD: " + hddcapacity + ", ОС: " + operatingsystem + ", Цвет: " + color + ", Диагональ: " + diagonal;
    }
}

