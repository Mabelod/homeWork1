package ru.skypro;

public class Main {
    public static void main(String[] args){
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double sum = boxer1 + boxer2;
        double difference = (boxer1 - boxer2) ;
        if (difference < 0){
            difference = difference * -1;
        }
        System.out.println("Общий вес боксеров " + sum + " кг");
        System.out.println("Разница в весе " + difference + " кг");
        }
    }
