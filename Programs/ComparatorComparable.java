import java.util.*;

public class ComparatorComparable {

	public static void main(String[] args) {
		List<Student> stud = new ArrayList<>();
		stud.add(new Student("Prashuk", 1, 55));
		stud.add(new Student("Ajmera", 2, 45));
		stud.add(new Student("Shraddha", 5, 85));
		stud.add(new Student("Shrey", 4, 35));
		stud.add(new Student("Kundan", 3, 95));

		Comparator<Student> comparator = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getMarks() < o2.getMarks()) {
					return 1;
				} else {
					return -1;
				}
			}
		};

		Collections.sort(stud, comparator);

		for (int i = 0; i < stud.size(); i++) {
			System.out.println(stud.get(i));
		}

	}

}

class Student
// implements Comparable<Student>
{
	private String name;
	private int rollno;
	private int marks;

	public Student(String name, int rollno, int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
	}

	// @Override
	// public int compareTo(Student stud2) {
	//
	// if(this.getMarks() < stud2.getMarks()) {
	// return 1;
	// } else {
	// return -1;
	// }
	// }

}