package lab4.number7;



    public enum Season {
        SUMMER(30),

        AUTUMN(10),

        WINTER(-10){
            public void getDescription() {
                System.out.println("Холодное время года");
            }

        },

        VESNA(15);

        int a;

        Season(int a) {
            this.a = a;
        }

        public void getDescription() {
            System.out.println("Теплое время года");
        }


        public String toString() {

            return name() + " средняя температура = " + a;
        }

    }

