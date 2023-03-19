package InterfaceBas2;

public abstract class Car implements Vehicle {
    public abstract void start();

    public void move() {
        System.out.println("Еду со средней скоростью 70 км/ч.");
    }

    public abstract void stop();
}