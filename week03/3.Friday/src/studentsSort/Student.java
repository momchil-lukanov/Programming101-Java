package studentsSort;

public class Student {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	String name = "";
	int grade = 0;

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

}
