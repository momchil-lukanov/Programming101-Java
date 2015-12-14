package studentsSort;

import java.util.ArrayList;

public class listOfStudents {

	static ArrayList<Student> result = null;

	static int smallestGrade = 7;

	public static ArrayList<Student> sortByGrade(ArrayList<Student> randomList) {

		for (int j = 0; j < randomList.size(); j++) {
			for (int i = j; i < randomList.size(); i++) {
				if (randomList.get(i).getGrade() < smallestGrade) {
					Student temp = randomList.get(j);
					randomList.set(j, randomList.get(i));
					randomList.set(i, temp);
					smallestGrade = randomList.get(i).getGrade();
				} else if (randomList.get(i).getGrade() == smallestGrade) {
					if (randomList.get(i).getName().compareTo(randomList.get(j).getName()) < 0) {
						Student temp = randomList.get(j);
						randomList.set(j, randomList.get(i));
						randomList.set(i, temp);
					}
				}
			}
		}
		return result;

	}

	public String toString() {

		String result1 = "";

		for (int i = 0; i < result.size(); i++) {
			result1 += "(" + result.get(i).getName() + ", " + result.get(i).getGrade() + ")";
		}

		return result1;
	}

	public static void main(String[] args) {
		Student one = new Student("Ibgan", 4);
		Student two = new Student("Ian", 4);
		Student three = new Student("Petar", 3);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(one);
		list.add(two);
		list.add(three);
		System.out.println(list.toString());
		sortByGrade(list);
		System.out.println(list.toString());

	}

}
