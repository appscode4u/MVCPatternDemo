public class MVCPatternDemo {

    public static void main(String[] args) {

        //retrieve employee data from database [simulation]
        Employee model = retriveEmployeeFromDatabase();

        //prepare View to write employee details on console
        EmployeeView view = new EmployeeView();

        //set-up controller
        EmployeeController controller = new EmployeeController(model,view);

        controller.updateView(); //first time data output on console

        //now update some data i.e. group and salary
        model.setGroup(5); //updated group from 2 to 5
        model.setSalary(2222.78); // updated salary from 1000.99 to 2222.78

        System.out.println(""); //just a little bit space between displayed data :)

        controller.updateView(); //second output: display after updates

    }

    private static Employee retriveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Kristpher");
        employee.setGroup(2);
        employee.setSalary(1000.99);
        return employee;
    }
}
