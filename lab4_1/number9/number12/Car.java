package lab4_1.number9.number12;

public class Car extends Transport{
    public Car(int speed, int f, int pf, double tarif) {
        super(speed, f, pf, tarif);
    }

    @Override
    public double gettarif() {
        return super.gettarif();
    }

    @Override
    public int getFuel() {
        return super.getFuel();
    }

    @Override
    public int getpf() {
        return super.getpf();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "Car";
    }
}
