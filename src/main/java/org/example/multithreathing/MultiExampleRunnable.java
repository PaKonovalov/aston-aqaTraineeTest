package org.example.multithreathing;

public class MultiExampleRunnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThreadThree());
        Thread thread2 = new Thread(new MyThreadFour());
        thread1.start();
        thread2.start();
    }
}
//TODO Для создания потока создаем класс и implements Runnable
class MyThreadThree implements Runnable{

//TODO переопределяем метод run в котором укажем сю логику

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

//TODO создадим второй поток
class MyThreadFour implements Runnable {

    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
