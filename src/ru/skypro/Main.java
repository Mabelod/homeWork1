package ru.skypro;

public class Main {
    public static void main(String[] args){
            task1();
    }
    public static void task1(){
        byte a = 127;
        short b = 32767;
        int c = 158_789;
        long z = 4567L;

        float e = 16f;
        double y = 15.7;

        boolean bool = true;
        char m = 77;

        System.out.print(a + " " + b + " " + c + " " + z + " " + e + " " + y + " " + bool + " " + m);
    }
}
