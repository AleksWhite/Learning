package InterfaceBas2;

public abstract class Bus implements Vehicle{
    public abstract void start();

    public void move() {
        System.out.println("Еду со средней скоростью 50 км/ч.");
    }

    public abstract void stop();
}