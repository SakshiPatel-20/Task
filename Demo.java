import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Emp employee = new Emp();

        System.out.print("Enter Employee Salary: $");
        int salary = scanner.nextInt();
        employee.setSalary(salary);

        System.out.print("Enter Hours of Work per Day: ");
        int hoursOfWorkPerDay = scanner.nextInt();
        employee.setHourperday(hoursOfWorkPerDay);

        int finalSalary = employee.finalSalary();

        System.out.println("Final Salary: $" + finalSalary);

        scanner.close();

	}

}