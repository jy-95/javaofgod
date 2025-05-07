package chapter8;

public class ManageStudent {

	public static void main(String[] args) {
		Student[] student = null;
		ManageStudent sample = new ManageStudent();
//		student = sample.addStudent();
//		sample.printStudents(student);
		sample.checkEquals();
	}
	
	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Lim");
		student[1] = new Student("Min");
		student[2] = new Student("Sook", "Seoul", "01073071350", "asd@gmail.com");
		return student;
		
	}
	
	public void printStudents(Student[] student) {
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
	}
	
	public void checkEquals() {
		Student a = new Student("Min", "Seoul", "01012312341", "asd@godofjava.com");
		Student b = new Student("Min", "Seoul", "01012312341", "asd@godofjava.com");
		if(a.equals(b)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}

}
