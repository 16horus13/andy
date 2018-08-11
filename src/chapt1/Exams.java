package chapt1;

public class Exams {

	public static void main(String[] args) {
		double[] result=new double[4];
		Student[] summer2018 = new Student[4];
		Student.Teacher[] t = new Student.Teacher[4];
		System.out.println("Заполните данные абитуриентов на СФ:");
		summer2018[0] = new Student();
		t[0] = new Student.Teacher() {
			@Override
			protected double exams() {
				int math = 3 + (int) (Math.random() * 5);
				System.out.println("Математика - " + math);
				int phys = 3 + (int) (Math.random() * 5);
				System.out.println("Физика - " + math);
				double average = ((double) math + (double) phys) / 2;
				System.out.println("Средний балл - " + average);
				return average;
			}
		};
		result[0]=t[0].exams();

		summer2018[1] = new Student();
		t[1] = new Student.Teacher() {
			@Override
			protected double exams() {
				int math = 3 + (int) (Math.random() * 5);
				System.out.println("Математика - " + math);
				int phys = 3 + (int) (Math.random() * 5);
				System.out.println("Физика - " + phys);
				double average = ((double) math + (double) phys) / 2;
				System.out.println("Средний балл - " + average);
				return average;
			}
		};
		result[1]=t[1].exams();

		int i = 2;
		do {
			summer2018[i] = new Student();
			t[i] = new Student.Teacher();
			result[i]=t[i].exams();

			i++;
		} while (5 > i);
	}
}
