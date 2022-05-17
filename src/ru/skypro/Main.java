package ru.skypro;

public class Main {
    public static void main(String[] args){
        task5();
    }
    public static void task5(){
        byte a = 12;
        byte b = 27;
        byte c = 44;
        byte d = 15;
        byte e = 9;
        int result = Math.abs(a * (b + ( c - d * e)));
        System.out.println(result);
    }
    }
