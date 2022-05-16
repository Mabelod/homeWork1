package ru.skypro;

public class Main {
    public static void main(String[] args){
        task2();
    }
    public static void task2(){
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double sum = boxer1 + boxer2;
        double difference = Math.abs(boxer1 - boxer2) ;
        System.out.println("Общий вес боксеров " + sum + " кг");
        System.out.println("Разница в весе " + difference + " кг");
    }
}
