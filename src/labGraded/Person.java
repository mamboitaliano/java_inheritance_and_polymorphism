package labGraded;
public class Person {

public static void main(String[] args) {
	Person person1 = new Person("Ronald McDonald", "2111 McDonald's Dr., Oak Brook, IL 60523", "(630) 623-3000", "ron@mcdonalds.com");
	System.out.println(person1.toString());
	Student student1 = new Student("Colonel Sanders", "1900 Colonel Sanders Ln, Louisville, KY 40213", "(502) 874-8300", "thecolonel@kfc.com", "Super Senior");
	System.out.println(student1.toString());
	Employee employee1 = new Employee("Ninja Gaiden", "Somewhere above you", "Unknown Number", "Unknown Email", "Sengoku", 1000000, new MyDate(1550, 1, 1));
	System.out.println(employee1.toString());
	Faculty faculty1 = new Faculty("Professor Johnstone", "55 University Lane, Fairfax, VA 22030", "444444", "Phone", "1 Rivanna River Lane, Fairfax, VA 22030", 50000, new MyDate(1992, 4, 17), "Tuesday & Thursday, 5 PM - 6 PM", "Emeritus");
	System.out.println(faculty1.toString());
	Staff staff1 = new Staff("Spock", "Vulcan Prime", "1-800-Vulcan1", "Spock@state.vul", "Starship Enterprise", 254346, new MyDate(1975, 8, 1), "Live Long & Prosper");
	System.out.println(staff1.toString());
	
	Person defaultPerson1 = new Person();
	Person defaultPerson2 = new Student();
	Person defaultPerson3 = new Employee();
	Person defaultPerson4 = new Faculty();
	Person defaultPerson5 = new Staff();
	
	System.out.println();
	System.out.println(defaultPerson1.toString() + "\n" + defaultPerson2.toString() + "\n" + defaultPerson3.toString() + "\n" + defaultPerson4.toString() + "\n" + defaultPerson5.toString());
	}

//Person: vars
String name = "No Name";
String address = "No Address";
String phone = "No Phone Number";
String email = "No Email";
String className = "Person";

//No-arg  constructor
Person() {
}

//Setter for new name
Person(String newName, String newAddress, String newPhone, String newEmail) {
	setName(newName);
	setAddress(newAddress);
	setPhone(newPhone);
	setEmail(newEmail);
}

void setAddress(String newAddress) {
	address = newAddress;
	}

void setPhone(String newPhone) {
	phone = newPhone;
	}

void setEmail(String newEmail) {
	email = newEmail;
	}

void setName(String newName) {
	name = newName;
	}

public String toString() {
	return "ClassName: " + this.className + "| Name: " + this.name + "| Address: " + this.address + "| Phone: " + this.phone + "| Email: " + this.email;
	}
}

//STUDENT------------------------------------------------------------------------

class Student extends Person {
	String test = "No Status";
	private final String classStatus;
	String className = "Student";

//No-arg constructor

Student() {
	classStatus = "No Status";
	}

Student(String newName, String newAddress, String newPhone, String newEmail, String newStatus) {
	super(newName, newAddress, newPhone, newEmail);
	classStatus = newStatus;
}

public final void setStatus(String newStatus) {
	test = newStatus;
	}


public String toString() {
	return "ClassName: " + className + "| Name: " + this.name + "| Address: " + this.address + "| Phone: " + this.phone + "| Email: " + this.email + "| Status: " + this.classStatus;
	}
}

//EMPLOYEE------------------------------------------------------------------------

class Employee extends Person {
	String office = "Currently unemployed";
	long salary = 0;
	MyDate hired = new MyDate();
	String className = "Employee";
	
Employee() {
}

Employee(String newName, String newAddress, String newPhone, String newEmail, String newOffice, long newSalary, MyDate newHired) {
	super(newName, newAddress, newPhone, newEmail);
	setOffice(newOffice);
	setSalary(newSalary);
	setDateHired(newHired);
	}

void setOffice(String newOffice) {
	office = newOffice;
	}

void setSalary(long newSalary) {
	salary = newSalary;
	}

void setDateHired(MyDate b) {
	hired = b;
	}

public String toString() {
	return "ClassName: " + className + "| Name: " + this.name + " Address: |" + this.address + "| Phone: " + this.phone + "| Email: " + this.email + "| Office: " + this.office + "| Salary: $" + this.salary + "| Date Hired: " + hired.month + "-" + hired.day + "-" + hired.year;
	}
}

//FACULTY------------------------------------------------------------------------

class Faculty extends Employee {
	String officeHours = "No office hours";
	String rank = "No rank";
	String className = "Faculty";

public String toString() {
	return "ClassName: " + className + "| Name: " + this.name + "| Address: " + this.address + "| Phone: " + this.phone + "| Email: " + this.email + "| Office: " + this.office + "| Salary: $" + this.salary + "| Date Hired: "+ hired.month + "-" + hired.day + "-" + hired.year + "| Office hours: " + this.officeHours + "| Rank: " + this.rank;
	}

Faculty() {
	}

Faculty(String newName, String newAddress, String newPhone, String newEmail, String newOffice, long newSalary, MyDate newDateHired, String newOfficeHours, String newRank) {
	super(newName, newAddress, newPhone, newEmail, newOffice, newSalary, newDateHired);
	setOfficeHours(newOfficeHours);
	setRank(newRank);
	}

void setOfficeHours(String newOfficeHours) {
	officeHours = newOfficeHours;
	}

void setRank(String newRank) {
	rank = newRank;
	}
}

//STAFF------------------------------------------------------------------------

class Staff extends Employee {
	String title = "Title N/A";
	String className = "Staff";
	public String toString() {
		return "ClassName: " + className + "| Name: " + this.name + "| Address: " + this.address + "| Phone: " + this.phone + "| Email: " + this.email + "| Office: " + this.office + "| Salary: " + this.salary + "| Date Hired: "+ hired.month + "-" + hired.day + "-" + hired.year;
		}

Staff() {
}

Staff(String newName, String newAddress, String newPhone, String newEmail, String newOffice, long newSalary, MyDate newDateHired, String newTitle) {
	super(newName, newAddress, newPhone, newEmail, newOffice, newSalary, newDateHired);
	setTitle(newTitle);
	}

void setTitle(String newTitle) {
	title = newTitle;
	}
}