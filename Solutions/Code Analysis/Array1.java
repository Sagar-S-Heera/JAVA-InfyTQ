class Teacher{
	private String teacherName;
	private String subject;
	private double salary;
	public Teacher(String teacherName, String subject, double salary) {
		this.salary=salary;
		this.subject=subject;
		this.teacherName=teacherName;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

public class Tester{

	public static void main(String[] args) {

		Teacher teachers[] = new Teacher[4];
		teachers[0]= new Teacher("Alex", "Java Fundamentals", 1200L);
		teachers[1]= new Teacher("John", "RDBMS", 800L);
		teachers[2]= new Teacher("Sam", "Networking", 900L);
		teachers[3]= new Teacher("Maria", "Pyhton", 900L);		
		
		for(Teacher t : teachers) {
			System.out.println("Name : "+t.getTeacherName()+", Subject : "+t.getSubject()+", Salary : "+t.getSalary());
		}		
	}
}
