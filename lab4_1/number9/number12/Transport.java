package lab4_1.number9.number12;

public abstract class Transport {
         int speed;
         int fuel;

         int pf;
         double tarif;

         double km;

        public Transport(int speed, int fuel, int pf, double tarif) {
            this.speed = speed;
            this.fuel = fuel;
            this.pf = pf;
            this.tarif = tarif;
            km=(fuel*pf)/100;
        }

        public double getkm() {
            return km;
        }

        public int getFuel() {
            return fuel;
        }

        public double gettarif() {
            return tarif;
        }

        public int getpf() {
            return pf;
        }

        public int getSpeed() {
            return speed;
        }

        @Override
        public abstract String toString() ;
}
