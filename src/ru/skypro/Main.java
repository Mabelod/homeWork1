package ru.skypro;

public class Main {
    public static void main(String[] args){
        task4();
    }
    public static void task4(){
        int weight = 7;
        int gramsInKg = 1000;
        int weightInGrams = weight * gramsInKg;

        int min = 250;
        int max = 500;

        int maxDays = weightInGrams / min;
        int minDays = weightInGrams / max;
        int averageDays = (maxDays + minDays) / 2;
        System.out.println("При снижении веса 250 грамм в день, спортсмен похудеет через " + minDays + " дней ");
        System.out.println("При снижении веса 500 грамм в день, спортсмен похудеет через " + maxDays + " дней ");
        System.out.println("В среднем для похудения необходим " + averageDays + " день ");
    }
    }
