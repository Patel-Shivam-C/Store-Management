import java.util.Scanner;											//importing scanner class

public class Lab2Test {
	
	static Scanner keys = new Scanner(System.in);					//declaring Scanner class for all classes
	public static void main(String[] args) {
		
		String strName;												//variable for getting store name
        int totEmp;													//variable for getting number of employees in store
        System.out.print("Enter name of the store: ");				//Asking user to enter store name
        strName = keys.nextLine();									//Getting name of store from user via keyboard
        System.out.print("How many employees do you have?");		//Asking user to enter the number of employee the have in store
        totEmp = keys.nextInt();									//getting number of employee they have in store
        Store store = new Store(totEmp);							//calling store class
        store.readEmployeeDetails();								//calling readEmployeeDetails() method from store class
        Store.printLine();											//calling printLine() static method from Store class
        Store.printTitle(strName);									//calling printTitle() static method from Store class
        store.printEmployeeDetails();								//calling printEmployeeDetails() method from store class
        keys.close();
	}

}
