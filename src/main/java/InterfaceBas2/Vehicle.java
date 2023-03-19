package InterfaceBas2;

/*
Дорожное движение
*/

public interface Vehicle {
    default void start()
    {
        System.out.println("Начинаю движение.");
    }
    void move();
    default void stop() {
        System.out.println("Останавливаюсь.");
    }
}