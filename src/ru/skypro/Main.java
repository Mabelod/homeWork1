package ru.skypro;

public class Main {
    public static void main(String[] args){
        task7();
    }
    public static void task7(){
        int a = 5;
        int b = 7;
        a = b - a;
        b = b - a;
        a = b + a;
        System.out.println(a + " " + b);
    }
    }
