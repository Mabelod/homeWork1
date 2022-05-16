package ru.skypro;

public class Main {
    public static void main(String[] args){
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int sum = bananas + milk + iceCream + eggs;
        int kg = sum / 1000;
        int remainder = sum % 1000;
        System.out.println("Вес = " + sum + " грамм ");
        System.out.println("Вес = " + kg + " килограмм " + remainder + " грамм");
    }
    }
