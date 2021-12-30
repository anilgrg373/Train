
public class Student {
	
	
 public String studentName;
 public int studentRollNo;
 public int phoneNo;
 public String address;

 
public class Main{
	
	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.studentName="Jhon Wick";
		st1.studentRollNo=1;
		st1.phoneNo= 911;
		st1.address="183,Apt 2, Long Island, Hicksville";
		
		Student st2 = new Student();
		st2.studentName= "Sam";
		st2.studentRollNo =2;
		st2.phoneNo= 100;
		st2.address="8507, 57th aveneue,NewYork , Manhattan";
		
		
		System.out.println("His name is"+ " "+st1.studentName);
		System.out.println("His roll number is"+" "+ st1.studentRollNo);
        System.out.println("HIs phone number is"+ " "+st1.phoneNo);
		System.out.println("His address is"+ " "+st1.address);
		System.out.println();
		System.out.println("His name is"+ " "+st2.studentName);
		System.out.println("His roll is"+ " "+st2.studentRollNo);
		System.out.println("His phone number is"+ " "+st2.phoneNo);
        System.out.println("His address is"+ " "+st2.address);
		
		
	}
}
	
	
			
	
}

	


