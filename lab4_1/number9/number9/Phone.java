package lab4_1.number9.number9;

public class Phone {
    String number;
    String model;
    int weight;
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }
    public Phone(String number,String model,int weight){
        this(number, model);
        this.weight = weight;
    }
    public Phone(String number,String model){
        this.model = model;
        this.number = number;
    }
    public Phone(){}

    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name+" номер " + number);
    }
    public void sendMessage(Object...obj){
        for (Object o : obj)
            System.out.println(o.toString()+" ");
    }

    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}

