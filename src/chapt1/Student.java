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
		System.out.println("���:");
		name =in.nextLine();
		System.out.println("���������� ����� "+id+". ���: "+name);
		}
	protected static class Teacher {
		protected double exams() {
			int math= 1+(int)(Math.random()*5);
			System.out.println("���������� - "+math);
			int phys= 1+(int)(Math.random()*5);
			System.out.println("������ - "+phys);
			double average= ((double)math+(double)phys)/2;
			System.out.println("������� ���� - "+average);
			return average;
		}
	}

}
