package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question2 {

	public static void sortEmployeesBySalary(List<Employee> employees) {
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			// SORTING IN ASCENDING ORDER OF SALARY
			public int compare(Employee e1, Employee e2) {
				return Double.compare(e1.getSalary(), e2.getSalary());
				// FOR DESCENDING ORDER OF SALARY
//				return Double.compare(e2.getSalary(), e1.getSalary());
			}
		});
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Harsh", 780000));
		employees.add(new Employee("Messi", 190000));
		employees.add(new Employee("Neymar", 290000));

		System.out.println("BEFORE SORTING:");
		// USING FOR EACH LOOP FOR DISPLAYING
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		sortEmployeesBySalary(employees);

		System.out.println("\nA:");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
