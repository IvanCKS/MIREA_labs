package Homework17__;

public class EmployeeController
{
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view)
    {
        this.model = model;
        this.view = view;
    }

    public void setSalary(int salary)
    {
        model.setSalary(salary);
    }

    public void setMonth(int month)
    {
        model.setMonth(month);
    }


    public int getSalary()
    {
        return model.getSalary();
    }

    public int getMonth()
    {
        return model.getMonth();

    }


    public void updateView()
    {
        view.print(model.getSalary(), model.getMonth());
    }
}
