package lab3.number1.number4;

public class rand4 {
    public static void main(String[] args)
    {
        Double d = Double.valueOf(5.2);
        String text="2.27";
        double value = Double.parseDouble(text);
        int i = (int) value;
        byte b = (byte) value;
        long l = (long) value;
        short s=(short) value;
        float f=(float) value;
        char c=(char) value;

        System.out.println(d);

        double  pi = 3.14;
        String str = Double.toString(pi);
        System.out.println(str);
    }
}
