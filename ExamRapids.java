package jaavaTutorial;

import java.util.ArrayList;

//defining enum -- it should create outside of the class
enum level {
	FIRST, SECOND, THIRD
}

class StudentsLevel {
	
	level grade;

	public StudentsLevel(level gr) {
		this.grade = gr;

	}

	public void disGrade() {
		System.out.println(this.grade);

		switch (grade) {
		case FIRST:
			System.out.println("first grade");
			break;
		case SECOND:
			System.out.println("second grade");
			break;
		case THIRD:
			System.out.println("third grade");
			break;
		}
	}
}

public class ExamRapids {

	public static void main(String[] args) {

		// defining ArrayList
		ArrayList<String> exam = new ArrayList<>();
		boolean objExam = exam.add("first");
		exam.add("second");
		exam.add("third");

		if (exam.contains("first")) {
			System.out.println("this is first exam.");
		} else {
			System.out.println("this is a class");
		}

		// creating object for StudentsLevel class
		StudentsLevel std = new StudentsLevel(level.SECOND);

		std.disGrade();

	}

}
