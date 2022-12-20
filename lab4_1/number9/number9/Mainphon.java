package lab4_1.number9.number9;

public class Mainphon {
    public static void main(String[] args){
        Phone phone=new Phone("88005553535","самсунг",450);
        Phone phone2=new Phone("89295516365","эпл",560);
        Phone phone3=new Phone("8909999999","сяоми",435);
        System.out.println(phone3);
        System.out.println(phone2);
        System.out.println(phone);
        phone.receiveCall("аноним");
        System.out.println(phone3.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone.getNumber());
        phone2.receiveCall("аноним2", "8905345813");
        phone3.sendMessage("89342352445","89348345242","89991457390");
    }
}
