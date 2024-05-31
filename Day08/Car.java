package Day08;

public class Car {
    private String name;

    private String model;

    private int speed;

    Car(String name, String model) {
        this.name = name;
        this.model = model;
        this.speed = 0;
    }
    void speedUp(){
        this.speed++;
    }

    void speedDown() {
        if (this.speed == 0) {
            this.speed = 0;
        }
        else {
            this.speed--;
        }
    }

    void nowSpeed(){
        System.out.println("현재 시속 : " + this.speed);
    }


}
