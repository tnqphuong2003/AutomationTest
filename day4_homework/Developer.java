package day4_homework;

public class Developer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		
		emp1.setEmployee_id("emp1");
		emp1.setEmployee_name("Nguyen Văn A");
		
		getInfo(emp1);
		
		
		Employee emp2 = new Employee();
		
		emp2.setEmployee_id("emp2");
		emp2.setEmployee_name("Nguyen Văn B");
		
		getInfo(emp2);
	}
	
	public static void getInfo(Employee emp) {
		System.out.println("nhan vien: " + emp.getEmployee_name() + ", id: " + emp.getEmployee_id() + ", salary: " + emp.getEmployee_salary());
	}

}
