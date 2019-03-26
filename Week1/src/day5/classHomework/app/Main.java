package day5.classHomework.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import day5.classHomework.model.Department;
import day5.classHomework.model.Employee;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = createSmallCompany();
		System.out.println(employees);
		
		// employee with max salary
		Employee maxEmployee = maxEmployee(employees);
		System.out.println(maxEmployee.getName());
		
		// better solution
		Employee empWithMaxSalary = 
				employees
				.stream()
				.reduce(new Employee(), (e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
		System.out.println(empWithMaxSalary.getName());
		
		List<Employee> empWithSameManager = employees
				.stream()
				.filter(e0 -> e0.getManagerId() != null && e0.getManagerId() == 3).collect(Collectors.toList());
		
		String result = 
				empWithSameManager
				.stream()
				.map(e -> e.getName())
				.collect(Collectors.joining(" and ", " Same Manager:", " report to Julie"));
		
		System.out.println(result);
		
		System.out.println("Below we will print out all employees that do not have managers");
		employees
		.stream()
		.filter(e0 -> e0.getManagerId() == null)
		.forEach((e) -> System.out.println(e.getName()));
		
		// Homework:
		System.out.println("List of employee names who do not have managers and who do not have subordinates.");
		List<Integer> subEmp = employees
		.parallelStream()
		.map(e -> e.getManagerId()).distinct().collect(Collectors.toList());
		
		List<Employee> nonSubEmp = employees.stream().filter(e -> !subEmp.contains(e.getId()) && e.getManagerId() == null).collect(Collectors.toList());
		
		nonSubEmp.parallelStream().forEach(e -> System.out.println(e.getName()));
	}
	
	private static Employee maxEmployee(List<Employee> list) {
		Employee maxSalaryEmployee = null;
		int maxSalary = Integer.MIN_VALUE;
		
		for(Employee employee : list) {
			if(employee.getSalary() > maxSalary) {
				maxSalary = employee.getSalary();
				maxSalaryEmployee = employee;
			}
		}
		return maxSalaryEmployee;
	}
	
	private static List<Employee> createSmallCompany() {

        Department technologyDept = new Department();
        technologyDept.setId(1);
        technologyDept.setDepartmentName("Technology");
        
        Department hrDept = new Department();
        hrDept.setId(2);
        hrDept.setDepartmentName("Human Resource");
        
        Department payrollDept = new Department();
        payrollDept.setId(3);
        payrollDept.setDepartmentName("Payroll");
        
        List<Employee> employees = new ArrayList<Employee>();
        
        employees.add(new Employee(1, "Tom", 200000, null, hrDept));
        employees.add(new Employee(2, "Joe", 95000, 1, hrDept));
        
        employees.add(new Employee(3, "Julie", 180000, null, technologyDept));
        employees.add(new Employee(4, "Adam", 140000, 3, technologyDept));
        employees.add(new Employee(5, "James", 135000, 3, technologyDept));
        
        employees.add(new Employee(6, "Jake", 125000, null, payrollDept));
        
        return employees;
    }

}
