package Week1Homework3;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		 Student student=new Student("Cihan Dilsiz",5005,3.23,(new PersonalData(1999,12,10,123456789)));
		 Student student2=new Student("Osman Dilsiz",5006,3.58,(new PersonalData(2008,12,10,123456789)));
		 Student student3=new Student("Ekrem Dilsiz",5007,3.4,(new PersonalData(2010,12,10,123456789)));
		 Student student4=new Student("Nurullah Dilsiz",5008,3.41,(new PersonalData(1998,12,10,123456789)));
		 Student student5=new Student("Barış Uğurlu",5009,3.1,(new PersonalData(2001,12,10,123456789)));
		 Course course=new Course("K129",3);
		 course.addStudent(student);
		 course.addStudent(student2);
		 course.addStudent(student3);
		 course.addStudent(student4);
		 course.list();
		 course.increaseCapacity();
		 course.addStudent(student4);
		 course.addStudent(student5);
		 course.list();
		 course.dropStudent(student);
		 course.list();
		 System.out.println(course.getNumberOfStudent());
		 System.out.println(course.getBestStudent().getPd().getBirthDate().getYear());
		 Course course2=new Course("K130");
		 for(int i=0;i<course.getNumberOfStudent();i++) {
			 course2.addStudent(course.getStudents()[i]);
		 }
		 course.clear();
		 course.list();
		 System.out.println();
		 course2.list();
		 course2.dropStudent(course2.getBestStudent());
		 course2.list();
		 System.out.println("En genç öğrencinin ortalması : "+course2.getYoungestStudent().getGpa());
	}

}
