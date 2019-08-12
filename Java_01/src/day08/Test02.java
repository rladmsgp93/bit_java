package day08;

public class Test02 {

	public static void main(String[] args) {

		Student[] students = { new Student("홍", 2019001, 80, 90, 100), new Student("김", 2019002, 70, 99, 100),
				new Student("박", 2019003, 87, 97, 100) };
		for (Student data : students) {
			if (data.getGrade() == 'B') {
				data.print();
			}
		}

	}
	}

class Student {
	private String name;
	private int number;
	private int kor;
	private int eng;
	private int math;
	private char grade;

	public Student() {

	}

	public Student(String data) {

	}

	public Student(String name, int number, int kor, int eng, int math) {
		super();
		this.name=name;
		setNumber(number);
		setKor(kor);
		setEng(eng);
		setMath(math);
		//setGradeProcess();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {

		if (!checkJumsu(kor)) {
			return;
		}
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (!checkJumsu(eng)) {
			return;
		}
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if (!checkJumsu(math)) {
			return;
		}
		this.math = math;
	}

	public char getGrade() {
		this.setGradeProcess();
		return grade;
	}

	private void setGradeProcess() {
		double avg = (kor + eng + math) / 3.0;
		this.grade = avg >= 90 ? 'A' : (avg >= 80 ? 'B' : (avg >= 70 ? 'C' : (avg >= 60 ? 'D' : 'F')));
	}

	public void print() {
		System.out.printf("이름 :%s 평균:%.2f 학번: %s 성적:%s ", name, (kor + eng + math) / 3.0, number, getGrade());
	}

	private boolean checkJumsu(int num) {
		boolean flag = true;
		if (num <= 0 && num >= 100) {
			System.out.println(num + "점수가 유효x");
			flag = false;
		}
		return flag;
	}
}
