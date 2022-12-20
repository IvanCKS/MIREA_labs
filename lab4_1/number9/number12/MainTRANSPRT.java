package lab4_1.number9.number12;

public class MainTRANSPRT {
    public static void main(String[] args) {
        double time;
        double price;
        double tarif;
        double rast = 2;

        Transport[] transports = {
                new Car(80,10,50,2),
                new Plane(950,2800,51,1.9),
                new Train(200, 400,52,0.9),
                new Ship(20,250, 5,3)};


        for (Transport transport:transports)
        {
            time = rast / transport.getSpeed();
            price = transport.getkm()*rast;
            tarif = price * transport.gettarif();

            System.out.println("\nТип транспорта "+ transport);
            System.out.println(("Время перевозки " + time*60 + " минут"));
            System.out.println("Цена перевозки пассажира "+ price+"руб");
            System.out.println("Цена перевозки груза "+ tarif+"руб");
        }
    }
}
