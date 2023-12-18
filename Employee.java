package org.emp;

public class Employee {
private void empID() {
	System.out.println("Employee Id is 123");

}
private void empName() {
   System.out.println("Employee Name is Praveen");

}
private void empDob() {
	System.out.println("Employee Dob is 17-11-2000");

}
private void empPhnone() {
	System.out.println("Employee Phone is 7548883233");

}
private void empEmail() {
	System.out.println("Employee Email is praveenravindran2000@gmail.com");

}
private void empAddress() {
	System.out.println("Employee Address is Udumalpet");

}
public static void main(String[] args) {
    
      Employee e = new Employee();
      e.empID();
      e.empAddress();
      e.empDob();
      e.empEmail();
      e.empName();
      e.empPhnone();
	
}
}

