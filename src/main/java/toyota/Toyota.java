package toyota;

import java.security.SecureRandom;

public class Toyota {
    private static final int WHEEL =4;
    private double engine;
    private String color;
    private  String  model;
    private  int year;
    //    private  boolean isCoupe;
    private double price;
    private  String transmission;

    public Toyota(double engine, String color, String model, int year, double price, String transmission) {
        this.engine = engine;
        this.color = color;
        this.model = model;
        this.year = year;
//        this.isCoupe = isCoupe;
        this.price = price;


        if (transmission.equalsIgnoreCase("mehanica") || transmission.equalsIgnoreCase("avtomat")
                || transmission.equalsIgnoreCase("robot")){
            this.transmission = transmission;
        }else {
            System.out.println("У нас нету вашего варианта");
        }
    }

    public void printCarInfo(){
        System.out.println("Объем вашей машины " + engine + " Цвет "
                + color + " Модель " + model + " год этой машины " + year + " Цена " + price);
    }

    public  double convertToSom(double rate){
        double result = price * rate;
        return result;
    }

    public static int getWHEEL() {
        return WHEEL;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
//
//    public boolean isCoupe() {
//        return isCoupe;
//    }
//
//    public void setCoupe(boolean coupe) {
//        isCoupe = coupe;
//    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }


//    @Override
//    public String toString() {
//        return "Объем вашей машины " + engine + " Цвет "
//                + color + " Модель " + model + " год этой машины " + year;
//    }
}

