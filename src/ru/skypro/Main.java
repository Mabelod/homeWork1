package ru.skypro;

public class Main {
    public static void main(String[] args){
        task3();
    }
    public static void task3(){
        int bananas = 5;
        int bananasWieght = 80;

        int milk = 200 / 100;
        int milkWieght = 105;

        int iceCream = 2;
        int iseCreamWieght = 100;

        int eggs = 4;
        int eggsWieght = 70;


        int sum = (bananas * bananasWieght) + (milk * milkWieght) + (iceCream * iseCreamWieght) + (eggs * eggsWieght);
        int kg = sum / 1000;
        int remainder = sum % 1000;
        // double remainder1 = (sum * 1.0) / 1000; - не стал выводить кг через double, оставляю чтобы показать что есть и такой вариант.
        System.out.println("Вес = " + sum + " грамм ");
        System.out.println("Вес = " + kg + " килограмм " + remainder + " грамм");
    }
    }
