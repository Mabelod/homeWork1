package ru.skypro;

public class Main {
    public static void main(String[] args){
        int maria = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mariaRise = (maria * 10) / 100;
        int denisRise = (denis * 10) / 100;
        int kristinaRise = (kristina * 10) / 100;
        System.out.println("Мария теперь получает " + (maria + mariaRise) + " рублей. Годовой догод вырос на " + mariaRise + " рублей.");
        System.out.println("Денис теперь получает " + (denis + denisRise) + " рублей. Годовой догод вырос на " + denisRise + " рублей.");
        System.out.println("Кристина теперь получает " + (kristina + kristinaRise) + " рублей. Годовой догод вырос на " + kristinaRise + " рублей.");
    }
    }
