public class Store {
    private Employee[] employees;										//Declaring employee array
    
    public Store(int totalEmployee) {									//constructor for creating size of an array
		employees = new Employee[totalEmployee];						//size of an array depend on number of employee store have. 
		totalEmployee++;
	}
    
    public void readEmployeeDetails(){									//method to read the detail of an employee
        for(int i=0;i<employees.length;i++){							//for loop to read detail of each employee
            System.out.println("Enter Detail of Employee "+(i+1));		
            employees[i] = new Employee(); 								//creating object of employee class
            employees[i].readEmployee(); 								//calling readEmloyee method from Employee class
        }
    }

    public void printEmployeeDetails(){									//method to print the detail of an employee
        for(int i=0;i<employees.length;i++){							//for loop to print detail of an employee
            employees[i].printEmployee();								//calling printEmployee method from Employee class
        }
    }

    public static void printLine() {									//method to print line at the end
        System.out.println("==================================================================================================");
    }

    public static void printTitle(String name) {						//method to print the title of the store. Declaring string name in parameter
        System.out.printf("%45s Store Management System %n", name);								//print out store name
        printLine();													//calling printLine() method. In next line, program print out the colume names
        System.out.printf("%10s|%20s|%20s|%20s|%20s| %n", "Emp#", "Name", "Email", "Phone", "Salary");
        printLine();													//calling printLine() method
    }
}
