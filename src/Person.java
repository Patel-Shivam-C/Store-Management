
public class Person {
	private String firstName;												//declaring instance variable name firstName
    private String lastName;												//declaring instance variable name lastName
    private String email;													//declaring instance variable name email
    private long phoneNumber;												//declaring instance variable name phoneNumber

    public Person(String name1,String name2, String eId, long cellNum){		//creating parameterized constructor
        this.firstName = name1;
        this.lastName = name2;
        this.email = eId;
        this.phoneNumber = cellNum;
    }

    public String getName(){												//getter for name and return first name last name in string format	
        return this.firstName + " "+this.lastName;
    }

    public String getEmail(){												//getter for email id
        return email;
    }

    public long getPhoneNumber(){											//getter for phone number
        return phoneNumber;
    }
}
