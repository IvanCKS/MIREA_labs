package Homework17__;

public class MVCPatternDemo
{
    public static void main(String[] args)
    {

        Employee model = retiveModel();
        EmployeeView view=new EmployeeView();

        EmployeeController controller = new EmployeeController(model,view);

        controller.updateView();
    }

    private static Employee retiveModel()
    {

        Employee employee = new Employee();

        employee.setSalary(300000);
        employee.setMonth(2);
        return employee;
    }
}
