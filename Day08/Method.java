package Day08;

public class Method {
    public static void main(String[] args) {

        Car a = new Car ("현대","셀토스");
        Car b = new Car ("테슬라","x");

        a.speedUp();
        a.speedUp();
        a.nowSpeed();

        b.speedDown();
        b.nowSpeed();

        b.nowSpeed();

    }
}
