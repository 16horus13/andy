package chapt1;
import java.util.Scanner;

public class Student {
	Scanner in=new Scanner(System.in);
	protected static int id=0;
	public String name;
	{
		id++;
	}
	public Student() {
		System.out.println("ФИО:");
		name =in.nextLine();
		System.out.println("Абитуриент номер "+id+". ФИО: "+name);
		}
	protected static class Teacher {
		protected double exams() {
			int math= 1+(int)(Math.random()*5);
			System.out.println("Математика - "+math);
			int phys= 1+(int)(Math.random()*5);
			System.out.println("Физика - "+phys);
			double average= ((double)math+(double)phys)/2;
			System.out.println("Средний балл - "+average);
			return average;
		}
	}

}
