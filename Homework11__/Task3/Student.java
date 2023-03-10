package Homework11__.Task3;

import java.text.DateFormat;
import java.util.Date;

public class Student
{
    private String name;

    private Date birth;

    public Student(String name, Date birth)
    {
        this.name = name;

        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getBirth()
    {
        return birth;
    }

    public void setBirth(Date birth)
    {
        this.birth = birth;
    }

    public String toString(int format)
    {
        DateFormat df;
        switch (format)
        {
            case (1):
                df = DateFormat.getDateInstance(DateFormat.SHORT);
                break;
            case(2):
                df = DateFormat.getDateInstance(DateFormat.MEDIUM);
                break;
            default:
                df = DateFormat.getDateInstance(DateFormat.LONG);

        }
        return "Студент: "
                + "Имя - " + name
                + ", дата рождения - " + df.format(this.birth);

    }

}
