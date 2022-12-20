package lab4.number7;

public class MainSEAS {
    public static void main(String[] args)
    {
            System.out.println("Лето - любимое время года");
            for (Season sea : Season.values()){
            System.out.println(sea.toString());
            sea.getDescription();

            switch(sea){
                case SUMMER:
                    System.out.println("Я люблю лето"+"\n");


                case AUTUMN:
                    System.out.println("Я люблю осень"+"\n");


                case WINTER:
                    System.out.println("Я люблю зиму"+"\n");


                case VESNA:
                    System.out.println("Я люблю осень весну"+"\n");

            }
        }
    }
}
