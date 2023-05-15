package org.example.multithreathing;

public class MultiExample {
    public static void main(String[] args) {
        MyThreadOne myThreadOne = new MyThreadOne();
        MyThreadTwo myThreadTwo = new MyThreadTwo();
        myThreadTwo.start();
        myThreadOne.start();
    }
}

//TODO Для создания потока создаем класс и наследуем класс Thread
class MyThreadOne extends Thread {

//TODO переопределяем метод run в котором укажем сю логику

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

//TODO создадим второй поток
class MyThreadTwo extends Thread {

    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

//TODO запуск через анонимный класс

class MyThreadHI extends Thread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("HI");
            }
        }).start();
//TODO запуск через ФИ и лямбда выражение
        new Thread(() -> System.out.println("HIHI")).start();

    }
}