package lab4_1.number9.number12;

public class Plane extends Transport{
    public Plane(int speed, int fuel, int pf, double tarif) {
        super(speed, fuel, pf, tarif);
    }

    @Override
    public double gettarif() {
        return super.gettarif();
    }

    @Override
    public int getFuel() {
        return super.getFuel();
    }


    public int getpf() {
        return super.getpf();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "Plane";
    }
}
