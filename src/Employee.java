
public class Employee {
	private int employeeNumber;												//declaring instance variable name employeeNumber
    private Person emp;														//declaring instance variable of Person class
    private double numHours;												//declaring instance variable name numHours											
    private double hourlyPay;												//declaring instance variable name hourlyPay

    public Employee(){}														//declaring constructor of Employee class
    																		//declaring parameterized constructor
    public Employee (int empNum,String name1, String name2, String emailId, long cellNum, double workHours, double payPerHours){
        this.employeeNumber = empNum;
        this.emp = new Person(name1, name2, emailId, cellNum);
        this.numHours = workHours;
        this.hourlyPay = payPerHours;
    }

    public void readEmployee() {											//declaring readEmployee()
        System.out.print("Enter Employee Number: ");						//Asking user for Employee number
        employeeNumber = Lab2Test.keys.nextInt();							//scanner class to get employee number
        System.out.print("Enter first name: "+Lab2Test.keys.nextLine());	//Asking user for first name 
        String name1 = Lab2Test.keys.nextLine();							//declaring name1 variable and get first name from user via scanner class
        System.out.print("Enter last name: ");								//Asking user for last name
        String name2 = Lab2Test.keys.nextLine();							//declaring name2 variable and get last name from user via scanner class
        System.out.print("Enter email: ");									//Asking user for email
        String eId = Lab2Test.keys.nextLine();								//declaring eId variable and get email via scanner class
        System.out.print("Enter phone number: ");							//Asking user for phone number 
        long cellNum = Lab2Test.keys.nextLong();							//declaring cellNum variable and get phone from user via scanner class
        emp = new Person(name1, name2, eId, cellNum);						//invoking person class
        System.out.print("Enter numbers of hours worked: ");				//asking user for number of hours work
        numHours = Lab2Test.keys.nextDouble();								//scanner class to get number of hours employee work
        System.out.print("Enter hourly pay: ");								//asking user for hourly pay
        hourlyPay = Lab2Test.keys.nextDouble();								//scanner class to get hourly pay employee receives 
    }

    public void printEmployee() {											//declaring printEmployee() method
        double Salary = numHours *hourlyPay;								//declaring salary variable and product of numHours and hourlyPay
        System.out.printf("%10d|%20s|%20s|%20d|%20.2f| %n",employeeNumber,emp.getName(),emp.getEmail(),emp.getPhoneNumber(),Salary);
    }	
}
